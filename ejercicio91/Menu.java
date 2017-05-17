/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio91;

import java.util.Scanner;

/**
 *
 * @author Legui
 */
public class Menu {

    public void Mostrar() {                      //Creamos las funciones a utilizar para el menu
        System.out.println("------------------------------");
        System.out.println("1.    Dar de alta libro");
        System.out.println("2. Lista libros y ejemplares");
        System.out.println("3.       Préstamo");
        System.out.println("4.        Cerrar");
        System.out.println("-------------------------------");
    }

    public int LeerDatoInt() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    public String LeerDatoString() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public void Opcion() {
        System.out.print("Seleccione una opcion: ");
    }

    public void Libros() {
        System.out.println("Libro1");
        System.out.println("Libro2");
        System.out.println("Libro3");
    }
    
}
