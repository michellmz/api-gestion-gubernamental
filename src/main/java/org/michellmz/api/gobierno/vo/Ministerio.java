package org.michellmz.api.gobierno.vo;

/**
 *
 * Casa: Clase de persistencia que representa una Ministerio de Gobierno.
 * 
 * @author Michelle Miranda
 * 
 * 
 */
public class Ministerio {
    private int identificador;
    private String nombre;
    private double presupuesto;
    private double gastos;

    /**
     * @param identificador
     * @param nombre
     */
    public Ministerio(int identificador, String nombre, double presupuesto, double gastos) {
        super();
        this.identificador = identificador;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.gastos = gastos;
    }

    public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public double getGastos() {
		return gastos;
	}

	public void setGastos(double gastos) {
		this.gastos = gastos;
	}

	public Ministerio() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Casa [identificador=" + identificador + ", nombre=" + nombre + "]";
    }

}
