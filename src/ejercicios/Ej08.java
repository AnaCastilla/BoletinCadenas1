package ejercicios;

public class Ej08 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir 2 cadenas
		 * 2. Introducir el número de caracteres de la cadena 1 que quieras que aparezca en la cadena 2
		 * 	  (los ultimos caracteres)
		 * 3. Mostrar el resultado 
		 */
		
		String s1, s2;
		int n, aux;
		
		//1. Introducir 2 cadenas
		s1 = Keyboard.readString();
		s2 = Keyboard.readString();
		//2. Introducir el número de caracteres de la cadena 1 que quieras que aparezca en la cadena 2
		n = Keyboard.readByte();
		
		//En esta variable auxiliar se guarda la longitud de la cadena s1, de esta manera en el bucle, i empezará desde esa posición y se irá decrementando
		aux = s1.length()-1;
		for (int i = aux, j = 1; j <= n; i--, j++) {
			
			s2 += s1.charAt(i); 
		}
		//3. Mostrar el resultado 
		System.out.println(s2);
		
		Keyboard.closeKeyboard();
	}

}
