package moduloUno;

import java.util.Scanner;

public class _12arrayBasico {
    /*
3. Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
Tambien muestra los alumnos con notas superiores a la media. El numero de alumnos se lee por teclado.
Este programa utiliza un array de elementos de tipo double que contendr las notas de los alumnos.
El tama�o del array ser� el n�mero de alumnos de la clase, por lo tanto primero se pedira por teclado el n�mero de alumnos y a continuaci�n se crear� el array.
Se realizan 3 recorridos sobre el array, el primero para asignar a cada elemento las notas introducidas por teclado, 
el segundo para sumarlas y calcular la media y el tercero para mostrar los alumnos con notas superiores a la media.
*/
	
	public static void main (String[] args) {
		
		int noAlumnos;
		int [] listAlumnos;
		double suma = 0, media;
		int i;
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Coloca cuantos burros hay que calificar : ");
			noAlumnos = s.nextInt();
		} while (noAlumnos < 0);
		
		double[] calificaciones = new double[noAlumnos];
		
		for (i = 0; i < calificaciones.length; i++) {
			System.out.println("Teclea la calificaci�n del alumno " + (i + 1)+ " : ");
			calificaciones[i] = s.nextDouble();
		}
		
		//Suma de todas las calificaciones 
		for (i = 0; i <calificaciones.length; i++) {
			suma = suma + calificaciones[i];
		}
		
		//calcular la media 
		media = suma / calificaciones.length;
		
		System.out.printf("La calificaci�n media es de: ", + media);
		
		//Mostrar las calificaciones encima de la media 
		System.out.println("Estas son las calificaciones arriba del promedio: ");
		for (i = 0; i<calificaciones.length; i++) {
			if (calificaciones[i] > media) System.out.println("Alumno " + (i + 1) + " calificaci�n de: " + calificaciones[i]);
		}
	}
}
