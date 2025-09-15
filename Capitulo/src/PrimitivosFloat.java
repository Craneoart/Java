import java.util.Arrays;

public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 1.5e-4f;//2.12e3f;//2120
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat BYTES= " + Float.BYTES);
        System.out.println("realFloat BITES= " + Float.SIZE);
        System.out.println("realFloat MAX= " + Float.MAX_VALUE);
        System.out.println("realFloat MIN= " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("realDouble BYTES= " + Double.BYTES);
        System.out.println("realDouble BITES= " + Double.SIZE);
        System.out.println("realDouble MAX= " + Double.MAX_VALUE);
        System.out.println("realDouble MIN= " + Double.MIN_VALUE);

        var varFlotante = 3.1416;

    }
}
