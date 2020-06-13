/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfac;

import entidades.Reserva;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mery Acevedo
 */
public abstract class Habitacion {
     public String numHabitacion;
    public double precio;
    public String tipo;
    public ArrayList<Reserva>lreservas=new ArrayList<>();

    public Habitacion(String numHabitacion, double precio, String tipo) {
        this.numHabitacion = numHabitacion;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    public boolean verificarDisponibilidad(Date a,Date b){
     if(this.lreservas.size()>0){
        orderTimeA ota=new orderTimeA();
        this.lreservas.sort(ota);
        Boolean bandera=true;

        for (int i = 0; i < this.lreservas.size(); i++) {
   

            if (this.lreservas.get(i).fechaInicio.compareTo(a)>=0 && this.lreservas.get(i).fechaInicio.compareTo(a)<=0) {
                bandera=false;
                break;
            }else if(this.lreservas.get(i).fechaFinal.compareTo(a)>=0 && this.lreservas.get(i).fechaFinal.compareTo(a)<=0){
                bandera=false;
                break;
            }
            else{
               this.precio=this.precio+this.lreservas.get(i).total;
                bandera=true;
            }
    
    
            
        }
        
        return bandera;
        }else{
            System.out.println("RESERVA 1");
            return true;
        }     
}
}