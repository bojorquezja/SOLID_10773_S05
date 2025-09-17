package OCP2;

public class CalculoInsumos {
    private Impresora[] lista;

    public CalculoInsumos(Impresora[] lista) {
        this.lista = lista;
    }
    
    public void CostoTotal(){
        double tot = 0;
        for(Impresora r : lista){
            tot += r.precio();
        }
        System.out.println(tot);
    }
}