import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Instanciando la clase Scanner
        System.out.println("Ingresa un número entero: ");
        //String numeroStr = scanner.nextLine();
        int numericoDecimal = 0;
        try{
            numericoDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        }catch (Exception e){
            System.out.println("Error, debe ingresar un número entero!");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "numero binario de " + numericoDecimal + " = " + Integer.toBinaryString(numericoDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;// Entero decimal, al colocar 0b Java lo interpreta como un numero binario

        String resultadoOctal = "Numero octal de " + resultadoBinario + " = " + Integer.toOctalString(numeroBinario);


        String resultadoHex = "Numero hexadecimal de " + numericoDecimal + " = " + Integer.toHexString(numericoDecimal );

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);
    }
}
