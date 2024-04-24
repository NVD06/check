import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class test {

    public void testOddEvenOutput() {
        // Arrange
        Main main = new Main();
        
        // Act & Assert
        assertEquals("1 là số lẻ.", main.getNumberType(1));
        assertEquals("2 là số chẵn.", main.getNumberType(2));
        assertEquals("3 là số lẻ.", main.getNumberType(3));
        assertEquals("4 là số chẵn.", main.getNumberType(4));
        assertEquals("5 là số lẻ.", main.getNumberType(5));
    }
}


