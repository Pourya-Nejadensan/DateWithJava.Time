import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        // Step 1

        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("Current date and time: " + nowTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // Step 2

        LocalDate newDate = nowTime.toLocalDate().plusWeeks(2);
        System.out.println("Date after 2 weeks: " + newDate);

        // Step 3

        LocalDate specifiedDate = LocalDate.of(2024, 12, 31);
        if (nowTime.toLocalDate().isBefore(specifiedDate)) {
            System.out.println("Current date is before " + specifiedDate);
        } else {
            System.out.println("Current date is after " + specifiedDate);
        }

        // Step 4

        LocalDate date1 = LocalDate.of(2024, 1, 1);
        LocalDate date2 = LocalDate.of(2024, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Days between " + date1 + " and " + date2 + ": " + daysBetween);

    }
}
