package com.example.CrudSpringBoot.interfaces;

import com.example.CrudSpringBoot.modelo.Evento;
import com.example.CrudSpringBoot.modelo.Musico;
import org.springframework.data.repository.CrudRepository;

public interface IEvento extends CrudRepository<Evento, Integer> {
}
