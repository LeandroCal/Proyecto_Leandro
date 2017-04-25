/*
Extra2: Pasar de segundos a semana, dias, horas, minutos y segundos.
 */
package extra2;

import java.util.Scanner;

/**
 *
 * @author Legui
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Declaro variables y objetos
        segundos s1 = new segundos();
        long resultado[] = s1.GetResultado();
        String variables[]= s1.GetVariables();
        
        System.out.print("Introduce una cantidad de segundos a cambiar: ");
        long segundos = teclado.nextLong();
        s1.SetSegundos(segundos);

        System.out.println("-------------------");
        System.out.println("El cambio es:");
//Muestro resultado
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i] + " " +variables[i]);
        }
    }
    
}
