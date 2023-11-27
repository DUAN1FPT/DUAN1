/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Hoa;
import Model.KichThuoc;
import Model.Mau;
import Model.NhaCungCap;
import Model.XuatXu;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class HoaRepository {

    public List<Hoa> getAll() throws Exception {
        List<Hoa> dsHoa = new ArrayList<>();
        Connection connection = DbConnector.getConnection();
        String sql = "SELECT\n"
                + "    Hoa.MaHoa,\n"
                + "    Hoa.Ten,\n"
                + "    KichThuoc.KichThuoc AS KichThuoc,\n"
                + "    Mau.Mau AS Mau,\n"
                + "    NhaCungCap.Ten AS NhaCungCap,\n"
                + "    Hoa.SoLuong,\n"
                + "    Hoa.Gia,\n"
                + "    XuatXu.XuatXu AS XuatXu\n"
                + "FROM\n"
                + "    Hoa\n"
                + "JOIN\n"
                + "    KichThuoc ON Hoa.MaKichThuoc = KichThuoc.MaKichThuoc\n"
                + "JOIN\n"
                + "    Mau ON Hoa.MaMau = Mau.MaMau\n"
                + "JOIN\n"
                + "    NhaCungCap ON Hoa.MaNhaCungCap = NhaCungCap.MaNhaCungCap\n"
                + "JOIN\n"
                + "    XuatXu ON Hoa.MaXuatXu = XuatXu.MaXuatXu;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Integer maHoa = rs.getInt("MaHoa");
            String tenHoa = rs.getString("Ten");
            String kichThuoc = rs.getString("KichThuoc");
            String mau = rs.getString("Mau");
            String nhaCungCap = rs.getString("NhaCungCap");
            Integer soLuong = rs.getInt("SoLuong");
            BigDecimal gia = rs.getBigDecimal("Gia");
            String xuatXu = rs.getString("XuatXu");

            KichThuoc kt = new KichThuoc();
            kt.setKichThuoc(kichThuoc);

            Mau tenMau = new Mau();
            tenMau.setMau(mau);

            NhaCungCap nhaCC = new NhaCungCap();
            nhaCC.setTenNhaCungCap(nhaCungCap);

            XuatXu xx = new XuatXu();
            xx.setXuatXu(xuatXu);

            Hoa hoa = new Hoa();
            hoa.setMaHoa(maHoa);
            hoa.setTenHoa(tenHoa);
            hoa.setKichThuoc(kt);
            hoa.setMau(tenMau);
            hoa.setNhaCungCap(nhaCC);
            hoa.setXuatXu(xx);
            hoa.setGia(gia);
            hoa.setSoLuong(soLuong);

            dsHoa.add(hoa);
        }
        rs.close();
        ps.close();
        connection.close();
        return dsHoa;
    }

    public Integer xoa(Integer maHoa) throws Exception {
        Connection con = DbConnector.getConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM Hoa WHERE MaHoa = ?");
        ps.setInt(1, maHoa);
        return ps.executeUpdate();
    }

    public Integer themHoa(Hoa hoa) throws Exception {
        Integer ketQua = -1;
        Connection conecConnection = DbConnector.getConnection();
        String sql = "INSERT INTO "
                + "Hoa (Ten, MaKichThuoc, MaMau, MaNhaCungCap, MaXuatXu, SoLuong, Gia)\n"
                + "VALUES(?,?,?,?,?,?,?)";

        PreparedStatement ps = conecConnection.prepareStatement(sql);
        Integer maKichThuoc = hoa.getKichThuoc().getMaKichThuoc();
        Integer maMau = hoa.getMau().getMaMau();
        Integer maNhaCungCap = hoa.getNhaCungCap().getMaNhaCungCap();
        Integer maXuatXu = hoa.getXuatXu().getMaXuatXu();

        ps.setString(1, hoa.getTenHoa());
        ps.setInt(2, maKichThuoc);
        ps.setInt(3, maMau);
        ps.setInt(4, maNhaCungCap);
        ps.setInt(5, maXuatXu);
        ps.setInt(6, hoa.getSoLuong());
        ps.setBigDecimal(7, hoa.getGia());

        ketQua = ps.executeUpdate();

        return ketQua;
    }

    public Integer capNhatHoa(Hoa hoa) throws Exception {
        Integer ketQua = -1;
        Connection conecConnection = DbConnector.getConnection();
        String sql = "UPDATE  Hoa "
                + "SET Ten = ?, MaKichThuoc = ?, MaMau = ?,MaNhaCungCap = ?,"
                + " MaXuatXu = ? , SoLuong = ?, Gia = ? WHERE MaHoa = ? ";

        PreparedStatement ps = conecConnection.prepareStatement(sql);
        Integer maKichThuoc = hoa.getKichThuoc().getMaKichThuoc();
        Integer maMau = hoa.getMau().getMaMau();
        Integer maNhaCungCap = hoa.getNhaCungCap().getMaNhaCungCap();
        Integer maXuatXu = hoa.getXuatXu().getMaXuatXu();

        ps.setString(1, hoa.getTenHoa());
        ps.setInt(2, maKichThuoc);
        ps.setInt(3, maMau);
        ps.setInt(4, maNhaCungCap);
        ps.setInt(5, maXuatXu);
        ps.setInt(6, hoa.getSoLuong());
        ps.setBigDecimal(7, hoa.getGia());
        ps.setInt(8, hoa.getMaHoa());
        ketQua = ps.executeUpdate();

        return ketQua;
    }

    public List<Hoa> timKiem(String tenSP) throws Exception {

        Connection conecConnection = DbConnector.getConnection();
        PreparedStatement ps = conecConnection.prepareStatement("SELECT\n"
                + "    Hoa.MaHoa,\n"
                + "    Hoa.Ten,\n"
                + "    KichThuoc.KichThuoc AS KichThuoc,\n"
                + "    Mau.Mau AS Mau,\n"
                + "    NhaCungCap.Ten AS NhaCungCap,\n"
                + "    Hoa.SoLuong,\n"
                + "    Hoa.Gia,\n"
                + "    XuatXu.XuatXu AS XuatXu\n"
                + "FROM\n"
                + "    Hoa\n"
                + "JOIN\n"
                + "    KichThuoc ON Hoa.MaKichThuoc = KichThuoc.MaKichThuoc\n"
                + "JOIN\n"
                + "    Mau ON Hoa.MaMau = Mau.MaMau\n"
                + "JOIN\n"
                + "    NhaCungCap ON Hoa.MaNhaCungCap = NhaCungCap.MaNhaCungCap\n"
                + "JOIN\n"
                + "    XuatXu ON Hoa.MaXuatXu = XuatXu.MaXuatXu\n"
                + "WHERE\n"
                + "    Hoa.Ten = ? ");
        ps.setString(1, tenSP);
        ResultSet rs = ps.executeQuery();
        ArrayList<Hoa> dsHoa = new ArrayList<>();
        while (rs.next()) {


            Integer maHoa = rs.getInt("MaHoa");
            String tenHoa = rs.getString("Ten");
            String kichThuoc = rs.getString("KichThuoc");
            String mau = rs.getString("Mau");
            String nhaCungCap = rs.getString("NhaCungCap");
            Integer soLuong = rs.getInt("SoLuong");
            BigDecimal gia = rs.getBigDecimal("Gia");
            String xuatXu = rs.getString("XuatXu");
            
            KichThuoc kt = new KichThuoc();
            kt.setKichThuoc(kichThuoc);
            
            Mau mau1 = new Mau();
            mau1.setMau(mau);
            
            NhaCungCap ncc = new NhaCungCap();
            ncc.setTenNhaCungCap(nhaCungCap);
            
            XuatXu xx = new XuatXu();
            xx.setXuatXu(xuatXu);

            Hoa hoa = new Hoa();
            hoa.setMaHoa(maHoa);
            hoa.setTenHoa(tenHoa);
            hoa.setKichThuoc(kt);
            hoa.setMau(mau1);
            hoa.setNhaCungCap(ncc);
            hoa.setSoLuong(soLuong);
            hoa.setGia(gia);
            hoa.setXuatXu(xx);
            
            dsHoa.add(hoa);

        }
        ps.close();
        conecConnection.close();
        return dsHoa;
    }
}
