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
public class Domicilio {
    private int id;
    private String calle;
    private String numero;
    private String colonia;
    private String localidad;
    private String entidadFederativa;
    private String jurisdiccion;
    private String telefono;
    private String otraCalle;
    private String otroNumero;
    private String otraColonia;
    private String OtraLocalidad;

    public Domicilio() {
    }

    public Domicilio(String calle, String numero, String colonia, String localidad, String entidadFederativa, String jurisdiccion, String telefono, String otraCalle, String otroNumero, String otraColonia, String OtraLocalidad) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.localidad = localidad;
        this.entidadFederativa = entidadFederativa;
        this.jurisdiccion = jurisdiccion;
        this.telefono = telefono;
        this.otraCalle = otraCalle;
        this.otroNumero = otroNumero;
        this.otraColonia = otraColonia;
        this.OtraLocalidad = OtraLocalidad;
    }

    public Domicilio(int id, String calle, String numero, String colonia, String localidad, String entidadFederativa, String jurisdiccion, String telefono, String otraCalle, String otroNumero, String otraColonia, String OtraLocalidad) {
        this(calle, numero, colonia, localidad, entidadFederativa, jurisdiccion, telefono, otraCalle, otroNumero, otraColonia, OtraLocalidad);
        this.id = id;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEntidadFederativa() {
        return entidadFederativa;
    }

    public void setEntidadFederativa(String entidadFederativa) {
        this.entidadFederativa = entidadFederativa;
    }

    public String getJurisdiccion() {
        return jurisdiccion;
    }

    public void setJurisdiccion(String jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOtraCalle() {
        return otraCalle;
    }

    public void setOtraCalle(String otraCalle) {
        this.otraCalle = otraCalle;
    }

    public String getOtroNumero() {
        return otroNumero;
    }

    public void setOtroNumero(String otroNumero) {
        this.otroNumero = otroNumero;
    }

    public String getOtraColonia() {
        return otraColonia;
    }

    public void setOtraColonia(String otraColonia) {
        this.otraColonia = otraColonia;
    }

    public String getOtraLocalidad() {
        return OtraLocalidad;
    }

    public void setOtraLocalidad(String OtraLocalidad) {
        this.OtraLocalidad = OtraLocalidad;
    }
    
    
    
}
