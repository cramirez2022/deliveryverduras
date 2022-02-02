package delivery;


public class Empleado extends Persona {
	private int telefono;
	private String ciudad;
	private String cargo;

	Empleado(int rut, String nombre, int telefono, String ciudad, String cargo) {
		super(rut, nombre);
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
