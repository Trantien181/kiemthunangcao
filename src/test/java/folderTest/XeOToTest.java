package folderTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import trantien.com.entity.XeOTo;
import trantien.com.service.XeOTOService;

public class XeOToTest {
    XeOTOService service;

    @BeforeEach
    public void setup() {
        service = new XeOTOService();
    }

    @Test
    public void testAddValid() {
        XeOTo xe = new XeOTo(1, "MayBack", 1000f, "Khong");
        service.addXeOTO(xe);
        Assert.assertEquals(1, service.getAll().size());
    }

    @Test
    public void updateValid() {
        XeOTo xe = new XeOTo(1, "MayBack" , 1000f , "Khong");
        service.addXeOTO(xe);
        XeOTo xe1 = new XeOTo(1, "MayBack" , 1000000f , "Khong");
        service.updateXeOTO(xe1, 1);
        System.out.println(service.searchXeOTO(1).getGia());
        Assert.assertEquals(1000000f, service.getAll().get(0).getGia());
    }

    @Test
    public void deleteValid() {
        XeOTo xe = new XeOTo(1, "MayBack" , 1000f , "Khong");
        service.addXeOTO(xe);
        int sizeBefore = service.getAll().size();
        service.deleteXeOTO(1);
        int sizeAfter = service.getAll().size();
        Assert.assertEquals(sizeBefore - 1, sizeAfter);
    }

    @Test
    public void deleteInValid() {
        XeOTo xe = new XeOTo(1, "MayBack" , 1000f , "Khong");
        service.addXeOTO(xe);
        int sizeBefore = service.getAll().size();
        service.deleteXeOTO(1);
        int sizeAfter = service.getAll().size();
        Assert.assertEquals(sizeBefore , sizeAfter);
    }

    @Test
    public void testSearchXeOtoValid() {
        XeOTo xe = new XeOTo(1, "MayBack" , 1000f , "Khong");
        service.addXeOTO(xe);

        XeOTo foundXeOTO = service.searchXeOTO(1);

        Assert.assertEquals(1, foundXeOTO.getId());
    }

    @Test
    public void testSearchXeOtoInValid() {
        XeOTo xe = new XeOTo(1, "MayBack" , 1000f , "Khong");
        service.addXeOTO(xe);

        XeOTo foundXeOTO = service.searchXeOTO(1);

        Assert.assertEquals(1, foundXeOTO.getId());
    }
}
