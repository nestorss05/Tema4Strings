package ejercicio11;

import java.util.Scanner;

/**
 * Clase Main
 * 
 * @author Nestor Sanchez
 */
public class ClaseMain {

	/**
	 * Funcion main: se le pedira al usuario una frase y se llamara continuamente a
	 * la funcion conjuntos para codificar esa frase
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// char[] conjunto1: cadena de caracteres sin codificar
		char[] conjunto1 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		
		// char[] conjunto2: cadena de caracteres codificados
		char[] conjunto2 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// char[] fraseChar: frase pasada a char
		char[] fraseChar;

		// String frase. frase introducida por el usuario
		String frase;

		// char c: caracter que se ira acumulando a la frase codificada
		char c = ' ';

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una frase
		System.out.println("Inserta una frase");
		frase = sc.nextLine().toLowerCase();

		// Pasa la frase a char
		fraseChar = frase.toCharArray();

		// For A
		for (int i = 0; i < fraseChar.length; i++) {
			c = fraseChar[i];
			
			// For B
			for (int j = 0; j < conjunto1.length; j++) {
				
				// If
				if (fraseChar[i] == conjunto1[j]) {
					c = Conjuntos.codificador(conjunto1, conjunto2, c);
					break;
				} // Fin If
				
			} // Fin For B
			System.out.print(c);
		} // For A

		// Cierra el Scanner
		sc.close();

	}

}
