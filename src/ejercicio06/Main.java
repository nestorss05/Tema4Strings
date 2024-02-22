package ejercicio06;

import java.util.Scanner;

/**
 * Clase donde se le pedira al usuario una frase palabra a palabra y se
 * concatenara
 * 
 * @author Nestor Sanchez
 */
public class Main {

	/**
	 * Funcion main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String frase: frase introducida por el usuario
		String frase = "";

		// String fraseFinal: frase concatenada a base de varias palabras
		String fraseFinal = "";

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una frase
		System.out.println("Inserta una frase");
		frase = sc.next().toLowerCase();

		while (!frase.equals("fin")) {
			fraseFinal = fraseFinal + frase + " ";
			System.out.println("Inserta una frase");
			frase = sc.next();
		} // Fin While

		// Muestra la frase final por pantalla
		System.out.println(fraseFinal);

		// Cierra el Scanner
		sc.close();

	}

}
