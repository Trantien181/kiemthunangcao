package trantien.com.service;

public class ServiceBai4 {
    public class ArrayUtils {
        public static int getElementAtIndex(int[] array, int index) {
            if (index < 0 || index >= array.length) {
                throw new IndexOutOfBoundsException("Index is out of range");
            }
            return array[index];
        }
    }

}
