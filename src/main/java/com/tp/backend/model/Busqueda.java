package com.tp.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "busqueda")
public class Busqueda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "años_experiencia")
    private int añosExperiencia;

    @Column(name = "tiempo_maximo")
    private int tiempoMaximo;

    @ManyToOne(cascade = CascadeType.ALL)
    private Banda banda;

    @OneToOne(cascade = CascadeType.ALL)
    private Instrumento instrumento;

    public Busqueda() {
    }

    public int getId() {
        return id;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public int getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
}
