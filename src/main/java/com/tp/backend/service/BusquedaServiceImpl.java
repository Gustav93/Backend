package com.tp.backend.service;

import com.tp.backend.dao.BusquedaDaoImpl;
import com.tp.backend.model.Busqueda;

import java.util.List;

public class BusquedaServiceImpl {

    private BusquedaDaoImpl dao;

    public BusquedaServiceImpl() {
        this.dao = new BusquedaDaoImpl();
    }

    public List<Busqueda> listar(){
        return dao.list();
    }
}
