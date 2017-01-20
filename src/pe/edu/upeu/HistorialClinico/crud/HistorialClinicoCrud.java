/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.HistorialClinico.crud;


import java.util.Vector;
import pe.edu.upeu.HistorialClinico.model.Paciente;
import pe.edu.upeu.HistorialClinico.model.HistorialClinico;
import pe.edu.upeu.HistorialClinico.model.Medico;
/**
 *
 * @author Docente
 */
public class HistorialClinicoCrud {

    public Vector listaPaciente = new Vector();

    public void create(Paciente paciente) {
        listaPaciente.add(paciente);
    }

    public void list() {
        for (int i = 0; i <listaPaciente.size(); i++) {
            Paciente pacienteObj = (Paciente)listaPaciente.get(i);
            System.out.println(pacienteObj.getNombre()+ " - " + pacienteObj.getApellidos()+ " - " + pacienteObj.getGenero());
        }
    }

    public Paciente findByCode(String codigo) {

        Paciente pacienteBus = null;//basio

        for (int i = 0; i < listaPaciente.size(); i++) {
            Paciente pacientee = (Paciente) listaPaciente.get(i);
            if (pacientee.getNombre().equals(codigo)) {//.ecuals es para compara string
                pacienteBus = pacientee;
            } else{
                pacienteBus = new  Paciente();
            }
        }

        return pacienteBus;
    }

    public void remove(Paciente paciente) {
        if (listaPaciente.remove(paciente) == true) {
            System.out.println("Nombre : " +paciente.getNombre()+ "Eliminado correctamente");
        } else {
            System.out.println("No se pudo eliminar");
        }
    }

    public void update(Paciente pacienteOld, Paciente pacienteNew) {
        int indiceEdificio =listaPaciente.indexOf(pacienteOld);
        listaPaciente.set(indiceEdificio, pacienteNew);
    }

}
