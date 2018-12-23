package ejercicios;

public class Ej03 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir una cadena
		 * 2. Comprobamos carácter a carácter si es una vocal o no
		 * 3. Mostramos el número de veces que han aparecido vocales en la cadena 
		 */
		String s;
		
		s = Keyboard.readString();
		
		System.out.println("Hay " + numVocals(s) + " vocal(es)");
		
		Keyboard.closeKeyboard();
	}
	
	public static int numVocals(String s) {
		
		int i, vocal = 0;
		
		//1. Introducir una cadena
		
		
		for (i = 0; i < s.length(); i++) {
			// 2. Comprobamos carácter a carácter si es una vocal o no
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' ||
					s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				vocal++; //si esa posición de 'i' es una vocal, se incrementa de 1 en 1 nuestra variable vocal
			}
		}
		//3. Mostramos el número de veces que han aparecido vocales en la cadena 		
		return vocal;
	}

}
