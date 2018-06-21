package com.tp.backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bandas")
public class Banda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "musicos")
    private List<Musico> musicos;

    @Column(name = "busquedas")
    private List<Busqueda> busquedas;

    public Banda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(List<Musico> musicos) {
        this.musicos = musicos;
    }

    public List<Busqueda> getBusquedas() {
        return busquedas;
    }

    public void setBusquedas(List<Busqueda> busquedas) {
        this.busquedas = busquedas;
    }
}
