package util;

import modelo.Alumno;
import modelo.Materia;
import modelo.Nota;

public class DataBase {
	
	private Alumno[] alumnos = new Alumno[2];
	private Materia[] materias = new Materia[3];
	private Nota[] notas = new Nota[4];
	
	public DataBase(){		
		
		Nota a = new Nota();
		a.setCalificacion(9);
		a.setFecha("10/4/17");
		notas [0] = a;
		
		Nota b = new Nota();
		b.setCalificacion(5);
		b.setFecha("10/5/17");
		notas [1] = b;
		
		Nota c = new Nota();
		c.setCalificacion(8);
		c.setFecha("10/6/17");
		notas [2] = c;
		
		Nota d = new Nota();
		d.setCalificacion(3);
		d.setFecha("10/7/17");
		notas [3] = d;
		
		Materia matematica = new Materia();
		matematica.setNombre("Matematica");
		matematica.setNotas(notas);
		materias [0] = matematica;
		
		//a = new Nota();
		a.setCalificacion(3);
		a.setFecha("3/4/17");
		notas [0] = a;
		
		//b = new Nota();
		b.setCalificacion(5);
		b.setFecha("3/5/17");
		notas [1] = b;
		
		//c = new Nota();
		c.setCalificacion(9);
		c.setFecha("3/6/17");
		notas [2] = c;
		
		//d = new Nota();
		d.setCalificacion(7);
		d.setFecha("3/7/17");
		notas [3] = d;
		
		Materia lengua = new Materia();
		lengua.setNombre("Lengua");
		lengua.setNotas(notas);
		materias [1] = lengua;
		
		//a = new Nota();
		a.setCalificacion(8);
		a.setFecha("3/4/17");
		notas [0] = a;
		
		//b = new Nota();
		b.setCalificacion(5);
		b.setFecha("3/5/17");
		notas [1] = b;
		
		//c = new Nota();
		c.setCalificacion(7);
		c.setFecha("3/6/17");
		notas [2] = c;
		
		//d = new Nota();
		d.setCalificacion(4);
		d.setFecha("3/7/17");
		notas [3] = d;
		
		Materia historia = new Materia();
		historia.setNombre("Historia");
		historia.setNotas(notas);
		materias [2] = historia;		
		
		Alumno tamara = new Alumno();	
		tamara.setMatricula(123);
		tamara.setApellido("Aquino");
		tamara.setNombre("Tamara");
		tamara.setMaterias(materias);		
		alumnos [0] = tamara;
		
		
		
		//a = new Nota();
		a.setCalificacion(9);
		a.setFecha("7/4/17");
		notas [0] = a;
		
		//b = new Nota();
		b.setCalificacion(8);
		b.setFecha("7/5/17");
		notas [1] = b;
		
		//c = new Nota();
		c.setCalificacion(7);
		c.setFecha("7/6/17");
		notas [2] = c;
		
		//d = new Nota();
		d.setCalificacion(6);
		d.setFecha("7/7/17");
		notas [3] = d;
		
		Materia geografia = new Materia();
		geografia.setNombre("Geografía");
		geografia.setNotas(notas);
		materias [1] = geografia;
		
		//a = new Nota();
		a.setCalificacion(6);
		a.setFecha("12/4/17");
		notas [0] = a;
		
		//b = new Nota();
		b.setCalificacion(4);
		b.setFecha("12/5/17");
		notas [1] = b;
		
		//c = new Nota();
		c.setCalificacion(10);
		c.setFecha("12/6/17");
		notas [2] = c;
		
		//d = new Nota();
		d.setCalificacion(8);
		d.setFecha("12/7/17");
		notas [3] = d;
		
		Materia artistica = new Materia();
		artistica.setNombre("Artística");
		artistica.setNotas(notas);
		materias [2] = artistica;		
		
		//a = new Nota();
		a.setCalificacion(7);
		a.setFecha("16/4/17");
		notas [0] = a;
		
		//b = new Nota();
		b.setCalificacion(3);
		b.setFecha("16/5/17");
		notas [1] = b;
		
		//c = new Nota();
		c.setCalificacion(8);
		c.setFecha("16/6/17");
		notas [2] = c;
		
		//d = new Nota();
		d.setCalificacion(9);
		d.setFecha("16/7/17");
		notas [3] = d;
		
		Materia computacion = new Materia();
		computacion.setNombre("Computación");
		computacion.setNotas(notas);
		materias [2] = computacion;	
		
		
		Alumno marina = new Alumno();		
		marina.setMatricula(235);
		marina.setNombre("Marina");
		marina.setApellido("Villaggi");
		marina.setMaterias(materias);
		alumnos [1] = marina;
		
		
		
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

}
