package ejercicio18;

import java.util.Scanner;

/**
 * Clase MainCode
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Funcion main: pide al usuario titulo y contenido de pagina y llama a la
	 * funcion crearPagina para crear la pagina web
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String titulo: titulo de la pagina
		String titulo;

		// String contenido: contenido de la pagina
		String contenido;

		// String codigoPagina: codigo final de la pagina web
		String codigoPagina;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario el titulo y el contenido de la web
		System.out.println("Inserta un titulo para tu pagina");
		titulo = sc.nextLine();
		System.out.println("Inserta el contenido para tu pagina");
		contenido = sc.nextLine();

		// Llama a la funcion Generador.crearPagina y guardala en codigoPagina
		codigoPagina = Generador.crearPagina(titulo, contenido);

		// Muestra codigoPagina por pantalla
		System.out.println(codigoPagina);

		// Cierra el Scanner
		sc.close();

	}

}
