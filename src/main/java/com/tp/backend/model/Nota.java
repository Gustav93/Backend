package com.tp.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "notas")
public class Nota {

    @Column(name = "puntuacion")
    private int puntuacion;

    @Column(name = "comantario")
    private String comentario;

    @Column(name = "aspecto")
    private Aspecto aspecto;

    public Nota() {
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Aspecto getAspecto() {
        return aspecto;
    }

    public void setAspecto(Aspecto aspecto) {
        this.aspecto = aspecto;
    }
}
