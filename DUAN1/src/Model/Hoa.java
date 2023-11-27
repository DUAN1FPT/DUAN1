/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class Hoa {
    private int maHoa;
    private String tenHoa;
    private KichThuoc kichThuoc;
    private Mau mau;
    private NhaCungCap nhaCungCap;
    private int soLuong;
    private BigDecimal gia;
    private XuatXu xuatXu;

    public Hoa() {
    }

    public Hoa(int maHoa, String tenHoa, KichThuoc kichThuoc, Mau mau, NhaCungCap nhaCungCap, int soLuong, BigDecimal gia, XuatXu xuatXu) {
        this.maHoa = maHoa;
        this.tenHoa = tenHoa;
        this.kichThuoc = kichThuoc;
        this.mau = mau;
        this.nhaCungCap = nhaCungCap;
        this.soLuong = soLuong;
        this.gia = gia;
        this.xuatXu = xuatXu;
    }

    public int getMaHoa() {
        return maHoa;
    }

    public void setMaHoa(int maHoa) {
        this.maHoa = maHoa;
    }

    public String getTenHoa() {
        return tenHoa;
    }

    public void setTenHoa(String tenHoa) {
        this.tenHoa = tenHoa;
    }

    public KichThuoc getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(KichThuoc kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public Mau getMau() {
        return mau;
    }

    public void setMau(Mau mau) {
        this.mau = mau;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    public XuatXu getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(XuatXu xuatXu) {
        this.xuatXu = xuatXu;
    }
    
}
