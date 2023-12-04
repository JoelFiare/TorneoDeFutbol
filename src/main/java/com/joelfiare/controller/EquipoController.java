package com.joelfiare.controller;

import com.joelfiare.dao.EquipoDAO;
import com.joelfiare.model.Equipo;

import java.util.List;
import java.util.Scanner;

public class EquipoController extends EquipoTemplate {

    public EquipoController() {
    }


    public static void mostrarEquipos() {
        EquipoDAO equipoDAO = new EquipoDAO();
        List<com.joelfiare.model.Equipo> listaEquipos = equipoDAO.obtenerTodosLosEquipos();

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(String.format("%-2s %-23s %-9s %-9s %-20s %-6s %-8s",
                "ID", "Nombre del Equipo", "Titulares", "Suplentes", "Director Técnico", "Puntos", "Partidos"));
        System.out.println("------------------------------------------------------------------------------------");
        listaEquipos.forEach(equipo -> System.out.println(
                String.format("%-2d %-23s %-9d %-9d %-20s %-6d %-8d",
                        equipo.getId(),
                        equipo.getNombre(),
                        equipo.getTitulares(),
                        equipo.getSuplentes(),
                        equipo.getDirectorTecnico(),
                        equipo.getPuntos(),
                        equipo.getPartidosJugados()
                )));
    }

    public static void agregarEquipo() {

        EquipoDAO equipoDAO = new EquipoDAO();
        Equipo nuevoEquipo = new Equipo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        nuevoEquipo.setNombre(nombreEquipo);

        System.out.print("Ingrese la cantidad de titulares: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero entre 0 y 11.");
            System.out.print("Ingrese la cantidad de titulares: ");
            scanner.next();
        }
        int titulares = scanner.nextInt();
        while (titulares < 0 || titulares > 11) {
            System.out.println("La cantidad de titulares debe ser entre 0 y 11.");
            System.out.print("Ingrese la cantidad de titulares: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero entre 0 y 11.");
                System.out.print("Ingrese la cantidad de titulares: ");
                scanner.next();
            }
            titulares = scanner.nextInt();
        }
        nuevoEquipo.setTitulares(titulares);

        System.out.print("Ingrese la cantidad de suplentes: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero entre 0 y 11.");
            System.out.print("Ingrese la cantidad de suplentes: ");
            scanner.next();
        }
        int suplentes = scanner.nextInt();
        while (suplentes < 0 || suplentes > 11) {
            System.out.println("La cantidad de suplentes debe ser entre 0 y 11.");
            System.out.print("Ingrese la cantidad de suplentes: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero entre 0 y 11.");
                System.out.print("Ingrese la cantidad de suplentes: ");
                scanner.next();
            }
            suplentes = scanner.nextInt();
        }
        nuevoEquipo.setSuplentes(suplentes);

        System.out.print("Ingrese el nombre del director técnico: ");
        scanner.nextLine();
        String directorTecnico = scanner.nextLine();
        nuevoEquipo.setDirectorTecnico(directorTecnico);

        System.out.print("Ingrese la cantidad de puntos: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            System.out.print("Ingrese la cantidad de puntos: ");
            scanner.next();
        }
        int puntos = scanner.nextInt();
        nuevoEquipo.setPuntos(puntos);

        System.out.print("Ingrese la cantidad de partidos jugados: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
            System.out.print("Ingrese la cantidad de partidos jugados: ");
            scanner.next();
        }
        int partidosJugados = scanner.nextInt();
        nuevoEquipo.setPartidosJugados(partidosJugados);

        equipoDAO.guardarEquipo(nuevoEquipo);

        System.out.println("El equipo se ha guardado correctamente.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(String.format("%-2s %-23s %-9s %-9s %-20s %-6s %-8s",
                "ID", "Nombre del Equipo", "Titulares", "Suplentes", "Director Técnico", "Puntos", "Partidos"));
        System.out.println(
                String.format("%-2d %-23s %-9d %-9d %-20s %-6d %-8d",
                        nuevoEquipo.getId(),
                        nuevoEquipo.getNombre(),
                        nuevoEquipo.getTitulares(),
                        nuevoEquipo.getSuplentes(),
                        nuevoEquipo.getDirectorTecnico(),
                        nuevoEquipo.getPuntos(),
                        nuevoEquipo.getPartidosJugados()
                ));
        System.out.println("------------------------------------------------------------------------------------");
    }

    public static void borrarEquipo() {
        EquipoDAO equipoDAO = new EquipoDAO();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del equipo que desea borrar: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            System.out.print("Ingrese el ID del equipo que desea borrar: ");
            scanner.next();
        }
        int id = scanner.nextInt();

        boolean equipoBorrado = equipoDAO.borrarEquipo(id);

        if (equipoBorrado) {
            System.out.println("El equipo se ha borrado correctamente.");
        } else {
            System.out.println("El equipo con el ID proporcionado no existe en la base de datos.");
        }
    }

    public static void actualizarEquipo() {
        EquipoDAO equipoDAO = new EquipoDAO();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del equipo que desea actualizar: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            System.out.print("Ingrese el ID del equipo que desea actualizar: ");
            scanner.next();
        }
        int id = scanner.nextInt();
        Equipo equipo = equipoDAO.obtenerEquipoPorId(id);

        if (equipo != null) {
            System.out.println("El equipo seleccionado es:");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println(String.format("%-2s %-23s %-9s %-9s %-20s %-6s %-8s",
                    "ID", "Nombre del Equipo", "Titulares", "Suplentes", "Director Técnico", "Puntos", "Partidos"));
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println(
                    String.format("%-2d %-23s %-9d %-9d %-20s %-6d %-8d",
                            equipo.getId(),
                            equipo.getNombre(),
                            equipo.getTitulares(),
                            equipo.getSuplentes(),
                            equipo.getDirectorTecnico(),
                            equipo.getPuntos(),
                            equipo.getPartidosJugados()
                    ));
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("¿Qué desea actualizar?");
            System.out.println("1: Nombre del equipo");
            System.out.println("2: Cantidad de titulares");
            System.out.println("3: Cantidad de suplentes");
            System.out.println("4: Nombre del director técnico");
            System.out.println("5: Cantidad de puntos");
            System.out.println("6: Cantidad de partidos jugados");
            System.out.println("0: Cancelar");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nuevo nombre del equipo: ");
                    scanner.nextLine();
                    String nombreEquipo = scanner.nextLine();
                    equipo.setNombre(nombreEquipo);
                    break;
                case 2:
                    System.out.print("Ingrese la nueva cantidad de titulares: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número entero entre 0 y 11.");
                        System.out.print("Ingrese la nueva cantidad de titulares: ");
                        scanner.next();
                    }
                    int titulares = scanner.nextInt();
                    while (titulares < 0 || titulares > 11) {
                        System.out.println("La cantidad de titulares debe ser entre 0 y 11.");
                        System.out.print("Ingrese la nueva cantidad de titulares: ");

                        while (!scanner.hasNextInt()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número entero entre 0 y 11.");
                            System.out.print("Ingrese la nueva cantidad de titulares: ");
                            scanner.next();
                        }
                        titulares = scanner.nextInt();
                    }
                    equipo.setTitulares(titulares);
                    break;
                case 3:
                    System.out.print("Ingrese la nueva cantidad de suplentes: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número entero entre 0 y 11.");
                        System.out.print("Ingrese la nueva cantidad de suplentes: ");
                        scanner.next();
                    }
                    int suplentes = scanner.nextInt();
                    while (suplentes < 0 || suplentes > 11) {
                        System.out.println("La cantidad de suplentes debe ser entre 0 y 11.");
                        System.out.print("Ingrese la nueva cantidad de suplentes: ");

                        while (!scanner.hasNextInt()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número entero entre 0 y 11.");
                            System.out.print("Ingrese la nueva cantidad de suplentes: ");
                            scanner.next();
                        }
                        suplentes = scanner.nextInt();
                    }
                    equipo.setSuplentes(suplentes);
                    break;
                case 4:
                    System.out.print("Ingrese el nuevo nombre del director técnico: ");
                    scanner.nextLine();
                    String directorTecnico = scanner.nextLine();
                    equipo.setDirectorTecnico(directorTecnico);
                    break;
                case 5:
                    System.out.print("Ingrese la nueva cantidad de puntos: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                        System.out.print("Ingrese la nueva cantidad de puntos: ");
                        scanner.next();
                    }
                    int puntos = scanner.nextInt();
                    equipo.setPuntos(puntos);
                    break;
                case 6:
                    System.out.print("Ingrese la nueva cantidad de partidos jugados: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número.");
                        System.out.print("Ingrese la nueva cantidad de partidos jugados: ");
                        scanner.next();
                    }
                    int partidosJugados = scanner.nextInt();
                    equipo.setPartidosJugados(partidosJugados);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            equipoDAO.actualizarEquipo(equipo);
            System.out.println("El equipo se ha actualizado correctamente.");
        } else {
            System.out.println("El equipo con el ID proporcionado no existe en la base de datos.");
        }
    }
}