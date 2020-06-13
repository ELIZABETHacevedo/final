/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfac;

import entidades.Reserva;
import java.util.Comparator;

/**
 *
 * @author Mery Acevedo
 */
public class orderTimeA implements Comparator<Reserva>{

    @Override
    public int compare(Reserva t, Reserva t1) {
       return t.fechaInicio.compareTo(t1.fechaFinal);
       
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
