package com.tp.backend.service;

import com.tp.backend.dao.PostulacionDaoImpl;
import com.tp.backend.model.Postulacion;

import java.util.ArrayList;
import java.util.List;

public class PostulacionServiceImpl {

    private PostulacionDaoImpl dao;

    public PostulacionServiceImpl() {

        dao = new PostulacionDaoImpl();
    }

    public List<Postulacion> listar(){
        return dao.list();
    }
}
