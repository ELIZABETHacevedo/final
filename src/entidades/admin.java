/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfac.Persona;

/**
 *
 * @author Mery Acevedo
 */
public class admin extends Persona{
    public String user,password;

    public admin(String user, String password, String nombre, String dui) {
        super(nombre, dui);
        this.user = user;
        this.password = password;
    }
    
    
    
}
