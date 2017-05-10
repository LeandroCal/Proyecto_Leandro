/*
Practica84: Crear una clase cuenta con los metodos "ingreso", "reintegro" y "transferencia".
La clase contendrá un constructor por defecto, un constructor con parámetros, un constructor copia y metodos "Getter" y "Setter".
Atributos(Nombre, apellido1, apellido2, dni, nº cuenta (3), tipo, interes, saldo).
 */
package ejercicio84;

import java.util.*;

/**
 *
 * @author Legui
 */
public class Ejercicio84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
//Introduzco los datos de las cuentas en los constructores
        Cuenta c1 = new Cuenta("Pedro", "Rodriguez", "Arnau", "75834188x", 123456789, "pez", 1.2, 1549.25);
        Cuenta c2 = new Cuenta("Carmen", "Abad", "Flores", "53744328p", 987654321, "gato", 1.5, 980.94);
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
                    while (cuenta != 3) {
                        System.out.println("-------------");
                        System.out.println("1)  Cuenta1");
                        System.out.println("2)  Cuenta2");
                        System.out.println("3) Retroceder");
                        System.out.println("-------------");
                        cuenta = teclado.nextInt();
                        switch (cuenta) {
                            case 1:         //Cuenta 1
                                c1.Imprimir();
                                System.out.print("Introduce una cantidad a ingresar: ");
                                cantidad=teclado.nextDouble();
                                c1.SetIngreso(cantidad);
                                System.out.println("Tu saldo actual es = "+c1.GetResultado()+" €");
                                break;
                            case 2:         //Cuenta 2
                                c2.Imprimir();
                                System.out.print("Introduce una cantidad a ingresar: ");
                                cantidad=teclado.nextDouble();
                                c2.SetIngreso(cantidad);
                                System.out.println("Tu saldo actual es = "+c2.GetResultado()+" €");
                                break;
                        }
                    }
                case 2:         //Reintegro
                    while (cuenta != 3) {
                        System.out.println("-------------");
                        System.out.println("1)  Cuenta1");
                        System.out.println("2)  Cuenta2");
                        System.out.println("3) Retroceder");
                        System.out.println("-------------");
                        cuenta = teclado.nextInt();
                        switch (cuenta) {
                            case 1:         //Cuenta 1
                                c1.Imprimir();
                                System.out.print("Introduce una cantidad a retirar: ");
                                cantidad=teclado.nextDouble();
                                c1.SetReintegro(cantidad);
                                System.out.println("Tu saldo actual es = "+c1.GetResultado()+" €");
                                break;
                            case 2:         //Cuenta 2
                                c2.Imprimir();
                                System.out.print("Introduce una cantidad a retirar: ");
                                cantidad=teclado.nextDouble();
                                c2.SetReintegro(cantidad);
                                System.out.println("Tu saldo actual es = "+c2.GetResultado()+" €");
                                break;
                        }
                    }
                    
                case 3:         //Transferencia
                    while (cuenta != 3) {
                        System.out.println("--------------------");
                        System.out.println("1) Cuenta1 a Cuenta2");
                        System.out.println("2) Cuenta2 a Cuenta1");
                        System.out.println("3)    Retroceder");
                        System.out.println("--------------------");
                        cuenta = teclado.nextInt();
                        switch (cuenta) {
                            case 1:         //Cuenta 1 a cuenta2
                                c1.Imprimir();
                                c2.Imprimir();
                                System.out.print("Introduce una cantidad a transferir: ");
                                cantidad=teclado.nextDouble();
                                c1.SetReintegro(cantidad);
                                c2.SetIngreso(cantidad);
                                System.out.println("Sueldo actual de la cuenta 1 = "+c1.GetResultado()+" €");
                                System.out.println("Sueldo actual de la cuenta 2 = "+c2.GetResultado()+" €");
                                break;
                            case 2:         //Cuenta 2 a cuenta 1
                                c2.Imprimir();
                                c1.Imprimir();
                                System.out.print("Introduce una cantidad a transferir: ");
                                cantidad=teclado.nextDouble();
                                c2.SetReintegro(cantidad);
                                c1.SetIngreso(cantidad);
                                System.out.println("Sueldo actual de la cuenta 2 = "+c2.GetResultado()+" €");
                                System.out.println("Sueldo actual de la cuenta 1 = "+c1.GetResultado()+" €");
                                break;
                        }
                    }

            }
        }
        
    }
}
