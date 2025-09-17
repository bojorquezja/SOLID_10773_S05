package OCP;

public class Rectangulo implements Figura{
    private double largo;
    private double ancho;

    @Override
    public double calculaArea() {
        return largo*ancho;
    }
    
    public Rectangulo() {
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    
    
}
