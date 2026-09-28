package org.michellmz.api.gobierno.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.michellmz.api.gobierno.dao.IMinisterioDAO;
import org.michellmz.api.gobierno.service.MinisterioService;
import org.michellmz.api.gobierno.vo.Ministerio;

class MinisterioServiceTest {

    private MinisterioService ministerioService;
    private FakeMinisterioDAO fakeDAO;

    @BeforeEach
    void setUp() {
        fakeDAO = new FakeMinisterioDAO();
        ministerioService = new MinisterioService(fakeDAO);
    }

    // =========================
    // obtenerListaCasas
    // =========================

    @Test
    void obtenerListaMinisterios_cuandoListaEstaVacio_lanzaExcepcion() {
        assertThrows(RuntimeException.class, () -> {
        	ministerioService.obtenerListaMinisterios();
        });
    }

    @Test
    void obtenerListaMinistertio_cuandoHayDatos_retornaLista() {
        fakeDAO.data.add(new Ministerio(1, "Ministerio de Defensa", 120000, 100000));

        List<Ministerio> resultado = ministerioService.obtenerListaMinisterios();

        assertNotNull(resultado);
        assertEquals(1, resultado.size());
    }
    
    static class FakeMinisterioDAO implements IMinisterioDAO {

        private List<Ministerio> data = new ArrayList<>();


        @Override
        public List<Ministerio> obtenerListaMinisterios() {
            return new ArrayList<>(data);
        }

    }

}