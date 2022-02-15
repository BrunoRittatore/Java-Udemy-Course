package Domain;



public class Empleado extends Persona{

        private int idEmpleado;
        private double sueldo;
        private static int contadorEmpleado;

        public Empleado(){
            //super() esta siendo llamado el constructor de la clase persona por mas que no este escrito.
            this.idEmpleado=++contadorEmpleado;

        }
        public Empleado(String nombre, double sueldo){
            super(nombre);
            this.sueldo= sueldo;
            this.idEmpleado = Empleado.contadorEmpleado++;
        }


        public int getIdEmpleado(){
            return this.idEmpleado;

        }
        public double getSueldo(){
            return this.sueldo;

        }
        public void setSueldo(double sueldo){
            this.sueldo = sueldo;

        }

    @java.lang.Override
    public java.lang.String toString() {
        return "Empleado { "+ "Nombre: "+ this.nombre+ ", idEmpleado=" + idEmpleado +
                ", sueldo= " + sueldo +
                " }";
    }
}
