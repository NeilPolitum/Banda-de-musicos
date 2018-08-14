/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BandaMusicos;

/**
 *
 * @author Brayan Alexander
 */
public class Musicos {
    
    Musicos(){}
    
    public void creaInstrumento(String instrumento){
        
        switch(instrumento){
            
            case "Acordeon":
                
                Acordeon acordeon = new Acordeon();
                break;
            case "Arpa":
                
                Arpa arpa = new Arpa();
                break;
            case "Guacharaca":
                
                Guacharaca guacharaca = new Guacharaca();
                break;
            case "Guitarra":
                
                Guitarra guitarra = new Guitarra();
                break;
            case "Maracas":
                
                Maracas maracas = new Maracas();
                break;
            case "Piano":
                
                Piano piano = new Piano();
                break;
            case "Saxofon":
                
                Saxofon saxofon = new Saxofon();
                break;
            case "Trombon":
                
                Trombon trombon = new Trombon();
                break;
            case "Trompeta":
                
                Trompeta trompeta = new Trompeta();
                break;
            case "Violin":
                
                Violin violin = new Violin();
                break;
        }
    }
    
}
