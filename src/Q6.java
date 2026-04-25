import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr your window Width:");
        int W = scanner.nextInt();
        System.out.println("Enetr your window Hight:");
        int H = scanner.nextInt();
        System.out.println("Enetr your window Title:");
        String windowT = scanner.nextLine();// can see every thing type as title(Add spacce)

        JFrame myWindow = new JFrame();
        myWindow.setSize(W,H);
        myWindow.setVisible(true);
        myWindow.setTitle(windowT);


    }
}
