package com.crisanto.domain;

import java.time.LocalDate;

/**
 * Created by rocri on 02/08/2017.
 */
public class Contacto {
    private String nombre;
    private String ciudad;
    private String numeroTelefonico;
    private LocalDate fechaNacimiento;

    public Contacto() {
    }

    public Contacto(String nombre, String ciudad, String numeroTelefonico, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroTelefonico = numeroTelefonico;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
