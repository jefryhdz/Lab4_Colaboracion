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
<<<<<<< HEAD
public class Caballero extends Pieza{
    private String pieza= "C";
=======
public class Caballero extends Pieza {
>>>>>>> 51de48d4917e1cd32195e3e26cc054a9101f8cb8

    public Caballero(String pieza, Color color) {
        super(pieza, color);
    }

<<<<<<< HEAD
   

   

=======
>>>>>>> 51de48d4917e1cd32195e3e26cc054a9101f8cb8
    @Override
    public boolean movimiento(int a, int b, String[][] matriz, int x, int y) {
        if (x + 1 == a && b == y) {
            return false;
        } else if (y+1== b &&a ==x) {

        } else {
            return false;
        }
    }

}
