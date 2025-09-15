public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';//String es un conjunto de caracteres, no se puede agregar más de un caracter
        var decimal = 64;
        System.out.println("args = " + caracter);
        System.out.println("decimal " + decimal);
        System.out.println("¿decimal = caracter? " + (caracter == decimal)); //Presendencia de la operacion, se define con los parentesis para determinar que soluciona primero;

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("¿simbolo = caracter? " + (simbolo == decimal));

        char espacio = ' ';
        char espacioUnicode = '\u0020'; //Es lo mismo que ' ' pero en codigo Unicode
        char retroceso = '\b';// En Unicode
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Char correspondiente en \u0040 byte:" + nuevaLinea + retornoCarro + Character.BYTES);
        System.out.println("Linea separador:" + System.lineSeparator() + Character.BYTES);
        System.out.println("Char correspondiente en bites = " + Character.SIZE);
        System.out.println("Char MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Char MAX_VALUE = " + Character.MAX_VALUE);

    }

}
