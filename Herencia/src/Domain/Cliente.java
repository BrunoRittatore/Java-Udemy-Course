package Domain;
import java.util.Date;
public class Cliente extends Persona {
    private int idCliente;
    private boolean vip;
    private Date fechaRegistro;
    private static int contadorCliente;

    public Cliente(String nombre, char genero,int edad ,String direccion,boolean vip,Date fechaRegistro){
    super(nombre,genero,edad,direccion);
    this.idCliente= contadorCliente++; // variable STATIC
    this.vip=vip;
    this.fechaRegistro=fechaRegistro;
    }

    public int getIdCliente() {
        return this.idCliente;
    }
    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Cliente {" +
                "idCliente: " + idCliente +
                ", Vip: " + vip +
                ", FechaRegistro: " + fechaRegistro +
                ", Nombre: " + nombre +
                ", Genero: " + genero +
                ", Edad: " + edad +
                ", Direccion: " + direccion +
                '}';
    }
}
