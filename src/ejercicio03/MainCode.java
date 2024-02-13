package ejercicio03;

import java.util.Scanner;

/**
 * Clase Main
 * @author Nestor Sanchez
 */
public class MainCode {
	
	/**
	 * Funcion Main: asigna valores predeterminados y pide al usuario una frase
	 * @param args
	 */
	public static void main(String[] args) {
		
		String frase;
		int espaciosEnBlanco = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte una frase");
		frase = sc.nextLine();
		System.out.println(EspaciosEnBlanco.analizar(frase, espaciosEnBlanco));
		sc.close();
		
	}

}