/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaidoxe;

/**
 *
 * @author LOQ
 */
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private QuanLyBaiXe ql = new QuanLyBaiXe();

    private JTextField txtBienSo;
    private JComboBox<String> cbLoaiXe;
    private JTextArea area;
    private JLabel lblDoanhThu;

    public GUI() {
        setTitle("Quản lý bãi xe");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        JPanel panelTop = new JPanel();
        txtBienSo = new JTextField(10);
        cbLoaiXe = new JComboBox<>(new String[]{"Xe máy", "Ô tô"});
        JButton btnVao = new JButton("Xe vào");
        JButton btnRa = new JButton("Xe ra");

        panelTop.add(new JLabel("Biển số:"));
        panelTop.add(txtBienSo);
        panelTop.add(cbLoaiXe);
        panelTop.add(btnVao);
        panelTop.add(btnRa);

        
        area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);

       
        JPanel panelBottom = new JPanel();
        lblDoanhThu = new JLabel("Doanh thu: 0");
        panelBottom.add(lblDoanhThu);

        add(panelTop, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(panelBottom, BorderLayout.SOUTH);

        
        btnVao.addActionListener(e -> xeVao());
        btnRa.addActionListener(e -> xeRa());
    }

    private void xeVao() {
        String bienSo = txtBienSo.getText();
        if (bienSo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập biển số!");
            return;
        }

        long time = System.currentTimeMillis();
        Xe xe;

        if (cbLoaiXe.getSelectedItem().equals("Ô tô")) {
            xe = new Oto(bienSo, time);
        } else {
            xe = new XeMay(bienSo, time);
        }
        boolean kq=ql.xeVao(xe);
        if(kq){
            area.append("Xe vào: " + bienSo + "\n");
        }else{
            area.append("xe đã tồn tạ!\n");
        }
    }

    private void xeRa() {
        String bienSo = txtBienSo.getText();
        long time = System.currentTimeMillis();

        double tien = ql.xeRa(bienSo, time);

        if (tien == -1) {
            area.append("Không tìm thấy xe\n");
        } else {
            area.append("Xe ra: " + bienSo + " | Tiền: " + tien + "\n");
            lblDoanhThu.setText("Doanh thu: " + ql.getDoanhThu());
        }
    }
}
