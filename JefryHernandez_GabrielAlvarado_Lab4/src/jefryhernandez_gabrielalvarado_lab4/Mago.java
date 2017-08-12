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
public class Mago extends Pieza {

    private String pieza = "M";

    public Mago(Color color) {
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
        int n = (matriz.length) - x;
        int n1 = (matriz.length) - y;
        int cont = 0;

        while (n > 0 && n1 > 0) {
            if (cont % 2 == 0) {
                n--;
                cont++;
            } else {
                n1--;
                cont++;
            }

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

    public String comer(int a, int b, String[][] matriz, int x, int y) {
        int n = (matriz.length) - x;
        int n1 = (matriz.length) - y;
        int cont = 0;

        while (n > 0 && n1 > 0) {
            if (cont % 2 == 0) {
                n--;
                cont++;
            } else {
                n1--;
                cont++;
            }

            if (a == x - n && b == y - n1) {
                if (!matriz[a][b].equals(" ")) {
                    return matriz[a][b];
                } else {
                    return "no hay pieza";
                }

            } else if (a == x + n && b == y + n1) {
                if (!matriz[a][b].equals(" ")) {
                    return matriz[a][b];
                } else {
                    return "no hay pieza";
                }
            } else if (a == x + n && b == y - n1) {
                if (!matriz[a][b].equals(" ")) {
                    return matriz[a][b];
                } else {
                    return "no hay pieza";
                }
            } else if (a == x - n && b == y + n1) {
                if (!matriz[a][b].equals(" ")) {
                    return matriz[a][b];
                } else {
                    return "no hay pieza";
                }
            } else if ((a == x && b == y + n1) || (b == y && a == x + n)) {
                if (!matriz[a][b].equals(" ")) {
                    return matriz[a][b];
                } else {
                    return "no hay pieza";
                }
            } else {
                return "no hay pieza";
            }
        }
        

    

    



