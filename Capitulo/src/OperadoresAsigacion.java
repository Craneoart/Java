public class OperadoresAsigacion {
    public static void main(String[] args) {

        int i = 5;// El = es una asignación tradicional
        int j = i + 4;

        i += 2;//i = i + 2;
        System.out.println("i = " + i);
        i -= 4;//Asignación compuesta o combinada.
        System.out.println("i = " + i);

        j *= 3; //j =j * 3;
        System.out.println("j = " + j);
        
        String sqlString = "select * from clientes c ";
        sqlString += "where cliente = 22099;";//Se 
        System.out.println("sqlString = " + sqlString);
    }
}
