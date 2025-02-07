package trantien.com.service;

import java.util.List;

public class TinhToanService {
    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static int tinhHieu(int a, int b) {
        return a - b;
    }

    public static int tinhTich(int a, int b) {
        return a * b;
    }

    public static double tinhThuong(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không chia đuược cho 0");
        }
        return (double) a / b;
    }
    public static double tinhTrungBinhCong(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty.");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }

    public static int timViTri(List<Integer> numbers, int value) {
        if (numbers == null) {
            throw new IllegalArgumentException("Mảng không the null");
        }
        return numbers.indexOf(value);
    }

    public static int tinhTongNSoNguyen(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Mảng không thể null.");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int tinhTongNSoLe(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Mảng không the null");
        }
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

}
