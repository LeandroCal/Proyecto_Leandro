/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio91;

/**
 *
 * @author Legui
 */
public class Usuario {
    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    public Usuario(){   //Constructor por defecto
        nif="";
        nombre="";
        apellido1="";
        apellido2="";
    }
    
    public Usuario(String nif, String nombre, String apellido1, String apellido2){  //Constructor por parametros
        this.nif=nif;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
    }
    
    public void ImprimirUsuario(){
        System.out.println("USUARIO");
        System.out.println("Nif: "+nif);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellido1+", "+apellido2);
    }
    
    public void setNombre(String nombre){       //Getter's y setter's
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido1(String apellido1){
        this.apellido1=apellido1;
    }
    
    public String getApellido1(){
        return apellido1;
    }
    
    public void setApellido2(String apellido2){
        this.apellido2=apellido2;
    }
    
    public String getApellido2(){
        return apellido2;
    }
    
    public void setNif(String nif){
        this.nif=nif;
    }
    
    public String getNif(){
        return nif;
    }
}
