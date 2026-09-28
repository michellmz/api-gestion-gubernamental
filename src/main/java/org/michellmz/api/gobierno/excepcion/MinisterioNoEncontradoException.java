package org.michellmz.api.gobierno.excepcion;

public class MinisterioNoEncontradoException extends RuntimeException {
    /**
    * 
    */
    private static final long serialVersionUID = -3344627619585104664L;

    public MinisterioNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
