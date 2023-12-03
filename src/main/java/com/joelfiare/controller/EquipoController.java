package com.joelfiare.controller;

public class Equipo extends EquipoTemplate {

    public Equipo(String nombre, Integer titulares, Integer suplentes, String directorTecnico, Integer puntos,
            Integer partidosJugados) {
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.directorTecnico = directorTecnico;
        this.puntos = puntos;
        this.partidosJugados = partidosJugados;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

}