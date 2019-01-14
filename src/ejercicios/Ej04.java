package ejercicios;

public class Ej04 {

	public static void main(String[] args) {

		/*
		 * 1. Se le pide al usuario que introduzca una cadena y el carácter que quiere contar
		 * 2. Si la posición de la cadena en la que estamos es igual que el carácter introducido, es que dicho carácter aparece
		 * 	2.1. Si no es igual, se siguen comprobando posiciones hasta finalizar la cadena 
		 * 3. Se muestran las veces que ha aparecido dicho carácter
		 */
		String s;
		char c;
		//1. Se le pide al usuario que introduzca una cadena y el carácter que quiere contar
		s = Keyboard.readString();
		System.out.println("Introduce el carácter que quieres contar: ");				
		c = Keyboard.readChar();
		
		//llamada a la función
		System.out.println("El carácter ha aparecido " + appeared(s, c) + " veces");
		
		Keyboard.closeKeyboard();
	}
	
	public static int appeared(String s, char c) {
		
		int i, appearance = 0;
			
		//Se recorre la cadena letra por letra con este bucle
		for (i = 0; i < s.length(); i++) {
			//2. Si la letra de la posición de la cadena en la que estamos es igual que el carácter introducido, es que dicho carácter aparece
			if (s.toLowerCase().charAt(i) == c) {
				//Si lo es, se cuenta que ha aparecido 1 vez en la variable contador
				appearance++;
			}
		// 2.1. Si no es igual, se siguen comprobando posiciones hasta finalizar la cadena 
		}
		//3. Se muestran las veces que ha aparecido dicho carácter
		return appearance;
		
	}

}
