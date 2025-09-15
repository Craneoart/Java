package moduloUno;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _6teoremaDePitagoras {

	/*Ejercicio 3. Programa lea la longitud de los catetos de un triangulo rectangulo y 
	 * calcule la longitud de la hipotenusa segun el teorema de Pitigoras.
	 */
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		double a;
		double b;
		double c;
		try (Scanner scanner = new Scanner(System.in)) {
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
				
			System.out.println("Calculo hipotenusa de un triangulo rectangulo");
			System.out.println("Introduce el lado A del triangulo: ");
			a = scanner.nextDouble();
			System.out.println("Introduce el lado B del triangulo: ");
			b = scanner.nextDouble();
			c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			
			System.out.println("El valor de la Hipotenusa es: " + decimalFormat.format(c));
		}
		
	}

}
