import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date_And_Time {

    public static void main(String[] args) {
        // LocalDate: Represents only the date (yyyy-MM-dd)
        LocalDate date = LocalDate.now();
        System.out.println("// LocalDate (current date): " + date);

        // LocalTime: Represents only the time (HH:mm:ss.nnn)
        LocalTime time = LocalTime.now();
        System.out.println("// LocalTime (current time): " + time);

        // LocalDateTime: Represents both date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("// LocalDateTime (current date & time): " + dateTime);

        // ZonedDateTime: Represents date and time with timezone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("// ZonedDateTime (with system timezone): " + zonedDateTime);

        // ZonedDateTime with specific time zone
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("// ZonedDateTime (Asia/Kolkata): " + indiaTime);

        // Instant: Represents a moment in UTC (timestamp)
        Instant instant = Instant.now();
        System.out.println("// Instant (UTC timestamp): " + instant);

        // Duration: Represents time-based amount (difference between two times)
        Duration duration = Duration.ofMinutes(90); // 1 hour 30 minutes
        System.out.println("// Duration (90 minutes): " + duration);

        // Period: Represents date-based amount (difference between two dates)
        Period period = Period.ofYears(1).plusMonths(2).plusDays(10);
        System.out.println("// Period (1 year, 2 months, 10 days): " + period);

        // Formatting Date and Time using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("// Formatted LocalDateTime: " + formattedDateTime);

        // Parsing a date string to LocalDate
        String dateStr = "2025-05-27";
        LocalDate parsedDate = LocalDate.parse(dateStr);
        System.out.println("// Parsed LocalDate from String: " + parsedDate);

        // Some useful methods with LocalDate
        LocalDate specificDate = LocalDate.of(2023, 12, 31);
        System.out.println("// LocalDate.of(2023, 12, 31): " + specificDate);

        LocalDate plusDays = date.plusDays(10);
        System.out.println("// date.plusDays(10): " + plusDays);

        LocalDate minusMonths = date.minusMonths(2);
        System.out.println("// date.minusMonths(2): " + minusMonths);

        boolean isLeap = date.isLeapYear();
        System.out.println("// date.isLeapYear(): " + isLeap);

        // Comparing dates
        boolean isBefore = date.isBefore(specificDate);
        System.out.println("// date.isBefore(specificDate): " + isBefore);

        boolean isAfter = date.isAfter(specificDate);
        System.out.println("// date.isAfter(specificDate): " + isAfter);
    }
}
