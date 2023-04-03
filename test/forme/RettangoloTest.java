package forme;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RettangoloTest {
	private Punto vertice;
	private Rettangolo rettangolo;

	@BeforeEach
	public void setUp() {
		this.vertice=new Punto(2, 2);
		this.rettangolo=new Rettangolo(this.vertice, 3, 2);
		
	}

	@Test
	void testTrasla() {
		this.rettangolo.trasla(2, 0);
		assertTrue(this.rettangolo.getVertice().equals(new Punto(4, 2)));
		assertFalse(this.rettangolo.getVertice().equals(this.vertice));
	
		
	}

	@Test
	void testGetVertice() {
		assertTrue(this.rettangolo.getVertice().equals(this.vertice));
	}

}
