/*
funciones de la clase para utilizar en el main
 */
package extra2;

/**
 *
 * @author Legui
 */
public class segundos {
    
    private long segundos;    //Declaro variables y funciones donde introducir los datos
    private long resultado[]=new long[5];
    private String variables[]= {"semanas","días","horas","minutos","segundos"};
    private long cambio[] = {604800,86400,3600,60,1};
    
    public void SetSegundos(long segundos){
        this.segundos=segundos;
        for(int i=0;i<cambio.length;i++){
            resultado[i]=segundos/cambio[i];
            segundos=segundos-resultado[i]*cambio[i];
        }
    }
    
    public long [] GetResultado(){
        return resultado;
    }
    public String [] GetVariables(){
        return variables;
    }
}
