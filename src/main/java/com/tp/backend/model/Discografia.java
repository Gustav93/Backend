package com.tp.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "discografias")
public class Discografia {

    @Column(name = "banda")
    private Banda banda;

    public Discografia() {
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
}
