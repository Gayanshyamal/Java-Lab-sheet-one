import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string:");
        String name = scanner.nextLine();

        int sizeOfString = name.length();
        System.out.println(sizeOfString);
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(sizeOfString-1));
    }
}
