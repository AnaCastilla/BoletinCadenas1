package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej07;

class Ej07Test {

	@Test
	void firstCharsTest() {
		assertEquals(Ej07.firstCharsS1("hola", "hola", 3), "holahol");
	}

}
