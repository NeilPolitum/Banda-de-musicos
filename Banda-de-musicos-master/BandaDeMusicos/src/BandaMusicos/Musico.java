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
public class Musico {
    
    Musico(){}
    Instrumento ins = null;
    
    public void escogerInstrumento(String instrumento){

        switch(instrumento){
            
            case "Acordeon":
                
                ins = new Acordeon();
                break;
            case "Arpa":
                
                ins = new Arpa();
                break;
            case "Guacharaca":
                
                ins = new Guacharaca();
                break;
            case "Guitarra":
                
                ins = new Guitarra();
                break;
            case "Maracas":
                
                ins = new Maracas();
                break;
            case "Piano":
                
                ins = new Piano();
                break;
            case "Saxofon":
                
                ins = new Saxofon();
                break;
            case "Trombon":
                
                ins = new Trombon();
                break;
            case "Trompeta":
                
                ins = new Trompeta();
                break;
            case "Violin":
                
                ins = new Violin();
                break;
        }
        
    }
    
    public void afinar(){
        
        ins.afinarinstrumento();
        
    }
    
    public void tocar(){
        
        ins.tocarinstrumento();
        
    }
    
}
