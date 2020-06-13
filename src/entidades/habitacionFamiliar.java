/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfac.Habitacion;
import interfac.habitacionInterface;
import java.util.Date;

/**
 *
 * @author Mery Acevedo
 */
public class habitacionFamiliar extends Habitacion  implements habitacionInterface
{

    public habitacionFamiliar(String numHabitacion, double precio, String tipo) {
        super(numHabitacion, precio, tipo);
    }
    
     public String crearReserva(Date a,Date b,String nombre,String dui){
        this.lreservas.add(new Reserva(a,b,generarPrecio(),nombre,dui));
        System.out.println("habitacion:  "+this.numHabitacion+this.tipo);
         return ("Habitacion: "+this.numHabitacion+this.tipo);
    }

    @Override
    public double generarPrecio() {
         return this.precio;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarPaquete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
