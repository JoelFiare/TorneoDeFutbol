package com.joelfiare;

import com.joelfiare.controller.EquipoController;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            manejarOpcion(opcion);
        } while (opcion != 0);
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("");
        System.out.println("------ Menú ------");
        System.out.println("1: Mostrar Equipos");
        System.out.println("2: Agregar Equipo");
        System.out.println("3: Borrar Equipo");
        System.out.println("4: Actualizar Equipo");
        System.out.println("0: Salir");
        System.out.println("------------------");
    }

    public static void manejarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado la Opción 1");
                EquipoController.mostrarEquipos();
                break;
            case 2:
                System.out.println("Ha seleccionado la Opción 2");
                EquipoController.agregarEquipo();
                break;
            case 3:
                System.out.println("Ha seleccionado la Opción 3");
                EquipoController.borrarEquipo();
                break;
            case 4:
                System.out.println("Ha seleccionado la Opción 4");
                EquipoController.actualizarEquipo();
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, elija una opción válida.");
                break;
        }
    }
}
