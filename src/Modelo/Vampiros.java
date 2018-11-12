/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author javie
 */
public class Vampiros extends Seres implements Serializable{
    private int numReproduccion, siguienteSer;
    
    //Puede ser que nacimiento dentro de vampiros no sea necesario
    public Vampiros(int nacimiento){
        super.setNacimiento(nacimiento);
        //SI no funicona bien probar con siguienteSer +1
        super.tipoSer(siguienteSer);
        //siguienteSer += 1;
        this.numReproduccion = 0;
    }
    public boolean MatarHumano(){
        return super.probabilidad(1, 2);
    }
    public void vampirosConvertidos(){
        numReproduccion++;
    }
    
}
