package com.tp.backend.dao;

import com.tp.backend.model.Banda;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class BandaDao {

    private static SessionFactory sessionFactory = buildSessionFactory();

    public void save(Banda banda) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(banda);
            session.getTransaction().commit();
        }

        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            session.close();
        }
    }


    public Banda getById(int id) {
        Session session = sessionFactory.openSession();
        Banda banda = null;
        try {
            session.beginTransaction();
            banda = (Banda) session.get(Banda.class, id);
            session.getTransaction().commit();
        }

        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            session.close();
        }
        return banda;
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
