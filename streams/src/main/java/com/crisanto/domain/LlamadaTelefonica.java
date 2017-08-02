package com.crisanto.domain;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by rocri on 02/08/2017.
 */
public class LlamadaTelefonica {
    private Contacto contacto;
    private LocalDate fecha;
    private Duration duration;

    public LlamadaTelefonica() {
    }

    public LlamadaTelefonica(Contacto contacto, LocalDate fecha, Duration duration) {
        this.contacto = contacto;
        this.fecha = fecha;
        this.duration = duration;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "LlamadaTelefonica{" +
                "contacto=" + contacto +
                ", fecha=" + fecha +
                ", duration=" + duration +
                '}';
    }
}
