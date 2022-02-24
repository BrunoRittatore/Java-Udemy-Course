package Datos;

import Excepciones.AccesoDatosEx;
import Excepciones.EscrituraDatosEx;
import Excepciones.LecturaDatosEx;
import Peliculas.Pelicula;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl  implements AccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo); // creamos solamente la variable archivo , todavia no creamos el texto
           return  archivo.exists(); // metodo particular de las variables File

    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        // Se crea el archivo
        var archivo = new File(nombre);
       // se genera la lista de objetos peliculas que es lo que hay que devolver
        List<Pelicula> peliculas = new ArrayList<>();
        try  {
            // se genera un lector del archivo que pasamos en la entrada
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            // se genera una variable que toma lo que va leyendo el buffer
            linea = entrada.readLine();
            while(linea!=null){ // ekl bucle funciona mientras la variable tenga alguna linea leida
                Pelicula pelicula1 = new Pelicula(linea); // se crea un objeto pelicula con la linea que se encuentra
                peliculas.add(pelicula1);  // se agrega a la lista de pelciuas
                linea = entrada.readLine(); // vuelve a leer antes de verificar el while para corroborar y el bucle lea completo el txt
                 }
            entrada.close(); // cierra el buffer asi no lee mas

        }catch (FileNotFoundException e){
            e.printStackTrace();
            throw new LecturaDatosEx("Error al listar las peliculas"+e.getMessage());
        } catch (IOException e){
            e.printStackTrace();
            throw new LecturaDatosEx("Error al listar las peliculas "+e.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File (nombreArchivo);
        try  {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString()); // llamo al toString para que se imprima la pelicula
            salida.close();
            System.out.println("Se escribio la informacion del archivo "+pelicula);
        }catch (IOException e){
            e.printStackTrace();
            throw new EscrituraDatosEx("Error al escribir peliculas"+e.getMessage());
        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        String resultado = null;
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea= null;
            linea = entrada.readLine();
            var indice =1;
            while (linea!= null){
                if(buscar != null && buscar.equalsIgnoreCase(linea)){ // buscar el equals Ignore Case
                    resultado= "Pelicula"+linea+"se ubica en el indice"+indice;
                    break;
                }
                linea=entrada.readLine();
                indice ++;
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Error en la busqueda: "+e.getMessage());
        } catch (IOException e){
            e.printStackTrace();
            throw new LecturaDatosEx("Error al momento de la busqueda: "+e.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se creo el archivo");
        }catch (IOException e){
           e.printStackTrace();
           throw new AccesoDatosEx("Error al momento de creacion del archivo: "+e.getMessage());
        }

    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);

        if(archivo.exists()){
            archivo.delete();
            System.out.println("Borrado el archivo exitosamente");
        }

    }

    @Override
    public void delay() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
