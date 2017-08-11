/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jefryhernandez_gabrielalvarado_lab4;

/**
 *
 * @author Gabriel Alvarado
 */
public class Jugador {
    private String nombre;
    private String nombreUsuario;
    private int puntos;
    private String Nacimiento;
    private int edad;
    private String sexo;

    public Jugador(String nombre, String nombreUsuario, int puntos, String Nacimiento, int edad, String sexo) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.puntos = puntos;
        this.Nacimiento = Nacimiento;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", nombreUsuario=" + nombreUsuario + ", puntos=" + puntos + ", Nacimiento=" + Nacimiento + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

    
    
}
