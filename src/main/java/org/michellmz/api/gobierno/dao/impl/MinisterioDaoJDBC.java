package org.michellmz.api.gobierno.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.michellmz.api.gobierno.dao.IMinisterioDAO;
import org.michellmz.api.gobierno.vo.Ministerio;
import org.springframework.stereotype.Repository;

@Repository
public class MinisterioDaoJDBC implements IMinisterioDAO {
    private final DataSource dataSource;

    // Spring inyecta el DataSource configurado automáticamente
    public MinisterioDaoJDBC(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public List<Ministerio> obtenerListaMinisterios() {

        List<Ministerio> lista = new ArrayList<>();

        String sentenciaSQL = """
                SELECT * FROM ministerio
                """;

        try (Connection conexion = dataSource.getConnection();
                PreparedStatement sentenciaJDBCPreparada = conexion.prepareStatement(sentenciaSQL);) {

            System.out.println(sentenciaJDBCPreparada);

            ResultSet resultadoSentencia = sentenciaJDBCPreparada.executeQuery();

            while (resultadoSentencia.next()) {
                lista.add(getLineaFromResultSet(resultadoSentencia));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }


    
    private Ministerio getLineaFromResultSet(ResultSet resultadoSentencia) throws SQLException {

        Ministerio ministerio = new Ministerio();

        ministerio.setIdentificador(resultadoSentencia.getInt("codMinisterio"));
        ministerio.setNombre(resultadoSentencia.getString("nombre"));
        ministerio.setPresupuesto(resultadoSentencia.getDouble("presupuesto"));
        ministerio.setGastos(resultadoSentencia.getDouble("gastos"));

        return ministerio;
    }
}