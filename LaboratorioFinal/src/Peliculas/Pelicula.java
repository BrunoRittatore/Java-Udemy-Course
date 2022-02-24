package Peliculas;

public class Pelicula {
    private String nombre;

    public Pelicula(){

    }

    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return  this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        System.out.println("Valor Cargado Correctamente");
        System.out.println("Nombre: " + nombre);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
