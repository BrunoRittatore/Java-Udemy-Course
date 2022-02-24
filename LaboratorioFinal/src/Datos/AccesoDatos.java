package Datos;

import Excepciones.AccesoDatosEx;
import Excepciones.EscrituraDatosEx;
import Excepciones.LecturaDatosEx;
import Peliculas.Pelicula;

import java.util.List;

public interface AccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir( Pelicula pelicula,String nombreArchivo,boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo, String buscar) throws  LecturaDatosEx;

    void crear(String nombreArchivo) throws AccesoDatosEx;

    void borrar(String nombreArchivo)throws AccesoDatosEx;

    void delay();
}
