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
                acordeon.afinarinstrumento();
                acordeon.tocarinstrumento();
                break;
            case "Arpa":
                
                Arpa arpa = new Arpa();
                arpa.afinarinstrumento();
                arpa.tocarinstrumento();
                break;
            case "Guacharaca":
                
                Guacharaca guacharaca = new Guacharaca();
                guacharaca.afinarinstrumento();
                guacharaca.tocarinstrumento();
                break;
            case "Guitarra":
                
                Guitarra guitarra = new Guitarra();
                guitarra.afinarinstrumento();
                guitarra.tocarinstrumento();
                break;
            case "Maracas":
                
                Maracas maracas = new Maracas();
                maracas.afinarinstrumento();
                maracas.tocarinstrumento();
                break;
            case "Piano":
                
                Piano piano = new Piano();
                piano.afinarinstrumento();
                piano.tocarinstrumento();
                break;
            case "Saxofon":
                
                Saxofon saxofon = new Saxofon();
                saxofon.afinarinstrumento();
                saxofon.tocarinstrumento();
                break;
            case "Trombon":
                
                Trombon trombon = new Trombon();
                trombon.afinarinstrumento();
                trombon.tocarinstrumento();
                break;
            case "Trompeta":
                
                Trompeta trompeta = new Trompeta();
                trompeta.afinarinstrumento();
                trompeta.tocarinstrumento();
                break;
            case "Violin":
                
                Violin violin = new Violin();
                violin.afinarinstrumento();
                violin.tocarinstrumento();
                break;
        }
    }
    
}
