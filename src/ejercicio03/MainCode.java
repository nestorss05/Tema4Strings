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
		
		// String frase: frase introducida por el usuario
		String frase;
		
		// int espaciosEnBlanco: cantidad de espacios en blanco
		int espaciosEnBlanco = 0;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario una frase
		System.out.println("Inserte una frase");
		frase = sc.nextLine();
		
		// Llama a la funcion EspaciosEnBlanco.analizar
		System.out.println(EspaciosEnBlanco.analizar(frase, espaciosEnBlanco));
		
		// Cierra el Scanner
		sc.close();
		
	}

}