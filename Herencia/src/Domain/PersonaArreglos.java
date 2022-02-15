package Domain;

public class PersonaArreglos {
    public String nombre;

    public PersonaArreglos (String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona {" +
                "nombre: '" + nombre + '\'' +
                '}';
    }
}
