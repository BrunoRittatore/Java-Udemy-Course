package Domain;

public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String tipoFigura){
        super(tipoFigura);

    }
    public void dibujar(){
        System.out.println("Se imprime un: "+this.getClass().getName());

}
}
