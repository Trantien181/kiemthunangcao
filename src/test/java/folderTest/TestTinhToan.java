package folderTest;

import org.junit.Test;
import trantien.com.service.TinhToanService;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTinhToan {
    TinhToanService service = new TinhToanService();

    @Test
    public void tinhTong1() {
        assertEquals(15, service.tinhTong( 5, 10));
    }

    @Test
    public void tinhTong2() {
        assertEquals(14, service.tinhTong(4, 10));
    }
    @Test
    public void tinhTong4() {
        assertEquals(19, service.tinhTong(9, 10));
    }

    @Test
    public void tinhTong5() {
        assertEquals(20, service.tinhTong(10 , 10));
    }
    @Test
    public void testTinhTong() {
        assertEquals(15, service.tinhTong(5, 10));
        assertEquals(0, service.tinhTong(-5, 5));
        assertEquals(-15, service.tinhTong(-10, -5));
        assertEquals(100, service.tinhTong(50, 50));
        assertEquals(1, service.tinhTong(0, 1));
    }

    @Test
    public void testTinhHieu() {
        assertEquals(-5, service.tinhHieu(5, 10));
        assertEquals(-10, service.tinhHieu(-5, 5));
        assertEquals(-5, service.tinhHieu(-10, -5));
        assertEquals(0, service.tinhHieu(50, 50));
        assertEquals(-1, service.tinhHieu(0, 1));
    }

    @Test
    public void testTinhTich() {
        assertEquals(50, service.tinhTich(5, 10));
        assertEquals(-25, service.tinhTich(-5, 5));
        assertEquals(50, service.tinhTich(-10, -5));
        assertEquals(2500, service.tinhTich(50, 50));
        assertEquals(0, service.tinhTich(0, 1));
    }

    @Test
    public void testTinhThuong() {
        assertEquals(0.5, service.tinhThuong(5, 10));
        assertEquals(-1, service.tinhThuong(-5, 5));
        assertEquals(2, service.tinhThuong(-10, -5));
        assertEquals(1, service.tinhThuong(50, 50));
        assertThrows(ArithmeticException.class, () -> service.tinhThuong(1, 0));
    }
    @Test
    public void testTinhTrungBinhCong() {
        assertEquals(3.0, service.tinhTrungBinhCong(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(0.0, service.tinhTrungBinhCong(Arrays.asList(-1, 1)));
        assertEquals(10.0, service.tinhTrungBinhCong(Arrays.asList(10, 10, 10)));
        assertThrows(IllegalArgumentException.class, () -> service.tinhTrungBinhCong(Collections.emptyList()));
    }
    @Test
    public void testTimViTri() {
        assertEquals(2, service.timViTri(Arrays.asList(1, 2, 3, 4, 5), 3));
        assertEquals(-1, service.timViTri(Arrays.asList(1, 2, 3, 4, 5), 6));
        assertEquals(0, service.timViTri(Arrays.asList(10, 20, 30), 10));
    }

    @Test
    public void testTinhTongNSoNguyen() {
        assertEquals(15, service.tinhTongNSoNguyen(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(-10, service.tinhTongNSoNguyen(Arrays.asList(-1, -2, -3, -4)));
        assertEquals(0, service.tinhTongNSoNguyen(Arrays.asList()));
    }

    @Test
    public void testTinhTongNSoLe() {
        assertEquals(9, service.tinhTongNSoLe(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(-4, service.tinhTongNSoLe(Arrays.asList(-1, -2, -3, -4)));
        assertEquals(0, service.tinhTongNSoLe(Arrays.asList(2, 4, 6)));
    }
}
