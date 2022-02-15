package Domain;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    final static int  MAX_PRODUCTOS =10;
    private int contadorProductos;



    public Orden(){
    this.idOrden = ++Orden.contadorOrdenes;
    this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos <= Orden.MAX_PRODUCTOS){
                        productos[contadorProductos++] = producto;

        }
        else {
            System.out.println("Se supero el maximo de productos: "+Orden.MAX_PRODUCTOS);
        }


    }

     public double calcularTotal(){
         double total=0;
         for(int i=0; i<this.contadorProductos ;i++){

                 total = total + this.productos[i].getPrecio();
            }
            return total;

    }



     public void mostrarOrden(){

         System.out.println( "Orden Numero:  "+idOrden + "\nTotal Orden : " + this.calcularTotal());
         int a=0;
         while(a<contadorProductos){
             System.out.println("Producto: " +this.productos[a].toString());

             a++;
         }


     }


}
