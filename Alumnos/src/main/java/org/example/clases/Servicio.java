package org.example.clases;

public class Servicio extends Empleado {
    private String seccion;

    public Servicio() { super();}

    public Servicio(String nombre, String apellido, String estadoCivil, int dni, int incorporacion, int despacho, String seccion) {
        super(nombre, apellido, estadoCivil, dni, incorporacion, despacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}
