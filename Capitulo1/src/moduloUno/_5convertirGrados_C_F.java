package moduloUno;

import java.util.Scanner;

public class _5convertirGrados_C_F {
	public static void main (String[] args) {
		/*Ejercicio 4: Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
		La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
		F = 32 + ( 9 * C / 5)*/

		double gCentigrados; 
		double gFahrenheit; 
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("¿Que cantidad de grados qui	eres convertir?");
			gCentigrados = scanner.nextDouble();
		}
		
		gFahrenheit = (32 +(9 * gCentigrados / 5));
		
		System.out.println(gFahrenheit);

		}

}
