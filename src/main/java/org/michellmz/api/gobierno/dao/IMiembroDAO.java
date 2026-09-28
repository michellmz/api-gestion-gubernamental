package org.michellmz.api.gobierno.dao;

import java.util.List;

import org.michellmz.api.gobierno.vo.Miembro;

public interface IMiembroDAO {

    public List<Miembro> obtenerListaMiembros();
    
    public Miembro obtenerMiembroPorNombre(String nombre);
    
    public Miembro obtenerMiembroPorAlias(String alias);
}
