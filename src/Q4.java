import java.text.SimpleDateFormat;
import java.util.Date;

public class Q4 {
    static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM YYYY");
        System.out.println(simpleDateFormat.format(today));
    }
}
