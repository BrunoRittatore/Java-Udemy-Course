package Domain;

public interface IAccesoDatos {
    // A las variables hay que asignarle valores cuando se instancian por que estamos en una interfaz
    int MAX_REGISTRO = 10;
    // metodos instanciados para simular el manejo de una base de datos
    // simulamos una operacion con mysql

    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}
