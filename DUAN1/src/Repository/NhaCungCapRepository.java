/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Mau;
import Model.NhaCungCap;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhaCungCapRepository {
    public List<NhaCungCap> getAll() throws Exception {
        List<NhaCungCap> dsNhaCC = new ArrayList<>();
        Connection connection = DbConnector.getConnection();
        String sql = "SELECT MaNhaCungCap, Ten,DiaChi,Gia,SoDienThoai,TrangThai "
                + "FROM NhaCungCap";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Integer maNhaCungCap = rs.getInt("MaNhaCungCap");
            String ten = rs.getString("Ten");
            String diaChi = rs.getString("DiaChi");
            BigDecimal gia = rs.getBigDecimal("Gia");
            String sdt = rs.getString("SoDienThoai");
            String trangThai = rs.getString("TrangThai");
            
            NhaCungCap ncc = new NhaCungCap();
            ncc.setMaNhaCungCap(maNhaCungCap);
            ncc.setTenNhaCungCap(ten);
            ncc.setDiaChi(diaChi);
            ncc.setGia(gia);
            ncc.setSdt(sdt);
            ncc.setTrangThai(trangThai);
            
            dsNhaCC.add(ncc);
        }
        rs.close();
        ps.close();
        connection.close();

        return dsNhaCC;
    }
}
