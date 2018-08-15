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
public class Violin extends Instrumento{

    @Override
    public void tocarinstrumento() {

        System.out.println("Toqué el violín");
    }

    @Override
    public void afinarinstrumento() {

        System.out.println("He afinado el violín");
    }
      
}
