package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej10;

class Ej10Test {

	@Test
	void digitsSumTest() {
		assertEquals(Ej10.digitsSum("123asd45asd"), 15);
		assertEquals(Ej10.digitsSum("asdasd"), 0);

	}

}
