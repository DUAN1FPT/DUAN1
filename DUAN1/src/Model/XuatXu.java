/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class XuatXu {
    private int maXuatXu;
    private String xuatXu;

    public XuatXu() {
    }

    public XuatXu(int maXuatXu, String xuatXu) {
        this.maXuatXu = maXuatXu;
        this.xuatXu = xuatXu;
    }

    public int getMaXuatXu() {
        return maXuatXu;
    }

    public void setMaXuatXu(int maXuatXu) {
        this.maXuatXu = maXuatXu;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    @Override
    public String toString() {
        return xuatXu;
    }
    
}
