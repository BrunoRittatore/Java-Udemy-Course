package Domain;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo)  {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close(); // aca se crea el archivo en el disco
            System.out.println("Se creo el archivo.");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }


    }
    public static void escribirArchivo(String nombreArchivo, String contenido ){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close(); // aca se crea el archivo en el disco
            System.out.println("Se escribio en el archivo.");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }

    }
    public static void anexarArchivo(String nombreArchivo,String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true)); //uso una funcion que me permite escribir dentro del txt
            salida.println(contenido);
            salida.close(); // aca se crea el archivo en el disco
            System.out.println("Se escribio en el archivo.");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }
    public static void leerArchivo(String nombreArchivo,String contenido){
        File archivo = new File(nombreArchivo);
        // usamos la siguiente variable para que lea el contenido del txt de manera completa (hay que acordarse que es una clase)
        try  {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine(); // aca se lee la linea
            while(lectura != null){
                System.out.println("Lectura: " + lectura);
                lectura=entrada.readLine(); // aca vuelve a leer otra linea de manera que cuando encuentre null sale del while
            }
        entrada.close();
        } catch (FileNotFoundException e){ // excepcion que se lanza cuando no existe un archivo de ese nombre
            e.printStackTrace(System.out);
        } catch (IOException e){ //se lanza cuando hay un erro de tipo I/O en la ejecucion
            e.printStackTrace(System.out);
        }



    }
}
