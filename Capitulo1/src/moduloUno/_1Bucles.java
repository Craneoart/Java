package moduloUno;

import javax.swing.JOptionPane;

public class _1Bucles {
	public static void main(String[] args) {

		String clave = "Craneoart";
		String pass = "";
		while (clave.equals(pass) == false) {
			
			pass=JOptionPane.showInputDialog("Dale el pass");
			
			if (clave.equals(pass) == false) {
			JOptionPane.showMessageDialog(null, "La anas regando compi");
			}
			
		}
		JOptionPane.showMessageDialog(null,"Bien, canijo!");
	}
}
