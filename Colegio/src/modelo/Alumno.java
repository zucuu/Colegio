package modelo;

public class Alumno extends Persona{
	public int matricula;
	private Materia[] materias = new Materia[3];
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Materia[] getMaterias() {
		return materias;
	}
	public void setMaterias(Materia[] materias) {
		this.materias = materias;
	}

}