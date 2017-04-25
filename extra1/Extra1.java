/*
Extra1: Teorema pitagoras.
 */
package extra1;
import java.util.*;
/**
 *
 * @author Legui
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
//Declaro variables e introduzco datos
        System.out.print("Introduce el valor del cateto1: ");
        double cateto1=teclado.nextDouble();
        System.out.print("Introduce el valor del cateto2: ");
        double cateto2=teclado.nextDouble();
//Meto los datos en el constructor y devuelvo resultado
        pitagoras p1=new pitagoras(cateto1,cateto2);
        System.out.println("El valor de la hipotenusa es = "+p1.GetResultado());
    }
    
}
