package ejercicios;

public class Ej07 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir 2 cadenas
		 * 2. Introducir el número de caracteres de la cadena 1 que quieras que aparezca en la cadena 2
		 * 	  (los primeros caracteres)
		 * 3. Mostrar el resultado 
		 */
		
		String s1, s2;
		int n;
		
		//1. Introducir 2 cadenas
		s1 = Keyboard.readString();
		s2 = Keyboard.readString();
		//2. Introducir el número de caracteres de la cadena 1 que quieras que aparezca en la cadena 2
		n = Keyboard.readByte();
		
		//el bucle se repetirá las mismas veces que número de caracteres de s1 queramos que aparezca en s2
		for (int i = 0, j = 1; j <= n; i++, j++) {
			//se va concatenando los caracteres de s1 en s2
			s2 += s1.charAt(i); 
		}
		//3. Mostrar el resultado 
		System.out.println(s2);
		
		Keyboard.closeKeyboard();
	}

}
