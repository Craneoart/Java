package moduloUno;

import javax.swing.JOptionPane;

public class _8comprobarDigito {
	
	public static void main (String[] args) {
		
		String caracter;
		
		caracter = JOptionPane.showInputDialog("Introduce el caracter");
		if (Character.isDigit(caracter.charAt(0))) JOptionPane.showMessageDialog(null,"Es un caracter");
		else JOptionPane.showMessageDialog(null, "No es caracter");
		
	}

}
