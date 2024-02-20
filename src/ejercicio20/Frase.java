package ejercicio20;

/**
 * Clase Frase
 * 
 * @author Nestor Sanchez
 */
public class Frase {

	/**
	 * Funcion aSubString: pasa la frase a substring dividiendolo en espacios de
	 * nLetras letras
	 * 
	 * @param frase:   la frase original
	 * @param nLetras: nº de letras a incluir en cada lote
	 * @return: array de letras
	 */
	public static String[] aSubstring(String frase, int nLetras) {

		// String[] fraseFinal: array que guardara las partes de la frase
		String[] fraseFinal = new String[(frase.length() / nLetras) + 1];

		// int nComienzo: nº donde comenzara el substring
		int nComienzo = 0;

		// int nFinal: nº donde acabara el substring
		int nFinal = nLetras;

		// For: pasa la frase a substring
		for (int i = 0; i < fraseFinal.length; i++) {

			// Se divide fraseFinal en un substring, de nComienzo a nFinal
			fraseFinal[i] = frase.substring(nComienzo, nFinal);

			// A nComienzo y a nFinal se le sumaran nLetras
			nComienzo = nComienzo + nLetras;
			nFinal = nFinal + nLetras;

			// If: si nFinal es mayor a la longitud de la frase, entonces pasara a ser la
			// longitud de la frase
			if (nFinal > frase.length()) {
				nFinal = frase.length();
			} // Fin If

		} // Fin For

		// Devuelve fraseFinal al main
		return fraseFinal;

	}

}