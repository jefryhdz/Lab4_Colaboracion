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
public abstract class Pieza implements Movimiento {
    private String pieza;

    protected Color color;

    public Pieza(String pieza, Color color) {
        this.pieza = pieza;
        this.color = color;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
   

   
    @Override
    public String toString() {
        return "Pieza{" + "pieza=" + pieza + ", color=" + color + '}';
    }

   

}
