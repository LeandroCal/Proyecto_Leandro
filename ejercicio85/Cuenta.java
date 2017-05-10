/*
metodos a emplear en el main
 */
package ejercicio85;

import java.util.Scanner;

/**
 *
 * @author Legui
 */
public class Cuenta {

    Scanner teclado = new Scanner(System.in);
    private String nombre;      //Variables a utilizar
    private String apellido1;
    private String apellido2;
    private String dni;
    private long cuenta;
    private String tipo;
    private double interes;
    private double saldo;
    double cantidad;

    public Cuenta() {    //Constructor por defecto

    }
    //Constructor por parametros

    public Cuenta(String nombre, String apellido1, String apellido2, String dni, long cuenta, String tipo, double interes, double saldo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.cuenta = cuenta;
        this.tipo = tipo;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    public static Cuenta clon(Cuenta c1){      //Constructor copia
        return new Cuenta(c1.nombre,c1.apellido1,c1.apellido2,c1.dni,c1.cuenta,c1.tipo,c1.interes,c1.saldo);
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void SetIngreso(double cantidad) {    //Metodo ingreso
        this.cantidad = cantidad;
        this.saldo = saldo + cantidad;
    }

    public void SetReintegro(double cantidad) {
        this.cantidad = cantidad;
        this.saldo = saldo - cantidad;
    }

    public double GetResultado() {
        return saldo;
    }

    public void Imprimir() {
        System.out.println("----------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);
        System.out.println("Dni: " + dni);
        System.out.println("Nº Cuenta: " + cuenta);
        System.out.println("Tipo: " + tipo);
        System.out.println("Interés: " + interes + " %");
        System.out.println("Saldo: " + saldo + " €");
    }
}
