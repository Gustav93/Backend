package com.tp.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "GeneroMusical")
public class GeneroMusical {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "musico")
    private Musico musico;

    public GeneroMusical() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Musico getMusico() {
        return musico;
    }

    public void setMusico(Musico musico) {
        this.musico = musico;
    }
}
