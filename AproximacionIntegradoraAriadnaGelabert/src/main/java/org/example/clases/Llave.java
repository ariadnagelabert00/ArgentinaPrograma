package org.example.clases;

import java.util.ArrayList;
import java.util.List;

public class Llave{
    private List<Equipo>equiposDeLaLlave;
    private String nombreDeLaLlave;

    public Llave() {
    }

    public Llave(List<Equipo> equiposDeLaLlave, String nombreDeLaLlave) {
        this.equiposDeLaLlave = equiposDeLaLlave;
        this.nombreDeLaLlave = nombreDeLaLlave;
    }

    public List<Equipo> getEquiposDeLaLlave() {
        return equiposDeLaLlave;
    }

    public void setEquiposDeLaLlave(List<Equipo> equiposDeLaLlave) {
        this.equiposDeLaLlave = equiposDeLaLlave;
    }

    public String getNombreDeLaLlave() {
        return nombreDeLaLlave;
    }

    public void setNombreDeLaLlave(String nombreDeLaLlave) {
        this.nombreDeLaLlave = nombreDeLaLlave;
    }

    public void armarLlave(List<Equipo>listaGenaeral, int indiceInicial){
    List<Equipo>equiposEnLlave=new ArrayList<>();
    for(int i=indiceInicial; i<indiceInicial+4; i++){
        equiposEnLlave.add(listaGenaeral.get(i));
    }
    this.equiposDeLaLlave=equiposEnLlave;
    }
}
