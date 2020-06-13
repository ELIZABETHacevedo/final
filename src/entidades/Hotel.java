/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfac.Habitacion;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mery Acevedo
 */
public class Hotel {
    private admin admin1;
    String mensaje;
   public ArrayList<HabitacionLujo> habitacionesLujo =new ArrayList<>();
   
   public ArrayList<habitacionMedia> habitacionesMedia =new ArrayList<>();
   
   public ArrayList<habitacionFamiliar> habitacionesFamilia =new ArrayList<>();
   
  
    public Hotel(){
        for (int i = 0; i < 3; i++) {
            this.habitacionesFamilia.add(new habitacionFamiliar(String.valueOf(i),25.0,"C"));
            this.habitacionesLujo.add(new HabitacionLujo(String.valueOf(i),100.0,"A"));
            this.habitacionesMedia.add(new habitacionMedia(String.valueOf(i),50.0,"B"));
        }
        this.admin1=new admin("jklele","123","jose pedro","125123-3");
    }
    
    public String generarReserva(int opcion,Date a,Date b,String nombre,String Dui){
        switch (opcion) {
            case 1:
                r(a,b,nombre,Dui);
                return this.mensaje;
            case 2:
                r2(a,b,nombre,Dui);
                return this.mensaje;
            case 3:
                r3(a,b,nombre,Dui);
                return this.mensaje;
                
            default:
                return ("no ha sido posible la reserva");
        }
        
    }
    
    public boolean r(Date a,Date b,String nombre,String dui){
        for (int i = 0; i < this.habitacionesLujo.size(); i++) {
            if (this.habitacionesLujo.get(i).verificarDisponibilidad(a, b)) {
                this.mensaje=this.habitacionesLujo.get(i).crearReserva(a,b,nombre,dui)
                          +"\n"+"total a pagar "+this.habitacionesLujo.get(i).generarPrecio();
                System.out.println("la reserva fue hecha");
                
                return true;
            }
   
        }this.mensaje="la reserva no fue hecha";
        return false;
    }
    
    public boolean r2(Date a,Date b,String nombre,String dui){
        for (int i = 0; i < this.habitacionesMedia.size(); i++) {
            if (this.habitacionesMedia.get(i).verificarDisponibilidad(a, b)) {
                this.mensaje=this.habitacionesMedia.get(i).crearReserva(a,b,nombre,dui)
                            +"\n" +"total a pagar "+this.habitacionesMedia.get(i).generarPrecio();;
                System.out.println("la reserva fue hecha");
                return true;
            }
   
        }
         this.mensaje="la reserva no fue hecha";
        return false;
    } 
    
     public boolean r3(Date a,Date b,String nombre,String dui){
        for (int i = 0; i < this.habitacionesFamilia.size(); i++) {
            if (this.habitacionesFamilia.get(i).verificarDisponibilidad(a, b)) {
                this.mensaje=this.habitacionesFamilia.get(i).crearReserva(a,b,nombre,dui)
                           +"\n"+"total a pagar "+this.habitacionesFamilia.get(i).generarPrecio();
                System.out.println("la reserva fue hecha");
                return true;
            }
   
        }
         this.mensaje="la reserva no fue hecha";
        return false;
    }
}
