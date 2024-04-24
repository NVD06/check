package tamgiac;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class tamgiactest {
    @Test
    public void testClassifyTriangle() {
        assertEquals("Equilateral", tamgiac.classifyTriangle(5, 5, 5));
        assertEquals("Isosceles", tamgiac.classifyTriangle(5, 5, 3));
        assertEquals("RightTriangle", tamgiac.classifyTriangle(3, 4, 5));
        assertEquals("NotATriangle", tamgiac.classifyTriangle(1, 2, 3));
    }
}
