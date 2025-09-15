public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder();
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500 = > 1ms
            //c += a + b + "\n"; // 500 => 19 ms
            sb.append(a).append(b).append("\n"); // 0 ms, este es el más eficiente
            //Este es un encadenamiento de metodos.
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());

    }
}
