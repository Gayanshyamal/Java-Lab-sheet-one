import java.util.Scanner;

public class Q3 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String f_name = scanner.next();
        System.out.println("Enter your middle name:");
        String m_name = scanner.next();
        System.out.println("Enter your last name:");
        String l_name = scanner.next();

        System.out.println(f_name+" "+m_name.substring(0,1)+"."+" "+l_name);

    }
}
