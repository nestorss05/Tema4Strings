package ejercicio01;

import java.util.Scanner;

/**
 * Codigo principal del Ejercicio 1 del Boletin 1 del Tema 4.2
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Se le pedira al usuario dos frases, y se analizara cual es la frase mas larga
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Define las dos frases
		String frase1;
		String frase2;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario las dos frases
		System.out.println("Inserta una frase");
		frase1 = sc.next();
		System.out.println("Inserta otra frase");
		frase2 = sc.next();
		
		// Comprueba cual es la frase mas larga
		if (frase1.length() > frase2.length()) {
			System.out.println(frase1);
		} else {
			System.out.println(frase2);
		}
		
		// Cierra el Scanner
		sc.close();
	}

}
