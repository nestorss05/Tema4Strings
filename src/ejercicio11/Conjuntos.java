package ejercicio11;

/**
 * Clase Conjuntos
 * 
 * @author Nestor Sanchez
 */
public class Conjuntos {

	/**
	 * Funcion donde se modificara o no el caracter pasado a la funcion
	 * 
	 * @param conjunto1: conjunto de letras sin codificar
	 * @param conjunto2: conjunto de letras codificadas
	 * @param c:         caracter a modificar
	 * @return caracter modificado
	 */
	public static char codificador(char[] conjunto1, char[] conjunto2, char c) {

		// For: analiza los arrays conjunto1[] y conjunto2[] para asi asignar c
		for (int i = 0; i < conjunto1.length; i++) {

			// If: si c es igual a conjunto1[i], se asignara c y se saldra del bucle
			if (c == conjunto1[i]) {
				c = conjunto2[i];
				break;
			} // Fin If

		} // Fin For

		// Devuelve c al main
		return c;

	}

}
