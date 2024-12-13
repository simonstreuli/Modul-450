import org.junit.jupiter.api.Test;

import com.example.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(-1.0, calculator.add(-2, 1), "-2 + 1 should equal -1");
        assertEquals(0.0, calculator.add(0, 0), "0 + 0 should equal 0");
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, calculator.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(-3.0, calculator.subtract(-2, 1), "-2 - 1 should equal -3");
        assertEquals(0.0, calculator.subtract(0, 0), "0 - 0 should equal 0");
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(-2.0, calculator.multiply(-2, 1), "-2 * 1 should equal -2");
        assertEquals(0.0, calculator.multiply(0, 5), "0 * 5 should equal 0");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(-2.0, calculator.divide(-6, 3), "-6 / 3 should equal -2");
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0), "Division by zero should throw exception");
    }
}
