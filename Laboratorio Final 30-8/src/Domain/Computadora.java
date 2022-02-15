package Domain;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadora;
  // la clase computadora no interactua con dispositivo de entrada , esa clase modela a las demas que utilizamos aca
    private Computadora(){
        this.idComputadora= ++Computadora.contadorComputadora;

    }

    public Computadora(String nombre,Monitor monitor,Teclado teclado, Raton raton){
        this();
        this.nombre= nombre;
        this.monitor= monitor;
        this.teclado= teclado;
        this.raton= raton;

    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorComputadora() {
        return contadorComputadora;
    }

    public static void setContadorComputadora(int contadorComputadora) {
        Computadora.contadorComputadora = contadorComputadora;
    }

    @Override
    public String toString() {
        return "Computadora{ " +
                "idComputadora: "  + idComputadora +
                ", nombre: '" + nombre + '\'' +
                ", monitor: " + monitor +
                ", teclado: " + teclado +
                ", raton: " + raton +
                ", contadorComputadora: " + contadorComputadora +
                '}';
    }
}
