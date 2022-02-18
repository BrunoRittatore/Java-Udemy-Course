package Test;

import Domain.Continentes;
import Domain.Dias;

public class testEnums {
    public static void main(String[] args) {
        // las variables de la clase enum se toman como metodos entonces se trae con el punto
        System.out.println("Dia 1: "+ Dias.LUNES);
      //  indicarSemana(Dias.MARTES);
        System.out.println("Continente n°4: "+ Continentes.AMERICA);


    }

    private static void indicarSemana(Dias dias){
        switch (dias){
            case LUNES:
                System.out.println("QUe paja los lunes men");
                break;
            case MARTES:
                System.out.println("Bueno , vamos llendo los martes");
                break;
            case MIERCOLES:
                System.out.println("Mitad de semana , vamos!");
                break;
            case JUEVES:
                System.out.println("Falta poco pal viernes");
                break;
            case VIERNES:
                System.out.println("Es viernes y tu cuerpo lo sabe");
                break ;

        }


    }
}
