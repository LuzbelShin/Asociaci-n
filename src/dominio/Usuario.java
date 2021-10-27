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
public class Usuario {
  private int id;
  private String nombre;
  private String apellido;
  private String puesto;
  private String usuario;
  private String contrasena;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String puesto, String usuario, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Usuario(String nombre, String apellido, String puesto, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.usuario = usuario;
        this.contrasena = contrasena;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
  
  
  
  
}
