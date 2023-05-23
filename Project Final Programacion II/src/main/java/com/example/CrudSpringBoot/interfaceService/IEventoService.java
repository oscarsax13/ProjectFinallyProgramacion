package com.example.CrudSpringBoot.interfaceService;

import com.example.CrudSpringBoot.modelo.Evento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IEventoService {
    public List<Evento> listar();
    public Optional<Evento> listarId(int id);
    public int save (Evento p);


    public void delete(int id);

    Object findAll();

    Optional<Evento> findById(int id);

    void deleteById(int id);
}
