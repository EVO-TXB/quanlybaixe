/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaidoxe;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.List;

public class QuanLyBaiXe {
    private List<Xe> danhSachXe = new ArrayList<>();
    private double tongDoanhThu = 0;
    public boolean xeVao(Xe xe) { 
        for (Xe x : danhSachXe) {
            if (x.getBienSo().equals(xe.getBienSo())) {
                return false;
            }
        }
        danhSachXe.add(xe);
        return true;
    }
    public double xeRa(String bienSo, long thoiGianRa) {
        for (Xe xe : danhSachXe) {
            if (xe.getBienSo().equals(bienSo)) {
                double tien = xe.tinhTien(thoiGianRa);
                tongDoanhThu += tien;
                danhSachXe.remove(xe);
                return tien;
            }
        }
        return -1;
    }

    public double getDoanhThu() {
        return tongDoanhThu;
    }

    public List<Xe> getDanhSachXe() {
        return danhSachXe;
    }
}