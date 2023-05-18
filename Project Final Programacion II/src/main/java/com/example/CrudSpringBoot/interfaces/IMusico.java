package com.example.CrudSpringBoot.interfaces;

import com.example.CrudSpringBoot.modelo.Musico;
import com.example.CrudSpringBoot.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IMusico extends CrudRepository<Musico, Integer> {
}
