/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 * @author Rosa Ramos
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String especialidad;
    boolean activo;

    public Persona(String nombre, int edad, String especialidad, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void obtenerInformacionPersonal() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Estado: " + (activo ? "Activo" : "Inactivo"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        // Agregar 5 registros iniciales
        personas.add(new Persona("Juan", 30, "Doctor", true));
        personas.add(new Persona("Pedro", 25, "Deportista", false));
        personas.add(new Persona("María", 35, "Doctor", true));
        personas.add(new Persona("Ana", 28, "Deportista", true));
        personas.add(new Persona("Carlos", 40, "Doctor", false));

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar información almacenada");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese la especialidad (Doctor/Deportista): ");
                    String especialidad = scanner.next();
                    System.out.print("Ingrese el estado (Activo/Inactivo): ");
                    String estado = scanner.next();

                    boolean activo = estado.equalsIgnoreCase("Activo");
                    personas.add(new Persona(nombre, edad, especialidad, activo));
                    System.out.println("Persona agregada exitosamente.");
                    System.out.println();
                    break;
                case 2:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas almacenadas.");
                        System.out.println();
                    } else {
                        System.out.println("Información almacenada:");
                        for (Persona persona : personas) {
                            persona.obtenerInformacionPersonal();
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    System.out.println();
                    break;
            }
        }

        scanner.close();
    }
}
