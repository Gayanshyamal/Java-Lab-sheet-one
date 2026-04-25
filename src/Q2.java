import javax.swing.*;
import java.util.Scanner;

public class Q2  {
    static void main() {

        Scanner u_name = new Scanner(System.in);// use to get user input
        System.out.println("Enetr your first_name");
        String f_name = u_name.next();// use to store user input
        System.out.println("Enetr your last_name");
        String l_name = u_name.next();

        JFrame myWindow = new JFrame();
        myWindow.setSize(800,600);
        myWindow.setVisible(true);
        myWindow.setTitle(f_name+" "+l_name);
    }
}
