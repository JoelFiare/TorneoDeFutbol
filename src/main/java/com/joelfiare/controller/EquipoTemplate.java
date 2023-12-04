package com.joelfiare.controller;

public abstract class EquipoTemplate {

    // Método Template Method
    public void metodoTemplate() {
        agregarEquipo();
        mostrarEquipos();
        actualizarEquipo();
        borrarEquipo();
    }

    public static void actualizarEquipo() {
    }

    public static void mostrarEquipos() {
    }

    public static void agregarEquipo() {
    }

    public static void borrarEquipo() {
    }
}