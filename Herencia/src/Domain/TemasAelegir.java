package Domain;
import java.util.*;
public class TemasAelegir {
    public static void main(String[] args) {
        ArrayList<String> temario = new ArrayList<String>();
        ArrayList <String> temasFiltrados = new ArrayList<String>();
        temario.add(("Siempres es hoy"));
        temario.add(("Pulsar"));
        temario.add(("Av Alcorta"));
        temario.add(("Ahora es nunca"));
        temario.add(("Traeme la noche"));
        temario.add(("Ameba"));
        temario.add(("Otra Piel"));
        temario.add(("Rio Babel"));
        temario.add("Toma la ruta");
        temario.add("Planta");
        temario.add("Paseando Por Roma");


        int n=0;
        while(n<2){
            String random = temario.get(new Random().nextInt(temario.size()));
            temasFiltrados.add(random);
            n++;
        }
        System.out.println(temasFiltrados);
    }
}

