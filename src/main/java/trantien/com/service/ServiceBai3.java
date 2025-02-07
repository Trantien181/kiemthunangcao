package trantien.com.service;
import java.util.List;

public class ServiceBai3 {
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Cannot calculate average of an empty list");
        }
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
