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
public class Caballero extends Pieza{
    private String pieza= "C";

    public Caballero(String pieza, Color color) {
        super(pieza, color);
    }

   

   

    @Override
    public boolean movimiento(int a, int b, String[][] matriz, int x, int y) {
       return false;
    }
    
}
