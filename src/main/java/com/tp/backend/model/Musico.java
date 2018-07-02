package com.tp.backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "musico")
public class Musico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Postulacion> postulaciones;

    public Musico() {
    }

    public int getId() {
        return id;
    }

    public List<Postulacion> getPostulaciones() {
        return postulaciones;
    }

    public void setPostulaciones(List<Postulacion> postulaciones) {
        this.postulaciones = postulaciones;
    }

}
