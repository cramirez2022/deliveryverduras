package delivery;

public class Proveedor extends Persona {
	private int telefono;
	private String ciudad;
	private String tipo_servicio;


	public Proveedor(int rut, String nombre, int telefono, String ciudad, String tipo_servicio) {
		super(rut, nombre);
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.tipo_servicio = tipo_servicio;
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
	
	public String getTipo_servicio() {
		return tipo_servicio;
	}

	public void setTipo_servicio(String tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}


}
