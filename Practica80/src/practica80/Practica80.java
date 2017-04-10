/*
Practica80: Cálculo del area cubo.
 */
package practica80;
import java.util.*;

/**
 *
 * @author Legui
 */
public class Practica80 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
//Declaro objetos y variables
        double arista;
        cubo c1=new cubo();
//Menu
        System.out.println("-----------------");
        System.out.println("1. Area Lateral Cubo");
        System.out.println("2. Área Total Cubo");
        System.out.println("3. Cerrar");
        System.out.println("-----------------"+"\n");
        System.out.print("Selecciona una opcion del menu: ");
        
        int opcion=0;
//Bucle while para mostrar opciones
        while(opcion!=3){
//Switch para entrar en cada caso 
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Introduce la longitud de la arista: ");
                    arista=teclado.nextDouble();
                    c1.SetAreaLateral(arista);
                    System.out.println("Área lateral del cubo = "+c1.GetAreaLateral());
                    System.out.println("Seleccione otra opcion: ");
                    break;
                case 2:
                    System.out.println("Introduce la longitud de la arista: ");
                    arista=teclado.nextDouble();
                    c1.SetAreaTotal(arista);
                    System.out.println("Área lateral del cubo = "+c1.GetAreaTotal());
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
