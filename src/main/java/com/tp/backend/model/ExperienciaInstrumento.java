package com.tp.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "ExperienciaInstrumento")
public class ExperienciaInstrumento {

    @Id
    private int id;

    @Column(name = "años")
    private int años;

    @ManyToOne(cascade = CascadeType.ALL)
    private Musico musico;

    @ManyToOne(cascade = CascadeType.ALL)
    private Instrumento instrumento;

    public ExperienciaInstrumento() {
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public Musico getMusico() {
        return musico;
    }

    public void setMusico(Musico musico) {
        this.musico = musico;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
}
