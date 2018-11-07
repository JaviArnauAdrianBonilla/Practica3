/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author javie
 */
public abstract class Seres {
    private int nacimiento, tipoSer;
    private boolean  serVivo = false;
            
    public Seres(){
       //Si no funciona bien poner el tipo ser a 0 o quitarlo
        this.tipoSer = 1;
       
        this.nacimiento = 1;
        this.serVivo = false;
    }
    
    public boolean probabilidad(int probabilidad, int total){
        return numeroAleatorio(1, total)<= probabilidad;
    }
    public int numeroAleatorio(int minimo, int maximo){
        Random r = new Random();
        int nuevoNumero;
        
        nuevoNumero = r.nextInt(maximo - minimo + 1 ) + minimo;
        
        return nuevoNumero;
    }
    public void setNacimiento(int dia){
        this.nacimiento = dia;
        serVivo = true;
    }
    public void setVivo(){
        serVivo = false;
    }       
    public void tipoSer(int tipoSer){
        this.tipoSer = tipoSer;
    }
    
    public boolean getVivo(){
        return serVivo;
    }
    public int getNacimiento(){
        return nacimiento;
    }   
}

