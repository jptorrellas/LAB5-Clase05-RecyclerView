package com.example.a55.clase05;

/**
 * Created by A55 on 30/04/2017.
 */

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String texto1) {
        this.nombre = texto1;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String texto2) {
        this.apellido = texto2;
    }
    public String getApellido() {
        return apellido;
    }
}
