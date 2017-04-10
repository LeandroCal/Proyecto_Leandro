/*
Practica78: Cálculo del area de un triangulo.
 */
package practica78;
import java.util.*;

/**
 *
 * @author Legui
 */
public class Practica78 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
//Declaro objetos y variables
        triangulo t1=new triangulo();
        
        int base;
        int altura;
//Introduzco datos
        System.out.print("Introduce el valor de la base del triángulo: ");
        base=teclado.nextInt();
        System.out.print("Introduce el valor de la altura del triángulo: ");
        altura=teclado.nextInt();
        
        t1.SetArea(base, altura);
        
        System.out.println("El área del triángulo es = "+t1.GetResultado());
    }
    
}
