package tamgiac;

import org.junit.*; // Sử dụng org.junit.jupiter.api.Test thay vì org.junit.Test

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class tamgiactest  {

    @Test
    public void testIsTriangle() {
        assertTrue(tamgiac.isTriangle(3, 4, 5));  // Valid triangle
        assertTrue(tamgiac.isTriangle(5, 12, 13)); // Valid triangle
        assertTrue(tamgiac.isTriangle(8, 15, 17)); // Valid triangle

        assertFalse(tamgiac.isTriangle(1, 2, 3)); // Not a triangle
        assertFalse(tamgiac.isTriangle(5, 10, 25)); // Not a triangle
    }

    @Test
    public void testMain() {
        String input = "3\n4\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        tamgiac.main(new String[]{});

        assertEquals("Enter side 1: \nEnter side 2: \nEnter side 3: \nThis is a triangle.\n", outContent.toString());
    }
}
