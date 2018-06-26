package com.tp.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "GeneroMusical")
public class GeneroMusical {

    @Id
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne(cascade = CascadeType.ALL)
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
