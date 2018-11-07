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
public class Zombies extends Seres{
    
    private int numReproduccion, siguienteSer, convertirseZombie;
    
    public Zombies(int nacimiento){
        super.setNacimiento(nacimiento);
        //SI no funicona bien probar con siguienteSer +1
        super.tipoSer(siguienteSer);
        //siguienteSer += 1;
        this.numReproduccion = 0;
       //Probar sin esto y con esto
        //convertirseZombie = 10;
    }
    public int getprobConvertirseZombie(){
        return convertirseZombie;
    }
    public void setprobConvertiseZombie(int convertir){
        this.convertirseZombie = convertir;
    }
    public void reproduccionZombie(){
        numReproduccion++;
    }
    public boolean convertirHumanoAZombie(){
        return super.probabilidad(1, 10);
    }    
}
