package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej01;

class Ej01Test {

	@Test
	void matchesTest() {
		assertTrue(Ej01.matches("True", 'a'));
		assertTrue(Ej01.matches("AaA", 'b'));
		assertTrue(Ej01.matches("holaaaaa", 'c'));
		assertTrue(Ej01.matches("Hola", 'd'));
		assertTrue(Ej01.matches("acde", 'e'));
		assertTrue(Ej01.matches("250", 'f'));
		assertTrue(Ej01.matches("956660066", 'g'));
		assertTrue(Ej01.matches("32456789T", 'h'));
		assertTrue(Ej01.matches("Ana", 'i'));
		assertTrue(Ej01.matches("abcd", 'j'));
		//assertTrue(Ej01.matches("hola1@gmail.es", 'k'));
		
		assertFalse(Ej01.matches("false", 'a'));
		assertFalse(Ej01.matches("AaAa", 'b'));
		assertFalse(Ej01.matches("holaaaaañ", 'c'));
		assertFalse(Ej01.matches("1Hola", 'd'));
		assertFalse(Ej01.matches("abcde", 'e'));
		assertFalse(Ej01.matches("350", 'f'));
		assertFalse(Ej01.matches("95666006666", 'g'));
		assertFalse(Ej01.matches("32456789Ñ", 'h'));
		assertFalse(Ej01.matches("Ana María", 'i'));
		assertFalse(Ej01.matches("bbba", 'j'));
		assertFalse(Ej01.matches("hola1@gmail.jk", 'k'));
	}

}
