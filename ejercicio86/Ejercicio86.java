/*
Practica86: Crea una clase contador con los metodos para incrementar y decrementar el contador.
Tenemos constructor por defecto, constructor con parametros, un constructor copia y metodos "Getter" y "Setter".
 */
package ejercicio86;

import java.util.*;

/**
 *
 * @author Legui
 */
public class Ejercicio86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        Contador cont1 = new Contador();        //Declaro objeto
        Contador cont2 = new Contador(cont1);   //Objeto copia

        int num, menu = 0;      //Declaro variables

        System.out.print("Introduce un número: ");
        num = teclado.nextInt();

        while (menu != 3) {     //Menu con bucle while y switch
            System.out.println("-----------------");
            System.out.println(" 1. Incrementar");
            System.out.println(" 2. Decrementar");
            System.out.println(" 3.   Cerrar");
            System.out.println("-----------------");
            menu = teclado.nextInt();
            
            switch (menu) {     //Switch para las operaciones de contador
                case 1: cont1.Incrementar();
                        System.out.println("Valor actual del contador = "+cont1.GetContador());
                        break;
                        
                case 2: cont1.Decrementar();
                        System.out.println("Valor actual del contador = "+cont1.GetContador());
                        if(cont1.GetContador()==0)
                            System.out.println("El contador no puede bajar de 0.");
                        break;
                        
                case 3: System.out.println("Valor del número + contador = "+(num+cont1.GetContador()));
                        break;
            }
        }

    }

}
