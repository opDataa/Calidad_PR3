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
		cuenta1 = new Cuenta("Juan","12345",50);
		cuenta2 = new Cuenta("Pedro","67890",0);
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
		cuenta1.retirar(200d);
		cuenta1.ingresar(100d);
		cuenta1.retirar(200d);
		assertEquals(cuenta1, cuenta1.getSaldo());
		
		cuenta2.retirar(350d);
		cuenta2.retirar(150d);
		cuenta2.ingresar(50d);
		assertEquals(cuenta2, cuenta2.getSaldo());
	}
	
}
