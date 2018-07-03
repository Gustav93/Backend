package com.tp.backend.service;

import com.tp.backend.dao.*;
import com.tp.backend.model.*;
import java.util.List;

public class MacheoService {

    private BusquedaDaoImpl busquedaDao;
    private PostulacionDaoImpl postulacionDao;
    private BandaDao bandaDao;
    private MusicoDaoImpl musicoDao;
    private NotificacionDao notificacionDao;

    public MacheoService() {
        busquedaDao = new BusquedaDaoImpl();
        postulacionDao = new PostulacionDaoImpl();
        bandaDao = new BandaDao();
        musicoDao = new MusicoDaoImpl();
        notificacionDao = new NotificacionDao();
    }

    public void machear() {
        List<Busqueda> busquedas = busquedaDao.list();
        List<Postulacion> postulaciones = postulacionDao.list();

        for(Busqueda busqueda : busquedas)
        {
            for(Postulacion postulacion : postulaciones)
            {
                if(busqueda.getInstrumento().getNombre().equals(postulacion.getInstrumento().getNombre()))
                {
                    Banda banda = bandaDao.getById(busqueda.getBanda().getId());
                    Musico musico = musicoDao.getMusicoById(postulacion.getMusico().getId());

                    Notificacion notificacion = new Notificacion();
                    notificacion.setBanda(banda);
                    notificacion.setMusico(musico);
                    notificacionDao.save(notificacion);
                }
            }
        }
    }
}
