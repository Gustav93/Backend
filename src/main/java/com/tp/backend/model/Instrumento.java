package com.tp.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "instrumento")
public class Instrumento
{
    @Id
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @OneToOne(mappedBy = "instrumento")
    private Postulacion postulacion;

    @OneToOne(mappedBy = "instrumento")
    private Busqueda busqueda;

    public Instrumento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Postulacion getPostulacion() {
        return postulacion;
    }

    public void setPostulacion(Postulacion postulacion) {
        this.postulacion = postulacion;
    }

    public Busqueda getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(Busqueda busqueda) {
        this.busqueda = busqueda;
    }

}
