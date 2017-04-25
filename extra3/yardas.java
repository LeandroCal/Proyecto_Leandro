/*
funciones de la clase para utilizar en el main
 */
package extra3;

/**
 *
 * @author Legui
 */
public class yardas {

    private int yardas;    //Declaro variables y funciones donde introducir los datos
    private int pies;
    private int pulgadas;
    private double centimetros;

    public void SetYardas(int yardas) {
        this.yardas = yardas;
        this.pies=yardas*3;
        this.pulgadas=yardas*36;
        this.centimetros=yardas*91.44;
    }

    public int GetPies() {  //Devuelvo los resultados
        return pies;
    }
    public int GetPulgadas() {
        return pulgadas;
    }
    public double GetCentimetros() {
        return centimetros;
    }

}
