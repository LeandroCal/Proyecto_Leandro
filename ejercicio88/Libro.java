/*
menus, getter, setter y metodos a emplear en el main.
 */
package ejercicio88;

import java.util.Scanner;

/**
 *
 * @author Legui
 */
public class Libro {
    Scanner teclado=new Scanner(System.in);
    
    private String titulo;      //Variables
    private String autor;
    private int ejemplares;
    private int prestados=0;
    private int isbn;
    
    public Libro(){     //Constructor por defecto
        
    }
    
    public Libro(String titulo, String autor, int ejemplares, int prestados, int isbn){     //Constructor por parametros
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestados=prestados;
        this.isbn=isbn;
    }
    
    public static Libro clon(Libro l1){      //Constructor copia
        return new Libro(l1.titulo,l1.autor,l1.ejemplares,l1.prestados,l1.isbn);
    }

    public String getTitulo() {         //Metodos setter y getter
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    //Metodos para cada opcion del menu
    public void SetAlta(String titulo, String autor, int ejemplares, int isbn){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.isbn=isbn;
    }
    
    public void SetBaja(String titulo, String autor, int ejemplares, int isbn){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.isbn=isbn;
    }
    
    public void SetPrestamo(int cantidad){
        this.ejemplares-=cantidad;
        this.prestados+=cantidad;
    }
    
    public int GetPrestamo(){
        return prestados;
    }
    
    public void SetDevolucion(int cantidad){
        this.ejemplares+=cantidad;
        this.prestados-=cantidad;
    }
    
    public int GetDevolucion(){
        return ejemplares;
    }
    
}