/*
funciones de la clase para utilizar en el main (menu)
 */
package practica76;
import java.util.*;
public class menu {
    
    public void Mostrar(){                      //Creamos las funciones a utilizar
        System.out.println("1. Sumar");         //donde introducimos los datos
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Modulo");
    }
    
    public int LeerDato(){
        Scanner teclado=new Scanner (System.in);
        return teclado.nextInt();
    }
    public void PedirNumero(){
        System.out.print("Introduce un numero: ");
    }
    public void PedirOpcion(){
        System.out.print("Introduce una opcion: ");
    }
}
