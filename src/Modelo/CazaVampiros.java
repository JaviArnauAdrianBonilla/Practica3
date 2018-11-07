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
public class CazaVampiros extends Humanos {
    
    private int vampirosMatados, siguienteSer;
    
    public CazaVampiros(int nacimiento){
        super(nacimiento);
        //SI no funicona bien probar con siguienteSer +1
        super.tipoSer(siguienteSer);
        //siguienteSer += 1;
        
        vampirosMatados = 0;
        
    }
    public int getvampirosMatados(){
        return vampirosMatados;
    }
    public void setvampirosMatados(){
        this.vampirosMatados++; 
    }
    
    public boolean cazarVampiros(){
        return super.probabilidad(1, 3);
    }
    public Zombies convertirAzombie(int nacimiento){
        Zombies z;
        //Creo que falta la probabilidad de convertir a ZOMBIE
        //if(super.probabilidad(velocidad, muerte))
        z = new Zombies(nacimiento);
        return z;
    }
    
}
