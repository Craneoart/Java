public class PrimitivosEnteros {

    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en BITES a " + Byte.SIZE);
        System.out.println(" Valor MAXIM de un byte " + Byte.MAX_VALUE);
        System.out.println(" Valor MINIM de un byte " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en BYTE a " + Short.BYTES);
        System.out.println("Tipo short corresponde en BITES a " + Short.SIZE);
        System.out.println(" Valor MAXIM de un SHORT " + Short.MAX_VALUE);
        System.out.println(" Valor MINIM de un SHORT " + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroShort = " + numeroInt);
        System.out.println("Tipo int corresponde en BYTE a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en BITES a " + Integer.SIZE);
        System.out.println(" Valor MAXIM de un int " + Integer.MAX_VALUE);
        System.out.println(" Valor MINIM de un int " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L; //Super entero, se debe agregar la letra L, se convierte la literal de tipo long

        System.out.println("numeroShort = " + numeroInt);
        System.out.println("Tipo long corresponde en BYTE a " + Long.BYTES);
        System.out.println("Tipo long corresponde en BITES a " + Long.SIZE);
        System.out.println(" Valor MAXIM de un long " + Long.MAX_VALUE);
        System.out.println(" Valor MINIM de un long " + Long.MIN_VALUE);

        float numeroFloat;  //Tipo de dato de precision simple


        double numeroDouble; //Tipo de dato de precision compleja

        var numeroVar = 9223372036854775807F;

    }
}
