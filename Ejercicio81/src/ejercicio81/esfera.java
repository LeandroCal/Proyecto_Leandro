/*
funciones de la clase para utilizar en el main
 */
package ejercicio81;
public class esfera {
    
    double radio;       //Declaro variables y funciones donde introducir datos
    double resultado;
    
    public void SetArea(double radio){
        this.radio=radio;
        this.resultado=4*Math.PI*Math.pow(radio, 2);
    }
    public void SetVolumen(double radio){
        this.radio=radio;
        this.resultado=4/3*Math.PI*Math.pow(radio, 3);
    }
    public double GetArea(){
        return resultado;
    }
    public double GetVolumen(){
        return resultado;
    }
}
