package com.tp.backend.model;

import javax.persistence.*;

@Entity
public class Instrumento
{
    @Column(name = "instrumento")
    private String instrumento;

    @Column(name = "expYears")
    private int expYears;

    public Instrumento() {
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getExpYears() {
        return expYears;
    }

    public void setExpYears(int expYears) {
        this.expYears = expYears;
    }
}
