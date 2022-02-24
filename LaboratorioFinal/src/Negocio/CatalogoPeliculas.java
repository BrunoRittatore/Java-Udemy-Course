package Negocio;

public interface CatalogoPeliculas {

    String NOMBRE_RECURSO = "peliculas.txt";

    void agregarPelicular(String nombrePelicula);

    void listarPeliculas();

    void buscarPelicula(String buscar);

    void iniciarCatalogoPeliculas() ;

}
