package ejercicios;

public class Ej06 {

	public static void main(String[] args) {

		
		/*
		 * 1. Pedir las 2 cadenas
		 * 2. Concatenar la cadena 2 en la cadena 1
		 * 3. Devuelve el resultado
		 */
	
		String s1, s2;
		
		//1. Pedir las 2 cadenas
		s1 = Keyboard.readString();
		s2 = Keyboard.readString();
		
		System.out.println("Cadena concatenada: " + concatString(s1, s2));
		
		Keyboard.closeKeyboard();
	}
	
	public static String concatString(String s1, String s2) { 
		String s3=null;
		
		//2. Concatenar la cadena 2 en la cadena 1
		for (int i = 0; i < s2.length(); i++) {
			//Se le va concatenando por cada repetición del bucle cada carácter de s2 en s1
			s1 += s2.charAt(i);
			//Se guarda en una nueva variable nuestro resultado
			s3 = s1;
		}
		
		//3. Devuelve el resultado
		return s3;
		
		
	}

}
