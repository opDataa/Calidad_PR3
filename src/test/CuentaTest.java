package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;


class CuentaTest {

	static private Cuenta cuenta;
	static private Cuenta cuenta1,cuenta2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//cuenta = new Cuenta(0d); // ya no lo hace al principio de iniciar los tests
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta(0d); // ahora lo hace antes de cada prueba
		cuenta1 = new Cuenta("Juan","12345",50d);
		cuenta2 = new Cuenta("Pedro","67890",0d);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(1d);
		assertEquals(1, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(1d);
		assertEquals(-1, cuenta.getSaldo());
	}

	@Test
	void test0014() {
		
		// (!!) No se puede hacer mas de un 'assert' (assertEquals, assertTrue, fails) en un mismo test
		//assertEquals(-250d, cuenta1.getSaldo());
		//assertEquals(-450d, cuenta2.getSaldo());

		cuenta1.retirar(200d); // 1
		cuenta2.retirar(350d); // 2
		cuenta1.ingresar(100d); 
		cuenta2.retirar(200d);
		cuenta2.retirar(150d);
		cuenta1.retirar(200d);
		cuenta2.ingresar(50d);
		cuenta2.retirar(100d);

		boolean cuenta1_bool = (-250d == cuenta1.getSaldo());
		boolean cuenta2_bool = (-450d == cuenta2.getSaldo());
	
		assertEquals(true,cuenta1_bool && cuenta2_bool);		
	}
	
}
