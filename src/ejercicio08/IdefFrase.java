package ejercicio08;

/**
 * Clase IdefFrase: identificador de frases
 * @author Nestor Sanchez
 */
public class IdefFrase {

	/**
	 * Funcion esPalindroma: analizara si una frase es palindroma o no
	 * @param frase: frase a analizar introducida por el usuario
	 * @return si es palindroma o no
	 */
	public static boolean esPalindroma(String frase) {

		// boolean esPalindroma: booleana que muestra si una frase es palindroma
		boolean esPalindroma = true;

		// int contador
		int contador = frase.length() - 1;

		// String[] letras: frase dividida en caracteres
		char[] letras = frase.toCharArray();

		// For: comprueba si la frase es palindroma
		for (int i = 0; i < frase.length(); i++) {
			if (letras[i] == ' ') {
				// Si letras[i] esta en blanco, se continuara a una nueva iteracion y no se
				// restara nada
				continue;
			} else if (letras[contador] == ' ') {
				// Si letras[contador] esta en blanco, se restaran 1 a i y contador y se
				// continuara en una nueva iteracion
				i--;
				contador--;
				continue;
			} else if (letras[i] != letras[contador]) {
				// Si letras[i] != letras[contador], esPalindroma sera false y se saldra del
				// bucle
				esPalindroma = false;
				break;
			} else {
				contador--;
			}

		}

		// Devuelve esPalindroma al main
		return esPalindroma;

	}

}
