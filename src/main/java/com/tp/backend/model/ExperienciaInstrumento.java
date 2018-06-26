package com.tp.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ExperienciaInstrumento")
public class ExperienciaInstrumento {

    @Column(name = "años")
    private int años;

    @Column(name = "musico")
    private Musico musico;

    @Column(name = "instrumento")
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
