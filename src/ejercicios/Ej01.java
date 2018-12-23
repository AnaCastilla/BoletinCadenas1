package ejercicios;

public class Ej01 {

	public static void main(String[] args) {

		/*
		 * Realizar las siguientes comprobaciones utilizando matches
		 */
		String s;
		char letter = 'a'; 
		
		//con este bucle se irán mostrando cada letra de la a y la k con lo que se pide hacer
		do {
			System.out.print(letter + ") ");
			s = Keyboard.readString();
			
			System.out.println(matches(s, letter));
			//cada vez que se hace un caso, se incrementa la letra
			letter++;
			
		} while (letter <= 'k');
		
		
		Keyboard.closeKeyboard();
	}
	
	public static boolean matches(String s, char letter) {
		boolean result = false;
		
		switch (letter) {
			//a) que la cadena sea exactamente “True”
			case 'a':
				result = s.matches("True||true");
				break;
			//b) que la cadena sea de tres letras, mayúsculas o minúsculas
			case 'b':
				result = s.matches("[aA-Zz]{3}");
				break;
			//c) que la cadena contenga 5 o más caracteres que no sean la ñ, la z ni la x.
			case 'c':
				result = s.matches("[^ñzxÑZX]{5,}");
				break;
			//d) que la cadena no empiece con un número
			case 'd':
				result = s.matches("\\D.*");
				break;
			//e) que la cadena tenga varios caracteres excepto la b.
			case 'e':
				result = s.matches("[aA-Zz[^bB]]{2,}");
				break;
			//f) que la cadena tenga un número positivo más pequeño que 300.
			case 'f': 
				result = s.matches("[0-2]?[0-9]?[0-9]");
				break;
			//g) que la cadena sea un número de teléfono
			case 'g':
				result = s.matches("[0-9]{9}");
				break;
			//h) que la cadena sea un DNI
			case 'h':
				result = s.matches("[0-9]{8}[A-Z[^IÑOU]]");
				break;
			//i) que la cadena sea un nombre, es decir, que no tenga espacios, que no sea una cadena vacía y que empiece por mayúsculas
			case 'i':
				result = s.matches("[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+");
				break;
			//j) que la cadena empiece con vocal y luego tenga varias consonantes o ninguna.
			case 'j': 
				result = s.matches("[aeiouáéíóúAEIOUÁÉÍÓÚ][b-zñB-ZÑ&&[^eiouéíóúEIOUÉÍÓÚ]]*");
				break;
			//k) que la cadena sea un correo electrónico acabado en .com o en .es
			case 'k':
				result = s.matches("[a-zA-Z0-9]@[a-z][\\.](.com||.es)");
				break;
			}
			
			//devuelve el resultado
			return result;
		}

	}


