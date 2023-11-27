/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

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
public class MauRepository {

    public List<Mau> getAll() throws Exception {
        List<Mau> dsMau = new ArrayList<>();
        Connection connection = DbConnector.getConnection();
        String sql = "SELECT MaMau,Mau FROM Mau";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Integer id = rs.getInt("MaMau");
            String mau = rs.getString("Mau");
            Mau mau1 = new Mau();
            mau1.setMaMau(id);
            mau1.setMau(mau);

            dsMau.add(mau1);
        }
        rs.close();
        ps.close();
        connection.close();

        return dsMau;
    }
}
