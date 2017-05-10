/*
Practica88: Idem que el 87 pero con arraylist.
 */
package ejercicio88;
import java.util.*;
/**
 *
 * @author Legui
 */
public class Ejercicio88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        
        Libro l1=new Libro();   //Declaro objetos, arraylist y variables
        Libro l2=new Libro();
        menu m = new menu();
        
        ArrayList <Libro> lista= new ArrayList <Libro> (2);
        
        int opcion=0, opcion1=0, opcion2=0, opcion3=0, opcion4=0;
        int cantidad;
        int cont=0;
        
        while (opcion != 5) {   //While para mostrar menu
            m.Menu();
            m.PedirOpcion();
            opcion = m.LeerDato();
            switch (opcion) {   //Switch para entrar en cada opcion del menu
                case 1:     //Dar de alta libro
                    if(cont==0){
                        m.Titulo();
                        String titulo=m.LeerDato2();
                        l1.setTitulo(titulo);
                        m.Autor();
                        String autor=m.LeerDato2();
                        l1.setAutor(titulo);
                        m.Ejemplares();
                        int ejemplares=m.LeerDato();
                        l1.setEjemplares(ejemplares);
                        m.Isbn();
                        int isbn=m.LeerDato();
                        l1.setIsbn(isbn);
                        l1.SetAlta(titulo, autor, ejemplares, isbn);
                        lista.add(l1);
                        cont++;
                    }
                    else if(cont==1){
                        m.Titulo();
                        String titulo=m.LeerDato2();
                        l2.setTitulo(titulo);
                        m.Autor();
                        String autor=m.LeerDato2();
                        l2.setAutor(titulo);
                        m.Ejemplares();
                        int ejemplares=m.LeerDato();
                        l2.setEjemplares(ejemplares);
                        m.Isbn();
                        int isbn=m.LeerDato();
                        l2.setIsbn(isbn);
                        l2.SetAlta(titulo, autor, ejemplares, isbn);
                        lista.add(l2);
                        cont++;
                    }
                    else
                        System.out.println("No se pueden dar de alta más libros.");
                    break;
                    
                case 2:     //Dar de baja libro
                    System.out.println("Libro 1: "+lista.get(0).getTitulo());
                    System.out.println("Libro 2: "+lista.get(1).getTitulo());
                    m.Baja();
                    opcion2=m.LeerDato();
                    if(opcion2==1){
                        l1.SetBaja("", "", 0, 0);
                        lista.remove(0);
                    }
                    else if(opcion2==2){
                        l1.SetBaja("", "", 0, 0);
                        lista.remove(1);
                    }
                    else{
                        m.Incorrecta();
                    }
                    break;
                    
                case 3:     //Prestamo libro
                    System.out.println("Libro 1: "+lista.get(0).getTitulo());
                    System.out.println("Libro 2: "+lista.get(1).getTitulo());
                    m.Prestar();
                    opcion3=m.LeerDato();
                    if(lista.get(0).getTitulo().equals("") || lista.get(1).getTitulo().equals("")){
                        System.out.println("No tenemos este libro dado de alta. Disculpe las molestias.");
                    }
                    else{
                        if(opcion3==1){
                            System.out.println("¿Cuantos ejemplares quiere retirar?");
                            cantidad=m.LeerDato();
                                if(cantidad>lista.get(0).getEjemplares()){
                                    System.out.println("Lo siento no tenemos tantos ejemplares.");
                                }
                                else{
                                    lista.get(0).SetPrestamo(cantidad);
                                    System.out.println(l1.GetPrestamo()+" ejemplares prestados del libro "+l1.getTitulo());
                                }
                        }
                        else if(opcion3==2){
                            System.out.println("¿Cuantos ejemplares quiere retirar?");
                            cantidad=m.LeerDato();
                                if(cantidad>lista.get(1).getEjemplares()){
                                    System.out.println("Lo siento no tenemos tantos ejemplares.");
                                }
                                else{
                                    lista.get(1).SetPrestamo(cantidad);
                                    System.out.println(l2.GetPrestamo()+" ejemplares prestados del libro "+l2.getTitulo());
                                }
                        }
                        else{
                            m.Incorrecta();
                        }
                    }
                    break;
                    
                case 4:     //Devolucion libro
                    System.out.println("Libro 1: "+lista.get(0).getTitulo());
                    System.out.println("Libro 2: "+lista.get(1).getTitulo());
                    System.out.print("Seleccione el libro que quiere devolver: ");
                    opcion4=m.LeerDato();
                    if(lista.get(0).getTitulo().equals("") || lista.get(1).getTitulo().equals("")){
                        System.out.println("No tenemos este libro dado de alta. Disculpe las molestias.");
                    }
                    else{
                        if(opcion4==1){
                            System.out.println("¿Cuantos ejemplares quiere devolver?");
                            cantidad=m.LeerDato();
                                if(cantidad>lista.get(0).GetPrestamo()){
                                    System.out.println("Lo siento no puede devolver mas ejemplares de los que tenemos de ese libro.");
                                }
                                else{
                                    lista.get(0).SetDevolucion(cantidad);
                                    System.out.println(lista.get(0).GetDevolucion()+" ejemplares devueltos del libro "+lista.get(0).getTitulo());
                                }
                        }
                        else if(opcion4==2){
                            System.out.println("¿Cuantos ejemplares quiere devolver?");
                            cantidad=m.LeerDato();
                                if(cantidad>lista.get(1).GetPrestamo()){
                                    System.out.println("Lo siento no puede devolver mas ejemplares de los que tenemos de ese libro.");
                                }
                                else{
                                    lista.get(1).SetDevolucion(cantidad);
                                    System.out.println(lista.get(1).GetDevolucion()+" ejemplares devueltos del libro "+lista.get(1).getTitulo());
                                }
                        }
                        else{
                            m.Incorrecta();
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
