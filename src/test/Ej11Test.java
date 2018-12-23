package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej11;

class Ej11Test {

	@Test
	void replaceAstTest() {
		assertEquals(Ej11.replaceAst("holaaa", 'a'), "hol***");
		assertEquals(Ej11.replaceAst("holaaa", 'c'), "holaaa");
	}

}
