package Test;

import Domain.PersonaArreglos;

public class TestPersonasArreglos {
    public static void main(String[] args) {
        PersonaArreglos personas[] = new PersonaArreglos[2];
        personas[0] = new PersonaArreglos("Juan");
        System.out.println(personas[0]); // sin un toString en la clase padre , va a imprimir la direccion de memoria

        for(int i=0; i < personas.length; i++){
            System.out.println("Persona[i]:  " + personas[i]);


        }
    }

}
