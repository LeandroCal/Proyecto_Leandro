/*
funciones de la clase para utilizar en el main
 */
package practica78;
public class triangulo {
    double base;
    double altura;
    double resultado;
    
//    public triangulo(){
//        resultado=0;
//    }
//                            //Inicio constructor
//    public triangulo(double base, double altura, double resultado){
//        this.base=base;
//        this.altura=altura;
//        this.resultado=resultado;
//    }                       //Cierre constructor
    
    public void SetArea(double base, double altura){    //Funciones donde introducir los datos
        this.base=base;
        this.altura=altura;
        this.resultado=(base*altura)/2;
    }
    public double GetResultado(){
        return resultado;
    }
}
