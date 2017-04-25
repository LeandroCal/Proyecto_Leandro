/*
Extra3: Pasar de 10 yardas a pies, pulgadas y centimetros.
 */
package extra3;
import java.util.*;
/**
 *
 * @author Legui
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
//Declaro variables, objetos e introduzco datos
        yardas y1=new yardas();
        System.out.print("Introduce las yardas a convertir: ");
        int yardas=teclado.nextInt();
        
        y1.SetYardas(yardas);
//Muestro resultados
        System.out.println(yardas+" yardas = "+y1.GetPies()+" pies.");
        System.out.println(yardas+" yardas = "+y1.GetPulgadas()+" pulgadas.");
        System.out.println(yardas+" yardas = "+y1.GetCentimetros()+" centimetros.");
    }
    
}
