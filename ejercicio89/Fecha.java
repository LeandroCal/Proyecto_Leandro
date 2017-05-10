/*
metodos a emplear en el main
 */
package ejercicio89;

import java.util.regex.Pattern;

/**
 *
 * @author Legui
 */
public class Fecha {

    private String fecha;       //Declaro variables
    boolean cumplePatron;

    public Fecha() {     //Constructor por defecto
        fecha="";
    }

    public Fecha(String fecha) {     //Constructor por parametros
        this.fecha=fecha;
        cumplePatron = Pattern.matches("^([0][1-9]|[12][0-9]|3[01])(\\/|-)([0][1-9]|[1][0-2])\\2(\\d{4})$", fecha);
        if (cumplePatron) {
            System.out.println("Fecha introducida correcta");
        } else {
            System.out.println("Fecha introducida INCORRECTA");
        }
    }
    
     public static Fecha clon(Fecha f1){      //Constructor copia
        return new Fecha(f1.fecha);
    }

    public void SetFecha(String fecha) {
        this.fecha=fecha;
        cumplePatron = Pattern.matches("^([0][1-9]|[12][0-9]|3[01])(\\/|-)([0][1-9]|[1][0-2])\\2(\\d{4})$", fecha);
        if (cumplePatron) {
            System.out.println("Fecha introducida correcta");
        } else {
            System.out.println("Fecha introducida INCORRECTA");
        }
    }

    public String GetFecha() {
        return fecha;
    }
}
