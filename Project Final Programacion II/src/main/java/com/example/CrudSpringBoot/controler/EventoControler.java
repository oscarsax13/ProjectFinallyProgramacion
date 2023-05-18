package com.example.CrudSpringBoot.controler;

import com.example.CrudSpringBoot.interfaceService.IEventoService;
import com.example.CrudSpringBoot.modelo.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class EventoControler {
    @Autowired
    private IEventoService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Evento> evento= service.listar();
        model.addAttribute("personas", evento);
        return "musicosTable";
    }

    //GUARDAR
    @PostMapping("/save")
    public String save(@Validated Evento p) {
        service.save(p);
        return "eventoOrquesta";
    }

    //EDITAR
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<Evento> evento = service.listarId(id);
        model.addAttribute("persona", evento);
        return "eventoOrquesta";
//  Posdata: FALTA ELIMINAR

    }
}
