package Clases;

public class Docente extends Persona implements Evaluable, Reportable {

    private String especialidad;
    private Curso curso;
    private Docente supervisor;


    public Docente(String nombre, String dni, String especialidad, Curso curso, Docente supervisor) {
        super(nombre, dni);
        this.especialidad = especialidad;
    }

    @Override
    public void evaluar() {
        System.out.println(nombre + "esta evaluando estudiantes");

    }

    public void asignarCurso(Curso curso) {
        this.curso = curso;
    }

    public void mostrarCurso() {
        if (curso != null) {
            System.out.println("Curso: " + curso.getNombre());
        }
    }

    public void asignarSupervisor(Docente supervisor) {
        this.supervisor = supervisor;
    }

    public void mostrarSupervisor() {
        if (supervisor != null) {
            System.out.println("Supervisor: " + supervisor.nombre);
        }
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Docente");
    }

    @Override
    public void GenerarReporte() {
        System.out.println(nombre + "esta generando un reporte");

    }
}//fin de la clase principal


