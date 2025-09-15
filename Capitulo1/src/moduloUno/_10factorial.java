package moduloUno;

import java.util.Scanner;

public class _10factorial {

	public static void main (String[] args) {
		
		int numeroEntrada;
		double factorial = 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Coloca un numero mayor a cero, para calcular los factoriales: ");
		numeroEntrada = scanner.nextInt();
		

		for (int i = 1; i < numeroEntrada; i++) {
			factorial *= i;
		}		
		System.out.println( "Resu!= " + factorial );
	}
}
