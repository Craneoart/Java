package moduloUno;

import java.util.Scanner;

public class _2blucles_While {
	
	public static void main(String[] args) {
		//*Bucle WHILE 
		
		int noAleatorio = (int) (Math.random() * 100);
		try (Scanner entrada = new Scanner(System.in)) {
			int numero = 0;
			int intentos = 0;
			
			do {
				
				intentos ++;
				System.out.println("En que numero estoy pensando: ");
				numero =  entrada.nextInt();
				
				if (numero > noAleatorio) System.out.println("Más bajo");
				else if (numero < noAleatorio) System.out.println("Más alto");
			}while (numero != noAleatorio);
			System.out.println("***Le has atinado, despues de: " + intentos);
		}
		
	}

}
