package ejercicios;

public class Ej09 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir 2 cadenas
		 * 2. Mostrar el resultado
		 */
		
		String s1, s2;
		int aux;
		
		//1. Introducir 2 cadenas
		s1 = Keyboard.readString();
		s2 = Keyboard.readString();
		
		//En esta variable auxiliar se guarda el valor de la longitud de la cadena 1
		aux = s1.length()-1;
		//de este modo, el bucle empezará desde esa posición e irá decrementando hasta llegar a la posición 0, que es donde terminará
		for (int i = aux; i >= 0; i--) {
			s2 += s1.charAt(i); 
		}
		//2. Mostrar el resultado
		System.out.println(s2);
		
		Keyboard.closeKeyboard();
	}

}
