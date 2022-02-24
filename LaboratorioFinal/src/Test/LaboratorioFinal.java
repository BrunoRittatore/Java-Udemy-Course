package Test;

import Datos.AccesoDatos;
import Datos.AccesoDatosImpl;
import Negocio.CatalogoPeliculas;
import Negocio.CatalogoPeliculasImpl;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LaboratorioFinal {
   private static final AccesoDatos abba = new AccesoDatosImpl();
    public static void main(String[] args) {
        String nombreArchivo=null;
        var opcion = -1;
        var scanner = new Scanner(System.in);
        CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        while(opcion !=0){

            System.out.println("Elige una Opcion: \n" +
                    "1:Iniciar Catalogo Peliculas\n" +
                     "2:Agregar Pelicula\n" +
                    "3:Listar Peliculas\n" +
                    "4:Buscar Pelicula\n" +
                    "0:Salir" );
            opcion = Integer.parseInt(scanner.nextLine());
            abba.delay();

            switch (opcion){
            case 1:
                catalogo.iniciarCatalogoPeliculas();
                break;
            case 2:
                System.out.println("Introduce el nombre de la pelicula: ");
                var nombrePeli = scanner.nextLine();
                abba.delay();
                catalogo.agregarPelicular(nombrePeli);
                abba.delay();
                break;
            case 3:
                catalogo.listarPeliculas();
                break;
            case 4:
                System.out.println("Introduce el nombre de la pelicula: ");
                var nombrePeli1 = scanner.nextLine();
                catalogo.buscarPelicula(nombrePeli1);
                break;
            case 0 :
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }

    }
}
}