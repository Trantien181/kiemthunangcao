package folderTest;
import org.junit.jupiter.api.Test;
import trantien.com.service.ServiceBai6;

import static org.junit.jupiter.api.Assertions.*;
public class TestBai6 {
    @Test
    void testFindMin_ValidArray() {
        int[] array = {4, 2, 7, 1, 9};
        assertEquals(1, ServiceBai6.findMin(array));
    }

    @Test
    void testFindMin_EmptyArray() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> {
            ServiceBai6.findMin(array);
        });
    }
}
