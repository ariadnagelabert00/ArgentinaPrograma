package org.example.clases;

public abstract class Empleado extends Persona {
    private int incorporacion;
    private int despacho;
public Empleado(){super();}
    public Empleado(String nombre, String apellido, String estadoCivil, int dni, int incorporacion, int despacho) {
        super(nombre, apellido, estadoCivil, dni);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
    }

    public int getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(int incorporacion) {
        this.incorporacion = incorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }
}
