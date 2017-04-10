/*
funciones de la clase para utilizar en el main
 */
package ejercicio83;

import java.util.Scanner;

public class ecuacion2 {    //Declaro variables y funciones donde introducir los datos
    double a;
    double b;
    double c;
    double x1;
    double x2;
    
    public void SetEcuacion(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
        this.x1=-b+Math.sqrt(Math.pow(b, 2)-4*a*c)/2;
        this.x2=-b-Math.sqrt(Math.pow(b, 2)-4*a*c)/2;
    }
    
    public int LeerDato(){
        Scanner teclado=new Scanner (System.in);
        return teclado.nextInt();
    }
    public void PedirA(){
        System.out.print("Introduce el valor de A: ");
    }
    public void PedirB(){
        System.out.print("Introduce el valor de B: ");
    }
    public void PedirC(){
        System.out.print("Introduce el valor de C: ");
    }
    
    public double Getx1(){
        return x1;
    }
    
    public double Getx2(){
        return x2;
    }
}
