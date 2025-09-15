import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "craneoart";
        String password = "asd123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingresa el password");
        String p = scanner.next();

        boolean autenticado = false;

        if (u.equals(username) && p.equals(password)){
            System.out.println("Bienvenido ".concat(u));
        }else{
            System.out.println("User o pass incorrecto");
        }
    }
}
