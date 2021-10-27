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
public class Antecedentes {

    private int id;
    private String citologia;
    private String situacionGinecologica;
    private String nombre;
    private String inicioVidaSexual;
    private int edadVida;
    private String atencedentesVacunaVPH;
    private int edadVPH;
    private String dosis;
    private String fechaRegla;
    private String utencilioMuestra;
    private String responsableCitologia;
    private String fechaMuestra;
    private String factoresRiego;
    private String cartillVacunacion;
    private String muestraRepetida;
    private String numeroCitologias;
    private Paciente paciente;

    public Antecedentes() {
    }

    public Antecedentes(String citologia, String situacionGinecologica, String nombre, String inicioVidaSexual, int edadVida, String atencedentesVacunaVPH, int edadVPH, String dosis, String fechaRegla, String utencilioMuestra, String responsableCitologia, String fechaMuestra, String factoresRiego, String cartillVacunacion, String muestraRepetida, String numeroCitologias, Paciente paciente) {
        
        this.citologia = citologia;
        this.situacionGinecologica = situacionGinecologica;
        this.nombre = nombre;
        this.inicioVidaSexual = inicioVidaSexual;
        this.edadVida = edadVida;
        this.atencedentesVacunaVPH = atencedentesVacunaVPH;
        this.edadVPH = edadVPH;
        this.dosis = dosis;
        this.fechaRegla = fechaRegla;
        this.utencilioMuestra = utencilioMuestra;
        this.responsableCitologia = responsableCitologia;
        this.fechaMuestra = fechaMuestra;
        this.factoresRiego = factoresRiego;
        this.cartillVacunacion = cartillVacunacion;
        this.muestraRepetida = muestraRepetida;
        this.numeroCitologias = numeroCitologias;
        this.paciente = paciente;
    }
    
    public Antecedentes(int id, String citologia, String situacionGinecologica, String nombre, String inicioVidaSexual, int edadVida, String atencedentesVacunaVPH, int edadVPH, String dosis, String fechaRegla, String utencilioMuestra, String responsableCitologia, String fechaMuestra, String factoresRiego, String cartillVacunacion, String muestraRepetida, String numeroCitologias, Paciente paciente) {
        this.id = id;
        this.citologia = citologia;
        this.situacionGinecologica = situacionGinecologica;
        this.nombre = nombre;
        this.inicioVidaSexual = inicioVidaSexual;
        this.edadVida = edadVida;
        this.atencedentesVacunaVPH = atencedentesVacunaVPH;
        this.edadVPH = edadVPH;
        this.dosis = dosis;
        this.fechaRegla = fechaRegla;
        this.utencilioMuestra = utencilioMuestra;
        this.responsableCitologia = responsableCitologia;
        this.fechaMuestra = fechaMuestra;
        this.factoresRiego = factoresRiego;
        this.cartillVacunacion = cartillVacunacion;
        this.muestraRepetida = muestraRepetida;
        this.numeroCitologias = numeroCitologias;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCitologia() {
        return citologia;
    }

    public void setCitologia(String citologia) {
        this.citologia = citologia;
    }

    public String getSituacionGinecologica() {
        return situacionGinecologica;
    }

    public void setSituacionGinecologica(String situacionGinecologica) {
        this.situacionGinecologica = situacionGinecologica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInicioVidaSexual() {
        return inicioVidaSexual;
    }

    public void setInicioVidaSexual(String inicioVidaSexual) {
        this.inicioVidaSexual = inicioVidaSexual;
    }

    public int getEdadVida() {
        return edadVida;
    }

    public void setEdadVida(int edadVida) {
        this.edadVida = edadVida;
    }

    public String getAtencedentesVacunaVPH() {
        return atencedentesVacunaVPH;
    }

    public void setAtencedentesVacunaVPH(String atencedentesVacunaVPH) {
        this.atencedentesVacunaVPH = atencedentesVacunaVPH;
    }

    public int getEdadVPH() {
        return edadVPH;
    }

    public void setEdadVPH(int edadVPH) {
        this.edadVPH = edadVPH;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFechaRegla() {
        return fechaRegla;
    }

    public void setFechaRegla(String fechaRegla) {
        this.fechaRegla = fechaRegla;
    }

    public String getUtencilioMuestra() {
        return utencilioMuestra;
    }

    public void setUtencilioMuestra(String utencilioMuestra) {
        this.utencilioMuestra = utencilioMuestra;
    }

    public String getResponsableCitologia() {
        return responsableCitologia;
    }

    public void setResponsableCitologia(String responsableCitologia) {
        this.responsableCitologia = responsableCitologia;
    }

    public String getFechaMuestra() {
        return fechaMuestra;
    }

    public void setFechaMuestra(String fechaMuestra) {
        this.fechaMuestra = fechaMuestra;
    }

    public String getFactoresRiego() {
        return factoresRiego;
    }

    public void setFactoresRiego(String factoresRiego) {
        this.factoresRiego = factoresRiego;
    }

    public String getCartillVacunacion() {
        return cartillVacunacion;
    }

    public void setCartillVacunacion(String cartillVacunacion) {
        this.cartillVacunacion = cartillVacunacion;
    }

    public String getMuestraRepetida() {
        return muestraRepetida;
    }

    public void setMuestraRepetida(String muestraRepetida) {
        this.muestraRepetida = muestraRepetida;
    }

    public String getNumeroCitologias() {
        return numeroCitologias;
    }

    public void setNumeroCitologias(String numeroCitologias) {
        this.numeroCitologias = numeroCitologias;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
