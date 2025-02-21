package trantien.com.service;

import trantien.com.entity.XeOTo;

import java.util.ArrayList;
import java.util.List;

public class XeOTOService {
    private List<XeOTo> danhSachXe;

    public XeOTOService() {
        this.danhSachXe = new ArrayList<>();
    }

    public void addXeOTO(XeOTo xe) {
        danhSachXe.add(xe);
    }

    public void updateXeOTO(XeOTo xeMoi, int id) {
        for (int i = 0; i < danhSachXe.size(); i++) {
            if (danhSachXe.get(i).getId() == id) {
                danhSachXe.set(i, xeMoi);
                return;
            }
        }
    }

    public void deleteXeOTO(int id) {
        danhSachXe.removeIf(xe -> xe.getId() == id);
    }

    public XeOTo searchXeOTO(int id) {
        for (XeOTo xe : danhSachXe) {
            if (xe.getId() == id) {
                return xe;
            }
        }
        return null;
    }

    public List<XeOTo> getAll() {
        return danhSachXe;
    }
}
