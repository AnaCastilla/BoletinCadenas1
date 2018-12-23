package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej05;

class Ej05Test {

	@Test
	void numCharsTest() {
		assertEquals(Ej05.numChars("holaaaa", 'a'), 2);
		assertEquals(Ej05.numChars("como estas carmen", 'c'), 10);
	}

}
