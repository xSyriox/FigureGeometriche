package forme;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CerchioTest {
	private Punto centro;
	private Cerchio cerchio;

	@BeforeEach
	public void setUp() {
		this.centro=new Punto(2, 2);
		this.cerchio=new Cerchio(this.centro, 4);
	}

	@Test
	void testTrasla() {
		this.cerchio.trasla(4, 2);
		assertTrue(this.cerchio.getCentro().equals(new Punto(6, 4)));
		assertFalse(this.cerchio.getCentro().equals(this.centro));
	}

	@Test
	void testGetCentro() {
		assertTrue(this.cerchio.getCentro().equals(centro));
		
	}
	@Test
	void testCerchioasPunto() {
		assertNotEquals(new Cerchio(new Punto(0, 0), 1), new Punto(0, 0));
		assertEquals(new Cerchio(new Punto(0, 0), 0), new Punto(0, 0));
		
	}

}