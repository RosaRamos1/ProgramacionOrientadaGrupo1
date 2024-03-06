/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 * @author Maycol Ramos
 */
// Clase Doctor (subclase de Persona)
public class Doctor extends Persona {
    private String especialidad;
      private boolean activo;

    // Constructor
    public Doctor(String nombre, int edad, boolean activo) {
        super(nombre, edad, "Doctor", activo);
        this.activo = activo;
    }

    // Método getter y setter para especialidad
    @Override
    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método para obtener información personal y especialidad del doctor
    @Override
    public void obtenerInformacionPersonal() {
        super.obtenerInformacionPersonal();
        System.out.println("Especialidad: " + especialidad);
    }
}

