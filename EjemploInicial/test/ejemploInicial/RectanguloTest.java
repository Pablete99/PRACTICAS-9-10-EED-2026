package ejemploInicial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	void testAreaPositiva() {

		Rectangulo r = new Rectangulo(3,4);

		assertEquals(12, r.area());
	}

	@Test
	void testPerimetroPositivo() {

		Rectangulo r = new Rectangulo(3,4);

		assertEquals(14, r.perimetro());
	}

	@Test
	void testValoresNegativos() {

		Rectangulo r = new Rectangulo(-3,4);

		assertEquals(-1, r.area());
		assertEquals(-1, r.perimetro());
	}

	@Test
	void testValoresCero() {

		Rectangulo r = new Rectangulo(0,4);

		assertEquals(0, r.area());
		assertEquals(0, r.perimetro());
	}

	@Test
	void testErroneo() {

		Rectangulo r = new Rectangulo(3,4);

		// Fallo intencionado
		assertEquals(20, r.area());
	}
}
