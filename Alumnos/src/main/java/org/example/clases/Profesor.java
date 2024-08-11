package org.example.clases;

public class Profesor extends Empleado {
    String dpto;

    public Profesor() {super();}

    public Profesor(String nombre, String apellido, String estadoCivil, int dni, int incorporacion, int despacho, String dpto) {
        super(nombre, apellido, estadoCivil, dni, incorporacion, despacho);
        this.dpto = dpto;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }
}
