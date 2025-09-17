package SRP;

public class Estudiante {
    private String nombre;
    private int edad;
    private String nomPerro;    //SRP NO pertenece a esta clase
    
    public void estudiar(){
        System.out.println("Estudiando");
    }
    
    public void manejar(){  //SRP NO pertenece a esta clase
        System.out.println("avanzando");
    }
    
    public void ayudarEnCasa(){ //SRP NO pertenece a esta clase
        System.out.println("limpiando");
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
