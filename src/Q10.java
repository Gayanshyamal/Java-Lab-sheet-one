import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you odd String");
        String name = scanner.next();
        int size_S = name.length();

        if ((size_S % 2 == 1)) {

            int Middle_C = size_S/2;
            System.out.println(name.substring(Middle_C,Middle_C+1));
        }
        else
            System.out.println("Even");
    }
}
