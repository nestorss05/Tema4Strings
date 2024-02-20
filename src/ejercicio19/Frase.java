package ejercicio19;

/**
 * Clase Frase
 * 
 * @author Nestor Sanchez
 */
public class Frase {

	/**
	 * Funcion paseCamel: transforma la frase a nomenclatura Camel
	 * 
	 * @param frase: frase original
	 * @return: frase pasada a Camel
	 */
	public static String paseCamel(String frase) {

		// String[] palabras: frase dividida en comentarios
		String[] palabras = frase.split(" ");

		// char[] letras: palabra dividida en letras
		char[] letras;

		// For: ve pasando cada palabra a nomenclatura camel
		for (int i = 0; i < palabras.length; i++) {

			// Pasa la palabra a minusculas
			palabras[i] = palabras[i].toLowerCase();

			// If: si i no es 0, se dividira la palabra en una cadena de caracteres, y el
			// primer caracter pasara a ser mayuscula
			if (i != 0) {
				letras = palabras[i].toCharArray();
				letras[0] = Character.toUpperCase(letras[0]);
				palabras[i] = String.valueOf(letras);
			} // Fin If
		} // Fin For

		// Une las palabras que quedan
		frase = String.join("", palabras);

		// Devuelve la frase al main
		return frase;

	}

}
