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
public class cliente extends Persona {
    
    public String numReserva;

    public cliente(String numReserva, String nombre, String dui) {
        super(nombre, dui);
        this.numReserva = numReserva;
    }

   

    
    
    
    
}
