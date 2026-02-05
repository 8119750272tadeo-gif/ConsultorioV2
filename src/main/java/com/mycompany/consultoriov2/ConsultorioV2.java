/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consultoriov2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 81197
 */
public class ConsultorioV2 {
    
static List<Medico> listaMedicos = new ArrayList<Medico>();
static List<Paciente> listaPacientes = new ArrayList<Paciente>();
static List<Cita> listaCitas = new ArrayList<Cita>();


    public static void main(String[] args) {
        String USUARIO_DEFAULT = "tadeo";
        String PASSWORD_DEFAULT = "123";
        
        Scanner entrada = new Scanner(System.in);
        
        Integer accion = 0;
        
        Usuario usuario = new Usuario();
        
        System.out.println("Introduce el usuario");
        usuario.usuario = entrada.nextLine();
        System.out.println("Introduce la contraseña");
        usuario.password = entrada.nextLine();
        
        if(usuario.esDatosValidos(USUARIO_DEFAULT, PASSWORD_DEFAULT)){
           System.out.println("--------Bienvenido al Consultorio version 2.0---------");
           System.out.println("---------------------------");
           while (accion!=7) {
               System.out.println("----------------------------");
               entrada = new Scanner(System.in);
               accion = 0;
               menu();
               accion = entrada.nextInt();
               aplicarAccion(accion);
           }
        
        }else{
            System.out.println("Error de credenciales");
        }
    }

    static void menu(){
        System.out.println("1.- Dar de alta medico");
        System.out.println("2.- Dar de alta paciente");
        System.out.println("3.- Crear cita");
        System.out.println("4.- Mostrar medicos");
        System.out.println("5.- Mostrar pacientes");
        System.out.println("6.- Mostrar citas");
        System.out.println("7.- Salir");
        System.out.println("Escribe la opcion:");
    }
    
    static void aplicarAccion(Integer accion){
        switch (accion){
            case 1:
                darAltaMedico();
                break;
            case 2:
                darAltaPaciente();
                break;
            case 3:
                crearCita();
                break;
            case 4:
                mostrarMedicos();
                break;
            case 5:
                mostrarPacientes();
                break;
            case 6: 
                mostrarCitas();
                break;          
        }
    }
    
    static void darAltaMedico(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---------Dar de alta medico---------");
        Medico medico =new Medico();
        System.out.println("Nombre:");
        medico.nombre = entrada.nextLine();
        System.out.println("Especialidad:");
        medico.especialidad = entrada.nextLine();
        listaMedicos.add(medico);
    }
    
    static void darAltaPaciente(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---------Dar de alta paciente------");
        Paciente paciente = new Paciente();
        System.out.println("Nombre:");
        paciente.nombre = entrada.nextLine();
        System.out.println("Edad:");
        paciente.edad = entrada.nextLine();
        listaPacientes.add(paciente);
        
    }
    
    static void crearCita(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------Crear cita-----------");   
        Cita cita = new Cita();
        System.out.println("Medico:");
        cita.medico = entrada.nextLine();
        System.out.println("Paciente:");
        cita.paciente = entrada.nextLine();
        System.out.println("Fecha:");
        cita.fecha = entrada.nextLine();
        System.out.println("Hora:");
        cita.hora = entrada.nextLine();
        listaCitas.add(cita);
    }
    
    static void mostrarMedicos(){
        System.out.println("---------Mostrar medicos--------");
        for (Medico medico : listaMedicos){
            System.out.println("Nombre: " + medico.nombre);
            System.out.println("Especialidad: + medico.especialidad");
        }
    }
    
    static void mostrarPacientes(){
        System.out.println("---------Mostrar pacientes---------");
        for (Paciente paciente : listaPacientes){
            System.out.println("Nombre: " + paciente.nombre);
            System.out.println("Edad: " + paciente.edad);
        }
    }
    
    static void mostrarCitas(){
        System.out.println("---------Mostrar citas------------");
        for(Cita cita : listaCitas){
            System.out.println("Medico: " + cita.medico);
            System.out.println("Paciente: " + cita.paciente);
            System.out.println("Fecha: " + cita.fecha);
            System.out.println("Hora: " + cita.hora);
        }
    }
    
    
}
