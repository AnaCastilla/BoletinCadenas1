package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.Ej02;

class Ej02Test {

	@Test
	void noSpacesTest() {
		assertEquals(Ej02.noSpaces("hola que tal"), "holaquetal");
		assertEquals(Ej02.noSpaces("holaquetal"), "holaquetal");

	}

}
