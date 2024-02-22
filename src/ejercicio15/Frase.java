package ejercicio15;

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
		
		// int numeroAleatorio: numero aleatorio generado del 0 a la longitud de palabrasOriginales
		int numeroAleatorio;
		
		// Inicia el random
		Random rand = new Random();
		
		// For: asigna un valor aleatorio a los caracteres del array
		for (int i = 0; i < palabrasOriginales.length; i++) {
		
			// Asigna un valor aleatorio
			numeroAleatorio = rand.nextInt(palabrasOriginales.length);
			
			// temp sera el indice i de palabrasOriginales
			temp = palabrasOriginales[i];
			
			// el indice i de palabrasOriginales sera el indice aleatorio de palabrasOriginales
			palabrasOriginales[i] = palabrasOriginales[numeroAleatorio];
			
			// el indice aleatorio de palabras originales sera temp con intencion de no perder la letra
			palabrasOriginales[numeroAleatorio] = temp;
			
		} // Fin For
		
		// Devuelve palabrasTransformadas al main
		return palabrasOriginales;
		
	}

}