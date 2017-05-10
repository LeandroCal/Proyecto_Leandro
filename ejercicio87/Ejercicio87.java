/*
Practica87: Crea una clase libro con metodos "prestamo", "devolucion" 
ademas de dar "alta libros" y "baja libros" (2 libros).Tenemos constructor por defecto, 
constructor con parametros, un constructor copia y metodos "Getter" y "Setter".
 */
package ejercicio87;

import java.util.*;

/**
 *
 * @author Legui
 */
public class Ejercicio87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        
        Libro l1=new Libro();   //Declaro objetos y variables
        Libro l2=new Libro();
        
        int opcion=0, opcion1=0, opcion2=0, opcion3=0, opcion4=0;
        int cantidad;
        
        while (opcion != 5) {   //While para mostrar el menu
            System.out.println("-----------------------");
            System.out.println(" 1.  Dar alta libro");
            System.out.println(" 2.  Dar baja libro");
            System.out.println(" 3.  Préstamo libro");
            System.out.println(" 4. Devolución libro");
            System.out.println(" 5.     Cerrar");
            System.out.println("-----------------------");
            
            System.out.print("Introduce una operacion: ");
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {   //Switch para cada opcion del menu
                case 1:     //Dar de alta libro
                    System.out.println("Libro1: ");
                    System.out.println("Libro2: ");
                    System.out.print("Selecione el libro que quiere dar de alta: ");
                    opcion1=teclado.nextInt();
                    if(opcion1==1){
                        System.out.print("Titulo: ");
                        String titulo=teclado.nextLine();
                        l1.setTitulo(titulo);
                        System.out.print("Autor: ");
                        String autor=teclado.nextLine();
                        l1.setAutor(titulo);
                        System.out.print("Ejemplares: ");
                        int ejemplares=teclado.nextInt();
                        l1.setEjemplares(ejemplares);
                        System.out.print("ISBN: ");
                        long isbn=teclado.nextLong();
                        l1.setIsbn(isbn);
                        l1.SetAlta(titulo, autor, ejemplares, isbn);
                    }
                    else if(opcion1==2){
                        System.out.print("Titulo: ");
                        String titulo=teclado.nextLine();
                        l2.setTitulo(titulo);
                        System.out.print("Autor: ");
                        String autor=teclado.nextLine();
                        l2.setAutor(titulo);
                        System.out.print("Ejemplares: ");
                        int ejemplares=teclado.nextInt();
                        l2.setEjemplares(ejemplares);
                        System.out.print("ISBN: ");
                        long isbn=teclado.nextLong();
                        l2.setIsbn(isbn);
                        l2.SetAlta(titulo, autor, ejemplares, isbn);
                    }
                    else
                        System.out.println("Opcion introducida incorrecta.");
                    break;
                    
                case 2:     //Dar de baja libro
                    System.out.println("Libro 1: "+l1.getTitulo());
                    System.out.println("Libro 2: "+l2.getTitulo());
                    System.out.print("Selecione el libro que quiere dar de baja: ");
                    opcion2=teclado.nextInt();
                    if(opcion2==1){
                        
                        l1.setTitulo("");
                        l1.setAutor("");
                        l1.setEjemplares(0);
                        l1.setIsbn(0);
                        l1.SetBaja("","",0,0);
                    }
                    else if(opcion2==2){
                        l2.setTitulo("");
                        l2.setAutor("");
                        l2.setEjemplares(0);
                        l2.setIsbn(0);
                        l2.SetBaja("","",0,0);
                    }
                    else{
                        System.out.println("Opcion introducida incorrecta.");
                    }
                    break;
                    
                case 3:     //Prestamo libro
                    System.out.println("Libro 1: "+l1.getTitulo());
                    System.out.println("Libro 2: "+l2.getTitulo());
                    System.out.print("Seleccione el libro que quiere recoger: ");
                    opcion3=teclado.nextInt();
                    if(l1.getTitulo().equals("") || l2.getTitulo().equals("")){
                        System.out.println("No tenemos este libro dado de alta. Disculpe las molestias.");
                    }
                    else{
                        if(opcion3==1){
                            System.out.println("¿Cuantos ejemplares quiere retirar?");
                            cantidad=teclado.nextInt();
                                if(cantidad>l1.getEjemplares()){
                                    System.out.println("Lo siento no tenemos tantos ejemplares.");
                                }
                                else{
                                    l1.SetPrestamo(cantidad);
                                    System.out.println(l1.GetPrestamo()+" ejemplares prestados del libro "+l1.getTitulo());
                                }
                        }
                        else if(opcion3==2){
                            System.out.println("¿Cuantos ejemplares quiere retirar?");
                            cantidad=teclado.nextInt();
                                if(cantidad>l2.getEjemplares()){
                                    System.out.println("Lo siento no tenemos tantos ejemplares.");
                                }
                                else{
                                    l2.SetPrestamo(cantidad);
                                    System.out.println(l2.GetPrestamo()+" ejemplares prestados del libro "+l2.getTitulo());
                                }
                        }
                        else{
                            System.out.println("Opcion introducida incorrecta.");
                        }
                    }
                    break;
                    
                case 4:     //Devolucion libro
                    System.out.println("Libro 1: "+l1.getTitulo());
                    System.out.println("Libro 2: "+l2.getTitulo());
                    System.out.print("Seleccione el libro que quiere devolver: ");
                    opcion4=teclado.nextInt();
                    if(l1.getTitulo().equals("") || l2.getTitulo().equals("")){
                        System.out.println("No tenemos este libro dado de alta. Disculpe las molestias.");
                    }
                    else{
                        if(opcion4==1){
                            System.out.println("¿Cuantos ejemplares quiere devolver?");
                            cantidad=teclado.nextInt();
                                if(cantidad>l1.GetPrestamo()){
                                    System.out.println("Lo siento no puede devolver mas ejemplares de los que tenemos de ese libro.");
                                }
                                else{
                                    l1.SetDevolucion(cantidad);
                                    System.out.println(l1.GetDevolucion()+" ejemplares devueltos del libro "+l1.getTitulo());
                                }
                        }
                        else if(opcion4==2){
                            System.out.println("¿Cuantos ejemplares quiere devolver?");
                            cantidad=teclado.nextInt();
                                if(cantidad>l2.GetPrestamo()){
                                    System.out.println("Lo siento no puede devolver mas ejemplares de los que tenemos de ese libro.");
                                }
                                else{
                                    l2.SetDevolucion(cantidad);
                                    System.out.println(l2.GetDevolucion()+" ejemplares devueltos del libro "+l2.getTitulo());
                                }
                        }
                        else{
                            System.out.println("Opcion introducida incorrecta.");
                        }
                    }
                    break;
                case 5:     //Cerrar programa
                    System.out.println("Cerrando programa...");
                    break;
                    
            } //Termina switch 
            
        }   //Termina while
        
    }
}
