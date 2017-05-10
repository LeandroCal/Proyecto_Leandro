/*
metodos a emplear en el main
 */
package ejercicio90;

/**
 *
 * @author Legui
 */
public class Nif {
    
    private String nif;
    private int resultado;
    
    public Nif(){       //Constructor por defecto
        nif="";
    }
    
    public Nif(String nif){     //Constructor con parametros
        this.nif=nif;
        int numNif = Integer.parseInt(nif.substring(0,8));
        this.resultado=numNif%23;
            switch(resultado){
                case 0:
                    System.out.println("Letra del NIF = T");
                    break;
                case 1:
                    System.out.println("Letra del NIF = R");
                    break;
                case 2:
                    System.out.println("Letra del NIF = W");
                    break;
                case 3:
                    System.out.println("Letra del NIF = A");
                    break;
                case 4:
                    System.out.println("Letra del NIF = G");
                    break;
                case 5:
                    System.out.println("Letra del NIF = M");
                    break;
                case 6:
                    System.out.println("Letra del NIF = Y");
                    break;
                case 7:
                    System.out.println("Letra del NIF = F");
                    break;
                case 8:
                    System.out.println("Letra del NIF = P");
                    break;
                case 9:
                    System.out.println("Letra del NIF = D");
                    break;
                case 10:
                    System.out.println("Letra del NIF = X");
                    break;
                case 11:
                    System.out.println("Letra del NIF = B");
                    break;
                case 12:
                    System.out.println("Letra del NIF = N");
                    break;
                case 13:
                    System.out.println("Letra del NIF = J");
                    break;
                case 14:
                    System.out.println("Letra del NIF = Z");
                    break;
                case 15:
                    System.out.println("Letra del NIF = S");
                    break;
                case 16:
                    System.out.println("Letra del NIF = Q");
                    break;
                case 17:
                    System.out.println("Letra del NIF = V");
                    break;
                case 18:
                    System.out.println("Letra del NIF = H");
                    break;
                case 19:
                    System.out.println("Letra del NIF = L");
                    break;
                case 20:
                    System.out.println("Letra del NIF = C");
                    break;
                case 21:
                    System.out.println("Letra del NIF = K");
                    break;
                case 22:
                    System.out.println("Letra del NIF = E");
                    break;
            }
    }
    
    public void SetNif(String nif){    //Método setter
        this.nif=nif;
        int numNif = Integer.parseInt(nif.substring(0,8));
        this.resultado=numNif%23;
            switch(resultado){
                case 0:
                    System.out.println("Letra del NIF = T");
                    break;
                case 1:
                    System.out.println("Letra del NIF = R");
                    break;
                case 2:
                    System.out.println("Letra del NIF = W");
                    break;
                case 3:
                    System.out.println("Letra del NIF = A");
                    break;
                case 4:
                    System.out.println("Letra del NIF = G");
                    break;
                case 5:
                    System.out.println("Letra del NIF = M");
                    break;
                case 6:
                    System.out.println("Letra del NIF = Y");
                    break;
                case 7:
                    System.out.println("Letra del NIF = F");
                    break;
                case 8:
                    System.out.println("Letra del NIF = P");
                    break;
                case 9:
                    System.out.println("Letra del NIF = D");
                    break;
                case 10:
                    System.out.println("Letra del NIF = X");
                    break;
                case 11:
                    System.out.println("Letra del NIF = B");
                    break;
                case 12:
                    System.out.println("Letra del NIF = N");
                    break;
                case 13:
                    System.out.println("Letra del NIF = J");
                    break;
                case 14:
                    System.out.println("Letra del NIF = Z");
                    break;
                case 15:
                    System.out.println("Letra del NIF = S");
                    break;
                case 16:
                    System.out.println("Letra del NIF = Q");
                    break;
                case 17:
                    System.out.println("Letra del NIF = V");
                    break;
                case 18:
                    System.out.println("Letra del NIF = H");
                    break;
                case 19:
                    System.out.println("Letra del NIF = L");
                    break;
                case 20:
                    System.out.println("Letra del NIF = C");
                    break;
                case 21:
                    System.out.println("Letra del NIF = K");
                    break;
                case 22:
                    System.out.println("Letra del NIF = E");
                    break;
            } 
    }
    
    public int GetLetra(){       //Método getter
        return resultado;
    }
    
}
