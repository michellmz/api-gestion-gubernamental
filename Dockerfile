# ====== Etapa 1: Fase de construcción (es temporal) ======
# Usamos una imagen de Maven con JDK 23 para construir la aplicación
FROM maven:3.9-eclipse-temurin-23 AS imagen_construccion

WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# ====== Etapa 2: Fase de ejecución (con la que se generará la imagen final) ======
# Sólo necesitamos la JRE para ejecutar la aplicación, lo que hace la imagen mucho más ligera.
# No se necesita el entorno de construcción completo (Maven + JDK + src), sólo el .jar resultante.
FROM eclipse-temurin:23-jre AS imagen_ejecucion

WORKDIR /app

# Copia el jar generado 
# se copia genéricamente con *.jar y se renombra como app.jar para simplificar
COPY --from=imagen_construccion /app/target/*.jar app.jar

# Puerto en el que escucha el Spring Boot 
EXPOSE 8080

# Comando de arranque
# Ejecuta el comando "java -jar app.jar" para iniciar tu API del gobierno
ENTRYPOINT ["java", "-jar", "app.jar"]
