package delivery;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Proveedor proveedor1 = new Proveedor(558, "Verduras Pepito", 97124545, "Santiago-CL", "Pago contado"); 
		
		Area_preparadora_despacho area_preparadora_despacho1 = new Area_preparadora_despacho(1, "Area AM -01");

		Cliente cliente1 = new Cliente(558, "Juan Perez", 228789241, "Departamental # 111 ", "Local" );
		
		Verdura verdura1 = new Verdura(1,"Papas Nortinas","2022-01-29", 2500, 1500, 800, proveedor1);
	    Verdura verdura2 = new Verdura(2,"Papas Sureñas","2022-01-29", 2800, 1200, 800, proveedor1);
	    Verdura verdura3 = new Verdura(3,"Manzanas Fujo","2022-01-29", 1000, 500, 800, proveedor1);
	    Verdura verdura4 = new Verdura(4,"Peras","2022-01-29", 1500, 1500, 800, proveedor1);
	    Verdura verdura5 = new Verdura(5,"Platanos","2022-01-29", 2500, 1500, 800, proveedor1);
	    Verdura verdura6 = new Verdura(6,"Frutillas","2022-01-29", 2500, 1500, 800, proveedor1);
	    Verdura verdura7 = new Verdura(7,"Cebolla","2022-01-29", 2500, 1500, 800, proveedor1);
	    Verdura verdura8 = new Verdura(8,"Rucula","2022-01-29", 2500, 800, 800, proveedor1);
	    Verdura verdura9 = new Verdura(8,"Repollo","2022-01-29", 2500, 600, 100, proveedor1);
	    Verdura verdura10 = new Verdura(10,"Apio","2022-01-29", 1000, 1000, 200, proveedor1);
	    
	     Empleado empleado1 = new Empleado(248566361, "Juan Perez", 98797244, "Santiago-CL", "Chofer-delivery");
		 Empleado empleado2 = new Empleado(106454736, "Marco Benavente", 987432444, "Santiago-CL", "Chofer-delivery");
		 Empleado empleado3 = new Empleado(96211945, "Alexis Bravo", 787878786, "Santiago-CL", "Bodega");
		 Empleado empleado4 = new Empleado(137170655, "Hector Venegas", 434564356, "Santiago-CL", "Bodega");
		 Empleado empleado5 = new Empleado(185531627, "Carlos Romero", 34564357, "Santiago-CL", "Armador Pedidos");
		 Empleado empleado6 = new Empleado(187864712, "Andrea Lopez", 436456546, "Santiago-CL", "Armador Pedidos");
		 
		Pedido pedido = new Pedido(1, "02-02-2022", 5800, "En proceso", cliente1, new ArrayList<Verdura>(), new ArrayList<Empleado>(), area_preparadora_despacho1);
		
		pedido.getVerdura().add(verdura1);
		pedido.getVerdura().add(verdura2);
		pedido.getVerdura().add(verdura3);
		pedido.getVerdura().add(verdura4);
		pedido.getVerdura().add(verdura5);
		pedido.getVerdura().add(verdura6);
		pedido.getVerdura().add(verdura7);
		pedido.getVerdura().add(verdura8);
		pedido.getVerdura().add(verdura9);
		pedido.getVerdura().add(verdura10);
		
		pedido.getEmpleado().add(empleado1);
		pedido.getEmpleado().add(empleado2);
		pedido.getEmpleado().add(empleado3);
		pedido.getEmpleado().add(empleado4);
		pedido.getEmpleado().add(empleado5);
		pedido.getEmpleado().add(empleado6);
		
				
	    String[] array;
	    array = new String[10]; 
	    
	    int total = 0;

		for (int i=0; i < pedido.getVerdura().size(); i++) {
			
		    array[i] = pedido.getVerdura().get(i).getNombre_verdura();
		    total = total + pedido.getVerdura().get(i).getPrecio_venta();
		}
		
		 System.out.println("Comprobante de nuevo Pedido");
		 System.out.println("Cliente " + pedido.getCliente().getNombre() + "- Rut: " + pedido.getCliente().getRut() + "- Fecha/hora: " + pedido.getFecha_pedido());
		 System.out.println("Estado Pedido : " + pedido.getEstado_pedido() + "- Valor Total Pedido: $"+ total + " -Area Arma Pedido: "+ pedido.getArea_preparadora_despacho().getNombre_Area_preparadora_despacho());
		 System.out.println("Contenido Pedido: "); 
		 
		  for (int j = 0; j < array.length; j++)
		    {
			  int a = j+1;
			  
		        System.out.println("Articulo #"+ a + " " + array[j] + " ");
		    } 
		  System.out.println("Chofer Entrega: " + pedido.getEmpleado().get(0).getNombre()+ "- Direccion Entrega" + pedido.getCliente().getCiudad()); 

	}

}
