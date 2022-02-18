package Test;

public class TestAutoboxingUnboxing {
    // Clases enmvolventes de tipos primitivos
    /*
    Int- integer
    long- long
    float- Float
    double- Double
     */
 //autoboxing
    public static void main(String[] args) {
        Integer entero= 10;
        System.out.println("entero = " + entero);
        // ahora la salida va a ser un string y no un valor int como en sout anterior
        System.out.println("entero = " + entero.toString());
        //ahora realizo un unboxing
        int entero1= entero;
        System.out.println("entero1 = " + entero1);

    }

}
