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
public class Paciente {
    private int id;
    private String clave;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String entidadNacimiento;
    private String curp;
    private String fechaNacimiento;
    private byte edad;
    private String correoElectronico;
    private String servicioMedico;
    private String afiliacion;
    private String escolaridad;
    private String ocupacion;
    private Domicilio dom;

    public Paciente() {
    }

    public Paciente(String clave, String nombre, String apellidoP, String apellidoM, String entidadNacimiento, String curp, String fechaNacimiento, byte edad, String correoElectronico, String servicioMedico, String afiliacion, String escolaridad, String ocupacion, Domicilio dom) {
        super();
        this.clave = clave;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.entidadNacimiento = entidadNacimiento;
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.servicioMedico = servicioMedico;
        this.afiliacion = afiliacion;
        this.escolaridad = escolaridad;
        this.ocupacion = ocupacion;
        this.dom = dom;
    }
    
    public Paciente(int id, String clave, String nombre, String apellidoP, String apellidoM, String entidadNacimiento, String curp, String fechaNacimiento, byte edad, String correoElectronico, String servicioMedico, String afiliacion, String escolaridad, String ocupacion, Domicilio dom) {
        this(clave, nombre, apellidoP, apellidoM, entidadNacimiento, curp, fechaNacimiento, edad, correoElectronico, servicioMedico, afiliacion, escolaridad, ocupacion, dom);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getEntidadNacimiento() {
        return entidadNacimiento;
    }

    public void setEntidadNacimiento(String entidadNacimiento) {
        this.entidadNacimiento = entidadNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getServicioMedico() {
        return servicioMedico;
    }

    public void setServicioMedico(String servicioMedico) {
        this.servicioMedico = servicioMedico;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Domicilio getDom() {
        return dom;
    }

    public void setDom(Domicilio dom) {
        this.dom = dom;
    }
    
    
}
