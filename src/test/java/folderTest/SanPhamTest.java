package folderTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trantien.com.entity.SanPham;
import trantien.com.service.SanPhamService;

public class SanPhamTest {
    SanPhamService service = new SanPhamService();

    @Test
    void testThemSanPham() {
        SanPham sp = new SanPham("SP01", "Áo Thun", "Thời Trang", 1, 200000, 50);
        service.themSanPham(sp);
        Assertions.assertTrue(service.kiemTraMaTonTai("SP01"));
    }

    @Test
    void testXoaSanPham() {
        SanPham sp = new SanPham("SP02", "Giày Sneaker", "Thể Thao", 2, 500000, 20);
        service.themSanPham(sp);
        Assertions.assertTrue(service.xoaSanPham("SP02"));
        Assertions.assertFalse(service.kiemTraMaTonTai("SP02"));
    }
}
