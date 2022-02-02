package delivery;

public class Area_preparadora_despacho {


	private int id_area_preparadora_despacho;
	private String nombre_Area_preparadora_despacho;
	
	public Area_preparadora_despacho(int id_area_preparadora_despacho,
			String nombre_Area_preparadora_despacho) {
		super();
		this.id_area_preparadora_despacho = id_area_preparadora_despacho;
		this.nombre_Area_preparadora_despacho = nombre_Area_preparadora_despacho;
	}

	public int getId_area_preparadora_despacho() {
		return id_area_preparadora_despacho;
	}

	public void setId_area_preparadora_despacho(int id_area_preparadora_despacho) {
		this.id_area_preparadora_despacho = id_area_preparadora_despacho;
	}

	public String getNombre_Area_preparadora_despacho() {
		return nombre_Area_preparadora_despacho;
	}

	public void setNombre_Area_preparadora_despacho(
			String nombre_Area_preparadora_despacho) {
		this.nombre_Area_preparadora_despacho = nombre_Area_preparadora_despacho;
	}
	

}
