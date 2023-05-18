package com.example.CrudSpringBoot.interfaceService;

import com.example.CrudSpringBoot.modelo.Musico;
import com.example.CrudSpringBoot.modelo.Persona;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IMusicoService {
    public List<Musico> listar();
    public Optional<Musico> listarId(int id);
    public int save (Musico p);
    public void delete(int id);

    Object findAll();

    Optional<Musico> findById(int id);

    void deleteById(int id);
}
