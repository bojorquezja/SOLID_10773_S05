package OCP2;

public class Program2 {
    public static void main(String[] args) {
        ImpresoraMatricial[] figuras = {new ImpresoraMatricial("Epson"), new ImpresoraMatricial("Epson2")};
        CalculoInsumos c = new CalculoInsumos(figuras);
        c.CostoTotal();
    }
}
