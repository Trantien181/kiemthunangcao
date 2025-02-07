package trantien.com.service;
import java.util.Arrays;
public class ServiceBai6 {
    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        return Arrays.stream(array).min().getAsInt();
    }
}
