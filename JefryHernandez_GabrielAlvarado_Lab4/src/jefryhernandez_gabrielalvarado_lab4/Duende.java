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
public class Duende extends Pieza {

    protected String pieza = "D";

    public Duende(Color color) {
        super(color);
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    @Override
    public boolean movimiento(int a, int b, String[][] matriz, int x, int y) {
        if (a == x + 1 && b == y) {
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
    public String comer(int ax, int b, String[][] a, int x, int y) {
        if (ax == x + 1 && b == y) {
            if (!a[ax][b].equals(" ")) {
                return a[ax][b];
            } else {
                return "no se puede realizar";
            }
        } else {
            return "no se puede realizar";
        }

    }

}
