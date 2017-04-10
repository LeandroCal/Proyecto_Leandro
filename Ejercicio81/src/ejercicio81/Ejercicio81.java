/*
Practica81: Cálculo del area esfera y volumen.
 */
package ejercicio81;
import java.util.*;

/**
 *
 * @author Legui
 */
public class Ejercicio81 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
//Declaro objetos y variables
        double radio;
        esfera e1=new esfera();
//Menu  
        System.out.println("-----------------");
        System.out.println("1. Area Esfera");
        System.out.println("2. Volumen Esfera");
        System.out.println("3. Cerrar");
        System.out.println("-----------------"+"\n");
        System.out.print("Selecciona una opcion del menu: ");
        
        int opcion=0;
//Bucle while para mostrar cada caso
        while(opcion!=3){
//Switch para entrar en cada caso   
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Introduce la longitud del radio: ");
                    radio=teclado.nextDouble();
                    e1.SetArea(radio);
                    System.out.println("Área de la esfera = "+e1.GetArea());
                    System.out.println("Seleccione otra opcion: ");
                    break;
                case 2:
                    System.out.println("Introduce la longitud del radio : ");
                    radio=teclado.nextDouble();
                    e1.SetVolumen(radio);
                    System.out.println("Volumen de la esfera = "+e1.GetVolumen());
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
