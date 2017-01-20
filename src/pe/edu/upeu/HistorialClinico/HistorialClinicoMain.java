/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.HistorialClinico;

import java.util.Scanner;
import javax.swing.JOptionPane;
import pe.edu.upeu.HistorialClinico.crud.HistorialClinicoCrud;
import pe.edu.upeu.HistorialClinico.model.Paciente;
import pe.edu.upeu.HistorialClinico.model.Medico;

/**
 *
 * @author Docente
 */
public class HistorialClinicoMain {

    public static void menu() {
        String menu = "";
        menu += "Bienvenido al Sistema de Historial CLinico\n";
        menu += "(1) Gestionar Pasiente\n";
        menu += "(2) GEstionar Medicos\n";
        menu += "(3) Gestionar Historial Clinico\n";
        menu += "(4) Salir\n";
        System.out.println(menu);
       
    }

    public static void main(String[] args) {
        HistorialClinicoCrud crud = new HistorialClinicoCrud();
        menu();
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Elija una opción del menu");
             int opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    
                    //crear
                    
                    System.out.println("Ingrese Nombre Del Paciente:");
                    String nombres = leer.next();
                    System.out.println("Ingrese El Apellido Del Paciente:");
                    String apellidos = leer.next();
                    System.out.println("Ingrese la Edad:");
                    String edad = leer.next();
                    System.out.println("Genero:");
                    String genero = leer.next();

                    Paciente pacienteNuevo = new Paciente();
                    pacienteNuevo.setNombre(nombres);
                    pacienteNuevo.setApellidos(apellidos);
                    pacienteNuevo.setEdad(edad);
                    
                    crud.create(pacienteNuevo);
                }
                break;
                case 2: {
                    crud.list();
                }
                break;
                case 3: {
                    System.out.println("buscar por Nombre:");
                    String Nombre = leer.next();
                    Paciente pacienteDel = crud.findByCode(Nombre);
                    if (pacienteDel.getNombre()!= null) {
                        crud.remove(pacienteDel);
                    } else {
                        System.out.println("el Nombre no existe");
                    }
                }
                break;

                case 4: {
                    System.out.println("buscar buscar apartamentos:");
                    String Nombre = leer.next();
                    System.out.println("apartamento encontrado encontrado : " + crud.findByCode(Nombre).getNombre());
                }
                break;
                case 5: {
                    System.out.println("buscar apartamento:");
                    String Nombre = leer.next();
                    Paciente pacienteBus = crud.findByCode(Nombre);
                    if (pacienteBus.getNombre()!= null) {
                        

                        System.out.println("nuevos nombres:");
                        String nombresNew = leer.next();
                        System.out.println("nuevos apellidos:");
                        String apellidosNew = leer.next();
                        System.out.println("nuevo apartamento:");
                        String edadNew = leer.next();

                       Paciente pacienteNew = new Paciente(null, nombresNew, apellidosNew,edadNew);
            
                        crud.update(pacienteBus, pacienteNew);
                    } else {
                        System.out.println("Persona no encontrada");
                    }

                }
                break;

                default: {
                    System.out.println("Usted ha elegido una opcion inválida");
                }
            }
        } while (true);
    }
}
