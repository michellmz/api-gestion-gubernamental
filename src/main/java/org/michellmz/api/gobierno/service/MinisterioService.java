/**
 * 
 */
package org.michellmz.api.gobierno.service;

import java.util.List;

import org.michellmz.api.gobierno.dao.IMinisterioDAO;
import org.michellmz.api.gobierno.vo.Ministerio;
import org.springframework.stereotype.Service;

@Service
public class MinisterioService {

    private final IMinisterioDAO ministerioDAO;

    // Spring inyecta el DAO automáticamente
    public MinisterioService(IMinisterioDAO ministerioDAO) {
        this.ministerioDAO = ministerioDAO;
    }
    
     public List<Ministerio> obtenerListaMinisterios() {

        List<Ministerio> lista = ministerioDAO.obtenerListaMinisterios();

        // Esto provoca error
        // lista = null;
        
        if (lista == null || lista.isEmpty()) {
            throw new RuntimeException("No hay miinisterios disponibles");
        }

        return lista;
    }

 
}