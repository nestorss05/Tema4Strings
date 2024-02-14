package ejercicio07;

/**
 * Clase Analizar: analiza la frase por si hay una palabra en concreto
 * 
 * @author Nestor Sanchez
 */
public class Analizar {

	/**
	 * Funcion frase:
	 * 
	 * @param frase        frase a analizar
	 * @param palabra      palabra a buscar en la frase
	 * @param nApariciones nº de apariciones totales de la palabra en la frase
	 * @return nApariciones
	 */
	public static int frase(String frase, String palabra, int nApariciones) {

		// Divide la frase por palabras
		String[] fraseDividida = frase.split(" ");

		// Analiza la frase por si esta la variable palabra en ella
		for (String frases : fraseDividida) {
			if (frases.equals(palabra)) {
				nApariciones++;
			}
		}

		// Devuelve nApariciones al main
		return nApariciones;

	}

}
