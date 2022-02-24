package Test;
import Domain.OperacionExcepcion;
import jdk.jshell.spi.ExecutionControlProvider;

import static Domain.Aritmetica.division;
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10,0);

        } catch (OperacionExcepcion e) {
            System.out.println("Occurio un erro de tipo Operacion Excepcion");
            System.out.println(e.getMessage());

        }catch (Exception e ) {
            System.out.println("Ocurrio un error de tipo Excepcion");
            System.out.println(e.getMessage());
        }


       // System.out.println("resultado = " + resultado); // va a imprimir el valor inicial ya que la division tuvo un error
    }
}
