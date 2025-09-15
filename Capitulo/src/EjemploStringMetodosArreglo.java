public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());//Length es un metodo
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;//Este length es una propiedad del atributo
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++){
            System.out.print(arreglo[i]);
        }
        System.out.println();
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));//Crea un elemento de acuerdo al patron determinado

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for(int  j = 0; j<l; j ++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "foto.demente.jpg";
        String[] archivoArr = archivo.split("\\.");//De esta forma puedo usar el "." ya que es reservado para expresiones regulares.
        int k = archivoArr.length;

        for(int m = 0; m<k; m++){
            System.out.println(archivoArr[m]);
        }

    }
}
