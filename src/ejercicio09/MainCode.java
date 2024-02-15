package ejercicio09;

import java.util.Scanner;

/**
 * Un gran y maravilloso traductor al idioma de Javalandia
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Funcion Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// frase: frase introducida por el usuario
		String frase;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una frase
		System.out.println("TRADUCTOR DE JAVALANDIA");
		System.out.println("Inserta una frase");
		frase = sc.nextLine();

		// If-Else: si la frase contiene sus dialectos, se procedera a traducir la frase
		if (frase.contains("Javalín, javalón" + "\t") || frase.contains("\t" + "javalén, len, len")) {
			frase = frase.replace("Javalín, javalón", "");
			frase = frase.replace("javalén, len, len", "");
			frase = frase.replace("\t", "");
			System.out.println(frase);
		} else {
			System.out.println("ERROR: El mensaje no esta en el idioma de Javalandia");
		} // Fin If-Else

		// Cierra el Scanner
		sc.close();

	}

}
