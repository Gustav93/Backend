package com.tp.backend.service;

import com.tp.backend.model.Busqueda;
import com.tp.backend.model.Postulacion;

import java.util.List;

public class MacheoService {

    private BusquedaServiceImpl busquedaService;
    private PostulacionServiceImpl postulacionService;

    public MacheoService() {
        busquedaService = new BusquedaServiceImpl();
        postulacionService = new PostulacionServiceImpl();
    }

    public void machear() {
        List<Busqueda> busquedas = busquedaService.listar();
        List<Postulacion> postulaciones = postulacionService.listar();

        for(Busqueda busqueda : busquedas)
        {
            for(Postulacion postulacion : postulaciones)
            {
                
            }
        }
    }
}
