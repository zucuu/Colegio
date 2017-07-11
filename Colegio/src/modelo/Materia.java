package modelo;

public class Materia {
	public String nombre;
	private Nota[] notas = new Nota[4];
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Nota[] getNotas() {
		return notas;
	}
	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}
}
