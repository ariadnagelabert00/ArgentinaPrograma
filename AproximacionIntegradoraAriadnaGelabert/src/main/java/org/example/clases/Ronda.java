package org.example.clases;

import javax.swing.*;

import java.util.List;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Ronda {
    private int numeroRonda;
    private int cantEquiposRonda;
    private int cantEquiposLlave;

    public Ronda() {
    }

    public Ronda(int numeroRonda, int cantEquiposRonda, int cantEquiposLlave) {
        this.numeroRonda = numeroRonda;
        this.cantEquiposRonda = cantEquiposRonda;
        this.cantEquiposLlave = cantEquiposLlave;
    }

    public int getNumeroRonda() {
        return numeroRonda;
    }

    public void setNumeroRonda(int numeroRonda) {
        this.numeroRonda = numeroRonda;
    }

    public int getCantEquiposRonda() {
        return cantEquiposRonda;
    }

    public void setCantEquiposRonda(int cantEquiposRonda) {
        this.cantEquiposRonda = cantEquiposRonda;
    }

    public int getCantEquiposLlave() {
        return cantEquiposLlave;
    }

    public void setCantEquiposLlave(int cantEquiposLlave) {
        this.cantEquiposLlave = cantEquiposLlave;
    }

    public void cuartos(Llave llaveIzquierda, Llave llaveDerecha){
        this.numeroRonda=1;
        this.cantEquiposLlave=4;
        Partido partido= new Partido();
        JOptionPane.showMessageDialog(null, "Se jugaron los cuarto de final.", "Bienvenido a los cuartos",INFORMATION_MESSAGE);
       //simulo partidos
        for (int i = 0; i<cantEquiposLlave;i+=2){
            partido.simularPartido(llaveIzquierda.getEquiposDeLaLlave().get(i),llaveIzquierda.getEquiposDeLaLlave().get(i+1));
            partido.simularPartido(llaveDerecha.getEquiposDeLaLlave().get(i),llaveDerecha.getEquiposDeLaLlave().get(i+1));
        }
        //remuevo al perdedor
        removerEquipo(llaveIzquierda.getEquiposDeLaLlave());
        removerEquipo(llaveDerecha.getEquiposDeLaLlave());
        //cant actual de equipos por llave
        this.cantEquiposLlave=2;
    }
    public void removerEquipo(List<Equipo> equipos){
        int contadorEquiposPorLlave=cantEquiposLlave;
        for(int i = 0; i<contadorEquiposPorLlave; i++){
            Equipo auxiliar=equipos.get(i);
            if (!auxiliar.isAutorizacion()){
                equipos.remove(auxiliar);
                contadorEquiposPorLlave--;
            }
        }
    }
    public void semi(Llave llaveIzquierda, Llave llaveDerecha){
        this.numeroRonda=2;
        JOptionPane.showMessageDialog(null,"Se jugaran las semifinales","Bienvenidos a las semis",INFORMATION_MESSAGE);
        Partido partido = new Partido();
        partido.simularPartido(llaveIzquierda.getEquiposDeLaLlave().get(0), llaveIzquierda.getEquiposDeLaLlave().get(1));
        partido.simularPartido(llaveDerecha.getEquiposDeLaLlave().get(0), llaveDerecha.getEquiposDeLaLlave().get(1));
        removerEquipo(llaveDerecha.getEquiposDeLaLlave());
        removerEquipo(llaveIzquierda.getEquiposDeLaLlave());
    }
    public void fin(Llave llaveIzquierda, Llave llaveDerecha){
        numeroRonda = 3;
        JOptionPane.showMessageDialog(null,"Se jugara la final","Bienvenidos a la final",INFORMATION_MESSAGE);
        Partido partido=new Partido();
        Equipo equipo = partido.simularPartido(llaveIzquierda.getEquiposDeLaLlave().get(0), llaveDerecha.getEquiposDeLaLlave().get(0));
       JOptionPane.showMessageDialog(null, "El ganador del torneo es: "+ equipo.getNombre(), "Ganador", INFORMATION_MESSAGE);
    }
}
