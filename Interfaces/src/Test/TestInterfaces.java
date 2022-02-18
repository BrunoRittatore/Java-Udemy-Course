package Test;

import Domain.IAccesoDatos;
import Domain.ImplementacionMySql;
import Domain.ImplementacionOracle;

public class TestInterfaces {
    public static void main(String[] args) {
        //  Inicializo un objeto de tipo interfaz y creo el objeto utilizando la clase que implementa a la interfaz
         IAccesoDatos datos = new ImplementacionMySql();
        imprimir(datos); // va a llamar al metodo de la implementacion , es de tipo objeto interfaz con implementaicon mysql

         //datos.listar(); // se va a ejectuar el metodo de la clase que implementa la interfaz
        datos = new ImplementacionOracle();
        imprimir(datos); // idem aca
    }

    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
