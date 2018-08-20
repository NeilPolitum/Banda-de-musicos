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
public class Guacharaca extends Instrumento{

    @Override
    public void tocarinstrumento() {

        System.out.println("Toqué la guacharaca");
    }

    @Override
    public void afinarinstrumento() {

        System.out.println("La guacharaca no se debe afinar");
    }
    
}
