import java.util.GregorianCalendar;

public class Lab4_2_64010792 {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        long MILLISECONDS_PER_DAY = 1000L * 60 * 60 * 24;
        long time = cal.getTimeInMillis();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + cal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + cal.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + cal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + cal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(cal.getTime());
        System.out.println("-----------------------");
        //cal.add(GregorianCalendar.DATE,1);
        cal.setTimeInMillis(time + MILLISECONDS_PER_DAY);
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + cal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + cal.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + cal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + cal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(cal.getTime());
    }

}
