import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string with exclamation mark:");
        String userInput = scanner.nextLine();

        int indexOfexclamationMark = userInput.indexOf("!");
        System.out.println(userInput.substring(0,indexOfexclamationMark));
        int temp = indexOfexclamationMark+1;
        System.out.println(userInput.substring(temp));


    }
}
