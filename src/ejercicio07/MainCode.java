package ejercicio07;

import java.util.Scanner;

/**
 * Clase MainCode: clase que pedira al usuario una frase y una palabra, y
 * mostrara el nº de apariciones de una palabra por pantalla
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Funcion main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String frase: frase a analizar
		String frase;

		// String palabra: palabra a buscar en la clase
		String palabra;

		// int nApariciones: nº de apariciones de la palabra a buscar en la frase
		int nApariciones = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una frase
		System.out.println("Inserta una frase");
		frase = sc.nextLine();

		// Pide al usuario una palabra a buscar
		System.out.println("Inserta una palabra a buscar en la frase");
		palabra = sc.next();

		// Llama a la funcion Analizar.frase y guarda su resultado en nApariciones
		nApariciones = Analizar.frase(frase, palabra, nApariciones);

		// Muestra las veces que aparece una palabra en una frase
		System.out.println(nApariciones);

		// Cierra el Scanner
		sc.close();

	}

}
