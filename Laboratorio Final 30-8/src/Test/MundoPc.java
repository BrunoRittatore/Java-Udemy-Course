package Test;

import Domain.*;

public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorAcer = new Monitor("hp",24);
        Raton razer = new Raton("Inalambro", "Razer One");
        Teclado teclado1 = new Teclado("USB", "Redragon");
        Computadora masterRace = new Computadora("La Master Race", monitorAcer, teclado1, razer);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(masterRace);
        orden1.mostrarOrden();



    }
}
