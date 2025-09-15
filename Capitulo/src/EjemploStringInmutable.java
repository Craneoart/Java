import java.util.Arrays;

public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = " Jesucristo ";

      String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        //Esta es una expresión lambda
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        // Los objetos de tipo String son inmutables, solo se reemplaza una instanciá por otra.
    }
}
