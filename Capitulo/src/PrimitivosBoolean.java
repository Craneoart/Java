public class PrimitivosBoolean  {
    public static void main(String[] args) {
        
            boolean datoLogico = Boolean.FALSE;
        System.out.println("datoLogico = " + datoLogico);

        double d = 23784.34e-3; // 23.78434
        float f = 1.2132e2f; // 121.32
        
        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);
    }
}
