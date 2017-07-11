import controlador.Logica;
import modelo.Alumno;
import vista.Pantalla;

public class AppColegio {
	public static void main(String[] args) {
		
		Pantalla vista = new Pantalla();
		Logica controlador = new Logica();
		
		String nombreAlumno = vista.ingresarValor( "Buscar información del alumno" );
		Alumno encontrado = controlador.buscarPor( nombreAlumno );
		String mensaje = null;
		
		if( encontrado != null ){
			for (int i = 0; i < encontrado.getMaterias().length; i++) {
				mensaje = mensaje + encontrado.getMaterias()[i].getNombre() + "\n";
				for (int j = 0; j < encontrado.getMaterias()[i].getNotas().length; j++) {
					mensaje = mensaje + encontrado.getMaterias()[i].getNotas()[j].getFecha() + " : " 
							+ encontrado.getMaterias()[i].getNotas()[j].getCalificacion() + "\n";
				}						
			}
			vista.mostrarMensaje( "Alumno: " + encontrado.getApellido()+ " " + encontrado.getNombre() 
			+ "\nMatricula: " + encontrado.getMatricula() + "\n" + mensaje);
			
		} else {
			vista.mostrarMensaje( "No existe este paciente en la BD" );
		}
	}
}
