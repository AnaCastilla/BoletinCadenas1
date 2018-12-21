package ejercicios;

public class Ej12 {

	public static void main(String[] args) {

		/*
		 * 1. Introduce la cadena 1 
		 * 2. Introduce la cadena 2 que será la que contará las veces que aparece en la cadena 1
		 * 3. Se muestra el número de veces que aparece la cadena 2 en la 1
		 */

		String s1, s2;
		int i = 0, appearance = 0, coincidentChar = 0;

		//1. Introduce la cadena 1 
		s1 = Keyboard.readString();
		//2. Introduce la cadena 2 que será la que contará las veces que aparece en la cadena 1
		s2 = Keyboard.readString();

		// Las ponemos en minúsculas para evitar errores
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		// Recorre la cadena s1
		while (i <= s1.length() - 1) {
			if (s1.charAt(i) == s2.charAt(0)) {
				// Recorre la cadena s2
				for (int j = 0; j <= s2.length() - 1; j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						i++;
						coincidentChar++;
					}
					//Si el número de caracteres coincidentes es igual a la longitud de la cadena 2, es que la cadena 2 aparece en la cadena 1,
					// por lo que se va incrementando el numero de apariciones de la cadena 2
					if (coincidentChar == s2.length()) {
						appearance++;
					}

				}
				// Una vez se cumple todo eso, se reinicia el valor de caracteres coincidentes
				// para que cuando aparezca de nuevo la cadena 2 no se quede guardado el valor de antes
				// Se decrementa el valor de i para que no afecte al bucle
				i--;
				coincidentChar = 0;
			}
			// Se incrementa el valor de i cuando se terminen todas las condiciones
			// anteriores para que siga recorriendo la cadena 1
			i++;
		}

		//3. Se muestra el número de veces que aparece la cadena 2 en la 1
		System.out.println(appearance);

		Keyboard.closeKeyboard();
	}

}
