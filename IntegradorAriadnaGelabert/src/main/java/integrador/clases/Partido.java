package integrador.clases;

import integrador.enumeraciones.Resultado;

import javax.swing.*;

public class Partido {

    private int golesEquipoLocal=0;
    private int golesEquipoVisitante =0;

    public Partido() {
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


    public Equipo simularPartido(Equipo equipoLocal, Equipo equipoVisitante) {
        golesEquipoLocal= (int) (Math.random()*10+1);
        golesEquipoVisitante=(int) (Math.random()*10+1);
        // Muestra un mensaje con el resultado del partido
        JOptionPane.showMessageDialog(null,
                equipoLocal.getNombre() + " " + this.golesEquipoLocal + " - " + this.golesEquipoVisitante + " " + equipoVisitante.getNombre(),
                "integrador.enumeraciones.Resultado",
                JOptionPane.INFORMATION_MESSAGE);

        // Le suma los goles a los equipos
        equipoLocal.sumarGolesNuevos(this.golesEquipoLocal);
        equipoVisitante.sumarGolesNuevos(this.golesEquipoVisitante);

        // Lógica del partido
        if (this.golesEquipoLocal > this.golesEquipoVisitante) {
            // El equipo local ganó
            equipoVisitante.setAutorizacion(false);
            equipoVisitante.setResultadoEnElPartido(Resultado.PERDEDOR);
            equipoLocal.setResultadoEnElPartido(Resultado.GANADOR);
            return equipoLocal;
        } else if (this.golesEquipoLocal == this.golesEquipoVisitante) {
            // Empate, se jugará un desempate
            JOptionPane.showMessageDialog(null,
                    "Se jugará el desempate entre " + equipoLocal.getNombre() + " - " + equipoVisitante.getNombre(),
                    "integrador.enumeraciones.Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
            equipoLocal.setResultadoEnElPartido(Resultado.EMPATE);
            equipoVisitante.setResultadoEnElPartido(Resultado.EMPATE);
            simularPartido(equipoLocal, equipoVisitante); // llamada recursiva para simular el desempate
        } else {
            // El equipo visitante ganó
            equipoLocal.setAutorizacion(false);
            equipoLocal.setResultadoEnElPartido(Resultado.PERDEDOR);
            equipoVisitante.setResultadoEnElPartido(Resultado.GANADOR);
            return equipoVisitante;
        }

        return null;
    }



}
