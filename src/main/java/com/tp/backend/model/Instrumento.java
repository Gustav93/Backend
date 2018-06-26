package com.tp.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "instrumentos")
public class Instrumento
{
    @Id
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "experienciaInstrumento")
    private int experienciaInstrumento;

    @Column(name = "postulacion")
    private Postulacion postulacion;

    public Instrumento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperienciaInstrumento() {
        return experienciaInstrumento;
    }

    public void setExperienciaInstrumento(int experienciaInstrumento) {
        this.experienciaInstrumento = experienciaInstrumento;
    }
}
