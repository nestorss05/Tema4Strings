package ejercicio20;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase MainCode
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Funcion main: pide al usuario una frase y el nº de letras en el que se
	 * dividira cada lote de la frase y muestralo por pantalla
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String frase: frase a introducir por el usuario
		String frase;

		// int nLetras: nº de letras en el que se dividira la frase
		int nLetras = 0;
		
		// String[] fraseFinal: frase dividida pasada a substring
		String[] fraseFinal;

		// boolean esValido: comprobador de si la respuesta introducida por el usuario
		// es valida o no
		boolean esValido = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do-While 1: Pide al usuario una frase
		do {
			System.out.println("Inserta una palabra");
			frase = sc.next();
			if (frase == "") {
				System.out.println("ERROR: la cadena no debe ser vacia");
			} else {
				esValido = true;
			}
		} while (!esValido);

		// Puesto a que se volvera a pedir otro valor, esValido volvera a ser false
		esValido = false;

		// Do-While 2: pide al usuario un numero
		do {
			try {
				System.out.println("Inserta nº de letras en el que se dividira la frase");
				nLetras = sc.nextInt();
				if (nLetras > frase.length()) {
					System.out.println("ERROR: el numero de letras debe ser menor o igual que la longitud de la frase");
				} else {
					esValido = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: la respuesta introducida es invalida");
			} finally {
				sc.nextLine();
			}
		} while (!esValido);

		// Llama a la funcion Frase.aSubstring y guardalo en la variable frase
		fraseFinal = Frase.aSubstring(frase, nLetras);

		// Muestra fraseFinal por pantalla
		System.out.println(Arrays.toString(fraseFinal));

		// Cierra el Scanner
		sc.close();

	}

}
