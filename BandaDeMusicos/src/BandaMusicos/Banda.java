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
    
    int numMusicos = (int) (random.nextDouble()*30+1);
    
    Musico[] Banda = new Musico[numMusicos];
    
    Banda(){}
    
    public void creaBanda(){
        
        for(int i=0; i<numMusicos; i++){
            
            Banda[i] = new Musico();
            Banda[i].escogerInstrumento(Instrumentos[(int) (random.nextDouble()*10)]);
            
        }
        
    }
    
    public void afinarTodos(){
        
        for(int i=0; i<numMusicos; i++){
            
            Banda[i].afinar();
            
        }
        
    }
    
    public void tocarTodos(){
        
        for(int i=0; i<numMusicos; i++){
            
            Banda[i].tocar();
            
        }
        
    }
    
    
    public static void main(String[] args){
        
        Banda banda = new Banda();
        System.out.println("Llegaron los músicos");
        banda.creaBanda();
        System.out.println("Los músicos están afinando");
        banda.afinarTodos();
        System.out.println("Los músicos comienzan la tocada");
        banda.tocarTodos();
        
    }
    
    
}
