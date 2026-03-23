/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaidoxe;

/**
 *
 * @author LOQ
 */
public abstract class Xe {
    protected String bienSo;
    protected long thoiGianVao;

    public Xe(String bienSo, long thoiGianVao) {
        this.bienSo = bienSo;
        this.thoiGianVao = thoiGianVao;
    }

    public abstract double tinhTien(long thoiGianRa);

    public String getBienSo() {
        return bienSo;
    }

    public long getThoiGianVao() {
        return thoiGianVao;
    }
}
