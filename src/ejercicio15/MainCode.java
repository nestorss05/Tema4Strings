package ejercicio15;

import java.util.Scanner;

/**
 * Clase MainCode
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Clase main: pide al usuario una frase, pide a otro que lo acierte y muestrale
	 * una pista al respecto
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String fraseOriginal: frase a adivinar introducida por el usuario
		String fraseOriginal;

		// String fraseRespuesta: frase introducida como respuesta del usuario
		String fraseRespuesta;

		// char[] palabrasOriginales: fraseOriginal pasada a una cadena de caracteres
		char[] palabrasOriginales;

		// boolean acertado: indica si el jugador ha acertado o no
		boolean acertado = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una frase
		System.out.println("Inserta una frase");
		fraseOriginal = sc.nextLine().toLowerCase().replace(" ", "");

		// Pasa la frase a array
		palabrasOriginales = fraseOriginal.toCharArray();

		// Pide al usuario que acierte la frase
		do {
			System.out.println("Adivina la frase");
			System.out.println("Pista: " + String.valueOf(Frase.desordenarFrase(palabrasOriginales)));
			fraseRespuesta = sc.nextLine().toLowerCase().replace(" ", "");
			if (fraseRespuesta.equals(fraseOriginal)) {
				System.out.println("Enhorabuena, has acertado la frase");
				acertado = true;
			} else {
				System.out.println("No has acertado la frase");
			}
		} while (!acertado);

		// Cierra el Scanner
		sc.close();

	}

}
