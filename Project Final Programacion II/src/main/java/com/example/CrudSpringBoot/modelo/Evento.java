package com.example.CrudSpringBoot.modelo;

import javax.persistence.*;

@Entity
@Table(name = "Evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String tipo;
    private String lugar;
    private String fecha;

    public Evento(){}

    public Evento(int id, String nombre, String tipo, String lugar, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

