package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.interfaceService.IMusicoService;
import com.example.CrudSpringBoot.modelo.Musico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class MusicoService implements IMusicoService {

    @Autowired
    private IMusicoService mdata;

    @Override
    public List<Musico> listar() {
        return (List<Musico>) mdata.findAll();
    }

    @Override
    public Optional<Musico> listarId(int id) {

        return mdata.findById(id);
    }

    @Override
    public int save(Musico p) {
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
    public Optional<Musico> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(int id) {

    }

}
