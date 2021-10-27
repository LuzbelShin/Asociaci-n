/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author DELL
 */
public class Institucion {
    private int id;
    private String nombre;
    private String entidad;
    private String jurisdiccion;
    private String municipio;
    private String unidad;

    public Institucion() {
    }

    public Institucion(String nombre, String entidad, String jurisdiccion, String municipio, String unidad) {
        this.nombre = nombre;
        this.entidad = entidad;
        this.jurisdiccion = jurisdiccion;
        this.municipio = municipio;
        this.unidad = unidad;
    }

    public Institucion(int id, String nombre, String entidad, String jurisdiccion, String municipio, String unidad) {
        this.id = id;
        this.nombre = nombre;
        this.entidad = entidad;
        this.jurisdiccion = jurisdiccion;
        this.municipio = municipio;
        this.unidad = unidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getJurisdiccion() {
        return jurisdiccion;
    }

    public void setJurisdiccion(String jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    
}
