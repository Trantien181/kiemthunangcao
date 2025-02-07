package folderTest;
import org.junit.jupiter.api.Test;
import trantien.com.service.ServiceBai4;

import static org.junit.jupiter.api.Assertions.*;
public class TestBai4 {
    @Test
    void testGetElementAtIndex_ValidIndex() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, ServiceBai4.ArrayUtils.getElementAtIndex(array, 2));
    }

    @Test
    void testGetElementAtIndex_IndexOutOfBounds() {
        int[] array = {1, 2, 3, 4, 5};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ServiceBai4.ArrayUtils.getElementAtIndex(array, 10);
        });
    }
}
