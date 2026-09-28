package org.michellmz.api.gobierno.controller;

import java.util.List;

import org.michellmz.api.gobierno.service.MiembroService;
import org.michellmz.api.gobierno.vo.Miembro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para gestionar miembros de ministerios
 * 
 * @author Michelle Miranda
 */
@RestController
@RequestMapping("/gobierno/miembros")
public class MiembroController {
    private final MiembroService miembroService;

    // Spring inyecta automáticamente el service con su DAO
    public MiembroController(MiembroService miembroService) {
        this.miembroService = miembroService;
    }

    /**
     * GET /gobierno/miembros - Obtiene la lista de todos los miembros
     * 
     * @return List<Miembro> lista de todos los miembros en formato JSON
     */
    @GetMapping
    public List<Miembro> getAll() {
        List<Miembro> listaMiembros = miembroService.obtenerListaMiembros();
        return listaMiembros;
    }

    /**
     * GET /gobierno/miembros/nombre/{nombre} - Obtiene un miembro por su nombre
     * 
     * @param nombre el nombre del miembro a buscar
     * @return Miembro el miembro encontrado en formato JSON
     */
    @GetMapping("/nombre/{nombre}")
    public Miembro getByNombre(@PathVariable String nombre) {
        Miembro miembro = miembroService.obtenerMiembroPorNombre(nombre);
        return miembro;
    }

    /**
     * GET /gobierno/miembros/alias/{alias} - Obtiene un miembro por su alias
     * 
     * @param alias el alias del miembro a buscar
     * @return Miembro el miembro encontrado en formato JSON
     */
    @GetMapping("/alias/{alias}")
    public Miembro getByAlias(@PathVariable String alias) {
        Miembro miembro = miembroService.obtenerMiembroPorAlias(alias);
        return miembro;
    }

}
