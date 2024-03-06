/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 * @author Belen Carranza
 */
// Clase Deportista (subclase de Persona)
public class Deportista extends Persona {
    private String deporte;
    private boolean activo;

    // Constructor
   
    public Deportista(String nombre, int edad, boolean activo) {
        super(nombre, edad, "Deportista", activo);
        this.activo = activo;
    }

    // Método getter y setter para deporte
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Método para obtener información personal y deporte del deportista
    @Override
    public void obtenerInformacionPersonal() {
        super.obtenerInformacionPersonal();
        System.out.println("Deporte: " + deporte);
    }
}
