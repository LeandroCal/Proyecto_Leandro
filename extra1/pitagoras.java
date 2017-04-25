/*
funciones de la clase para utilizar en el main
 */
package extra1;

/**
 *
 * @author Legui
 */
public class pitagoras {    
    double cateto1;
    double cateto2;
    double resultado;
    
    public pitagoras(){
        resultado=0;            //Creo el constructor
    }
    public pitagoras(double cateto1, double cateto2){
        this.cateto1=cateto1;
        this.cateto2=cateto2;
        this.resultado = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
    public double GetResultado(){   //Devuelvo el resultado del constructor
        return resultado;
    }
}
