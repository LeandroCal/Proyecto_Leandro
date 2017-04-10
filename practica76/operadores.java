/*
funciones de la clase para utilizar en el main (calcular)
 */
package practica76;
public class operadores {
    
    private int num1;       //variables a utilizar
    private int num2;
    private int resultado;
    
//    public operadores(){      //El constructor se utiliza para meter los datos directamente por el
//        resultado=0;
//    }
//                            //Inicio constructor
//    public operadores(int num1, int num2, int resultado){
//        this.num1=num1;
//        this.num2=num2;
//        this.resultado=resultado;
//    }                       //Cierre constructor
    
    public void SetSumar(int num1,int num2){       //Creamos las funciones a utilizar
        this.num1=num1;                           //donde introducimos los datos
        this.num2=num2;
        this.resultado=this.num1+this.num2;
    }
    public void SetRestar(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        this.resultado=this.num1-this.num2;
    }
    public void SetMultiplicar(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        this.resultado=this.num1*this.num2;
    }
    public void SetDividir(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        this.resultado=this.num1/this.num2;
    }
    public void SetModulo(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        this.resultado=this.num1%this.num2;
    }
    public int GetResultado(){       //devolucion de resultados
            return resultado;
    }
    
}
