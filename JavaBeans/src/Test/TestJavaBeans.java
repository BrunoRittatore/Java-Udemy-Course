package Test;

import Domain.Persona;

public class TestJavaBeans  {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Juan");
        p1.setApellido("Carlo");
        System.out.println(p1.toString());
    }
}
