/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class KichThuoc {
    private int maKichThuoc;
    private String kichThuoc;

    public KichThuoc() {
    }

    public KichThuoc(int maKichThuoc, String kichThuoc) {
        this.maKichThuoc = maKichThuoc;
        this.kichThuoc = kichThuoc;
    }

    public int getMaKichThuoc() {
        return maKichThuoc;
    }

    public void setMaKichThuoc(int maKichThuoc) {
        this.maKichThuoc = maKichThuoc;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    @Override
    public String toString() {
        return kichThuoc;
    }
    
}
