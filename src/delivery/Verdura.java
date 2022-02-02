package delivery;

public class Verdura {
	private int id_verdura;
	private String nombre_verdura;
	private String fecha_ingreso;
	private int stock_verdura;
	private int precio_venta;
	private int precio_compra;
	private Proveedor proveedor;
	
	public Verdura(int id_verdura, String nombre_verdura, String fecha_ingreso,
			int stock_verdura, int precio_venta, int precio_compra,
			Proveedor proveedor) {
		super();
		this.id_verdura = id_verdura;
		this.nombre_verdura = nombre_verdura;
		this.fecha_ingreso = fecha_ingreso;
		this.stock_verdura = stock_verdura;
		this.precio_venta = precio_venta;
		this.precio_compra = precio_compra;
		this.proveedor = proveedor;
	}

	public int getId_verdura() {
		return id_verdura;
	}

	public void setId_verdura(int id_verdura) {
		this.id_verdura = id_verdura;
	}

	public String getNombre_verdura() {
		return nombre_verdura;
	}

	public void setNombre_verdura(String nombre_verdura) {
		this.nombre_verdura = nombre_verdura;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public int getStock_verdura() {
		return stock_verdura;
	}

	public void setStock_verdura(int stock_verdura) {
		this.stock_verdura = stock_verdura;
	}

	public int getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}

	public int getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(int precio_compra) {
		this.precio_compra = precio_compra;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	

}
