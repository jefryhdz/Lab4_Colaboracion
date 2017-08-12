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
        if ((x + 1 == a && b == y) || (x - 1 == a && b == y) || (x == a && b - 1 == y) || (x == a && b + 1 == y)) {
            if (matriz[a][b].equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    @Override
    public String comer(int a1, int b, String a[][], int x, int y) {
        if ((x + 1 == a1 && b == y) || (x - 1 == a1 && b == y) || (x == a1 && b - 1 == y) || (x == a1 && b + 1 == y)) {
            if (!a[a1][b].equals(" ")) {
                return a[a1][b];
            } else {
                return "No se puede";
            }
        } else {
            return "No se puede";
        }
        
    }
}
