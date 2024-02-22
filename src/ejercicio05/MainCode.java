package ejercicio05;

import java.util.Scanner;

/**
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Funcion main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String frase: frase introducida por el usuario
		String frase = "";
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario una frase
		System.out.println("Inserta una frase a invertir");
		frase = sc.nextLine();
		
		// Llama a la funcion ModificaFrase.Invertir
		frase = ModificaFrase.Invertir(frase);
		
		// Muestra la frase por pantalla
		System.out.println(frase);
		
		// Cierra el Scanner
		sc.close();

	}

}
