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

		// boolean esPalindroma: booleana que te mostrara si una frase es palindroma
		boolean esPalindroma;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una frase
		System.out.println("Inserta una frase");
		frase = sc.nextLine().toLowerCase();

		// Llama a la funcion IdefClase.esPalindroma y guarda su resultado en
		// nApariciones
		esPalindroma = IdefClase.esPalindroma(frase);
		
		// Muestra el resultado por pantalla
		System.out.println(esPalindroma);
		
		// Cierra el Scanner
		sc.close();

	}

}
