package ejercicio04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa que mostrara las palabras de una frase por orden alfabetico
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Clase principal del codigo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String frase: frase introducida por el usuario
		String frase;
		
		// String palabras: frase dividida en palabras
		String[] palabras;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario una frase
		System.out.println("Inserta una frase");
		frase = sc.nextLine();
		
		// Divide el string en palabras
		palabras = frase.split(" ");
		
		// Ordena el array
		Arrays.sort(palabras);
		
		// Muestra el array por pantalla
		System.out.println(Arrays.toString(palabras));
		
		// Cierra el Scanner
		sc.close();

	}

}
