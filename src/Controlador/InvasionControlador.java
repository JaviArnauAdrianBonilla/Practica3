/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Seres;
import Modelo.Humanos;
import Modelo.CazaVampiros;
import Modelo.Vampiros;
import Modelo.Zombies;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Javier Arnau y Adrian Bonilla
 */
public class InvasionControlador implements Serializable {
    private ArrayList<Humanos> humanos;
    private ArrayList<Humanos> humanosnacidos;
    private ArrayList<Humanos> humanosmuertos;
    private ArrayList<Humanos> humanosaux;

    private ArrayList<CazaVampiros> cazavampiros;
    private ArrayList<CazaVampiros> cazavampirosnacidos;
    private ArrayList<CazaVampiros> cazavampirosmuertos;
    private ArrayList<CazaVampiros> cazavampirosaux;

    private ArrayList<Vampiros> vampiros;
    private ArrayList<Vampiros> vampir;
    private ArrayList<Vampiros> vampirosnacidos;
    private ArrayList<Vampiros> vampirosmuertos;  
    
    private ArrayList<Zombies> zombies;
    private ArrayList<Zombies> zombiesnacidos;
    private ArrayList<Zombies> zombiesmuertos;

    private Seres ser;
    private float temperatura;
    private int dia;
    private int[] detallesTipoSer;
    
    public InvasionControlador(){
        humanos = new ArrayList<Humanos>();
        cazavampiros = new ArrayList<CazaVampiros>();
        zombies = new ArrayList<Zombies>();
        vampiros = new ArrayList<Vampiros>();
        ser = new Seres() {};
        detallesTipoSer = new int[10];
    }
    
    public void setEliminarDetallesTipoSer(){
        for(int i = 0; i < detallesTipoSer.length; i++){
            detallesTipoSer[i] = 0;
        }
    }
    public void probabilidadConvertirseZombie(int convertir){
        for(int i = 0; i < zombies.size(); i++){
            zombies.get(i).setprobConvertiseZombie(convertir);
        }
    }
    public void creacionHumanos(int cantidad){
        Humanos human;
        for(int i = 0; i < cantidad; i++){
            human = new Humanos(dia);
            humanos.add(human);
        }
    }
    public String cantidadHumanos(){
        String cadena;
        cadena = Integer.toString(humanos.size());
        return cadena;
    }
    public void creacionCazaVampiros(int cantidad){
        CazaVampiros cazaV;
        for(int i = 0; i < cantidad; i++){
            cazaV = new CazaVampiros(dia);
            cazavampiros.add(cazaV);
        }
    }
    public String cantidadCazaVampiros(){
        String cadena; 
        cadena = Integer.toString(cazavampiros.size());
        return cadena;
    }
    
    public void creacionZombies(int cantidad){
        Zombies zombie;
        for(int i = 0; i < cantidad; i++){
            zombie = new Zombies(dia);
            zombies.add(zombie);
        }
    }
    public String cantidadZombies(){
        String cadena; 
        cadena = Integer.toString(zombies.size());
        return cadena;
    }
    

    public void creacionVampiros(int cantidad){
        Vampiros vamp;
        for(int i = 0; i < cantidad; i++){
            vamp = new Vampiros(dia);
            vampiros.add(vamp);
        }
    }
    public String cantidadVampiros(){
        String cadena; 
        cadena = Integer.toString(vampiros.size());
        return cadena;
    }
    
    public String getDia(){
        String cadena;
        cadena = Integer.toString(dia);
        return cadena;
    }
    
    public void setDia(){
        dia++;
    }
    
    public void incrementarTemperatura(float incremento){
        temperatura += incremento;
    }
    
    public void disminuirTemperatura(float disminuir){
        temperatura -= disminuir;    
    }
    
    public void setTemperatura(){
        int numeroAleatorio = ser.numeroAleatorio(1, 100);
        if(temperatura <= 18){
            if(numeroAleatorio > 55)
                temperatura -= 0.5;
            else
                temperatura += 0.5;
        } 
        else if(temperatura >= 22){
            if(numeroAleatorio > 55)
                temperatura += 0.5;
            else
                temperatura -= 0.5;
        }
        else{
            if(numeroAleatorio >65 && numeroAleatorio <=95)
                temperatura -= 0.5;
            else if(numeroAleatorio <= 65)
                temperatura += 0.5;
        }
    }
    
    public String getTemperatura(){
        return temperatura + "";
    }
    
    public void crearInvasion(){
        int numAleatorioHumanos,numAleatorioCazavampiros,numAleatorioVampiros,numAleatorioZombies;
        
        humanos.clear();
        cazavampiros.clear();
        vampiros.clear();
        zombies.clear();
        
        numAleatorioHumanos = ser.numeroAleatorio(4000, 6000);
        numAleatorioCazavampiros = ser.numeroAleatorio(10, 15);
        numAleatorioVampiros = ser.numeroAleatorio(15, 20);
        numAleatorioZombies = ser.numeroAleatorio(20, 30);
        
        creacionHumanos(numAleatorioHumanos);
        creacionCazaVampiros(numAleatorioCazavampiros);
        creacionVampiros(numAleatorioVampiros);
        creacionZombies(numAleatorioZombies);
        
        //Esto es una prueba para ver si cogia bien los datos
       /* numAleatorioHumanos = 3000;
        numAleatorioCazavampiros = 12;
        numAleatorioVampiros = 18;
        numAleatorioZombies = 25;
        
        
        creacionHumanos(numAleatorioHumanos);
        creacionCazaVampiros(numAleatorioCazavampiros);
        creacionVampiros(numAleatorioVampiros);
        creacionZombies(numAleatorioZombies);        
        */
        dia = 1;
        temperatura = 20;
    }
    
    public void AvanzarDia(){
        //dia++;
        setDia();
        setTemperatura();
        setEliminarDetallesTipoSer();
        vidaHumano();
        vidaCazaVampiro();
        vidaVampiro();
        vidaZombie();
    }
    
    public void vidaHumano(){
       humanosnacidos = new ArrayList<Humanos>();
       humanosmuertos = new ArrayList<Humanos>();
       Humanos humano, hijos;
       int numHijos, velocidadHumanos;
       
       for(int i = 0; i < humanos.size(); i++){
           humano = humanos.get(i);
           if(humano.probSobrevivir()){
               if(humano.reproduccion(temperatura)){
                   numHijos = humano.numHijos();
                   velocidadHumanos = humano.getVelocidad();
                   for(int j = 0; j < numHijos; j++){
                       hijos = new Humanos(dia);
                       hijos.setVelocidad(velocidadHumanos);
                       humanosnacidos.add(hijos);
                   }
               }
           }
           else
               humanosmuertos.add(humano);
       }
       
       detallesTipoSer[0] = humanosnacidos.size();
       detallesTipoSer[1] = humanosmuertos.size();
       
       for(int i = 0; i < humanosnacidos.size(); i++){
           humanos.add(humanosnacidos.get(i));
       }
       for(int i = 0; i < humanosmuertos.size(); i++){
           humanos.remove(humanosmuertos.get(i));
       }
       
       humanosnacidos.clear();
       humanosmuertos.clear();      
    }            
    public void vidaCazaVampiro(){
        cazavampirosnacidos = new ArrayList<CazaVampiros>();
        cazavampirosmuertos = new ArrayList<CazaVampiros>(); 
        vampir = new ArrayList<Vampiros>();
        CazaVampiros cazaV, hijosCazaVamp;
        int velocidadCazaVamp, numhijos, numeroAleatorio;
        
        for( int i = 0; i < cazavampiros.size(); i++){
            cazaV = cazavampiros.get(i);
            if(cazaV.getVivo()){
                if(cazaV.reproduccion(temperatura)){
                    numhijos = cazaV.numHijos();
                    velocidadCazaVamp = cazaV.getVelocidad();
                    for(int j = 0; j < numhijos; j++){
                        hijosCazaVamp = new CazaVampiros(dia);
                        hijosCazaVamp.setVelocidad(velocidadCazaVamp);
                        cazavampirosnacidos.add(hijosCazaVamp);
                    }
                }
                if(cazaV.cazarVampiros() && vampiros.size()>= 1){
                    numeroAleatorio = ser.numeroAleatorio(0, vampiros.size());
                    cazaV.setvampirosMatados();
                    vampir.add(vampiros.get(numeroAleatorio));
                }
            }
            else
                cazavampirosmuertos.add(cazaV);
        }
        
        detallesTipoSer[2] = cazavampirosnacidos.size();
        detallesTipoSer[3] = cazavampirosmuertos.size();
        detallesTipoSer[7] = vampir.size();
        
        for(int i = 0; i < cazavampirosnacidos.size(); i++){
           humanos.add(cazavampirosnacidos.get(i));
       }
       for(int i = 0; i < cazavampirosmuertos.size(); i++){
           humanos.remove(cazavampirosmuertos.get(i));
       }
       for(int i = 0; i < vampir.size(); i++){
           vampiros.remove(vampir.get(i));
       }

       cazavampirosnacidos.clear();
       cazavampirosmuertos.clear();
       vampir.clear();
    }
    
    public void vidaVampiro(){
       vampirosnacidos = new ArrayList<Vampiros>();
       vampirosmuertos = new ArrayList<Vampiros>();
       Vampiros vampiro;
       int numeroAleatorio, contadorVampiros = 0;
       
        for(int i = 0; i < vampiros.size(); i++){
           if(vampiros.get(i).MatarHumano()){
               if(!humanos.isEmpty()){
                   numeroAleatorio = ser.numeroAleatorio(0,humanos.size()-1);
                   contadorVampiros++;
                   vampiro = humanos.get(numeroAleatorio).convertirAVampiro();
                   humanos.remove(numeroAleatorio);
                   if(vampiro != null){
                       vampirosnacidos.add(vampiro);
                       vampiros.get(i).vampirosConvertidos();
                   }
               }
           }
        }
       
        detallesTipoSer[2] = contadorVampiros;
        detallesTipoSer[3] = vampirosnacidos.size();
        detallesTipoSer[4] = vampirosmuertos.size();
        
        for(int i = 0; i < vampirosnacidos.size(); i++){
           vampiros.add(vampirosnacidos.get(i));
        }
        for(int i = 0; i < vampirosmuertos.size(); i++){
           vampiros.remove(vampirosmuertos.get(i));
        }
        
        vampirosnacidos.clear();
        vampirosmuertos.clear();
    }
    public void vidaZombie(){
        humanosaux = new ArrayList<Humanos>();
        cazavampirosaux = new ArrayList<CazaVampiros>();
        zombiesnacidos = new ArrayList<Zombies>();
        zombiesmuertos = new ArrayList<Zombies>();
        Comparacion comparacion = new Comparacion();
        Zombies zombie = null; 
        boolean ok = false;
        
        if(!humanos.isEmpty()){
            humanosaux.addAll(humanos);
            Collections.sort(humanosaux, comparacion);
        }
        if(!cazavampiros.isEmpty()){
            cazavampirosaux.addAll(cazavampiros);
            Collections.sort(cazavampiros, comparacion);
        }
        
        for(int i = 0; i < zombies.size(); i++){
            if((dia-zombies.get(i).getNacimiento()) != 8){
                if((!humanos.isEmpty() || !cazavampiros.isEmpty()) && zombies.get(i).convertirHumanoAZombie()){
                    if(humanos.get(0).getVelocidad() > cazavampiros.get(0).getVelocidad()){
                        zombie = cazavampiros.get(0).convertirAzombie(dia);
                    }
                    else{
                        humanos.get(0).convertirAzombie(dia);
                        ok = true;
                    }

                }
                else if(humanos.isEmpty()){
                    zombie = cazavampiros.get(0).convertirAzombie(dia);
                }
                else{
                    zombie = humanos.get(0).convertirAzombie(dia);
                    ok = true;
                }
                
                if(ok = true){
                    humanos.remove(0);
                }
                else
                    cazavampiros.remove(0);

                zombiesnacidos.add(zombie);

            }
            else
                zombiesmuertos.add(zombies.get(i));
            

        }
        
        detallesTipoSer[8] = zombiesmuertos.size();
        detallesTipoSer[9] = zombiesnacidos.size();
        
        for(int i = 0; i < zombiesnacidos.size(); i++){
           zombies.add(zombiesnacidos.get(i));
        }
        for(int i = 0; i < zombiesmuertos.size(); i++){
           zombies.remove(zombiesmuertos.get(i));
        }
        
        vampirosnacidos.clear();
        vampirosmuertos.clear();       
    }

    
public class Comparacion implements Comparator<Humanos>{
    
    public int compare(Humanos humano, Humanos humano1){
        if(humano.getVelocidad() < humano1.getVelocidad())
            return 1;
        else if(humano.getVelocidad() > humano1.getVelocidad())
            return -1;
        else
            return 0;
    }
}
    
    public String toString(){
        return "\t\tDia: " + dia+ " \t Temperatura: "+ temperatura+"\n\nCantidad de Humanos Nacidos: "+ detallesTipoSer[0]+
                "\nCantidad de humanos muertos por muerte natural: "+ detallesTipoSer[1]+"\nCantidad de humanos Cazavampiros nacidos:"+
                detallesTipoSer[2]+"\nCantidad Humanos Cazavampiros muertos por muerte natural: "+ detallesTipoSer[3]+
                "\nCantidad de humanos mordidos por Vampiros: "+detallesTipoSer[4]+"\nCantidad de Humanos convertidos a Vampiros: "+
                detallesTipoSer[5]+"\nCantidad Humanos muertos por mordisco de Vampiros: "+ (detallesTipoSer[4]-detallesTipoSer[5])+
                "\nCantidad de vampiros muertos por falta de hambre: "+ detallesTipoSer[6]+"\nCantidad de Vampiros muertos por los"
                + "Cazavampiros: "+detallesTipoSer[7]+"\nCantidad de Vampiros muertos en total: "+ (detallesTipoSer[6]+detallesTipoSer[7])+
                "\nCantidad de zombies muertos por hambre: "+ detallesTipoSer[8]+"\nCantidad de Humanos y humanos Cazavampiros convertidos a zombies"
                + " por mordisco: "+detallesTipoSer[9];
    }
}