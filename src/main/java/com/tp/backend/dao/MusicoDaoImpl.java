package com.tp.backend.dao;

import com.tp.backend.model.Musico;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class MusicoDaoImpl implements MusicoDao {

    private static SessionFactory sessionFactory = buildSessionFactory();

    @Override
    public Musico getMusicoById(int id) {
        Session session = sessionFactory.openSession();
        Musico musico = null;
        try {
            session.beginTransaction();
            musico = (Musico) session.get(Musico.class, id);
            session.getTransaction().commit();
        }

        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            session.close();
        }
        return musico;
    }

    @Override
    public List<Musico> getAll() {
        Session session = sessionFactory.openSession();
        List<Musico> musicos = null;
        try {
            session.beginTransaction();
            musicos = session.createSQLQuery("select * from musico").list();
            session.getTransaction().commit();
        }

        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            session.close();
        }
        return musicos;
    }

    @Override
    public void save(Musico musico) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(musico);
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

//    @Override
//    public void update(Musico musico) {
//        Session session = sessionFactory.openSession();
//        try {
//            session.beginTransaction();
//
//            Musico entity = (Musico) session.get(Musico.class, musico.getId());
//
//            entity.setNombre(musico.getNombre());
//            entity.setApellido(musico.getApellido());
//            entity.setFormacion(musico.getFormacion());
//            entity.setEmail(musico.getEmail());
//            entity.setYears(musico.getYears());
//            entity.setInstrumentos(musico.getInstrumentos());
//            entity.setBanda(musico.getBanda());
//            entity.setPostulaciones(musico.getPostulaciones());
//
//            session.update(entity);
//            session.getTransaction().commit();
//        }
//
//        catch (Exception e){
//            e.printStackTrace();
//            session.getTransaction().rollback();
//        }
//        finally {
//            session.close();
//        }
//    }

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
