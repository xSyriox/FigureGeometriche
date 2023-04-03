package forme;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GruppoDiFormeTest {
	private GruppoDiForme forme;
	private Rettangolo rettangolo;
	private Cerchio cerchio;
	private Punto origine;

	@BeforeEach
	public void setUp() {
		this.forme=new GruppoDiForme();
		this.origine = new Punto(2, 2);
		this.rettangolo=new Rettangolo(this.origine, 3, 2);
		this.cerchio=new Cerchio(this.origine, 7);
		
		this.forme.aggiungiForma(this.rettangolo);
		
	}

	@Test
	void testAggiungiForma() {
		this.forme.aggiungiForma(this.cerchio);
		Forma[] gruppoDiForme = this.forme.getGruppo();
		assertTrue(gruppoDiForme[1].equals(this.cerchio));
		assertEquals(gruppoDiForme[1], this.cerchio);
		
	}

	@Test
	void testTrasla() {
		this.forme.aggiungiForma(this.cerchio);
		this.forme.trasla(2, 3);
		Punto punto = new Punto(4, 5);
		assertEquals(punto, this.cerchio.getCentro());
		assertEquals(punto, this.rettangolo.getVertice());
		
		
		
	}

}
