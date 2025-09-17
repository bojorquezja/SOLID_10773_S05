package SRP;

public class Empleado {
    private String nombre;
    private int codigo;
    private String cargo;
    
    public void trabajar(){
        System.out.println("amanecida");
    }
    public void guardarBD(){ //SRP NO pertenece a esta clase
        //codigo
        System.out.println("grabado exitoso");
    }
}
