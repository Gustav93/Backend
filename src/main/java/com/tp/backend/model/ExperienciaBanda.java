package com.tp.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "ExperienciaBanda")
public class ExperienciaBanda {

    @Column(name = "nombreBanda")
    private String nombreBanda;

    @Column(name = "cantAños")
    private int cantAños;

    @OneToMany(mappedBy = "experienciaEnBandas", cascade = CascadeType.ALL)
    @Column(name = "musico")
    private Musico musico;

    public ExperienciaBanda() {
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public int getCantAños() {
        return cantAños;
    }

    public void setCantAños(int cantAños) {
        this.cantAños = cantAños;
    }

    public Musico getMusico() {
        return musico;
    }

    public void setMusico(Musico musico) {
        this.musico = musico;
    }
}
