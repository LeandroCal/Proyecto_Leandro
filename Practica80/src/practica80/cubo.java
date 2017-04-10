/*
funciones de la clase para utilizar en el main
 */
package practica80;
public class cubo {
//Declaro variables y funciones donde seran introducidos los datos
    double arista;
    double resultado;
    
    public void SetAreaLateral(double arista){
        this.arista=arista;
        this.resultado=4*(Math.pow(arista,2));
    }
    public void SetAreaTotal(double arista){
        this.arista=arista;
        this.resultado=6*(Math.pow(arista, 2));
    }
    
   public double GetAreaLateral(){
       return resultado;
   }
   public double GetAreaTotal(){
       return resultado;
   }
}
