package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej09;

class Ej09Test {

	@Test
	void reverseTest() {
		assertEquals(Ej09.reverseS1("hola", "Ana"), "Anaaloh");
		assertEquals(Ej09.reverseS1("hola", ""), "aloh");
		assertEquals(Ej09.reverseS1("", "Ana"), "Ana");
	}

}
