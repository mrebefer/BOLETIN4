/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_2;

/**
 *
 * @author mrebelladofernandez
 */
public class Satelite {

    private double meridiano;
    private double paralelo;
    private double distanciaTierra;

    public Satelite() {
        meridiano = 0;
        paralelo = 0;
        distanciaTierra = 0;
    }
    
    public void verPosicion(){
        System.out.println("o satelite atopase no paralelo "+paralelo+" meridiano "+meridiano+" distancia tierra "+distanciaTierra);
    }
}
