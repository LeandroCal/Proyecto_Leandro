/*
Practica85: Igual que la practica 84 pero con arraylist.
 */
package ejercicio85;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Legui
 */
public class Ejercicio85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
//Introduzco los datos de las cuentas en los constructores
        Cuenta c1 = new Cuenta("Pedro", "Rodriguez", "Arnau", "75834188x", 123456789, "pez", 1.2, 1549.25);
        Cuenta c2 = new Cuenta("Carmen", "Abad", "Flores", "53744328p", 987654321, "gato", 1.5, 980.94);
        Cuenta c3 = Cuenta.clon(c1);
        
        ArrayList<Cuenta>  lista=new ArrayList<Cuenta>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

//Declaro variables
        int menu = 0;
        int cuenta = 0;
        double cantidad;
        while (menu != 4) {     //Menu con while's y switch's
            System.out.println("----------------");
            System.out.println("1)   Ingreso");
            System.out.println("2)  Reintegro");
            System.out.println("3) Transferencia");
            System.out.println("4)    Cerrar");
            System.out.println("----------------");
            menu = teclado.nextInt();
            switch (menu) {
                case 1:     //Ingreso
                    while (cuenta != 4) {
                        System.out.println("-------------");
                        System.out.println("1)  Cuenta1");
                        System.out.println("2)  Cuenta2");
                        System.out.println("3)  Cuenta3");
                        System.out.println("4) Retroceder");
                        System.out.println("-------------");
                        cuenta = teclado.nextInt();
                        switch (cuenta) {
                            case 1:         //Cuenta 1
                                lista.get(0).Imprimir();
                                System.out.print("Introduce una cantidad a ingresar: ");
                                cantidad = teclado.nextDouble();
                                lista.get(0).SetIngreso(cantidad);
                                System.out.println("Tu saldo actual es = " + lista.get(0).GetResultado() + " €");
                                break;
                            case 2:         //Cuenta 2
                                lista.get(1).Imprimir();
                                System.out.print("Introduce una cantidad a ingresar: ");
                                cantidad = teclado.nextDouble();
                                lista.get(1).SetIngreso(cantidad);
                                System.out.println("Tu saldo actual es = " + lista.get(1).GetResultado() + " €");
                                break;
                            case 3:         //Cuenta 3
                                lista.get(2).Imprimir();
                                System.out.print("Introduce una cantidad a ingresar: ");
                                cantidad = teclado.nextDouble();
                                lista.get(2).SetIngreso(cantidad);
                                System.out.println("Tu saldo actual es = " + lista.get(2).GetResultado() + " €");
                                break;
                        }
                    }
                case 2:         //Reintegro
                    while (cuenta != 4) {
                        System.out.println("-------------");
                        System.out.println("1)  Cuenta1");
                        System.out.println("2)  Cuenta2");
                        System.out.println("3)  Cuenta3");
                        System.out.println("4) Retroceder");
                        System.out.println("-------------");
                        cuenta = teclado.nextInt();
                        switch (cuenta) {
                            case 1:         //Cuenta 1
                                lista.get(0).Imprimir();
                                System.out.print("Introduce una cantidad a retirar: ");
                                cantidad = teclado.nextDouble();
                                lista.get(0).SetReintegro(cantidad);
                                System.out.println("Tu saldo actual es = " + lista.get(0).GetResultado() + " €");
                                break;
                            case 2:         //Cuenta 2
                                lista.get(1).Imprimir();
                                System.out.print("Introduce una cantidad a retirar: ");
                                cantidad = teclado.nextDouble();
                                lista.get(1).SetReintegro(cantidad);
                                System.out.println("Tu saldo actual es = " + lista.get(1).GetResultado() + " €");
                                break;
                            case 3:         //Cuenta 3
                                lista.get(2).Imprimir();
                                System.out.print("Introduce una cantidad a retirar: ");
                                cantidad = teclado.nextDouble();
                                lista.get(2).SetReintegro(cantidad);
                                System.out.println("Tu saldo actual es = " + lista.get(2).GetResultado() + " €");
                                break;
                        }
                    }

                case 3:         //Transferencia
                    while (cuenta != 7) {
                        System.out.println("---------------------");
                        System.out.println("1) Cuenta1 a Cuenta2");
                        System.out.println("2) Cuenta1 a Cuenta3");
                        System.out.println("3) Cuenta2 a Cuenta1");
                        System.out.println("4) Cuenta2 a Cuenta3");
                        System.out.println("5) Cuenta3 a Cuenta1");
                        System.out.println("6) Cuenta3 a Cuenta2");
                        System.out.println("7)    Retroceder");
                        System.out.println("---------------------");
                        cuenta = teclado.nextInt();
                        switch (cuenta) {
                            case 1:         //Cuenta 1 a cuenta2
                                lista.get(0).Imprimir();
                                lista.get(1).Imprimir();
                                System.out.print("Introduce una cantidad a transferir: ");
                                cantidad = teclado.nextDouble();
                                lista.get(0).SetReintegro(cantidad);
                                lista.get(1).SetIngreso(cantidad);
                                System.out.println("Sueldo actual de la cuenta 1 = " + lista.get(0).GetResultado() + " €");
                                System.out.println("Sueldo actual de la cuenta 2 = " + lista.get(1).GetResultado() + " €");
                                break;
                            case 2:         //Cuenta 1 a cuenta 3
                                lista.get(0).Imprimir();
                                lista.get(2).Imprimir();
                                System.out.print("Introduce una cantidad a transferir: ");
                                cantidad = teclado.nextDouble();
                                lista.get(0).SetReintegro(cantidad);
                                lista.get(3).SetIngreso(cantidad);
                                System.out.println("Sueldo actual de la cuenta 1 = " + lista.get(0).GetResultado() + " €");
                                System.out.println("Sueldo actual de la cuenta 3 = " + lista.get(3).GetResultado() + " €");
                                break;
                            case 3:         //Cuenta 2 a cuenta 1
                                lista.get(1).Imprimir();
                                lista.get(0).Imprimir();
                                System.out.print("Introduce una cantidad a transferir: ");
                                cantidad = teclado.nextDouble();
                                lista.get(1).SetReintegro(cantidad);
                                lista.get(0).SetIngreso(cantidad);
                                System.out.println("Sueldo actual de la cuenta 1 = " + lista.get(1).GetResultado() + " €");
                                System.out.println("Sueldo actual de la cuenta 3 = " + lista.get(0).GetResultado() + " €");
                                break;
                            case 4:         //Cuenta 2 a cuenta 3
                                lista.get(1).Imprimir();
                                lista.get(2).Imprimir();
                                System.out.print("Introduce una cantidad a transferir: ");
                                cantidad = teclado.nextDouble();
                                lista.get(1).SetReintegro(cantidad);
                                lista.get(2).SetIngreso(cantidad);
                                System.out.println("Sueldo actual de la cuenta 1 = " + lista.get(1).GetResultado() + " €");
                                System.out.println("Sueldo actual de la cuenta 3 = " + lista.get(2).GetResultado() + " €");
                                break;
                            case 5:         //Cuenta 3 a cuenta 1
                                lista.get(2).Imprimir();
                                lista.get(0).Imprimir();
                                System.out.print("Introduce una cantidad a transferir: ");
                                cantidad = teclado.nextDouble();
                                lista.get(2).SetReintegro(cantidad);
                                lista.get(0).SetIngreso(cantidad);
                                System.out.println("Sueldo actual de la cuenta 1 = " + lista.get(2).GetResultado() + " €");
                                System.out.println("Sueldo actual de la cuenta 3 = " + lista.get(0).GetResultado() + " €");
                                break;
                            case 6:         //Cuenta 3 a cuenta 2
                                lista.get(2).Imprimir();
                                lista.get(1).Imprimir();
                                System.out.print("Introduce una cantidad a transferir: ");
                                cantidad = teclado.nextDouble();
                                lista.get(2).SetReintegro(cantidad);
                                lista.get(1).SetIngreso(cantidad);
                                System.out.println("Sueldo actual de la cuenta 1 = " + lista.get(2).GetResultado() + " €");
                                System.out.println("Sueldo actual de la cuenta 3 = " + lista.get(1).GetResultado() + " €");
                                break;
                        }
                    }

            }
        }

    }
}
