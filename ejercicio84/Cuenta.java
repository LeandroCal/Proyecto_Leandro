/*
metodos a emplear en el main
 */
package ejercicio84;
import java.util.*;
/**
 *
 * @author Legui
 */
public class Cuenta {
    Scanner teclado=new Scanner (System.in);
    private String nombre;      //Variables a utilizar
    private String apellido1;
    private String apellido2;
    private String dni;
    private long cuenta;
    private String tipo;
    private double interes;
    private double saldo;
    double cantidad;
    
    public Cuenta(){    //Constructor por defecto
        
    }
        //Constructor por parametros
    public Cuenta(String nombre, String apellido1, String apellido2, String dni, long cuenta, String tipo, double interes, double saldo){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.dni=dni;
        this.cuenta=cuenta;
        this.tipo=tipo;
        this.interes=interes;
        this.saldo=saldo;
    }
    
//    public Cuenta(Cuenta c1){      //Constructor copia
//        this.nombre=c1.nombre;
//        this.apellido1=c1.apellido1;
//        this.apellido2=c1.apellido2;
//        this.dni=c1.dni;
//        this.cuenta=c1.cuenta;
//        this.tipo=c1.tipo;
//        this.interes=c1.interes;
//        this.saldo=c1.saldo;
//    }
    
    public void SetIngreso(double cantidad){    //Metodo ingreso
        this.cantidad=cantidad;
        this.saldo=saldo+cantidad;
    }
    public void SetReintegro(double cantidad){
        this.cantidad=cantidad;
        this.saldo=saldo-cantidad;
    }
    
    public double GetResultado(){
        return saldo;
    }
    
    public void Imprimir(){
        System.out.println("----------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido1: "+apellido1);
        System.out.println("Apellido2: "+apellido2);
        System.out.println("Dni: "+dni);
        System.out.println("Nº Cuenta: "+cuenta);
        System.out.println("Tipo: "+tipo);
        System.out.println("Interés: "+interes+" %");
        System.out.println("Saldo: "+saldo+" €");
    }
}
