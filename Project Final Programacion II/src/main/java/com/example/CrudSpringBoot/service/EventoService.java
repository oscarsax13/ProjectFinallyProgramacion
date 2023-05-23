package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.interfaceService.IEventoService;
import com.example.CrudSpringBoot.modelo.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;



@Service
public  class EventoService implements IEventoService {
    @Autowired
    private IEventoService mdata;

    @Override
    public List<Evento> listar() {
        return (List<Evento>) mdata.findAll();
    }

    @Override
    public Optional<Evento> listarId(int id) {

        return mdata.findById(id);
    }

    @Override
    public int save(Evento p) {
        return 0;
    }


    @Override
    public void delete(int id) {
        mdata.deleteById(id);
    }

    @Override
    public Object findAll() {
        return null;
    }

    @Override
    public Optional<Evento> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(int id) {

    }
}
