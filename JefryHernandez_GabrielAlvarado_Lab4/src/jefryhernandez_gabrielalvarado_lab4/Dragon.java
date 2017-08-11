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
public class Dragon extends Pieza {

    private String pieza = "F";

    public Dragon(String pieza, Color color) {
        super(pieza, color);
    }

   

    

    
    

    @Override
    public boolean movimiento(int a, int b, String[][] matriz, int x, int y) {
        int n = (matriz.length) - x;
        int n1 = (matriz.length) - y;

        while (n > 0 && n1 > 0) {
            n--;
            n1--;
            if (a == x - n && b == y - n1) {
                if (matriz[x - n][y - n].equals(" ")) {
                    return true;
                } else {
                    return false;
                }

            } else if (a == x + n && b == y + n1) {
                if (matriz[x + n][y + n].equals(" ")) {
                    return true;
                } else {
                    return false;
                }
            } else if (a == x + n && b == y - n1) {
                if (matriz[x + n][y - n].equals(" ")) {
                    return true;
                } else {
                    return false;
                }
            } else if (a == x - n && b == y + n1) {
                if (matriz[x - n][y + n].equals(" ")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
<<<<<<< HEAD

=======
>>>>>>> 51de48d4917e1cd32195e3e26cc054a9101f8cb8
        }
        return true;

    }

}
