/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaidoxe;

/**
 *
 * @author LOQ
 */
public class XeMay extends Xe {

    public XeMay(String bienSo, long thoiGianVao) {
        super(bienSo, thoiGianVao);
    }

    @Override
    public double tinhTien(long thoiGianRa) {
        long soGio = (thoiGianRa - thoiGianVao) / (1000 * 60 * 60);
        if (soGio == 0) soGio = 1;
        return soGio * 5000;
    }
}
