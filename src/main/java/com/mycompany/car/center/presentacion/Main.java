package com.mycompany.car.center.presentacion;

import com.mycompany.car.center.controller.FuncionarioController;
import com.mycompany.car.center.domain.Funcionario;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void obtenerFuncionarios(FuncionarioController funcionarioController) {
        try {

            List<Funcionario> funcionarios = funcionarioController.obtenerFuncionarios();

            if (funcionarios.isEmpty()) {
                System.out.println("no hay datos");
            } else {
                funcionarios.forEach(funcionario -> {
                    System.out.print("id: " + funcionario.getId());
                    System.out.print("Tipo identificacion: " + funcionario.getTipo_identificacion());
                    System.out.print("Tipo identificacion: " + funcionario.getNumero_identificacion());
                    System.out.print("Tipo identificacion: " + funcionario.getNombre());
                    System.out.print("Tipo identificacion: " + funcionario.getApellido());
                    System.out.print("Tipo identificacion: " + funcionario.getEstado_civil());
                    System.out.print("Tipo identificacion: " + funcionario.getSexo());
                    System.out.print("Tipo identificacion: " + funcionario.getDireccion());
                    System.out.print("Tipo identificacion: " + funcionario.getTelefono());
                    System.out.print("Tipo identificacion: " + funcionario.getFecha_nacimiento());

                });
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static void crear(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite el tipo de cedula: ");
            String tipoCedula = sc.nextLine();
            System.out.println("El tipo de cedula es: " + tipoCedula);
            System.out.println("----------------------");
            System.out.println("----------------------");
            
            System.out.println("Digite el numero de identificacion ");
            String numeroIdentificacion = sc.nextLine();
            System.out.println("El umero de identificacioa es " + numeroIdentificacion);
            System.out.println("----------------------");
            System.out.println("----------------------");
            
            System.out.println("Digite el nombre ");
            String nombre = sc.nextLine();
            System.out.println("El nombre es " + nombre);
            System.out.println("----------------------");
            System.out.println("----------------------");
            
            System.out.println("Digite el apellido ");
            String apellido = sc.nextLine();
            System.out.println("El apellido es " + apellido);
            System.out.println("----------------------");
            System.out.println("----------------------");
            
            System.out.println("Digite el estado civil ");
            String estadoCivil = sc.nextLine();
            System.out.println("El estado civil es " + estadoCivil);
            System.out.println("----------------------");
            System.out.println("----------------------");
            
            System.out.println("Digite el sexo ");
            String sexo = sc.nextLine();
            System.out.println("El sexo es " + sexo);
            System.out.println("----------------------");
            System.out.println("----------------------");
            
            System.out.println("Digite el direccion ");
            String direccion = sc.nextLine();
            System.out.println("La direcciones " + direccion);
            System.out.println("----------------------");
            System.out.println("----------------------");
            
            System.out.println("Digite el telefono ");
            String telefono = sc.nextLine();
            System.out.println("El telefono es " + telefono);
            System.out.println("----------------------");
            System.out.println("----------------------");
            
            System.out.println("Digite la Fecha de Nacimiento ");
            String fechaNacimientoStr = sc.nextLine();
            java.sql.Date fechaNacimiento = null;
            try {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date utilFechaNacimiento = formatoFecha.parse(fechaNacimientoStr);
                fechaNacimiento = new java.sql.Date(utilFechaNacimiento.getTime());
                System.out.println("Fecha de nacimiento en tipo Date: " + fechaNacimiento);
            } catch (ParseException e) {
                System.out.println("Error al convertir la fecha de nacimiento.");
            }
            
            System.out.println("----------------------");
            System.out.println("----------------------");
            
            Funcionario funcionario = new Funcionario();
            funcionario.setTipo_identificacion(tipoCedula);
            funcionario.setNumero_identificacion(numeroIdentificacion);
            funcionario.setNombre(nombre);
            funcionario.setApellido(apellido);
            funcionario.setEstado_civil(estadoCivil);
            funcionario.setSexo(sexo);
            funcionario.setDireccion(direccion);
            funcionario.setTelefono(telefono);
            funcionario.setFecha_nacimiento(fechaNacimiento);
            
            funcionarioController.crear(funcionario);
            System.out.println("Funcionario creado con éxito");
            obtenerFuncionarios(funcionarioController);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        

    }
    
    public static void elminar(FuncionarioController funcionarioController) {
            
        try {
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            System.out.println("El id a borrar es " + id);
            
            Funcionario funcionarioExist = funcionarioController.obtenerFuncionario(id);
            
            if (funcionarioExist == null) {
                System.out.println("No existe carro");
                return;
            }
            
            funcionarioController.eliminarFuncionario(id);
            System.out.println("Carro eliminado con éxito ");
            
            obtenerFuncionarios(funcionarioController);
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
            
            
            
    public static void main(String[] args) {
        
        
        
        
    }
}
