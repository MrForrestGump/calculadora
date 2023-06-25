package calculadora;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calculadora.Calculadora;

public class CalculadoraTest {

	Calculadora calculadora;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executa depois");
	}

	@Test
	public void testSomar() {
		calculadora = new Calculadora(20, 50);

		// assertTrue(calculadora.somar()== 50);
		assertEquals(70, calculadora.somar());

		// if( calculadora.somar() == 50)
		// System.out.println("deu certo");
		// else
		// fail();
	}

	@Test
	public void testSomar2() {
		System.out.println(calculadora);

	}

}
