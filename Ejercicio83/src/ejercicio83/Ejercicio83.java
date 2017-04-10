/*
Practica83: Ecuacion 2 grado.
 */
package ejercicio83;
import java.util.*;

/**
 *
 * @author Legui
 */
public class Ejercicio83 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
//Declaro variables y objetos
        double a,b,c;
        ecuacion2 e1=new ecuacion2();
//Pedir datos
        e1.PedirA();
        a=e1.LeerDato();
        e1.PedirB();
        b=e1.LeerDato();
        e1.PedirC();
        c=e1.LeerDato();
        
        e1.SetEcuacion(a, b, c);
        
        System.out.println("El resultado de 'x1' es = "+e1.Getx1());
        System.out.println("El resultado de 'x2' es = "+e1.Getx2());
    }
    
}
