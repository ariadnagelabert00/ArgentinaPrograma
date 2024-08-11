package org.example;

import org.example.clases.Alumno;
import org.example.clases.Profesor;
import org.example.clases.Servicio;

public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno ("Ariadna", "Gelabert", "Soltera", 42470020, "Geografia");
        Profesor p1= new Profesor("Gabriel", "Obregon", "Soltero", 33333333, 2020, 103, "Soltero");
        Servicio s1= new Servicio("Rodrigo", "Ibañez", "Soltero", 22222222, 2020,106,"Biblioteca");
    }
}