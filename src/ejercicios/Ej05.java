package ejercicios;

public class Ej05 {

	public static void main(String[] args) {

		/*
		 * 1. Se le pide al usuario la cadena y el carácter
		 * 2. Se muestra la primera vez que aparece el carácter
		 * 3. Se muestra la última vez que aparece el carácter
		 * 4. Se muestra el número de carácteres que hay entre la primera y la última aparición
		 */
		
		String s, s2;
		char c;
		int firstAppearance = 0, lastAppearance;
		
		//1. Se le pide al usuario la cadena y el carácter
		s = Keyboard.readString();
		c = Keyboard.readChar("Introduce el carácter");
		
		//2. Se muestra la primera vez que aparece el carácter
		//Mientras que el carácter de la posición de la cadena en la que estamos no es igual que el introducido, va incrementando la posición 
		while (s.charAt(firstAppearance) != c) {
			firstAppearance++;
		}
		
		//Cuando se cumpla en bucle, tendremos la primera aparición de la letra 
		System.out.printf("La primera aparición de la letra '%c' es en la posición %d\n", c, firstAppearance+1);
		
		//En esta variable guardamos la longitud exacta (con el -1) de la cadena
		lastAppearance = s.length()-1;
		
		//3. Se muestra la última vez que aparece el carácter
		while (s.charAt(lastAppearance) != c) {
			lastAppearance--;
		}
		
		System.out.printf("La última aparición de la letra '%c' es en la posición %d\n", c, lastAppearance+1);
		
		//El método substring nos sacará la porción de texto que hay entre los límites que son la primera  y última vez que aparece el carácter
		s2 = s.substring(firstAppearance+1, lastAppearance);
		
		//4. Se muestra el número de carácteres que hay entre la primera y la última aparición
		System.out.println("Número de carácteres comprendidos entre su primera y última aparición: " + s2.length());
		
		Keyboard.closeKeyboard();
	}

}
