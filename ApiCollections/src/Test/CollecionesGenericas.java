package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollecionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();

        miLista.add("Hola");
        miLista.add("Bebe");
        miLista.add("Como Amaneciste");
        String ele = miLista.get(2);
        System.out.println(ele);
        imprimir(miLista);
    }

    public static void imprimir(Collection elem) {
        elem.forEach(elemento ->{
            System.out.println("Elemento: " +elemento);
        });
    }
}
