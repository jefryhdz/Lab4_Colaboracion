/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jefryhernandez_gabrielalvarado_lab4;

import java.awt.Color;

/**
 *
 * @author Jefry Hernandez
 */
public class Caballero extends Pieza {

    private String pieza = "C";

    public Caballero(Color color) {
        super(color);
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Caballero{" + "pieza=" + pieza + '}';
    }

   
   
    

    @Override
    public boolean movimiento(int a, int b, String[][] matriz, int x, int y) {
        
        return false;

    }
}
