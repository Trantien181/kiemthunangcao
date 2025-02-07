package folderTest;
import org.junit.jupiter.api.Test;
import trantien.com.service.ServiceBai3;

import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
public class TestBai3 {
    @Test
    void testCalculateAverage_ValidList() {
        assertEquals(3.0, ServiceBai3.calculateAverage(Arrays.asList(2, 3, 4)));
    }

    @Test
    void testCalculateAverage_SingleElement() {
        assertEquals(5.0, ServiceBai3.calculateAverage(Arrays.asList(5)));
    }

    @Test
    void testCalculateAverage_AllZeroes() {
        assertEquals(0.0, ServiceBai3.calculateAverage(Arrays.asList(0, 0, 0)));
    }

    @Test
    void testCalculateAverage_PositiveAndNegative() {
        assertEquals(0.0, ServiceBai3.calculateAverage(Arrays.asList(-2, 2)));
    }

    @Test
    void testCalculateAverage_LargeNumbers() {
        assertEquals(500000.0, ServiceBai3.calculateAverage(Arrays.asList(1000000, 0)));
    }

    @Test
    void testCalculateAverage_OnlyNegatives() {
        assertEquals(-3.0, ServiceBai3.calculateAverage(Arrays.asList(-1, -3, -5)));
    }

    @Test
    void testCalculateAverage_MixedValues() {
        assertEquals(2.5, ServiceBai3.calculateAverage(Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    void testCalculateAverage_MinInteger() {
        assertEquals(Integer.MIN_VALUE, ServiceBai3.calculateAverage(Arrays.asList(Integer.MIN_VALUE)));
    }

    @Test
    void testCalculateAverage_MaxInteger() {
        assertEquals(Integer.MAX_VALUE, ServiceBai3.calculateAverage(Arrays.asList(Integer.MAX_VALUE)));
    }

    @Test
    void testCalculateAverage_EmptyList() {
        assertThrows(ArithmeticException.class, () -> ServiceBai3.calculateAverage(Collections.emptyList()));
    }
}
