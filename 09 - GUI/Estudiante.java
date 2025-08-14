
public class Estudiante {
	String nombre, carnet, carrara;

	public Estudiante(String nombre, String carnet, String carrara) {
		this.nombre = nombre;
		this.carnet = carnet;
		this.carrara = carrara;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getCarrara() {
		return carrara;
	}

	public void setCarrara(String carrara) {
		this.carrara = carrara;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", carnet=" + carnet + ", carrara=" + carrara + "]";
	}
}
