/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jefryhernandez_gabrielalvarado_lab4;

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
        // TODO code application logic here
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

    }
}
