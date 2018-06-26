package com.tp.backend.dao;

import com.tp.backend.model.Musico;

import java.util.List;

public interface MusicoDao {

    Musico getMusicoById(int id);

    List<Musico> getAll();

    void save(Musico musico);

//    void update(Musico musico);
}
