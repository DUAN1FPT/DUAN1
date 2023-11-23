/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TaiKhoanRepository {
    public List<TaiKhoan> findAll() throws Exception{
        List<TaiKhoan> dsAcc = new ArrayList();
        Connection connection = DbConnector.getConnection();
        String sql = "SELECT TaiKhoan, MatKhau, MaChucVu FROM TaiKhoan";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String username = rs.getString("TaiKhoan");
            String password = rs.getString("MatKhau");
            Integer role = rs.getInt("MaChucVu");

//           RoleConst ro = new RoleConst();
//            ro.
            TaiKhoan acc = new TaiKhoan();

            acc.setTaiKhoan(username);
            acc.setMatKhau(password);
            acc.setMaChucVu(role);

            dsAcc.add(acc);

        }
        rs.close();
        ps.close();
        connection.close();
        return dsAcc;
    }
      public TaiKhoan getUSer(String username) {

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        TaiKhoan acc = new TaiKhoan();
        try {
            String sql = "SELECT TaiKhoan, MatKhau, MaChucVu FROM TaiKhoan WHERE TaiKhoan = ?";
            connection = DbConnector.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                acc.setTaiKhoan(rs.getString(1));
                acc.setMatKhau(rs.getString(2));
                acc.setMaChucVu(rs.getInt(3));
            }
            System.out.println(acc);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                rs.close();
                ps.close();
                connection.close();
            } catch (Exception e) {
            }

        }
        return acc;

    }
}
