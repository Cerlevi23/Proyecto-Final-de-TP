package modelo;

public class inventario {

    private producto[] productos;

    // Constructor
    public inventario() {
        // Inicializando el arreglo de productos con los precios
        productos = new producto[]{
            new producto("Tonificadores Abdominales", 125),
            new producto("Tobilleras", 10),
            new producto("Fajas Reductoras", 55),
            new producto("Mat de Yoga", 10),
            new producto("Proteinas", 72),
            new producto("Masajeador Facial", 125),
            new producto("Crema Reductora", 25),
            new producto("Pesas", 22),
            new producto("Rueda Abdominal", 42),
            new producto("Pelota Fitness", 63)
        };
    }

    // Metodo getter
    public producto[] getProductos() {
        return productos;
    }

    // Metodo para mostrar inventario
    public void mostrarInventario() {
        System.out.println("Productos disponibles:");

        for (int i = 0; i < productos.length; i++) {
            producto producto = productos[i];
            System.out.println((i+1)+". "+producto.getNombre()+" - Precio: $" + producto.getPrecio());
        }
    }
}