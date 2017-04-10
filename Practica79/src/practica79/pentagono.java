/*
funciones de la clase para utilizar en el main
 */
package practica79;
public class pentagono {
    
    double lado;
    double resultado;
    
    public void SetArea(double lado){   //Funciones donde introducir datos
        this.lado=lado;
        this.resultado=(this.lado*5*(Math.sqrt(Math.pow(this.lado, 2)-Math.pow(this.lado/2, 2))) /2);
    }
    
    public double GetArea(){
        return resultado;
    }
}
