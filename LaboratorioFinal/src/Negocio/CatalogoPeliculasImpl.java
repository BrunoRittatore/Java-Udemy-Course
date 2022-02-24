package Negocio;

import Datos.AccesoDatos;
import Datos.AccesoDatosImpl;
import Excepciones.AccesoDatosEx;
import Peliculas.Pelicula;

import java.io.File;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
  // creo una variable de tipo accesoDatos para hacer la implementacion de los metodos y trabajar directamente con eso (backend)
    private final AccesoDatos datos;

    public  CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();

    }
    @Override
    public void agregarPelicular(String nombrePelicula){
        Pelicula peli = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(peli,NOMBRE_RECURSO,anexar); // utilizo la clase de acceso de datos para hacer la escritura de la pelicula.
            System.out.println("Pelicula cargada exitosamente");
        } catch (AccesoDatosEx accesoDatosEx) {
            System.out.println("Hubo un error en el acceso a datos."+accesoDatosEx.getMessage());
            accesoDatosEx.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas()  {
    try {
        var peliculas = this.datos.listar(NOMBRE_RECURSO);
        if(peliculas == null){
            System.out.println("No hay peliculas cargadas todavia");
            datos.delay();
        }
        else {
            for(var pelicula : peliculas){
            System.out.println("Pelicula: " + pelicula.getNombre()+"\n"); // aca se trabaja con la capa de negocio de la pp
            // no se trabaja con la capa de datos o backend
            datos.delay();

        }

        }

    }catch (AccesoDatosEx e){
        System.out.println("Erro de acceso de datos.");
        e.printStackTrace(System.out);
    }
    }

    @Override
    public void buscarPelicula(String buscar)  {
        try {
            String resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
            if (resultado.equals(buscar)){
                System.out.println("La pelicula "+ resultado+" se encuentra en el catalogo.");
            }

        }catch (AccesoDatosEx e){
            System.out.println("Error en el acceso de Datos.");
            e.printStackTrace(System.out);

        }
        catch (NullPointerException e){
            System.out.println("La pelicula no se encuentra en el catalogo.");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void iniciarCatalogoPeliculas()  {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.delay();
                datos.crear(NOMBRE_RECURSO);
                datos.delay();
            } else {
                datos.crear(NOMBRE_RECURSO);
            }

        }catch (AccesoDatosEx e ){
            System.out.println("Error al iniciar el catalogo de Peliculas: ");
            e.printStackTrace(System.out);
        }
    }
}
