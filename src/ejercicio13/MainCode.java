package ejercicio13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase MainCode
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Pide al usuario dos palabras y comprueba si son anagramas
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String palabra1 y String palabra2: palabras introducidas por el usuario
		String palabra1;
		String palabra2;

		// char[] caracteres1 y caracteres2: palabra1 y palabra2 divididas en chars
		char[] caracteres1;
		char[] caracteres2;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario dos palabras
		System.out.println("Inserta una palabra");
		palabra1 = sc.nextLine().toLowerCase().replace(" ", "");
		System.out.println("Inserta otra palabra");
		palabra2 = sc.nextLine().toLowerCase().replace(" ", "");

		// Divide las palabras en arrays
		caracteres1 = palabra1.toCharArray();
		caracteres2 = palabra2.toCharArray();

		// Ordena las dos cadenas de caracteres
		Arrays.sort(caracteres1);
		Arrays.sort(caracteres2);

		// If-Else: Comprueba si las palabras son anagramas o no
		if (Arrays.equals(caracteres1, caracteres2)) {
			System.out.println("Las palabras son anagramas");
		} else {
			System.out.println("Las palabras no son anagramas");
		} // Fin If-Else

		// Cierra el Scanner
		sc.close();

	}

}
