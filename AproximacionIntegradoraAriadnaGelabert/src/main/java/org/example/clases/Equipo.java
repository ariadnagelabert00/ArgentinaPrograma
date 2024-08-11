package org.example.clases;

import org.example.enumeraiones.Resultado;

public class Equipo {
    private String nombre;
    private boolean autorizacion = true;
    private Resultado resultadoPartido;
    private int cantGoles;

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre, boolean autorizacion, Resultado resultadoPartido, int cantGoles) {
        this.nombre = nombre;
        this.autorizacion = autorizacion;
        this.resultadoPartido = resultadoPartido;
        this.cantGoles = cantGoles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(boolean autorizacion) {
        this.autorizacion = autorizacion;
    }

    public Resultado getResultadoPartido() {
        return resultadoPartido;
    }

    public void setResultadoPartido(Resultado resultadoPartido) {
        this.resultadoPartido = resultadoPartido;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
    public void sumarGolesNuevos(int nuevosGoles){
        this.cantGoles+=nuevosGoles;
    }
}
