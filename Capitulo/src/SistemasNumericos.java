import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingresa un número entero");
        int numericoDecimal = 0;
        try{
            numericoDecimal =Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "numero binario de " + numericoDecimal + " = " + Integer.toBinaryString(numericoDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;// Entero decimal, al colocar 0b Java lo interpreta como un numero binario
        System.out.println("NumeroBinario = " + numeroBinario);

        String resultadoOctal = "Numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario);
        int numeroOctal = 0764; // Al colocar un 0 antes Java lo interpreta como un octal.
        System.out.println(resultadoOctal);

        String resultadoHex = "Numero hexadecimal de " + numericoDecimal + " = " + Integer.toHexString(numericoDecimal );
        int numeroHex = 0x1f4; // Con el 0x lo identifica como Hexadecimal
        System.out.println(resultadoHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
