package org.example.clases;
import javax.swing.*;
import java.util.List;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Jugador<Equipos> {
    private Equipo equipoSeleccionado;
    private int puntaje;

    public Jugador() {
    }

    public Jugador(Equipo equipoSeleccionado, int puntaje) {
        this.equipoSeleccionado = equipoSeleccionado;
        this.puntaje = puntaje;
    }

    public Equipo getEquipoSeleccionado() {
        return equipoSeleccionado;
    }

    public void setEquipoSeleccionado(Equipo equipoSeleccionado) {
        this.equipoSeleccionado = equipoSeleccionado;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void elegirEquipo(List<Equipo> listaEquipos) {
        String listaEquiposEnMensaje = "Seleccione su equipo: \n";
        for (int i=0; i<listaEquipos.size(); i++) {
            listaEquiposEnMensaje+=(i+1)+ ". " + listaEquipos.get(i).getNombre() + "\n";
        }
        JOptionPane.showMessageDialog(null, listaEquiposEnMensaje, "Seleccion de equipo", INFORMATION_MESSAGE);

        int indiceEquipo = 0;
        do {
            indiceEquipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice del equipo que quiere seleccionar", "Seleccion de equipo", INFORMATION_MESSAGE)) - 1;
        } while (indiceEquipo < 1 || indiceEquipo > 8);
        JOptionPane.showMessageDialog(null, "El equipo que elegiste es: " + listaEquipos.get(indiceEquipo).getNombre()+".");
        this.equipoSeleccionado=listaEquipos.get(indiceEquipo);
    }
    public void sumarPuntos(){
        if(equipoSeleccionado.isAutorizacion()){
            puntaje++;
        }
    }
}
