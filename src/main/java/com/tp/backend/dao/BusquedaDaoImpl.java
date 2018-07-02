package com.tp.backend.dao;

import com.tp.backend.model.Busqueda;
import com.tp.backend.model.Postulacion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class BusquedaDaoImpl {

    private static SessionFactory sessionFactory = buildSessionFactory();

    public Busqueda ById(int id) {
        Session session = sessionFactory.openSession();
        Busqueda busqueda = null;
        try {
            session.beginTransaction();
            busqueda = (Busqueda) session.get(Busqueda.class, id);
            session.getTransaction().commit();
        }

        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            session.close();
        }
        return busqueda;
    }

    public List<Busqueda> list(){

        Session session = sessionFactory.openSession();
        List<Busqueda> busquedaList = null;
        try {
            session.beginTransaction();
            busquedaList = session.createCriteria(Busqueda.class).list();
            session.getTransaction().commit();
        }

        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            session.close();
        }
        return busquedaList;
    }

    private static SessionFactory buildSessionFactory() {
        // Creating Configuration Instance & Passing Hibernate Configuration File
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.xml");

        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();

        // Creating Hibernate Factory Instance
        sessionFactory = configObj.buildSessionFactory(serviceRegistryObj);
        return sessionFactory;
    }
}
