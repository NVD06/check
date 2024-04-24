package ngay;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class NextDateTest {
    @Test
    public void testNextDate() {
        NextDate nextDate = new NextDate(31, 12, 2012);
        assertEquals(LocalDate.of(2013, 1, 1), nextDate.getNextDate());

        nextDate = new NextDate(28, 2, 2012);
        assertEquals(LocalDate.of(2012, 2, 29), nextDate.getNextDate());

        nextDate = new NextDate(28, 2, 2011);
        assertEquals(LocalDate.of(2011, 3, 1), nextDate.getNextDate());
        
    }
}
