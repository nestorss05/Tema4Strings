package ejercicio12;

import java.util.Scanner;

/**
 * Clase MainCode
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Pide al usuario una frase y busca la palabra mas larga
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String frase: frase introducida por el usuario
		String frase;

		// String[] palabras: palabras de la frase en un array
		String[] palabras;

		// char[] letras: letras de cada palabras
		char[] letras;

		// int larga: indice de la palabra mas larga
		int larga = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una frase
		System.out.println("Inserta una frase");
		frase = sc.nextLine();

		// Divide la frase por palabras
		palabras = frase.split(" ");

		// For: lee el array de las palabras
		for (int i = 0; i < palabras.length; i++) {

			// Pasa cada letra a una cadena de caracteres
			letras = palabras[i].toCharArray();

			// If: si la longitud de letra es mayor que la longitud de palabra[larga], larga
			// sera i
			if (letras.length > palabras[larga].length()) {
				larga = i;
			} // Fin If

		} // Fin For

		// Muestra la palabra mas larga por pantalla
		System.out.println(palabras[larga]);

		// Muestra la longitud de la frase
		System.out.println(palabras[larga].length());

		// Cierra el Scanner
		sc.close();

	}

}
