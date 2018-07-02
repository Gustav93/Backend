package com.tp.backend;

import com.tp.backend.dao.BusquedaDaoImpl;
import com.tp.backend.dao.MusicoDao;
import com.tp.backend.dao.MusicoDaoImpl;
import com.tp.backend.model.Busqueda;
import com.tp.backend.model.Musico;
import com.tp.backend.service.MacheoService;
import org.apache.camel.main.Main;

import java.util.List;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
//        Main main = new Main();
//        main.addRouteBuilder(new MyRouteBuilder());
//        main.run(args);

//        MusicoDaoImpl musicoDao = new MusicoDaoImpl();

//        List<Musico> musicos = musicoDao.getAll();
//        System.out.println(musicoDao.getAll().size());


//        BusquedaDaoImpl dao = new BusquedaDaoImpl();
//        Busqueda busqueda = dao.ById(1);
//        System.out.println(busqueda.getInstrumento().getNombre());


        MacheoService macheoService = new MacheoService();
        macheoService.machear();
    }

}

