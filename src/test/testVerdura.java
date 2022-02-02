package test;

import static org.junit.Assert.*;

import org.junit.Test;

import delivery.Proveedor;
import delivery.Verdura;

public class testVerdura {

	@Test
	public void test() {
		
		Proveedor proveedor1 = new Proveedor(558, "Verduras Pepito", 97124545, "Santiago-CL", "Pago contado"); 

		assertEquals(1, new delivery.Verdura(1,"Papas Nortinas","2022-01-29", 2500, 1500, 800, proveedor1).getId_verdura());
		

	}


}
