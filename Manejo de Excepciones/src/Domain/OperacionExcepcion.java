package Domain;

public class OperacionExcepcion extends Exception{
// es de tipo check
    public OperacionExcepcion(String mensaje) {
        super(mensaje); // se utiliza el constructor de la clase Exception

    }
}
