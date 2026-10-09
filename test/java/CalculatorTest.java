
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(15, c.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, c.multiply(10, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, c.divide(10, 5));
    }
}
