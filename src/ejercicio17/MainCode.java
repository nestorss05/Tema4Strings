package ejercicio17;

import java.util.Scanner;

/**
 * Clase MainCode
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Funcion main: pide al usuario una frase y llama a la funcion que quita los
	 * comentarios
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String frase: frase introducida por el usuario
		String frase;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una frase en C
		System.out.println("Inserta una frase en preprocesador de C");
		frase = sc.nextLine();

		// Llama a la funcion Frase.eliminarComentarios
		frase = Frase.eliminarComentarios(frase);

		// Muestra la frase por pantalla
		System.out.println(frase);

		// Cierra el Scanner
		sc.close();

	}

}
