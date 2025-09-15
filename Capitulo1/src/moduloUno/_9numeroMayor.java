package moduloUno;

import javax.swing.JOptionPane;

public class _9numeroMayor {
	
	public static void main (String[] args) {
        String numeroA;
        String numeroB;
        String numeroC;
        double a;
        double b;
        double c;

        numeroA = JOptionPane.showInputDialog(null, "Introduce el primer numero: ");
        numeroB = JOptionPane.showInputDialog(null, "Introduce el segudo numero: ");
        numeroC = JOptionPane.showInputDialog(null, "Introduce el segudo numero: ");

       a = Double.parseDouble(numeroA);
       b = Double.parseDouble(numeroB);
       c = Double.parseDouble(numeroC);

        if ( a > b ){
            if ( a > c ) JOptionPane.showMessageDialog(null, "El numero mayor es el primero: " + numeroA );
        } else if (b > c ) JOptionPane.showMessageDialog(null, "El numero mayor es el segundo: " + numeroB );
        else JOptionPane.showMessageDialog(null, "El numero mayor es el tercero: " + numeroC);
    }
}