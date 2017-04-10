/*
Practica77: Cálculo del area y la longitud de una circunferencia.
 */
package practica77;
import java.util.*;

/**
 *
 * @author Legui
 */
public class Practica77 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
//Declaro objetos y variables
        datos d1=new datos();
        int radio;
        
        System.out.print("Introduce el valor del radio: ");
        radio=teclado.nextInt();
//Menu
        System.out.println("\n"+"-----------------");
        System.out.println("1. Longitud círculo");
        System.out.println("2. Área círculo");
        System.out.println("3. Cerrar");
        System.out.println("-----------------"+"\n");
        System.out.print("Selecciona una opcion del menu: ");
        
        int opcion=0;
//Bucle while para entrar en cada caso
        while(opcion!=3){
            
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    d1.SetLongitud(radio);
                    System.out.println("Longitud = "+d1.GetLongitud());
                    System.out.println("Seleccione otra opcion: ");
                    break;
                case 2:
                    d1.SetArea(radio);
                    System.out.println("Área = "+d1.GetArea());
                    System.out.println("Seleccione otra opcion: ");
                    break;
                case 3:
                    System.out.println("Cerrando programa.");
                    break;
                default:
                    System.out.println("Introduce una opcion correcta.");
                    break;
            }
        }
        
    }
}
