package modelo;

public class producto {

    public static producto[] getProductos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public static producto[] getProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String nombre;
    private double precio;
    private int cantidadVendida;

    // Constructor
    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
    
    public int getCantidadVendida(){
        return cantidadVendida;
    }
    
    public void setCantidadVendida(int cantidadVendida){
        this.cantidadVendida = cantidadVendida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}