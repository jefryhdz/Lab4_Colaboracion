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

    public Caballero(Color color) {
        super(color);
    }

    @Override
    public boolean movimiento(int a, int b) {
      return true;
    }
    
}
