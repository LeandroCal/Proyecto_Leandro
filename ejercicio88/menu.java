/*
menu a emplear en el main
 */
package ejercicio88;

import java.util.Scanner;

/**
 *
 * @author Legui
 */
public class menu {

    public void Menu() {
        System.out.println("-----------------------");
        System.out.println(" 1.  Dar alta libro");
        System.out.println(" 2.  Dar baja libro");
        System.out.println(" 3.  Préstamo libro");
        System.out.println(" 4. Devolución libro");
        System.out.println(" 5.     Cerrar");
        System.out.println("-----------------------");
    }
    
    public int LeerDato(){
        Scanner teclado=new Scanner (System.in);
        return teclado.nextInt();
    }
    
    public String LeerDato2(){
        Scanner teclado=new Scanner (System.in);
        return teclado.nextLine();
    }
    
    public void PedirNumero(){
        System.out.print("Introduce una cantidad: ");
    }
    
    public void PedirOpcion(){
        System.out.print("Introduce una opcion: ");
    }
    
    public void Incorrecta(){
        System.out.println("Opcion introducida incorrecta.");
    }
    
    public void Alta(){
        System.out.print("Selecione el libro que quiere dar de alta: ");
    }
    public void Baja(){
        System.out.print("Selecione el libro que quiere dar de baja: ");
    }
    public void Prestar(){
        System.out.print("Seleccione el libro que quiere recoger: ");
    }
    
    public void Titulo(){
        System.out.print("Titulo: ");
    }
    public void Autor(){
       System.out.print("Autor: "); 
    }
    public void Ejemplares(){
        System.out.print("Ejemplares: ");
    }
    public void Isbn(){
        System.out.print("ISBN: ");
    }
    
}
