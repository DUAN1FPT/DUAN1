/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Mau;
import Model.XuatXu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class XuatXuRepository {

    public List<XuatXu> getAll() throws Exception {
        List<XuatXu> dsXx = new ArrayList<>();
        Connection connection = DbConnector.getConnection();
        String sql = "SELECT MaXuatXu,XuatXu FROM XuatXu";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Integer id = rs.getInt("MaXuatXu");
            String xuatXu = rs.getString("XuatXu");
            XuatXu xx = new XuatXu();
            xx.setMaXuatXu(id);
            xx.setXuatXu(xuatXu);
            dsXx.add(xx);
        }
        rs.close();
        ps.close();
        connection.close();

        return dsXx;
    }
}
