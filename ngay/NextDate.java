package ngay;
import java.time.LocalDate;

public class NextDate {
    private int day;
    private int month;
    private int year;

    public NextDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public LocalDate getNextDate() {
        LocalDate date = LocalDate.of(year, month, day);
        return date.plusDays(1);
    }
}
