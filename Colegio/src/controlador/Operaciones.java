package controlador;
import modelo.Alumno;

public interface Operaciones {
	public Alumno buscarPor (String nombre);
	public Alumno buscarPor (int matricula);
}
