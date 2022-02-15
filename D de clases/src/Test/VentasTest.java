package Test;

import Domain.Orden;
import Domain.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Remera", 60);
        Producto producto2 =  new Producto("Camisa", 100);
        Producto producto3 = new Producto("Pantalon", 150);


        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.mostrarOrden();

        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();
    }
}
