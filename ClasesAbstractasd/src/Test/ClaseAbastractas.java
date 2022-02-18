package Test;

import Domain.FiguraGeometrica;
import Domain.Rectangulo;

public class ClaseAbastractas {
    public static void main(String[] args) {
        // No se puede instanciar de la siguiente manera
        // FiguraGeometrica f1 = new FiguraGeometrica(tipoFigura);
        // Aplico polimorfismo generando un objeto generico con la clase padre y le asigno un objeto hijo
        FiguraGeometrica fig = new Rectangulo("Rectangulo");
        fig.dibujar();

    }
}
