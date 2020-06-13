/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Mery Acevedo
 */
public class Reserva {
    public Date fechaInicio,fechaFinal,fechahoy;
    public double total;
    private String numReserva;
    public cliente c;
    

    public Reserva() {
    }

    public Reserva(Date fechaInicio, Date fechaFinal, double total, String nombre,String dui) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechahoy=new Date();
        int diasRes=(int) ((fechaInicio.getTime()-this.fechahoy.getTime())/86400000);
       int dias2=(int) ((fechaFinal.getTime()-fechaInicio.getTime())/86400000);
        if (diasRes>30) {
            this.total=(total+25)*dias2;
        }else{
            this.total = total*dias2;
        }
       
        agregarCliente(nombre,dui);
    }
    
    
    
    
    
    public void agregarCliente(String nombre,String Dui){
        this.c=new cliente("55",nombre,Dui);
        
    }
    
    public void generarNum(){
        
    }
    
}
