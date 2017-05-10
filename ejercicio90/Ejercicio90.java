/*
Practica90: Crear una clase NIF (atributo:nif con letra) y la clase 
contendra un metodo privado que calcule la letra del nif a partir del dni.
 */
package ejercicio90;
import java.util.*;
/**
 *
 * @author Legui
 */
public class Ejercicio90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        String nif;
        Nif n1=new Nif();
        
        System.out.print("Introduce un NIF: ");
        nif=teclado.nextLine();
        
        n1.SetNif(nif);
        n1.GetLetra();

    }
}
