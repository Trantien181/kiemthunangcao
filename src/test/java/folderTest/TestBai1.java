package folderTest;
import org.junit.jupiter.api.Test;
import trantien.com.service.ServiceBai1;

import static org.junit.jupiter.api.Assertions.*;
public class TestBai1 {
    @Test
    void testMultiply_PositiveNumbers() {
        assertEquals(20, ServiceBai1.multiply(4, 5));
    }

    @Test
    void testMultiply_NegativeNumbers() {
        assertEquals(20, ServiceBai1.multiply(-4, -5));
    }

    @Test
    void testMultiply_PositiveNegative() {
        assertEquals(-15, ServiceBai1.multiply(3, -5));
    }

    @Test
    void testMultiply_Zero() {
        assertEquals(0, ServiceBai1.multiply(0, 7));
    }

    @Test
    void testMultiply_LargeNumbers() {
        assertEquals(1000000, ServiceBai1.multiply(1000, 1000));
    }

    @Test
    void testMultiply_SmallNumbers() {
        assertEquals(1, ServiceBai1.multiply(1, 1));
    }

    @Test
    void testMultiply_MaxInteger() {
        assertEquals(Integer.MAX_VALUE, ServiceBai1.multiply(Integer.MAX_VALUE, 1));
    }

    @Test
    void testMultiply_MinInteger() {
        assertEquals(Integer.MIN_VALUE, ServiceBai1.multiply(Integer.MIN_VALUE, 1));
    }

    @Test
    void testMultiply_LargeNegativeNumbers() {
        assertEquals(-1000000, ServiceBai1.multiply(-1000, 1000));
    }

    @Test
    void testMultiply_NegativeZero() {
        assertEquals(0, ServiceBai1.multiply(-5, 0));
    }
}
