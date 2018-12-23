package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej06;

class Ej06Test {

	@Test
	void concatStringTest() {
		assertEquals(Ej06.concatString("hola", "Ana"), "holaAna");
		assertEquals(Ej06.concatString("", "Ana"), "Ana");
		assertEquals(Ej06.concatString("hola", ""), "hola");
	}

}
