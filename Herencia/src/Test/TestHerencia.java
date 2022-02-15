package Test;

import Domain.Cliente;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        /*Empleado carlos = new Empleado("Juan carlos", 5000); // para acceder a los constructores usamos la palabra super
        carlos.setGenero('M');
        System.out.println(carlos);
        System.out.println("\n\n Su genero es : " + carlos.getGenero());
        */
        var fecha = new Date();
        Cliente bruno;
        bruno = new Cliente("Bruno Rittatore",'M',25,"Juan Neper 5446",true, fecha );
        System.out.println(bruno);
       // Cliente bruno1 = new Cliente ("Gonzalo Rittatore", 'M', 20 , "Juan Neper 5446", false,new Date());
        //System.out.println("bruno1 = " + bruno1);
    }

}
