package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ejercicios.Ej08;

class Ej08Test {

	@Test
	void lastCharsTest() {
		assertEquals(Ej08.lastCharsS1("hola", "hola", 3), "holaalo");
	}

}
