package com.example.CrudSpringBoot.modelo;

import javax.persistence.*;
@Entity
@Table(name = "Musico")
public class Musico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String nombre;
    private  String funcion;
    private  String telefono;
    private String lugarResidencia;

    public Musico() {}
    public Musico(int id, String nombre, String funcion, String telefono, String lugarResidencia) {
        this.id = id;
        this.nombre = nombre;
        this.funcion = funcion;
        this.telefono = telefono;
        this.lugarResidencia = lugarResidencia;
    }

    public int getId() {
        return id;}

    public void setId(int id) {
        this.id = id;}

    public String getNombre() {
        return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public String getFuncion() {
        return funcion;}

    public void setFuncion(String funcion) {
        this.funcion = funcion;}

    public String getTelefono() {
        return telefono;}

    public void setTelefono(String telefono) {
        this.telefono = telefono;}

    public String getLugarResidencia() {
        return lugarResidencia;}

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;}
}


