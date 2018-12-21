package ejercicios;

public class Ej10 {

	public static void main(String[] args) {

		/*
		 * 1. Pedir una cadena
		 * 2. Se comprueba si que cada posición de la cadena se trata de un dígito
		 * 3. Mostrar el resultado
		 */
		
		String s, saveChar;
		int result = 0;
		
		//1. Pedir una cadena
		s = Keyboard.readString();
		
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
		//3. Mostrar el resultado
		System.out.println(result);
		
		Keyboard.closeKeyboard();
	}
}
