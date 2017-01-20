/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.HistorialClinico.model;

/**
 *
 * @author TOSHIBA
 */
public class Medico {
    private String identificacion;
    private String Nombre;
    private String Apellidos;
    private String Especialidad;

    public Medico() {
    }

    public Medico(String identificacion, String Nombre, String Apellidos, String Especialidad) {
        this.identificacion = identificacion;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Especialidad = Especialidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
}
