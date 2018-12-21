package ejercicios;

public class Ej13 {

	public static void main(String[] args) {

		/*
		 * PRIMERA PARTE
		 * 1. Se introduce una cadena
		 * 2. Se comprueba si la cadena empieza con un espacio
		 * 	2.1. Si es así, todavia no hay ninguna palabra
		 * 	2.2. Si no hay espacio, nos encontramos con la primera palabra
		 * 3. Comprobamos si en la posición donde nos encontramos se trata de un espacio
		 * 	3.1. Si es así, es que hemos pasado una palabra
		 * 	3.2. Si no, se sigue contando
		 * 4. Se muestran cuantas palabras hay en la cadena 
		 */
		
		char space = ' ';
		int word = 0, i = 0;
		String s;
		boolean isValid = false;
		
		//PRIMERA PARTE
		//1. Se introduce una cadena
		s = Keyboard.readString();
		
		//2. Se comprueba si la cadena empieza con un espacio
		if (s.charAt(0) == space) {
			//2.1. Si es así, todavia no hay ninguna palabra
			word = 0;
		} else {
			//2.2. Si no hay espacio, nos encontramos con la primera palabra
			word = 1;
		}
		
		while (i < s.length()) {
			//3. Comprobamos si en la posición donde nos encontramos se trata de un espacio
			if (s.charAt(i) == space) {
				//3.1. Si es así, es que hemos pasado una palabra
				word++;
			}
			//3.2. Si no, se sigue contando
			//va incrementando la posición de la cadena en la que nos encontramos
			i++;
		}
		//4. Se muestran cuantas palabras hay en la cadena 
		System.out.printf("Número de palabras que tiene la cadena '%s': %d\n", s, word);
		
		//SEGUNDA PARTE (tiene básicamente casi los mismos pasos que la primera)
		//Se reinicia el valor de i porque si no se seguiría usando el anterior
		i = 0;
		
		//2. Se comprueba si la cadena empieza con un espacio
		if (s.charAt(0) == space) {
			//2.1. Si es así, todavia no hay ninguna palabra
			word = 0;
		} else {
			//2.2. Si no hay espacio, nos encontramos con la primera palabra
			word = 1;
		}
		
		while (i < s.length()) {
			//3. Comprobamos si en la posición donde nos encontramos se trata de un espacio
			//3.1. Si es así, es que hemos pasado una palabra
			if (s.charAt(i) == space) {
				i++;
				//comprobamos si la siguiente posición se trata de un espacio también
				if (s.charAt(i) == space) {
					word++;
					i--;
				} else {
					i--;
				}
			} 
			
			//3.2. Si no, se sigue contando
			//va incrementando la posición de la cadena en la que nos encontramos
			i++;
		}
		
		System.out.printf("Número de palabras que tiene la cadena '%s': %d", s, word);

	}
}
