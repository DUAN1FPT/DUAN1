/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.KichThuoc;
import Model.Mau;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KichThuocRepository {
    public List<KichThuoc> getAll() throws Exception {
        List<KichThuoc> dsKichThuoc = new ArrayList<>();
        Connection connection = DbConnector.getConnection();
        String sql = "SELECT MaKichThuoc,KichThuoc FROM KichThuoc";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Integer id = rs.getInt("MaKichThuoc");
            String kichThuoc = rs.getString("KichThuoc");
            
            KichThuoc kichThuoc1 = new KichThuoc();
            kichThuoc1.setMaKichThuoc(id);
            kichThuoc1.setKichThuoc(kichThuoc);

            dsKichThuoc.add(kichThuoc1);
        }
        rs.close();
        ps.close();
        connection.close();

        return dsKichThuoc;
    }
}
