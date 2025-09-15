import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4;

        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j);

        int resta = i - j;
        System.out.println("resta = " + resta);

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        int divicion = i / j;
        float divicion2 = (float) i / (float) j;
        System.out.println("divicion = " + divicion);
        System.out.println("divicion2 = " + divicion2);
        
        int resto = i % j;//Modulo o resto, se usa para obtener números pares o impares
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero"));
        if(numero % 2 == 0){ // si es divisible por dos y no hay resto es par.
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}
                     