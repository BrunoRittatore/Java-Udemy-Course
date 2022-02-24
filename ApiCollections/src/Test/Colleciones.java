package Test;
import java.util.*;
import java.lang.Iterable;
public class Colleciones {
    public static void main(String[] args) {

       Map<String,String> mainMap = new HashMap<>();
        mainMap.put("Valor1", "Juan ");
        mainMap.put("Valor2", "Carlos");
        imprimir(mainMap.keySet());
        imprimir(mainMap.values());


    }
    public static void imprimir(Collection<String> map1){

        for(String a: map1){
            System.out.println("Elemento: "+a.toUpperCase());
        }

    }

}
