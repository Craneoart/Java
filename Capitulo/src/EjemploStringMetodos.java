public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Craneo";
        //Metodos mas importantes del String
        System.out.println("nombre.length() = " + nombre.length());//Conocer cuantos caracteres tiene (arreglo de caracteres) 
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());//Convierte a mayúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());//convierte a minusculas
        System.out.println("nombre.equals(\"Craneo\") = " + nombre.equals("Craneo"));//Comparar cadena y retorna Boolean
        System.out.println("nombre.equals(\"craneo\") = " + nombre.equals("craneo"));//
        System.out.println("nombre.equalsIgnoreCase(\"craneo\") = " + nombre.equalsIgnoreCase("craneo"));//Ignora mayúsculas y minusculas
        System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("Craneo"));//Realiza una comparación de tipo orden lexico gráfico (basado en Unicode)
        System.out.println("nombre.charAt(0) = " + nombre.charAt(3));//Retorna el elemento en la posición que se coloca.
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));//De esta forma obtengo la última posición de forma dinámica
        System.out.println("nombre.substring(1) = " + nombre.substring(1));//Extrae los elementos de la posición colocada en adelante.
        System.out.println("nombre.substring(1) = " + nombre.substring(1, 4));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a",".") );//Reemplaza un caracter por otro.
        //Solo retorna una nueva instancia, la original no cambia.
        System.out.println("trabalenguas = " + trabalenguas.indexOf('a'));//Recibe un caracter o char y retorna la posición donde encuentra ese caracter
        System.out.println("trabalenguas = " + trabalenguas.indexOf("len"));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('z'));//última posición, si no encuentra el carcater retorna un -1
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("traba"));// Retorna un booleano y solo recibe una cadena.
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));//Comienza con... Retorna un booleano. 
        System.out.println("trabalenguas.endsWith(\"sdsd\") = " + trabalenguas.endsWith("sdsd"));
        System.out.println("  trabalenguas  ".trim());//Quita los espacios en blanco.

    }
}
