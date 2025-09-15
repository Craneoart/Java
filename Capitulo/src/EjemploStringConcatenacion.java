public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Jesucristo ";

        String detalle = curso + " Con el profe: " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));//Concatena y no suma, por la precedencia de los operadores
        //Al tener primero un String concatena, con () se separa este proceso.

        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(profesor);
        System.out.println(detalle2); // Los String son inmutables, no cambian, solo se van instanciando en nuevas variables.
    }
}
