package org.michellmz.api.gobierno.excepcion;

public class MiembroNoEncontradoException extends RuntimeException {
    /**
    * 
    */
    private static final long serialVersionUID = -3344627619585104665L;

    public MiembroNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
