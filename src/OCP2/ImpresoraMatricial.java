package OCP2;

public class ImpresoraMatricial implements Impresora{
    String marca;

    public ImpresoraMatricial(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public double precio() {
        return 20;
    }
    
}
