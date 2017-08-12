/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jefryhernandez_gabrielalvarado_lab4;

import java.awt.Color;

/**
 *
 * @author Gabriel Alvarado
 */
public class Arquera extends Pieza {

    private String pieza = "A";

    public Arquera(Color color) {
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
        return "Arquera{" + "pieza=" + pieza + '}';
    }

    @Override
    public boolean movimiento(int a, int b, String[][] matriz, int x, int y) {
        int n = (matriz.length - 1);
        int n1 = (matriz.length - 1);
        n--;
        n1--;

        while (n > 0 && n1 > 0) {
            if (a == x - n && b == y - n1) {
                if (matriz[a][b].equals(" ")) {
                    return true;
                } else {
                    return false;
                }

            } else if (a == x + n && b == y + n1) {
                if (matriz[a][b].equals(" ")) {
                    return true;
                } else {
                    return false;
                }
            } else if (a == x + n && b == y - n1) {
                if (matriz[a][b].equals(" ")) {
                    return true;
                } else {
                    return false;
                }
            } else if (a == x - n && b == y + n1) {
                if (matriz[a][b].equals(" ")) {
                    return true;
                } else {
                    return false;
                }
            } else if ((a == x && b == y + n1) || (b == y && a == x + n)) {
                if (matriz[a][b].equals(" ")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;

    }
}



    

