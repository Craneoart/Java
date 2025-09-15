package moduloUno;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class _3ejerciciosPracticos {

		public static void main(String[] args) {

			System.out.println("Que onda, prueba de recien nacido");
			
			//Estos son tipos de datos primitivos. 
			short a = 4;
			short b = 4;
			int total;
			total = a + b;	
			
			//Estos tipos de datos son objetos 
			String nombreMarca = "Craneoart";
			String nombreMarcaDos = "Craneo";
			// Date fechaInicio = '2012.10.23';
			
			System.out.println(total);

			System.out.println();
			teoremaPitagoras(a,b);
			usoDeCadenas(nombreMarca);
			extraerCadena(nombreMarca);
			compararCadena(nombreMarca, nombreMarcaDos);
					
		}
		
		public static double teoremaPitagoras (double a,double b) {
			
			System.out.println("*****Teorema de pitagoras******");
			DecimalFormat formato = new DecimalFormat("##.##");
			double c;
			a = Math.pow(4,2);
			b = Math.pow(4,2);
			c = Math.sqrt(a + b);
			System.out.println("Resultado raíz uno: " + formato.format(c));
			System.out.println();
			return c;
		}
		
		public static void usoDeCadenas (String cadena) {
			//Metodo para obtener el tamaño de una cadena
			
			int ultimaLetra;
			System.out.println("*******Cadenas de texto*****");
			System.out.println("Numero de letras en la palabra " + cadena + " es: " + cadena.length());
			System.out.println("La primer letra en la palabra " + cadena + " es: " + cadena.charAt(0) ); 
			ultimaLetra = cadena.length();
			System.out.println("La ultima letra es " + cadena.charAt(ultimaLetra - 1));
			System.out.println();
					 
		}
		
		public static void extraerCadena (String cadena) {
			//Metodo para extraer caracteres de una cadena
			
			System.out.println("****Estraer caracteres de una cadena de texto***");
			System.out.println("Extración letra 2: " + cadena.substring(2));
			System.out.println("Extrae letra 6 a 9: " + cadena.substring(6,9));
			System.out.println();

		}
		
		public static void compararCadena (String cadena, String cadenaDos) {
			
			System.out.println("Son Iugales las cadeas " + cadena + " " + cadenaDos + " ? " + cadena.equalsIgnoreCase(cadenaDos));
		}
		
		public Date fechas (int anho, int mes, int dia) {
			GregorianCalendar calendario = new GregorianCalendar(anho, mes-1, dia);
			
			Date fecha = null;
			
			System.out.print(fecha);
			return fecha=(Date) calendario.getTime();
			
		}
}
