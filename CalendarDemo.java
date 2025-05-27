import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalendarDemo {
    public static void main(String[] args) {
        // Create a Calendar instance representing the current date and time
        Calendar cal = Calendar.getInstance();

        // Get current date and time as a Date object
        Date currentDate = cal.getTime();
        System.out.println("// Current date and time: " + currentDate);

        // Get individual fields from Calendar
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH); // Note: January = 0, December = 11
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println("// Year: " + year);
        System.out.println("// Month (0-based): " + month);
        System.out.println("// Day: " + day);
        System.out.println("// Hour: " + hour);
        System.out.println("// Minute: " + minute);
        System.out.println("// Second: " + second);

        // Set a specific date: 15 August 2025
        cal.set(Calendar.YEAR, 2025);
        cal.set(Calendar.MONTH, Calendar.AUGUST); // or 7 (August is 7, as January is 0)
        cal.set(Calendar.DAY_OF_MONTH, 15);
        Date independenceDay = cal.getTime();
        System.out.println("// Set date to 15 August 2025: " + independenceDay);

        // Add or subtract days, months, years, etc.
        cal.add(Calendar.DAY_OF_MONTH, 10); // Add 10 days
        System.out.println("// Add 10 days: " + cal.getTime());

        cal.add(Calendar.MONTH, -2); // Subtract 2 months
        System.out.println("// Subtract 2 months: " + cal.getTime());

        // Roll a field (changes field without affecting larger fields)
        cal.set(2025, Calendar.JANUARY, 31); // 31 Jan 2025
        cal.roll(Calendar.MONTH, 1); // Rolls month to Feb, but date stays 31 (may overflow)
        System.out.println("// Roll month by 1: " + cal.getTime());

        // Formatting Calendar date using SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formatted = sdf.format(cal.getTime());
        System.out.println("// Formatted date: " + formatted);

        // Get maximum and minimum values for a field
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int minDay = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
        System.out.println("// Maximum day in current month: " + maxDay);
        System.out.println("// Minimum day in current month: " + minDay);
    }
}
