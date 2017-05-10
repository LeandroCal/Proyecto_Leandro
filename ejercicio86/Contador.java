/*
metodos a emplear en el main
 */
package ejercicio86;

/**
 *
 * @author Legui
 */
public class Contador {

    private int contador;

    public Contador() {     //Constructor por defecto

    }

    public Contador(int contador) {     //Constructor con parámetros
        if (contador < 0) {
            this.contador = 0;
        } else {
            this.contador = contador;
        }
    }
    
    public Contador(Contador cont1) {     //Constructor copia
        contador = cont1.contador;
    }

    public void SetContador(int contador) {
        if (contador < 0) {
            this.contador = 0;
        } else {
            this.contador = contador;
        }
    }
    
    public int GetContador() {
        return contador;
    }

    public void Incrementar() {
        contador++;
    }

    public void Decrementar() {
        contador--;
        if (contador < 0) {
            contador = 0;
        }
    }

}
