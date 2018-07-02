package com.tp.backend.service;

import com.tp.backend.dao.BandaDao;
import com.tp.backend.dao.MusicoDao;
import com.tp.backend.dao.MusicoDaoImpl;
import com.tp.backend.dao.NotificacionDao;
import com.tp.backend.model.*;

import javax.transaction.Transactional;
import java.util.List;

public class MacheoService {

    private BusquedaServiceImpl busquedaService;
    private PostulacionServiceImpl postulacionService;
    private BandaDao bandaDao;
    private MusicoDaoImpl musicoDao;
    private NotificacionDao notificacionDao;

    public MacheoService() {
        busquedaService = new BusquedaServiceImpl();
        postulacionService = new PostulacionServiceImpl();
        bandaDao = new BandaDao();
        musicoDao = new MusicoDaoImpl();
        notificacionDao = new NotificacionDao();
        }


    public void machear() {
        List<Busqueda> busquedas = busquedaService.listar();
        List<Postulacion> postulaciones = postulacionService.listar();

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
