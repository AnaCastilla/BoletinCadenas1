package ejercicios;

public class Ej04 {

	public static void main(String[] args) {

		/*
		 * 1. Se le pide al usuario que introduzca una cadena y el carácter que quiere contar
		 * 2. Se muestran las veces que ha aparecido dicho carácter
		 */
		
		String s;
		int i, appearance = 0;
		char c;
		
		//1. Se le pide al usuario que introduzca una cadena y el carácter que quiere contar
		s = Keyboard.readString();
		System.out.println("Introduce el carácter que quieres contar: ");
		c = Keyboard.readChar();
		
		//Se recorre la cadena letra por letra con este bucle
		for (i = 0; i < s.length(); i++) {
			//Por cada iteración del bucle se lee cada letra de la cadena en minúsculas y se comprueba si es igual al carácter introducido
			if (s.toLowerCase().charAt(i) == c) {
				//Si lo es, se cuenta que ha aparecido 1 vez en la variable contador
				appearance++;
			}
		}
		//2. Se muestran las veces que ha aparecido dicho carácter
		System.out.printf("El carácter '%c' ha aparecido %d veces", c, appearance);
		
		Keyboard.closeKeyboard();
	}

}
