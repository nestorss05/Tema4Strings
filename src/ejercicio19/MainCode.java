package ejercicio19;

import java.util.Scanner;

/**
 * Clase MainCode
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Funcion main: pide al usuario una frase y pasala a camel llamando a Frase.paseCamel
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// String frase: frase a introducir por el usuario, a pasar a nomenclatura Camel
		String frase;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario una frase
		System.out.println("Inserta una frase a pasar a nomenclatura Camel");
		frase = sc.nextLine();
		
		// Llama a la funcion paseCamel y guarda el resultado en Frase
		frase = Frase.paseCamel(frase);
		
		// Muestra la frase transformada a Camel
		System.out.println(frase);
		
		// Cierra el Scanner
		sc.close();
		
	}

}
