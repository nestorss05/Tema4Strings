package ejercicio08;

import java.util.Scanner;

/**
 * 
 * @author Nestor Sanchez
 */
public class ClaseMain {

	/**
	 * Funcion Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String frase: frase a analizar
		String frase;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una frase
		System.out.println("Inserta una frase");
		frase = sc.nextLine();

		// Llama a la funcion Analizar.frase y guarda su resultado en nApariciones

		// Cierra el Scanner
		sc.close();

	}

}
