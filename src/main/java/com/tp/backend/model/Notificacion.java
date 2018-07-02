package com.tp.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "notificacion")
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Banda banda;

    @ManyToOne(cascade = CascadeType.ALL)
    private Musico Musico;

    public Notificacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public com.tp.backend.model.Musico getMusico() {
        return Musico;
    }

    public void setMusico(com.tp.backend.model.Musico musico) {
        Musico = musico;
    }
}
