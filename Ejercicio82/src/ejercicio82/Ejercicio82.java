/*
Practica82: Cambios monedas.
 */
package ejercicio82;

import java.util.*;

/**
 *
 * @author Legui
 */
public class Ejercicio82 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Declaro variables y objetos
        cambio c1 = new cambio();
        long euros;
        long resultado[] = c1.GetNumero();
        long billetes[] = c1.GetBilletes();
        System.out.print("Introduce una cantidad a cambiar: ");
        euros = teclado.nextLong();
        c1.SetEuros(euros);

        System.out.println("Su cambio");
        System.out.println("-------------------");
//Muestro resultado
        for (int i = 0; i < resultado.length; i++) {
            if (i < 7) {
                System.out.println(resultado[i] + " billetes de " + billetes[i]);
            } else {
                System.out.println(resultado[i] + " monedas de " + billetes[i]);
            }
        }
    }
}
