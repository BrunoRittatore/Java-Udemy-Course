package Domain;
import Domain.OperacionExcepcion;
public class Aritmetica {
    // se tiene que declarar las posibles exepciones que puede lanzar
    public static int division(int num, int den) throws OperacionExcepcion {
        if(den == 0){
            throw new OperacionExcepcion("Division entre 0");
        }
        return num/den;
    }
}
