package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej12;

class Ej12Test {

	@Test
	void s2AppearanceTest() {
		assertEquals(Ej12.s2Appearance("hola que tal que te cuentas", "que"), 2);
		assertEquals(Ej12.s2Appearance("hola que tal que te cuentas", "123"), 0);
	}

}
