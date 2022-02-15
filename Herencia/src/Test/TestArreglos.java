package Test;

import java.util.Arrays;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int [3]; // de la derecha se crea un objeto de 3 elementos
        String caca[] = {"Hola","Juan","Carlos"};
        System.out.println("edades: " + edades);
        edades[2]= 20;
        System.out.println(edades[2]);
        System.out.println(edades.length); // se utiliza el metodo length para saber el tamaño del arreglo
        System.out.println("caca = " + Arrays.toString(caca));
    }
}
