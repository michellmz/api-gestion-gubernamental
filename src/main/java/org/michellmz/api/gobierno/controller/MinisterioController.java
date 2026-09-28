/**
 * 
 */
package org.michellmz.api.gobierno.controller;

import java.util.List;

import org.michellmz.api.gobierno.service.MinisterioService;
import org.michellmz.api.gobierno.vo.Ministerio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Michelle Miranda
 */
@RestController
@RequestMapping("/gobierno/ministerios")
public class MinisterioController {
    private final MinisterioService ministerioService;

    // Spring inyecta automáticamente el service con su DAO
    public MinisterioController(MinisterioService ministerioService) {
        this.ministerioService = ministerioService;
    }

    // GET /gobierno/ministerios - listar todos los ministerio
    @GetMapping
    public List<Ministerio> getAll() {
        List<Ministerio> listaCasas = ministerioService.obtenerListaMinisterios();
        return listaCasas;
    }

 
}
