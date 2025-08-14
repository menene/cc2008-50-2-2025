
public class Controller {
	
	Estudiante[] estudiantes;
	
	int cantidadEstudiantes, maxEstudiantes;
	
	public Controller(int max) {
		this.maxEstudiantes = max;
		this.estudiantes = new Estudiante[this.maxEstudiantes];
		this.cantidadEstudiantes = 0;
	}
	
	public Estudiante agegarEstudiante(String nombre, String carnet, String carrera) {
		if (this.cantidadEstudiantes >= this.maxEstudiantes) {
	        return null;
	    }
		
		Estudiante est = new Estudiante(nombre, carnet, carrera);
		
		this.estudiantes[this.cantidadEstudiantes] = est;
		this.cantidadEstudiantes++;
		
		return est;
	}
	
	public int getCantidadEstudiantes() {
		return this.cantidadEstudiantes;
	}
	
	public int getMaxEstudiantes() {
		return this.maxEstudiantes;
	}
}
