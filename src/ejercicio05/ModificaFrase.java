package ejercicio05;

/**
 * 
 * @author Nestor Sanchez
 */
public class ModificaFrase {
	
	public static String Invertir(String frase) {

		// String fraseFinal: frase invertida que se devolvera al main
		String fraseFinal = "";
		
		// Char c: caracteres que se iran acumulando a fraseFinal
		char c;
		
		// For: invierte la frase
		for (int i = frase.length()-1; i >= 0; i--) {
			c = frase.charAt(i);
			System.out.println(c);
			fraseFinal = fraseFinal + c;
		} // Fin For
		
		// Devuelve frase al main
		return fraseFinal;

	}

}