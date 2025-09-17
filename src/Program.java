
import OCP.CalculaTotalArea;
import OCP.Circulo;
import OCP.Figura;
import OCP.Rectangulo;
import OCP.Triangulo;

public class Program {
    public static void main(String[] args) {
        //OCP
        Figura[] figuras = {new Rectangulo(2,3), new Circulo(2), new Triangulo(2,3)};
        CalculaTotalArea c = new CalculaTotalArea(figuras);
        c.Muestra();
    }
}
