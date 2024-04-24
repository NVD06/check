import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    @Test
    public void testGetNumberType() {
        Main main = new Main();
        
        assertEquals("le", Main.getNumberType(1));
        assertEquals("chan", Main.getNumberType(2));
        assertEquals("le", Main.getNumberType(3));
        assertEquals("chan", Main.getNumberType(4));
        assertEquals("le", Main.getNumberType(5));
    }
}
