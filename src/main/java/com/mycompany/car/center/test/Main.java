package com.mycompany.car.center.test;

import com.mycompany.car.center.controller.FuncionarioController;
import com.mycompany.car.center.domain.Funcionario;
import java.sql.SQLException;
import java.util.List;

public class Main {
    
    public static void obtenerFuncionarios(FuncionarioController funcionarioController) {
        try {
                        
            List<Funcionario> funcionarios = funcionarioController.obtenerFuncionarios();
            
            if (funcionarios.isEmpty()){
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
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    
    }

    public static void main(String[] args) {
        FuncionarioController funcionarioController = new FuncionarioController();
        obtenerFuncionarios(funcionarioController);
    }
}
