package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej03;

class Ej03Test {

	@Test
	void numVocalsTest() {
		assertEquals(Ej03.numVocals("hola que tal"), 5);
		assertEquals(Ej03.numVocals("hlqtl"), 0);
	}

}
