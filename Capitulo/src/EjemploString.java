public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";//Un String es un objeto, es un arreglo. Java internamente crea el new.
        String curso2 = new String("Programación java");
        //Curso y curso2 son objetos diferentes. A pesar de que el contenido es el mismo.

        boolean esIgual = curso == curso2; // La declaración es falsa dado que son objetos diferentes, su contenido si es igual
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2); //Aquí ya se está comparando el contenido y no por referencia.
        System.out.println("esIgual = " + esIgual);

        String curso3 = "Programación Java";
        esIgual =  curso == curso3;//Esta sera true ya que detecta que la instancia es igual y le asigna esa referencia.
                                    // Es el mismo objeto, pero se guarda en distinta variable
        System.out.println("curso3 = " + esIgual);

    }
}
