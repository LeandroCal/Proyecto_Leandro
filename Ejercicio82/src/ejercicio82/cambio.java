/*
funciones de la clase para utilizar en el main
 */
package ejercicio82;

public class cambio {
    
    private long cantidad;    //Declaro variables y funciones donde introducir los datos
    private long resultado[]=new long[9];
    private long billetes[] = {500,200,100,50,20,10,5,2,1};
    
    public void SetEuros(long cantidad){
        this.cantidad=cantidad;
        for(int i=0;i<billetes.length;i++){
            resultado[i]=cantidad/billetes[i];
            cantidad=cantidad-resultado[i]*billetes[i];
        }
    }
    
    public long [] GetNumero(){
        return resultado;
    }
    public long [] GetBilletes(){
        return billetes;
    }
    
}
