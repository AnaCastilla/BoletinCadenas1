package ejercicios;

public class Ej10 {

	public static void main(String[] args) {

		/*
		 * 1. Pedir una cadena
		 * 2. Se comprueba si que cada posición de la cadena se trata de un dígito
		 * 3. Devuelve el resultado, que será la suma de todos los dígitos que han aparecido en la cadena
		 */
		
		String s;
		
		//1. Pedir una cadena
		s = Keyboard.readString();
		
		System.out.println(digitsSum(s));
		
		Keyboard.closeKeyboard();
	}
	
	public static int digitsSum(String s) {
		String saveChar;
		int result = 0;
		//este bucle recorre la cadena s 
		for (int i = 0; i < s.length(); i++) {
			
			//2. Se comprueba si que cada posición de la cadena se trata de un dígito
			if (Character.isDigit(s.charAt(i))) {
				//Si es verdad (true) convertir el charAt(i) a String y guardarlo en una variable String
				saveChar = String.valueOf(s.charAt(i));
				//Para convertir el resultado en un número, utilizar el método Integer.parseInt y guardarlo en una variable de tipo int
				result += Integer.parseInt(saveChar); //parseInt solo admite strings,  por eso antes s.charAt(i) que es un caracter se convierte a String
			}
		}
		//3. Devuelve el resultado, que será la suma de todos los dígitos que han aparecido en la cadena
		return result;
	}
}
