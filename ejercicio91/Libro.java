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
public class Libro {
    Scanner teclado=new Scanner (System.in);
    
    private int codigo;     //Variables libro
    private String nombre;
    private String autor;
    int ejemplares;

    private int codigoEjemplar;     //Variables ejemplar
    private int isbn;
    private String fechaIni;
    private String fechaFin;

    public Libro(){     //Constructor por defecto
        codigo = 0;
        nombre = "";
        autor = "";
        ejemplares = 0;
    }
    
    public Libro(int codigo, String nombre, String autor, int ejemplares){ //Constructor por parametros
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.ejemplares = ejemplares;
    }
    
    public void AltaLibro(){
        System.out.print("Introduce el codigo del libro: ");
        this.codigo=teclado.nextInt();
        System.out.print("Introduce el nombre del libro: ");
        this.nombre=teclado.next();
        System.out.print("Introduce el nombre del autor: ");
        this.autor=teclado.next();
        System.out.print("Introduce el numero de ejemplares: ");
        this.ejemplares=teclado.nextInt();
    }

    public void AltaEjemplar(){
        System.out.print("Introduce el código del ejemplar: ");
        this.codigoEjemplar=teclado.nextInt();
        System.out.print("Introduce el isbn: ");
        this.isbn=teclado.nextInt();
        System.out.print("Introduce la fecha de inicio: ");
        this.fechaIni=teclado.next();
        System.out.print("Introduce la fecha de fin: ");
        this.fechaFin=teclado.next();
    }

    public Scanner getTeclado() {       //Getter's y setter's
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public int getCodigoEjemplar() {
        return codigoEjemplar;
    }

    public void setCodigoEjemplar(int codigoEjemplar) {
        this.codigoEjemplar = codigoEjemplar;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void ImprimirEjemplar(){
        System.out.println("Nombre del libro: "+nombre);
        System.out.println("Codigo del ejemplar: "+codigoEjemplar);
        System.out.println("ISBN: "+isbn);
        System.out.println("Fecha de inicio: "+fechaIni);
        System.out.println("Fecha final: "+fechaFin);   
    }
    
    public void Prestamo(){
        if(this.ejemplares>0){
            ejemplares--;
            ImprimirLibro();
        }
        else{
            System.out.println("Lo siento, no quedan más ejemplares.");
        }
    }
    
    public void ImprimirLibro(){
        System.out.println("Código: "+codigo);
        System.out.println("Nombre libro: "+nombre);
        System.out.println("Autor: "+autor);
        System.out.println("Ejemplares: "+ejemplares);
    }

    public int getCodigo() {        //Getter's y setter's
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

}
