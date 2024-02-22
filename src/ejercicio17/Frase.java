package ejercicio17;

/**
 * Clase Frase
 * 
 * @author Nestor Sanchez
 */
public class Frase {

	/**
	 * Funcion eliminarComentarios: elimina los comentarios C
	 * 
	 * @param frase: frase original
	 * @return: frase sin comentarios
	 */
	public static String eliminarComentarios(String frase) {

		// String[] palabras: frase dividida en comentarios
		String[] palabras = frase.split("/");

		// For: revisa cada frase
		for (int i = 0; i < palabras.length; i++) {

			// Hazle un trim a la palabra
			palabras[i] = palabras[i].trim();

			// Si la palabra empieza y acaba por asterisco, se borrara
			if (palabras[i].startsWith("*") && (palabras[i].endsWith("*"))) {
				palabras[i] = "";
			} else {
				// Si no es asi, la palabra se mantendra como tal y se le metera un espacio al
				// final
				palabras[i] = palabras[i] + " ";
			}
		} // Fin For

		// Une las palabras que quedan
		frase = String.join("", palabras);

		// Hazle un trim a la frase por si quedan espacios sobrantes al final
		frase = frase.trim();

		// Devuelve la frase al main
		return frase;

	}

}
