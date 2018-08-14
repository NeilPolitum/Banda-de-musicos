/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BandaMusicos;

import java.util.Random;

/**
 *
 * @author Brayan Alexander
 */
public class Banda {
    
    String[] Instrumentos = {"Acordeon", "Arpa", "Guacharaca", "Guitarra", "Maracas", "Piano", "Saxofon", "Trombon", "Trompeta", "Violin"};
    
    Random random = new Random();
    
    int numMusicos = (int) (random.nextDouble()*30+5);
    
    Musicos[] Banda = new Musicos[numMusicos];
    Ob
    
    Banda(){}
    
    public void creaBanda(){
        
        for(int i=0; i<numMusicos; i++){
            
            Banda[i] = new Musicos();
        }
        
        for(int i=0; i<numMusicos; i++){
                        
            Banda[i].creaInstrumento(Instrumentos[(int) (random.nextDouble()*10)]);
        }
        
    }
    
    public static void main(String[] args){
        
        Banda o = new Banda();
        o.creaBanda();
        
    }
    
    
}
