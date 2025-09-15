package moduloUno;

import java.util.Scanner;

public class _4sumaDosNumeros{


    public static void main (String[] args) {
            //1. Programa Java que lea dos nï¿½meros enteros por teclado y los muestre por pantalla.
        
            //Declaraciï¿½n de variables
        int n1;
        int n2; 
        try (//System. in se utliza para especificar por donde ingresara informaciï¿½n 
        Scanner scanner = new Scanner(System.in)) {
            //Leer datos 
            System.out.println("¿Cual es el primer numero a sumar?");
            n1 = scanner.nextInt();
            System.out.println("¿Y el segundo a sumar?");
            n2 = scanner.nextInt();
        }
            
        //Impreciï¿½n resultado
        System.out.println("Resultado : " + (n1 + n2));

        }
    }