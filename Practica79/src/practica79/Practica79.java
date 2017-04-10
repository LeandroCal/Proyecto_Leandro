/*
Practica79: Cálculo del area de un pentagono.
 */
package practica79;
import java.util.*;

/**
 *
 * @author Legui
 */
public class Practica79 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
//Declaro objetos y variables
        pentagono p1=new pentagono();
        double lado;
//Introduzco datos
        System.out.print("Introduce el valor del lado del pentágono: ");
        lado=teclado.nextInt();
        
        p1.SetArea(lado);
        
        System.out.println("El área del pentágono es = "+p1.GetArea());
    }
    
}
