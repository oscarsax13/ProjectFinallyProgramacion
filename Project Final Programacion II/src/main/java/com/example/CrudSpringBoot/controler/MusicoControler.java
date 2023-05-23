package com.example.CrudSpringBoot.controler;
import com.example.CrudSpringBoot.interfaceService.IMusicoService;
import com.example.CrudSpringBoot.modelo.Musico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class MusicoControler {

    @Autowired
    private IMusicoService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Musico> musico= service.listar();
        model.addAttribute("personas", musico);
        return "eventosTable";
    }

    //GUARDAR
    @PostMapping("/save")
    public String save(@Validated Musico p) {
        service.save(p);
        return "eventoOrquesta";
    }

    //EDITAR
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<Musico> musico = service.listarId(id);
        model.addAttribute("persona", musico);
        return "eventoOrquesta";
//  Posdata: FALTA ELIMINAR

    }
}