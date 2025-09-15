public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento
        int i = 1;
        int j = ++i;
        System.out.println("Pre incremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post incremento
        i = 2;
        j = i++;
        System.out.println("Post incremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        i = 5;
        j = --i;// i = i - 1 = 4
        System.out.println("Pre decremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento
        System.out.println("Post incremento");
        i = 4;
        j = i--;// primero se asigna y despúes se decrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j)  = " + (++j));
        System.out.println("(j++) = " + (j++));//Aquí primero se imprime y después se incrementa, por lo que j = 6
        System.out.println("j = " + j);//


    }
}
