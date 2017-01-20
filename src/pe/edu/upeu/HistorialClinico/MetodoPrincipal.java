/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.HistorialClinico;

import pe.edu.upeu.HistorialClinico.crud.HistorialClinicoCrud;
import pe.edu.upeu.HistorialClinico.model.Paciente;

/**
 *
 * @author Docente
 */
public class MetodoPrincipal {

    public static void main(String[] args) {
        HistorialClinicoCrud crud = new HistorialClinicoCrud();
        
        Paciente paciente = new Paciente();
        
        paciente.setNombre("Alicia");
        paciente.setApellidos("Zolorsano Quispe");
        paciente.setEdad(29);
        
        Paciente paciente1 = new Paciente();
        
        paciente1.setNombre("Julia");
        paciente1.setApellidos("Gutierres Ramos");
        paciente1.setEdad(12);
        
        Paciente paciente2 = new Paciente();
        
        paciente2.setNombre("alex");
        paciente2.setApellidos("Quispe Ventura");
        paciente2.setEdad(22);
        
        crud.create(paciente);
        crud.create(paciente1);
        crud.create(paciente2);
        //crud.create(estudiante4);
        crud.list();
        
    }      

}
