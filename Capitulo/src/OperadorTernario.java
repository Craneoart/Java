import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condición ? si es verdadero: si es falso;
        String variable = 7 == 5 ? "Es verdadero" : "Es falso";
        System.out.println("variable = " + variable);

        String estado = "";

        double promedio = 0, matematicas ,ciencias ,historia = 0.0;
        Scanner s = new Scanner(System.in);

        System.out.println(" Calificación Matematicas: ");
        matematicas = s.nextDouble();

        System.out.println(" Calificación Ciencias Naturales: ");
        ciencias = s.nextDouble();

        System.out.println(" Calificación Historia: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 8 ? "Haz aprobado!, Tú muy bien." : "Reprobaste! Esfuérzate más :(";
        System.out.println(estado);
    }
}
