package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);
        System.out.println(tanggal.getTime());

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
    }
}
