package modelo;

import java.util.Scanner;

public class cliente {

    private String nombre;
    
    //Sobrecarga de constructores
    public cliente(){
        
    }
    
    public cliente(String nombre) {
        this.nombre = nombre;
    }
    
    public void ingresarNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = sc.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}