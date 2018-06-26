package com.tp.backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "musico")
public class Musico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "formacion")
    private String formacion;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ExperienciaBanda> experienciaEnBandas;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<ExperienciaInstrumento> experienciaEnInstrumentos;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Postulacion> postulaciones;

    @OneToMany(cascade = CascadeType.ALL)
    private List<GeneroMusical> generosMusicales;

    @ManyToOne(cascade = CascadeType.ALL)
    private Banda banda;

    @ManyToOne(cascade = CascadeType.ALL)
    private Onda onda;

    @ManyToOne(cascade = CascadeType.ALL)
    private Reputacion reputacion;

    public Musico() {
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

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public List<ExperienciaBanda> getExperienciaEnBandas() {
        return experienciaEnBandas;
    }

    public void setExperienciaEnBandas(List<ExperienciaBanda> experienciaEnBandas) {
        this.experienciaEnBandas = experienciaEnBandas;
    }

//    public List<ExperienciaInstrumento> getExperienciaEnInstrumentos() {
//        return experienciaEnInstrumentos;
//    }
//
//    public void setExperienciaEnInstrumentos(List<ExperienciaInstrumento> experienciaEnInstrumentos) {
//        this.experienciaEnInstrumentos = experienciaEnInstrumentos;
//    }

    public List<Postulacion> getPostulaciones() {
        return postulaciones;
    }

    public void setPostulaciones(List<Postulacion> postulaciones) {
        this.postulaciones = postulaciones;
    }

    public List<GeneroMusical> getGenerosMusicales() {
        return generosMusicales;
    }

    public void setGenerosMusicales(List<GeneroMusical> generosMusicales) {
        this.generosMusicales = generosMusicales;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public Onda getOnda() {
        return onda;
    }

    public void setOnda(Onda onda) {
        this.onda = onda;
    }

    public Reputacion getReputacion() {
        return reputacion;
    }

    public void setReputacion(Reputacion reputacion) {
        this.reputacion = reputacion;
    }
}
