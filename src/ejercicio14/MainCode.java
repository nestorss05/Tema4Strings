package ejercicio14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase MainCode
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Pide al usuario una frase y analiza cuantas letras hay y cuantas veces se repiten<
	 * @param args
	 */
	public static void main(String[] args) {
		
		// String frase: frase introducida por el usuario
		String frase;
		
		// char[] letras: frase dividida en letras
		char[] letras;
		
		// int contador: contador de veces que se repite una letras
		int contador = 1;
		
		// char siguiente: caracter siguiente
		char siguiente = ' ';
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario una frase
		System.out.println("Inserta una frase");
		frase = sc.nextLine().toLowerCase();
		
		// Quita los espacios
		frase = frase.trim();
		
		// Pasa la frase a array
		letras = frase.toCharArray();
		
		// Ordena las letras
		Arrays.sort(letras);
		
		// El caracter siguiente sera letras[1] inicialmente
		siguiente = letras[1];
		
		// For: muestra los caracteres por pantalla y la cantidad de apariciones
		for (int i = 0; i < letras.length; i++) {
			if (siguiente == letras[i]) {
				contador++;
				
				// Este If te arregla la posicion de las letras
				if (siguiente != letras[i+1]) {
					System.out.println("Letra " +  letras[i] + ": " + contador);
					contador = 1;
				}
			} else {
				
				// Este If te quita las letras duplicadas dejandote el valor mas mayor
				if (i == letras.length-1 || letras[i] != letras[i+1]) {
					System.out.println("Letra " +  letras[i] + ": " + contador);
				}
				
				// Por lo demas, restablecera el contador a 1, y siguiente sera letras[i]
				contador = 1;
				siguiente = letras[i];
			}
		} // Fin For
		
		// Cierra el Scanner
		sc.close();
		
	}

}
