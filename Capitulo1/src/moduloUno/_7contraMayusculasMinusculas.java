package moduloUno;

import java.util.Scanner;

public class _7contraMayusculasMinusculas {
	
	public static void main (String[] args){
        //4 Programa que lea una cadena de texto por teclado y compruebe si es una letra mayúscula

        Scanner scanner = new Scanner(System.in);
        String entrada;
        int mayusculas = 0;
        int minusculas = 0;

        System.out.println("Ingresa la cedana de texto que vamos a checar: ");
        entrada = scanner.nextLine();

        for (int n=0;n<entrada.length();n++){
 
            char c = entrada.charAt(n);
            if (Character.isUpperCase(c)) mayusculas = mayusculas + 1;
            else minusculas = minusculas + 1;
        }

        System.out.println("Mayusuclas: " + mayusculas);
        System.out.println("Minusculas: " + minusculas);        

    }
}
