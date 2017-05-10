/*
Practica89: Crea una clase fecha (Dia, mes, año).Tenemos metodos "Getter" y "Setter".
Comprobar si fecha que le pasamos es correcta y otro objeto para obtener la fecha actual del sistema y guardarlo.
 */
package ejercicio89;
import java.util.*;
/**
 *
 * @author Legui
 */
public class Ejercicio89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        Fecha f1=new Fecha("13/01/1994");   //Declaro objetos
        Fecha f2 = Fecha.clon(f1);
        
//        String fecha="13/01/1994";
//        f1.SetFecha(fecha);

        System.out.println(f1.GetFecha());
        
        Calendar fechaActual = Calendar.getInstance();      //Fecha actual
        int año = fechaActual.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH) + 1;
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);

        System.out.println("Fecha Actual: "+ dia + "/" + (mes) + "/" + año);
        
    }
    
}
