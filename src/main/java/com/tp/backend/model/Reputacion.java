package com.tp.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reputacion")
public class Reputacion {

    @Id
    private int id;

}
