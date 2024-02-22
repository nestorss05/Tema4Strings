package ejercicio02;

import java.util.Scanner;

/**
 * Codigo principal del Ejercicio 2 del Boletin 1 del Tema 4.2
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Se le pedira al usuario una contraseña y debera acertarla. Si no acierta, se
	 * le informara si es mayor o menor alfabeticamente
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String contraseña: contraseña a adivinar
		String contraseña;
		
		// String respuesta: respuesta del usuario
		String respuesta;
		
		// boolean acceso: define si el usuario tendra acceso o no
		boolean acceso = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Inserta la contraseña
		System.out.println("Inserta una contraseña");
		contraseña = sc.next();

		// Pide la contraseña al otro usuario
		do {
			System.out.println("Introduce la contraseña");
			respuesta = sc.next();
			if (respuesta.equals(contraseña)) {
				System.out.println("Acceso concedido");
				acceso = true;
			} else {
				System.out.println("Contraseña incorrecta.");
				System.out.println("Caracteres que faltan: " + respuesta.compareTo(contraseña));
			}
		} while (!acceso);

		// Cierra el Scanner
		sc.close();

	}

}
