package ejercicios;

public class Ej11 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir por teclado la cadena y el carácter que queramos cambiar por un asterisco
		 * 2. Comprobamos si ese caracter de dicha posición es el caracter introducido
		 * 	2.1. Si lo es, reemplazamos lo que estaba guardado en la variable valorChar (que era el caracter de la posición marcada por i) por un *
		 * 3. En la cadena resultante, se va sumando lo introducido en valorChar
		 * 4. Sacar por pantalla el resultado
		 */

		String s;
		char replaceChar;

		//1. Introducir por teclado la cadena y el carácter que queramos cambiar por un asterisco
		s = Keyboard.readString();
		System.out.println("Introduce el carácter que desea reemplazar: ");
		replaceChar = Keyboard.readChar();

		System.out.println(replaceAst(s, replaceChar));
		
		Keyboard.closeKeyboard();

		
	}
	
	public static String replaceAst(String s, char replaceChar) {
		
		String s2="";
		char valorChar;
		//Recorrer los caracteres de la cadena
		for (int i = 0; i <= s.length() - 1; i++) {

			//Le asignamos el valor del caracter de la posición a un caracter vacío
			valorChar= s.charAt(i);
			//2. Comprobamos si ese caracter de dicha posición es el caracter introducido
			if (s.toLowerCase().charAt(i) == replaceChar) {

				//2.1. Si lo es, reemplazamos lo que estaba guardado en la variable valorChar (que era el caracter de la posición marcada por i) por un *
				valorChar = '*';
				
			}

			//3. En la cadena resultante, se va sumando lo introducido en valorChar
			s2 += valorChar;
		}

		//4. Sacar por pantalla el resultado
		return s2;
	}

}
