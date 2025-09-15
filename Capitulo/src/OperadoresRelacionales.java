public class OperadoresRelacionales {

    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j; // Esta comparación solo es entre PRIMITIVOS, al no ser objetos se pueden comparar así
        System.out.println("b1 = " + b1);

        //Para comprar dos objetos, se comparan por instancias. Con el método equals

        boolean b2 = !b1;//Con ! invertimos el valor
        System.out.println("b2 = " + b2);
    }
}
