/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author javie
 */
public class Humanos extends Seres {
    private int velocidad, reproduccion, muerte, siguienteSer;
    
    public Humanos(int nacimiento){
        super.setNacimiento(nacimiento);
        //SI no funicona bien probar con siguienteSer +1
        super.tipoSer(siguienteSer);
        //siguienteSer += 1;
        velocidad = super.numeroAleatorio(60, 100);
        muerte = 300;
        reproduccion = 30;
        
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    public boolean probSobrevivir(){
        if(super.probabilidad(1,300)){
            super.setVivo();
            return false;
        }
        else if(super.probabilidad(1, 500)){
            super.setVivo();
            return false;
        }
        else
            return true;
    }
    public int probReproduccion(float temperatura){
        if(temperatura >= 22){
            reproduccion = 15;
        }
        else if(temperatura <=18){
            reproduccion = 50;
        }
        else
            reproduccion = 30;
        
        return reproduccion;
    }
    public Vampiros convertirAVampiro(){
        Vampiros v = null;
        if(super.probabilidad(1, 2)){
            v = new Vampiros(this.getNacimiento());
            return v;
        }
        else
            return v;
    }
    
    public Zombies convertirAzombie(int nacimiento){
        Zombies z;
        //Creo que falta la probabilidad de convertir a ZOMBIE
        //if(super.probabilidad(velocidad, muerte))
        z = new Zombies(nacimiento);
        return z;
    }
    
    public boolean reproduccion(float temperatura){
        return super.probabilidad(this.probReproduccion(temperatura), 1);
    }
    public int numHijos(){
        int num = super.numeroAleatorio(1, 3);
        return num;
    }
}
