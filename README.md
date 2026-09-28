# ☁️ Despliegue Cloud y CI/CD - API Gubernamental

Este repositorio documenta el ciclo de vida de despliegue, configuración de infraestructura y automatización de una API REST desarrollada en Spring Boot. 

El código fuente de la aplicación fue provisto como base, recayendo mi trabajo íntegramente en la capa de **Operaciones, Sistemas y DevOps**.

## 🛠️ Stack de Infraestructura y Herramientas
* **Sistema Operativo:** Debian (Instancia Cloud)
* **Automatización (CI/CD):** GitHub Actions
* **Contenedores:** Docker & Docker Compose
* **Administración Remota:** MobaXterm (SSH)
* **Gestión de Base de Datos:** DBeaver

## 🚀 Trabajo Realizado (Fase de Despliegue)

* **Configuración del Entorno (Debian):** Aprovisionamiento y configuración del servidor Linux para alojar la aplicación.
* **Integración Continua:** Configuración de flujos de trabajo en GitHub para la ejecución automatizada de pruebas unitarias (JUnit) y construcción de imágenes Docker.
* **Gestión de Configuración:** Adaptación de variables de entorno y el archivo `application.properties` para la conexión segura a la base de datos de producción.
* **Verificación de Despliegue:** Comprobación del correcto funcionamiento de la API a través del navegador, tanto en entornos aislados como integrados con la base de datos.
