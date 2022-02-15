package Domain;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto(){
        this.idProducto = ++contadorProductos;

    }

    public Producto(String nombre , double precio){
       this();
        this.nombre = nombre;
        this.precio = precio;


    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getIdProducto(){

        return this.idProducto;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto {" +
                "idProducto: "  + idProducto +
                ", nombre: '" + nombre + '\'' +
                ", precio: " + precio +
                '}';
    }
}
