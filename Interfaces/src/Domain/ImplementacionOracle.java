package Domain;

public class ImplementacionOracle implements  IAccesoDatos{
  // Aca hacemos que se implementen los metodos para cuando se utilice la base de datos
    // la clase no puede ser abstracta si queremos hacer objetos de esta clase
    @Override
    public void insertar() {
        System.out.println("Insertar desde oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle");
    }
}
