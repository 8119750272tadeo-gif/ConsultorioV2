/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultoriov2;

/**
 *
 * @author 81197
 */
public class Usuario {
    String usuario;
    String password;  
    
    boolean esDatosValidos(String usuario,String password){
        if(this.usuario.equals(usuario)&& this.password.equals(password)){
            return true;
        }
        return false;
    }
}
