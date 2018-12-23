package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej13;

class Ej13Test {

	@Test
	void numWords1stPartTest() {
		assertEquals(Ej13.numWords1stPart("holaquetal"), 1);
		assertEquals(Ej13.numWords1stPart("hola que tal"), 3);
		assertEquals(Ej13.numWords1stPart("hola  que  tal"), 5);
	}
	
	@Test
	void numWords2ndPart() {
		assertEquals(Ej13.numWords2ndPart("holaquetal"), 1);
		assertEquals(Ej13.numWords2ndPart("hola que tal"), 1);
		assertEquals(Ej13.numWords2ndPart("hola  que  tal"), 3);
	}

}
