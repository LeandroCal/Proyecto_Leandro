/*
funciones de la clase para utilizar en el main
 */
package practica77;
public class datos {
    double radio;
    double resultado;
    
//    public datos(){
//        resultado=0;
//    }
//                            //Inicio constructor
//    public datos(double radio, double resultado){
//        this.radio=radio;
//        this.resultado=resultado;
//    }                       //Cierre constructor
    
    public void SetLongitud(double radio){          //Creo las funciones a utilizar
        this.radio=radio;                           //donde seran introducidos los datos
        this.resultado=this.radio*2*Math.PI;
    }
    
    public void SetArea(double radio){
        this.radio=radio;
        this.resultado=this.radio*this.radio*Math.PI;
    }
    
    public double GetLongitud(){
        return resultado;
    }
    
    public double GetArea(){
        return resultado;
    }
}
