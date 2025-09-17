package OCP;

public class Circulo implements Figura{
    private double radio;

    @Override
    public double calculaArea() {
        return Math.PI*radio*radio;
    }
    
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
