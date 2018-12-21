package ejercicios;

public class Ej02 {

	public static void main(String[] args) {

		/*
		 * 1. Introducir una cadena por teclado
		 * 2. Suprimir los espacios de dicha cadena 
		 * 3. Mostrar la nueva cadena sin espacios 
		 */
		String s, x = " ";
		int l, i;
		
		//1. Introducir una cadena por teclado
		s = Keyboard.readString();
		//se guarda la longitud de la cadena
		l = s.length();
		
		System.out.println("Cadena sin espacios: ");
		//2. Suprimir los espacios de dicha cadena 
		for (i = 0; i < l; i++) {
			//si la posición de la cadena en la que nos encontramos es distinto a un espacio, se imprime el caracter de dicha posición, si es un espacio
			//no hace nada y pasa a la siguiente posición
			if (x.charAt(0) != s.charAt(i)) {
				//3. Mostrar la nueva cadena sin espacios 
				//se va sacando por pantalla todos los caracteres por cada repetición del bucle
				System.out.print(s.charAt(i));
			}
		}
		
		Keyboard.closeKeyboard();
	}

}
