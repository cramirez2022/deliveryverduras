package test;

import static org.junit.Assert.*;

import org.junit.Test;

import delivery.Cliente;

public class testCliente {

	@Test
public void test() {
	
		assertEquals("Juan Perez", new delivery.Cliente(558, "Juan Perez", 228789241, "Santiago-CL", "Local" ).getNombre());
			
		}	

}
