package org.example.clases;

public class Alumno extends Persona {
    String curso;
    public Alumno (){super();}


    public Alumno(String nombre, String apellido, String estadoCivil, int dni, String curso) {
        super(nombre, apellido, estadoCivil, dni);
        this.curso = curso;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
