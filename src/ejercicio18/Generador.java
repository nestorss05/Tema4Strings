package ejercicio18;

/**
 * Clase Generador
 * 
 * @author Nestor Sanchez
 */
public class Generador {

	/**
	 * Funcion crearPagina: funcion que creara el codigo para la pagina web
	 * 
	 * @param titulo:    titulo de la pagina web
	 * @param contenido: contenido de la pagina web
	 * @return: codigo completo de la pagina web
	 */
	public static String crearPagina(String titulo, String contenido) {

		// String codigoFinal: codigo resultante de la pagina
		String codigoFinal;

		// Añade el titulo con sus etiquetas
		titulo = "<h1>" + titulo + "</h1>";

		// Añade el contenido con sus etiquetas
		contenido = "<p>" + contenido + "</p>";

		// Mete el resto de etiquetas y todo el contenido en codigoFinal
		codigoFinal = "<html>" + "<body>" + titulo + contenido + "</body>" + "</html>";

		// Devuelve codigoFinal al main
		return codigoFinal;

	}

}
