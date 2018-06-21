package com.tp.backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "musicos")
public class Musico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "years")
    private int years;

    @Column(name = "instrumentos")
    private List<Instrumento> instrumentos;

    @Column(name = "banda")
    private Banda banda;

    @Column(name = "postulaciones")
    private List<Postulacion> postaciones;

    public Musico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public List<Postulacion> getPostaciones() {
        return postaciones;
    }

    public void setPostaciones(List<Postulacion> postaciones) {
        this.postaciones = postaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
}
