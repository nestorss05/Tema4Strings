package ejercicio03;

/**
 * Clase EspaciosEnBlanco
 * 
 * @author Nestor Sanchez
 */
public class EspaciosEnBlanco {

	/**
	 * Funcion int analizar: analiza cuantos espacios en blanco hay
	 * 
	 * @param frase:            frase a analizar
	 * @param espaciosEnBlanco: cantidad de espacios en blanco de la frase
	 * @return cuantos espacios en blanco hay en la frase
	 */
	public static int analizar(String frase, int espaciosEnBlanco) {
		
		// char[] letras: la frase dividida en letras
		char[] letras = frase.toCharArray();
		
		// For: ve analizando letra por letra por un espacio en blanco
		for (int i = 0; i<letras.length; i++) {
			if (letras[i]==' ') {
				espaciosEnBlanco++;
			}
		} // Fin For
		
		// Devuelve espaciosEnBlanco al main
		return espaciosEnBlanco;
	}

}
