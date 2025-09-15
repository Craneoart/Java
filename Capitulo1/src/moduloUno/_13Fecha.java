package moduloUno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _13Fecha {

	public static void main (String[] 	args) throws ParseException {
		
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		//Date fechaFtomato = formato.parse(fecha);
		System.out.println("Fecha: " + formato.format(fecha));

		System.out.print("Fecha 2: ");
		String a = "23/10/23";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha2 = sdf.parse(a);
		System.out.print(fecha2);

		
	}
	
}
