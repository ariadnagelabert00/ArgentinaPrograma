package org.example;
import org.example.clases.Equipo;
import org.example.clases.Jugador;
import org.example.clases.Llave;
import org.example.clases.Ronda;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null,"Bienvenidos al torneo!", "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        listaEquipos.add(new Equipo("Belgica"));
        listaEquipos.add(new Equipo("Francia"));
        listaEquipos.add(new Equipo("Portugal"));
        listaEquipos.add(new Equipo("Brasil"));
        listaEquipos.add(new Equipo("Italia"));
        listaEquipos.add(new Equipo("Argelia"));
        listaEquipos.add(new Equipo("Alemania"));
        listaEquipos.add(new Equipo("Argentina"));
        Jugador jugador=new Jugador();
        jugador.elegirEquipo(listaEquipos);

        Llave llaveDerecha=new Llave();
        Llave llaveIzquierda=new Llave();

        llaveDerecha.armarLlave(listaEquipos,0);
        llaveIzquierda.armarLlave(listaEquipos,4);

        Ronda ronda= new Ronda();
        ronda.cuartos(llaveIzquierda,llaveDerecha);
        jugador.sumarPuntos();
        ronda.semi(llaveIzquierda,llaveDerecha);
        jugador.sumarPuntos();
        ronda.fin(llaveIzquierda,llaveDerecha);
        jugador.sumarPuntos();
        JOptionPane.showMessageDialog(null, "Has conseguido "+jugador.getPuntaje()+" puntos por elegir al equipo "+ jugador.getEquipoSeleccionado().getNombre()+".", "Resultado", JOptionPane.INFORMATION_MESSAGE);



    }
 }












