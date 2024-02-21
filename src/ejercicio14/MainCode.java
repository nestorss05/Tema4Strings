package ejercicio14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase MainCode
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Pide al usuario una frase y analiza cuantas letras hay y cuantas veces se
	 * repiten<
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String frase: frase introducida por el usuario
		String frase;

		// char[] letras: frase dividida en letras
		char[] letras;

		// int contador: contador de veces que se repite una letras
		int contador = 1;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una frase
		System.out.println("Inserta una frase");
		frase = sc.nextLine().toLowerCase();

		// Quita los espacios
		frase = frase.replace(" ", "");

		// Pasa la frase a array
		letras = frase.toCharArray();

		// Ordena las letras
		Arrays.sort(letras);

		// For: muestra los caracteres por pantalla y la cantidad de apariciones
		for (int i = 0; i < letras.length; i++) {
			
			// If-Else: si i es igual a la longitud de letras - 1, o si letras[i] es igual
			// al siguiente, se sumara 1 al contador
			if (i == letras.length - 1 || letras[i] == letras[i + 1]) {
				contador++;
			} else {
				// De lo contrario, se mostrara la cantidad de veces que se repite la letra, y
				// se reestablecera el contador a 1
				System.out.println(letras[i] + ": " + contador);
				contador = 1;
			} // Fin If-Else
			
		} // Fin For

		// Cierra el Scanner
		sc.close();

	}

}
