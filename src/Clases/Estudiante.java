package Clases;

public class Estudiante extends Persona{

    public String codigo;

    public Estudiante(String nombre, String dni, String codigo) {
        super(nombre, dni);
        this.codigo = codigo;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Estudiante");

    }

    public void estudiante(){
        System.out.println(nombre + " Esta estudiando");
    }
}

