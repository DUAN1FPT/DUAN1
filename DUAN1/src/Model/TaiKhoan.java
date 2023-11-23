/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class TaiKhoan {

    private String taiKhoan;
    private String matKhau;
    private int maChucVu;

    public TaiKhoan() {
    }

    public TaiKhoan(String taiKhoan, String matKhau, int maChucVu) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.maChucVu = maChucVu;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(int maChucVu) {
        this.maChucVu = maChucVu;
    }
//  @Override
//    public String toString() {
//        return "Account{" + "username=" + username + ", password=" + password + ", role=" + role + '}';
//    }
//    private static Account instance;
//     private Account(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//     public static void createSession(String username, String password) {
//        instance = new Account(username, password);
//    }
//
//    public static Account getInstance() {
//        return instance;
//    }
}
