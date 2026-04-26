import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your First name:");
        String f_Name = scanner.next();

        System.out.print("Enter your Middle name:");
        String m_Name = scanner.next();

        System.out.print("Enter your Last name:");
        String l_Name = scanner.next();

        System.out.println(l_Name+","+f_Name+" "+m_Name.substring(0,1)+".");

    }
}
