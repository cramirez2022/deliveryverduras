package delivery;


public class Cliente extends Persona {
	private int telefono;
	private String ciudad;
	private String tipo_cliente;

	

	public Cliente(int rut, String nombre, int telefono, String ciudad, String tipo_cliente) {
		super(rut, nombre);
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.tipo_cliente = tipo_cliente;
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
	
	public String getTipo_cliente() {
		return tipo_cliente;
	}

	public void setTipo_cliente(String tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}
}
