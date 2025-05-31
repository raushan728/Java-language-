import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterExample {

    public static void main(String[] args) {
        // Create a LocalDate object for the current date
        LocalDate date = LocalDate.now();
        
        // Create a DateTimeFormatter with a custom pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        // Format the LocalDate to a String
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
        
        // Parse the formatted String back to a LocalDate
        LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);
        System.out.println("Parsed Date: " + parsedDate);
    }
}
