package com.tp.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "postulacion")
public class Postulacion {

    @Id
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private  Musico musico;

    @OneToOne
    private Instrumento instrumento;

    public Postulacion() {
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
