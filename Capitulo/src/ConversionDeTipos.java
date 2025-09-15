public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int enteroInt = Integer.parseInt(numeroStr);
        System.out.println("enteroInt = " + enteroInt);

        String realStr = "98765.43e-3";
        double realDoule = Double.parseDouble(realStr);
        System.out.println("realDoule = " + realDoule);

        String logicoStr = "TRUE";//Se puede colocar un 0,1 - TRUE,FALSE,
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otroRealStr = " + otroRealStr);

        //Conversion de primitivos a primitivos
        int i = 100002728;
        short s = (short)i;//Con cast forzamos la conversión. Int es mas grande que short
        System.out.println("s = " + s);//Si el Int sobre pasa el tamaño max del short se crea ambiguedad
        long l = i;
        System.out.println("l = " + l);
        //El cast solo se puede aplicar al mismo tipo de dato numericos...
    }
}
