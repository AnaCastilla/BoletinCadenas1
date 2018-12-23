package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej04;

class Ej04Test {

	@Test
	void appearedTest() {
		assertEquals(Ej04.appeared("holaaaa", 'a'), 4);
		assertEquals(Ej04.appeared("holaaaa", 'b'), 0);
	}

}
