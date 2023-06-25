package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExperimentoTest {

	Experimento exp;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void deveriaCriarListaCalculadoraTest() {
	    exp = new Experimento();
		assertTrue(exp.calculadoras!= null);
	}

}
