package OCP;

public class CalculaTotalArea {
    private Figura[] figuras;

    public CalculaTotalArea(Figura[] figuras) {
        this.figuras = figuras;
    }
    public void Muestra(){
        double tot = 0;
        for(Figura r : figuras){
            tot += r.calculaArea();
        }
        System.out.println(tot);
    }
}
