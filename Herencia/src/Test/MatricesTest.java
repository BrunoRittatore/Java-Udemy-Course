package Test;

import Domain.Persona;
import Domain.PersonaArreglos;

import java.util.Arrays;

public class MatricesTest {
    public static void main(String[] args) {
        int edades [][] = new int [3][2]; // filas x columnas
       // edades[1][0] =45;
        //System.out.println("edades[1][0] = " + edades[1][0]);
        // Ahora vamos a ver como iterar una matriz

        /*for(int i = 0; i< edades.length;i++){
            for(int j=0; j<edades[i].length;j++){
                System.out.println("Edad: " + edades[i][j]);

            }
        }
        */
         // Ahora creo un string y lo recorro
        // cada uno de los corchetes es una fila y lo que tiene adentro son las columnas.

       /* String frulas [][] = {{"La concha de ","Tu hermana"},{"El coño de", "tu vieja "}}; // en este caso es una matriz 2x2
        for(int k=0; k<frulas.length;k++){
            for(int m=0; m<frulas[k].length;m++){
                System.out.println("Frulas: "+frulas[k][m]);
            }

        }

        */

        PersonaArreglos personas[][] = new PersonaArreglos[2][3];
        personas[0][1]= new PersonaArreglos("Juan carlos");
        personas[0][0]= new PersonaArreglos("Como estas");
        for (PersonaArreglos[] a: personas) {
            System.out.println(Arrays.toString(a));

        }
    }
}
