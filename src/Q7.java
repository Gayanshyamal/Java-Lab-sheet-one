import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {

        Date time = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss a");
        System.out.println(simpleDateFormat.format(time));
    }
}
