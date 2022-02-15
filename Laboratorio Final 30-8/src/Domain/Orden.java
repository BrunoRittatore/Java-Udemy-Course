package Domain;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private  int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden= ++Orden.contadorOrdenes;
        this.computadoras= new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras <= MAX_COMPUTADORAS ){

            this.computadoras[this.contadorComputadoras++] = computadora; // aca se agrega la computadora , no importa los parametros interno


        }
        else{
            System.out.println("Se alcanzo el limite maximo de : "+ MAX_COMPUTADORAS);

        }
    }

    public void mostrarOrden(){
        System.out.println("Orden N°:"+idOrden );
        System.out.println("Cantidad de Computadoras en la orden: "+this.contadorComputadoras);
        int a=0;
        while (a<this.contadorComputadoras){
            System.out.println(this.computadoras[a]);
            a++;
        }

    }



}
