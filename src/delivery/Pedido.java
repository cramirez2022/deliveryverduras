package delivery;

import java.util.ArrayList;

public class Pedido {
	private int id_area_pedido;
	private String fecha_pedido;
	private int valor_total_pedido;
	private String estado_pedido;
	private Cliente cliente;
	private ArrayList<Verdura> verdura; 
	private ArrayList<Empleado> empleado;
	private Area_preparadora_despacho area_preparadora_despacho;
	
	public Pedido(int id_area_pedido, String fecha_pedido,
			int valor_total_pedido, String estado_pedido, Cliente cliente,
			ArrayList<Verdura> verdura, ArrayList<Empleado> empleado,
			Area_preparadora_despacho area_preparadora_despacho) {
		super();
		this.id_area_pedido = id_area_pedido;
		this.fecha_pedido = fecha_pedido;
		this.valor_total_pedido = valor_total_pedido;
		this.estado_pedido = estado_pedido;
		this.cliente = cliente;
		this.verdura = verdura;
		this.empleado = empleado;
		this.area_preparadora_despacho = area_preparadora_despacho;
	}

	public int getId_area_pedido() {
		return id_area_pedido;
	}

	public void setId_area_pedido(int id_area_pedido) {
		this.id_area_pedido = id_area_pedido;
	}

	public String getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(String fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public int getValor_total_pedido() {
		return valor_total_pedido;
	}

	public void setValor_total_pedido(int valor_total_pedido) {
		this.valor_total_pedido = valor_total_pedido;
	}

	public String getEstado_pedido() {
		return estado_pedido;
	}

	public void setEstado_pedido(String estado_pedido) {
		this.estado_pedido = estado_pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Verdura> getVerdura() {
		return verdura;
	}

	public void setVerdura(ArrayList<Verdura> verdura) {
		this.verdura = verdura;
	}

	public ArrayList<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(ArrayList<Empleado> empleado) {
		this.empleado = empleado;
	}

	public Area_preparadora_despacho getArea_preparadora_despacho() {
		return area_preparadora_despacho;
	}

	public void setArea_preparadora_despacho(
			Area_preparadora_despacho area_preparadora_despacho) {
		this.area_preparadora_despacho = area_preparadora_despacho;
	}


}
