package folderTest;
import org.junit.jupiter.api.Test;
import trantien.com.service.ServiceBai2;

import static org.junit.jupiter.api.Assertions.*;
public class TestBai2 {
    @Test
    void testDivide_PositiveNumbers() {
        assertEquals(2, ServiceBai2.divide(10, 5));
    }

    @Test
    void testDivide_NegativeNumbers() {
        assertEquals(2, ServiceBai2.divide(-10, -5));
    }

    @Test
    void testDivide_PositiveNegative() {
        assertEquals(-2, ServiceBai2.divide(10, -5));
    }

    @Test
    void testDivide_ZeroNumerator() {
        assertEquals(0, ServiceBai2.divide(0, 5));
    }

    @Test
    void testDivide_LargeNumbers() {
        assertEquals(1000, ServiceBai2.divide(1000000, 1000));
    }

    @Test
    void testDivide_SmallNumbers() {
        assertEquals(1, ServiceBai2.divide(1, 1));
    }

    @Test
    void testDivide_MaxInteger() {
        assertEquals(Integer.MAX_VALUE / 2, ServiceBai2.divide(Integer.MAX_VALUE, 2));
    }

    @Test
    void testDivide_MinInteger() {
        assertEquals(Integer.MIN_VALUE / 2, ServiceBai2.divide(Integer.MIN_VALUE, 2));
    }

    @Test
    void testDivide_LargeNegativeNumbers() {
        assertEquals(-1000, ServiceBai2.divide(-1000000, 1000));
    }

    @Test
    void testDivide_ByZero() {
        assertThrows(ArithmeticException.class, () -> ServiceBai2.divide(5, 0));
    }
}
