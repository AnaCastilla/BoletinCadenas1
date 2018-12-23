package ejercicios;

public class Ej09 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir 2 cadenas
		 * 2. Se copia en la segunda la cadena los caracteres de la primera en orden inverso
		 * 3. Devuelve el resultado
		 */
		
		String s1, s2;
		
		//1. Introducir 2 cadenas
		s1 = Keyboard.readString();
		s2 = Keyboard.readString();
		
		System.out.println(reverseS1(s1, s2));
		
		Keyboard.closeKeyboard();
	}
	
	public static String reverseS1(String s1, String s2) {
		int aux;
		//En esta variable auxiliar se guarda el valor de la longitud de la cadena 1
		aux = s1.length()-1;
		//2. Se copia en la segunda la cadena los caracteres de la primera en orden inverso
		//de este modo, el bucle empezará desde esa posición e irá decrementando hasta llegar a la posición 0, que es donde terminará
		for (int i = aux; i >= 0; i--) {
			s2 += s1.charAt(i); 
		}
		//3. Devuelve el resultado
		return s2;
	}

}
