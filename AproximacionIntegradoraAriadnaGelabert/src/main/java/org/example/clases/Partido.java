package org.example.clases;

import org.example.enumeraiones.Resultado;

import javax.swing.*;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Partido {
    int golesEquipoLocal =2;
    int golesEquipoVisitante=3;

    public Partido() {
    }

    public Partido(int golesEquipoLocal, int golesEquipoVisitante) {
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }

    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }

    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }

    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    public Equipo simularPartido(Equipo equipoLocal, Equipo equipoVisitante) {
        JOptionPane.showMessageDialog(null, equipoLocal.getNombre() + " " + this.golesEquipoLocal + " - " + this.golesEquipoVisitante + "" + equipoVisitante.getNombre(), "Resultado", INFORMATION_MESSAGE);
        equipoLocal.sumarGolesNuevos(this.golesEquipoLocal);
        equipoVisitante.sumarGolesNuevos(this.golesEquipoLocal);

        //Logica del partido
        if (this.golesEquipoLocal>this.golesEquipoVisitante){
            equipoVisitante.setAutorizacion(false);
            equipoLocal.setResultadoPartido(Resultado.GANADOR);
            equipoVisitante.setResultadoPartido(Resultado.PERDEDOR);
            JOptionPane.showMessageDialog(null, "El equipo ganador es: " +equipoLocal.getNombre() +".", "Resultado",INFORMATION_MESSAGE);
            return equipoLocal;
        }else if(this.golesEquipoLocal==this.golesEquipoVisitante){
            JOptionPane.showMessageDialog(null, "Se jugara el desempate entre "+ equipoLocal.getNombre()+ " y "+equipoVisitante.getNombre(), "Resultado", INFORMATION_MESSAGE);
            equipoLocal.setResultadoPartido(Resultado.EMPATE);
            equipoVisitante.setResultadoPartido(Resultado.EMPATE);
            simularPartido(equipoLocal,equipoVisitante);
        } else {
            equipoLocal.setAutorizacion(false);
            equipoVisitante.setResultadoPartido(Resultado.GANADOR);
            equipoLocal.setResultadoPartido(Resultado.PERDEDOR);
            JOptionPane.showMessageDialog(null, "El equipo ganador es: " +equipoVisitante.getNombre() +".", "Resultado",INFORMATION_MESSAGE);
            return equipoVisitante;
        }

        return null;
    }

}
