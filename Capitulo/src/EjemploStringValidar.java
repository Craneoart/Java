public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = "Programación Java";

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);
        
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);
        
        boolean esBlanco = curso.isBlank();//Válida que no tenga espacios o que el objeto sea nulo, DE jdk 11 en adelante.
        System.out.println("esBlanco = " + esBlanco);

        if (esBlanco == false) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
