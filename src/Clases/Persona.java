package Clases;

public abstract class Persona {
    protected  String nombre;
    protected String dni;

    public Persona(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;

    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Dni:" + dni);
    }

    public  abstract void mostrarRol();
}
