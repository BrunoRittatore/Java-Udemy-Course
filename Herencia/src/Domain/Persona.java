package Domain;

public class Persona {
    // para que las clases hijas pueden acceder a las variables , las tenemos que declarar como protected

    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    public Persona(){

    }

    public Persona(String nombre){

        this.nombre =nombre;
    }

    public Persona(java.lang.String nombre, char genero, int edad, java.lang.String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public java.lang.String getNombre() {
        return this.nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public java.lang.String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Persona{ " + "nombre= " + nombre + ", genero= " + genero +
                ", edad= " + edad + ", direccion= " + direccion +
                '}';
    }
}
