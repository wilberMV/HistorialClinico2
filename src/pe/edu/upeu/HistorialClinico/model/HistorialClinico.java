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
public class HistorialClinico {
    private String Codigo;
    private String Fecha;
    private String IdPaciente;
    private String IdMedico;
    private String Observaciones;

    public HistorialClinico() {
    }

    public HistorialClinico(String Codigo, String Fecha, String IdPaciente, String IdMedico, String Observaciones) {
        this.Codigo = Codigo;
        this.Fecha = Fecha;
        this.IdPaciente = IdPaciente;
        this.IdMedico = IdMedico;
        this.Observaciones = Observaciones;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(String IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public String getIdMedico() {
        return IdMedico;
    }

    public void setIdMedico(String IdMedico) {
        this.IdMedico = IdMedico;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

}