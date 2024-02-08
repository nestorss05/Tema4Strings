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
		char[] letras = frase.toCharArray();
		for (int i = 0; i<letras.length; i++) {
			if (letras[i]==' ') {
				espaciosEnBlanco++;
			}
		}
		return espaciosEnBlanco;
	}

}
