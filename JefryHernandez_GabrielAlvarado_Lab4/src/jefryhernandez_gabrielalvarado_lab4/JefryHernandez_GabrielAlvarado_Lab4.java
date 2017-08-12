/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jefryhernandez_gabrielalvarado_lab4;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefry Hernandez
 */
public class JefryHernandez_GabrielAlvarado_Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Tablero[][] = new String[10][10];
        ArrayList<Pieza> ListPieza1 = new ArrayList();
        ArrayList<Pieza> ListPieza2 = new ArrayList();
        ListPieza1.add(new Dragon(Color.white));
        ListPieza1.add(new Dragon(Color.white));
        ListPieza1.add(new Dragon(Color.white));
        ListPieza1.add(new Duende(Color.white));
        ListPieza1.add(new Duende(Color.white));
        ListPieza1.add(new Duende(Color.white));
        ListPieza1.add(new Duende(Color.white));
        ListPieza1.add(new Caballero(Color.white));
        ListPieza1.add(new Caballero(Color.white));
        ListPieza1.add(new Caballero(Color.white));
        ListPieza1.add(new Mago(Color.white));
        ListPieza1.add(new Rey(Color.white));
        ListPieza1.add(new Arquera(Color.WHITE));
        ListPieza1.add(new Arquera(Color.WHITE));
        ListPieza1.add(new Arquera(Color.WHITE));
        ListPieza1.add(new Arquera(Color.WHITE));

        ListPieza2.add(new Dragon(Color.BLACK));
        ListPieza2.add(new Dragon(Color.BLACK));
        ListPieza2.add(new Dragon(Color.BLACK));
        ListPieza2.add(new Duende(Color.BLACK));
        ListPieza2.add(new Duende(Color.BLACK));
        ListPieza2.add(new Duende(Color.BLACK));
        ListPieza2.add(new Duende(Color.BLACK));
        ListPieza2.add(new Caballero(Color.BLACK));
        ListPieza2.add(new Caballero(Color.BLACK));
        ListPieza2.add(new Caballero(Color.BLACK));
        ListPieza2.add(new Mago(Color.BLACK));
        ListPieza2.add(new Rey(Color.BLACK));
        ListPieza2.add(new Arquera(Color.BLACK));
        ListPieza2.add(new Arquera(Color.BLACK));
        ListPieza2.add(new Arquera(Color.BLACK));
        ListPieza2.add(new Arquera(Color.BLACK));

        Tablero = LlenarTablero();
        imprimir(Tablero);
        ArrayList<Jugador> lista = new ArrayList();
        String op = "";
        while (!op.equals("e")) {
            op = JOptionPane.showInputDialog(""
                    + "a- Ingresar jugador\n"
                    + "b-listar jugadores \n"
                    + "c-modificar jugador\n"
                    + "d-eliminar jugador\n"
                    + "e.Salir");

            if (op.equals("a")) {
                int i;
                int puntos = 0;
                String nombre;
                int edad;
                String sexo;
                String nacimiento;
                String nombreUsuario;
                String contraseña;

                nombre = JOptionPane.showInputDialog("Ingrese nombre");
                i = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese edad")
                );
                nombreUsuario = JOptionPane.showInputDialog("Crear username");
                nacimiento = JOptionPane.showInputDialog("Ingrese lugar de nacimiento");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                sexo = JOptionPane.showInputDialog("Ingrese el sexo MASCULINO/FEMENINO");
                lista.add(new Jugador(nombre, nombreUsuario, puntos, nacimiento, edad, sexo));

            }

            if (op.equals("b")) {
                String s = "";
                for (Object t : lista) {
                    if (t instanceof Jugador) {
                        s += "" + lista.indexOf(t) + "- " + t + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, s);
            }

            if (op.equals("c")) {
                int i;
                String sexo2 = "";
                String nombre;
                int edad = 0;
                String nombreUsuario = "";
                String nacimiento = "";
                String username = "";
                String contraseña = null;
                i = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "pocision a modificar")
                );
                nombre = JOptionPane.showInputDialog("nuevo nombre");
                ((Jugador) lista.get(i)).setNombre(nombre);
                ((Jugador) lista.get(i)).setEdad(edad);
                ((Jugador) lista.get(i)).setNacimiento(nacimiento);
                ((Jugador) lista.get(i)).setNombreUsuario(nombreUsuario);
                ((Jugador) lista.get(i)).setSexo(sexo2);

            }

            if (op.equals("d")) {
                int i2;

                i2 = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "pocision a eliminar")
                );

                lista.remove(i2);
            }
        }
        boolean ganador = false;
        while (ganador == true) {
            int cont = 1;
            int i;
            int i2;
            if (cont % 2 != 0) {

                JOptionPane.showMessageDialog(null, "Es turno del primer jugador");
                i = Integer.parseInt(JOptionPane.showInputDialog("ingrese las coordenadas en X"));
                i2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese las coordenadas en Y"));
                try {
                    validar(Tablero,i,i2);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Es turno del segundo jugador");
                i = Integer.parseInt(JOptionPane.showInputDialog("ingrese las coordenadas en X"));
                i2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese las coordenadas en Y"));
                try {
                    validar(Tablero,i,i2);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
        }
    }

    public static void imprimir(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println("");

        }
    }

    public static String[][] LlenarTablero() {
        String[][] matriz = {
            {"c", " ", "F", "A", "R", "M", "A", "A", "-", "C",},
            {"D", " ", "A", "D", "C", "F", "D", "A", " ", "D",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {"D", "", "A", "D", "C", "F", "D", "A", "-", "A",},
            {"C", "-", "F", "A", "R", "M", "A", "F", "-", "C",},};
        return matriz;
    }

    public static void validar(String matriz[][], int x, int y) throws MiException {
        int limit = matriz.length;
        int limit2 = matriz[0].length;
        if (x > limit || y > limit2) {
            throw new MiException("Se salio del limite");
        }
    }
}
