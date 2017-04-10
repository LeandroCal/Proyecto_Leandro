/*
Practica76: Realizar una calculadora (UML y orientacion objetos).
 */
package practica76;

import java.util.*;

/**
 *
 * @author Legui
 */
public class Practica76 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Declaro los objetos
        operadores o1 = new operadores();
        menu m = new menu();
//Declaro las variables
        int opcion = 0;
        int num1, num2;
//Bucle while para mostrar menu y opciones
        while (opcion != 6) {
            m.Mostrar();
            m.PedirOpcion();
            opcion = m.LeerDato();
            switch (opcion) {
//Switch para cada operacion a realizar
                case 1:
                    m.PedirNumero();
                    num1 = m.LeerDato();
                    m.PedirNumero();
                    num2 = m.LeerDato();
                    o1.SetSumar(num1, num2);
                    System.out.println("El resultado es = " + o1.GetResultado()+"\n");
                    break;
                case 2:
                    m.PedirNumero();
                    num1 = m.LeerDato();
                    m.PedirNumero();
                    num2 = m.LeerDato();
                    o1.SetRestar(num1, num2);
                    System.out.println("El resultado es = " + o1.GetResultado()+"\n");
                    break;
                case 3:
                    m.PedirNumero();
                    num1 = m.LeerDato();
                    m.PedirNumero();
                    num2 = m.LeerDato();
                    o1.SetMultiplicar(num1, num2);
                    System.out.println("El resultado es = " + o1.GetResultado()+"\n");
                    break;
                case 4:
                    m.PedirNumero();
                    num1 = m.LeerDato();
                    m.PedirNumero();
                    num2 = m.LeerDato();
                    o1.SetDividir(num1, num2);
                    System.out.println("El resultado es = " + o1.GetResultado()+"\n");
                    break;
                case 5:
                    m.PedirNumero();
                    num1 = m.LeerDato();
                    m.PedirNumero();
                    num2 = m.LeerDato();
                    o1.SetModulo(num1, num2);
                    System.out.println("El resultado es = " + o1.GetResultado()+"\n");
                    break;
                case 6:
                    System.out.println("Cerrando programa.");
                    break;
            }
        }
    }
}
