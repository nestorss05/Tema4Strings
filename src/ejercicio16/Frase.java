package ejercicio16;

import java.util.Arrays;
import java.util.Random;

/**
 * Clase Frase
 * 
 * @author Nestor Sanchez
 */
public class Frase {

	/**
	 * Funcion desordenarFrase: desordenara la frase para darla como pista
	 * 
	 * @param palabrasOriginales: frase dividida en array
	 * @return: la cadena de caracteres desordenada
	 */
	public static char[] desordenarFrase(char[] palabrasOriginales) {

		// char temp: caracter temporal que sera asignado al array palabrasOriginales
		char temp;

		// int numeroAleatorio: numero aleatorio generado del 0 a la longitud de
		// palabrasOriginales
		int numeroAleatorio;

		// Inicia el random
		Random rand = new Random();

		// For: asigna un valor aleatorio a los caracteres del array
		for (int i = 0; i < palabrasOriginales.length; i++) {

			// Asigna un valor aleatorio
			numeroAleatorio = rand.nextInt(palabrasOriginales.length);

			// temp sera el indice i de palabrasOriginales
			temp = palabrasOriginales[i];

			// el indice i de palabrasOriginales sera el indice aleatorio de
			// palabrasOriginales
			palabrasOriginales[i] = palabrasOriginales[numeroAleatorio];

			// el indice aleatorio de palabras originales sera temp con intencion de no
			// perder la letra
			palabrasOriginales[numeroAleatorio] = temp;

		} // Fin For

		// Devuelve palabrasTransformadas al main
		return palabrasOriginales;

	}

	/**
	 * Funcion coinciden: funcion que saca cuantas letras coinciden con la respuesta
	 * 
	 * @param palabrasOriginales: frase a adivinar ya pasada a array
	 * @param fraseRespuesta:     frase que ha introducido el usuario como respuesta
	 * @return letras que coinciden con la respuesta
	 */
	public static char[] coinciden(char[] palabrasOriginalesCopia, String fraseRespuesta) {

		// char[] palabrasRespuesta: fraseRespuesta en array
		char[] palabrasRespuesta = fraseRespuesta.toCharArray();

		// char[] letrasCoinciden: letras que coinciden con la respuesta
		char[] letrasCoinciden = new char[palabrasRespuesta.length];

		// If: comprueba si la palabra tiene la cantidad de caracteres que deberia tener
		if (palabrasRespuesta.length == palabrasOriginalesCopia.length) {
			// For I: va analizando letra por letra si esta o no
			for (int i = 0; i < palabrasOriginalesCopia.length; i++) {
				if (palabrasRespuesta[i] == palabrasOriginalesCopia[i]) {
					letrasCoinciden[i] = palabrasOriginalesCopia[i];
				} else {
					letrasCoinciden[i] = '-';
				}
			} // Fin For I
		} else {
			System.out.println(
					"ERROR: la frase debe tener como minimo " + palabrasOriginalesCopia.length + " caracteres");
		}

		// Devuelve letrasCoinciden al main
		return letrasCoinciden;

	}

}