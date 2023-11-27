/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import Model.Hoa;
import Model.KichThuoc;
import Model.Mau;
import Model.NhaCungCap;
import Model.XuatXu;
import Service.HoaService;
import Service.KichThuocService;
import Service.MauService;
import Service.NhaCungCapService;
import Service.XuatXuService;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QuanLyHoaForm extends javax.swing.JFrame {

    private final HoaService hoaSer = new HoaService();
    private final KichThuocService kichThuocSer = new KichThuocService();
    private final MauService mauSer = new MauService();
    private final NhaCungCapService nhaCCSer = new NhaCungCapService();
    private final XuatXuService xuatXuSer = new XuatXuService();

    public QuanLyHoaForm() {
        initComponents();
        setLocationRelativeTo(null);
        loadTable();
        loadCBB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        All = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNhanVien = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnTrangChu1 = new javax.swing.JButton();
        btnNhaCungCap = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        btnHoa = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnThongKe1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongTin = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTenHoa = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        cbbMau = new javax.swing.JComboBox<>();
        cbbNhaCungCap = new javax.swing.JComboBox<>();
        cbbKichThuoc = new javax.swing.JComboBox<>();
        cbbXuatXu = new javax.swing.JComboBox<>();
        lblMaHoa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        All.setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("TAYTUU");

        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nhanvien.png"))); // NOI18N
        btnNhanVien.setText("Quản lí nhân viên");
        btnNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel2.setText("CHỨC NĂNG");

        btnTrangChu1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnTrangChu1.setForeground(new java.awt.Color(255, 255, 255));
        btnTrangChu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home1.png"))); // NOI18N
        btnTrangChu1.setText("Trang chủ");
        btnTrangChu1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTrangChu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChu1ActionPerformed(evt);
            }
        });

        btnNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nhaCungCap.png"))); // NOI18N
        btnNhaCungCap.setText("Quản lí nhà cung cấp");
        btnNhaCungCap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaCungCapActionPerformed(evt);
            }
        });

        btnTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/taiKhoan (2).png"))); // NOI18N
        btnTaiKhoan.setText("Quản lí tài khoản");
        btnTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });

        btnHoa.setBackground(new java.awt.Color(51, 153, 255));
        btnHoa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnHoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hoa.png"))); // NOI18N
        btnHoa.setText("Quản lí hoa");
        btnHoa.setToolTipText("");
        btnHoa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHoa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaActionPerformed(evt);
            }
        });

        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hoaDon.png"))); // NOI18N
        btnHoaDon.setText("Quản lí hoá đơn");
        btnHoaDon.setToolTipText("");
        btnHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/khachHang.png"))); // NOI18N
        btnKhachHang.setText("Quản lí khách hàng");
        btnKhachHang.setToolTipText("");
        btnKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongKe.png"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.setToolTipText("");
        btnThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnThongKe1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThongKe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lichSU.png"))); // NOI18N
        btnThongKe1.setText("Lịch sử hóa đơn");
        btnThongKe1.setToolTipText("");
        btnThongKe1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongKe1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongKe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKe1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Quản Lí hoa");

        jLabel6.setText("Kích Thước");

        jLabel7.setText("Số Lượng");

        jLabel8.setText("Giá");

        jLabel9.setText("Xuất xứ");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Danh Sách Sản Phẩm");

        tblThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hoa ", "Tên Hoa", "Màu", "Kích thước", "Nhà Cung cấp", "Số Lượng", "Giá", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongTinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThongTin);

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/find123.png"))); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jButton5.setText(">>");

        jLabel5.setText("Mã Hoa");

        jLabel10.setText("Tên Hoa");

        jLabel11.setText("Màu");

        jLabel12.setText("Nhà Cung Cấp:");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete123.png"))); // NOI18N
        jButton8.setText("Xóa");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fix123.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete123.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset123.png"))); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        cbbMau.setModel(new javax.swing.DefaultComboBoxModel<>());

        cbbNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>());

        cbbKichThuoc.setModel(new javax.swing.DefaultComboBoxModel<>());

        cbbXuatXu.setModel(new javax.swing.DefaultComboBoxModel<>());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(cbbNhaCungCap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(187, 187, 187)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(78, 78, 78)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGiaBan, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(txtSoLuong)
                                    .addComponent(cbbKichThuoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbbXuatXu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(230, 230, 230))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbMau, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenHoa, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                        .addGap(281, 671, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton5)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblMaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbbKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTenHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(cbbMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(cbbNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnLamMoi))
                .addGap(76, 76, 76)
                .addComponent(jButton8)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AllLayout = new javax.swing.GroupLayout(All);
        All.setLayout(AllLayout);
        AllLayout.setHorizontalGroup(
            AllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AllLayout.createSequentialGroup()
                .addGroup(AllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AllLayout.createSequentialGroup()
                        .addGroup(AllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AllLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1))
                            .addGroup(AllLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AllLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThongKe1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNhaCungCap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTrangChu1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AllLayout.setVerticalGroup(
            AllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnTrangChu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(btnNhanVien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNhaCungCap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTaiKhoan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThongKe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThongKe1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AllLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(All, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(All, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadTable() {
        List<Hoa> dsHoa = hoaSer.layDsHoa();
        if (dsHoa == null) {
            JOptionPane.showMessageDialog(this, "Loi");

        } else if (dsHoa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Khong co du lieu");
        } else {
            DefaultTableModel model = (DefaultTableModel) tblThongTin.getModel();
            model.setColumnCount(0);
            model.addColumn("Mã Hoa");
            model.addColumn("Tên hoa");
            model.addColumn("Màu");
            model.addColumn("Kích thước");
            model.addColumn("Nhà Cung cấp");
            model.addColumn("Xuất xứ");
            model.addColumn("Số lượng");
            model.addColumn("Giá");

            model.setRowCount(0);
            for (Hoa hoa : dsHoa) {
                Object[] row = new Object[]{
                    hoa.getMaHoa(),
                    hoa.getTenHoa(),
                    hoa.getMau(),
                    hoa.getKichThuoc(),
                    hoa.getNhaCungCap(),
                    hoa.getXuatXu(),
                    hoa.getSoLuong(),
                    hoa.getGia()
                };
                model.addRow(row);
            }
        }
    }

    private void loadCBB() {
        // load cbb mau
        cbbMau.removeAllItems();
        List<Mau> dsMau = mauSer.layDs();
        for (Mau mau : dsMau) {
            cbbMau.addItem(mau);
        }
        // load cbb Kich thuoc
        cbbKichThuoc.removeAllItems();
        List<KichThuoc> dsKt = kichThuocSer.layDs();
        for (KichThuoc kt : dsKt) {
            cbbKichThuoc.addItem(kt);
        }
        //load xuat xu
        cbbXuatXu.removeAllItems();
        List<XuatXu> dsXX = xuatXuSer.layDs();
        for (XuatXu xx : dsXX) {
            cbbXuatXu.addItem(xx);
        }
        // load nha cung cap
        cbbNhaCungCap.removeAllItems();
        List<NhaCungCap> dsNhaCC = nhaCCSer.layDs();
        for (NhaCungCap nhacc : dsNhaCC) {
            cbbNhaCungCap.addItem(nhacc);
        }
    }

    private Hoa getHoa() {
//        Integer maHoa = Integer.valueOf(lblMaHoa.getText());
        String tenHoa = txtTenHoa.getText();
        Mau mau = (Mau) cbbMau.getSelectedItem();
        KichThuoc kt = (KichThuoc) cbbKichThuoc.getSelectedItem();
        NhaCungCap nhacc = (NhaCungCap) cbbNhaCungCap.getSelectedItem();
        XuatXu xx = (XuatXu) cbbXuatXu.getSelectedItem();
        Integer soLuong = Integer.valueOf(txtSoLuong.getText());
        BigDecimal gia = BigDecimal.valueOf(Double.parseDouble(txtGiaBan.getText()));

        Hoa hoa = new Hoa();
//        hoa.setMaHoa(maHoa);
        hoa.setTenHoa(tenHoa);
        hoa.setMau(mau);
        hoa.setKichThuoc(kt);
        hoa.setNhaCungCap(nhacc);
        hoa.setXuatXu(xx);
        hoa.setSoLuong(soLuong);
        hoa.setGia(gia);

        return hoa;
    }

    private Hoa getHoa2() {
        Integer maHoa = Integer.valueOf(lblMaHoa.getText());
        String tenHoa = txtTenHoa.getText();
        Mau mau = (Mau) cbbMau.getSelectedItem();
        KichThuoc kt = (KichThuoc) cbbKichThuoc.getSelectedItem();
        NhaCungCap nhacc = (NhaCungCap) cbbNhaCungCap.getSelectedItem();
        XuatXu xx = (XuatXu) cbbXuatXu.getSelectedItem();
        Integer soLuong = Integer.valueOf(txtSoLuong.getText());
        BigDecimal gia = BigDecimal.valueOf(Double.parseDouble(txtGiaBan.getText()));

        Hoa hoa = new Hoa();
        hoa.setMaHoa(maHoa);
        hoa.setTenHoa(tenHoa);
        hoa.setMau(mau);
        hoa.setKichThuoc(kt);
        hoa.setNhaCungCap(nhacc);
        hoa.setXuatXu(xx);
        hoa.setSoLuong(soLuong);
        hoa.setGia(gia);

        return hoa;
    }
    private void btnThongKe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThongKe1ActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHoaActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaCungCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhaCungCapActionPerformed

    private void btnTrangChu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrangChu1ActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        List<Hoa> ds = hoaSer.layDsHoa();
        String tenHoa = txtTimKiem.getText();
        try {
            if (tenHoa.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Chua nhap ten SP");
            } else if (!tenHoa.equals(tenHoa)) {
                JOptionPane.showMessageDialog(this, "Ma SP khong dung");

            } else {
                ds = hoaSer.timKiem(tenHoa);
                DefaultTableModel model = (DefaultTableModel) tblThongTin.getModel();
                model.setColumnCount(0);
                model.addColumn("Mã Hoa");
                model.addColumn("Tên hoa");
                model.addColumn("Màu");
                model.addColumn("Kích thước");
                model.addColumn("Nhà Cung cấp");
                model.addColumn("Xuất xứ");
                model.addColumn("Số lượng");
                model.addColumn("Giá");

                model.setRowCount(0);
                for (Hoa hoa : ds) {
                    Object[] row = new Object[]{
                        hoa.getMaHoa(),
                        hoa.getTenHoa(),
                        hoa.getMau(),
                        hoa.getKichThuoc(),
                        hoa.getNhaCungCap(),
                        hoa.getXuatXu(),
                        hoa.getSoLuong(),
                        hoa.getGia()
                    };
                    model.addRow(row);
                    break;

                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm SP không?");
        if (confirm == JOptionPane.YES_OPTION) {
            // Thực hiện lưu thay đổi
            Hoa hoa = getHoa();
            int ketQua = -1;
            ketQua = hoaSer.themHoa(hoa);
            if (ketQua > -1) {
                JOptionPane.showMessageDialog(this, "Thanh cong");

            } else {
                JOptionPane.showMessageDialog(this, "That bai");

            }
            loadTable();
//            clearForm();
        } else {
            // Không lưu thay đổi
            return;
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongTinMouseClicked
        // TODO add your handling code here:
        List<Hoa> dsHoa = hoaSer.layDsHoa();
        int index = -1;
        index = tblThongTin.getSelectedRow();
        if (index == -1) {
            return;
        } else {
            Integer maHoa = (Integer) tblThongTin.getValueAt(index, 0);
            String tenHoa = (String) tblThongTin.getValueAt(index, 1);
            Mau mau = (Mau) tblThongTin.getValueAt(index, 2);
            KichThuoc kt = (KichThuoc) tblThongTin.getValueAt(index, 3);
            NhaCungCap nhacc = (NhaCungCap) tblThongTin.getValueAt(index, 4);
            XuatXu xx = (XuatXu) tblThongTin.getValueAt(index, 5);
            Integer soLuong = (Integer) tblThongTin.getValueAt(index, 6);
            for (Hoa hoa : dsHoa) {
                if (maHoa == hoa.getMaHoa()) {
                    lblMaHoa.setText("" + hoa.getMaHoa());
                    txtTenHoa.setText(tenHoa);
                    txtGiaBan.setText("" + hoa.getGia());
                    txtSoLuong.setText("" + hoa.getSoLuong());

                    // cbb mau
                    int soLuongMau = cbbMau.getItemCount();
                    for (int i = 0; i < soLuongMau; i++) {
                        Mau mau2 = cbbMau.getItemAt(i);
                        if (mau2.getMau().equals(mau.getMau())) {
                            cbbMau.setSelectedIndex(i);
                        }
                    }
                    // cbb nhaCC
                    int soLuongNhaCC = cbbNhaCungCap.getItemCount();
                    for (int i = 0; i < soLuongNhaCC; i++) {
                        NhaCungCap nhacc2 = cbbNhaCungCap.getItemAt(i);
                        if (nhacc2.getTenNhaCungCap().equals(nhacc.getTenNhaCungCap())) {
                            cbbNhaCungCap.setSelectedIndex(i);
                        }
                    }
                    // cbb kich thuoc
                    int soLuongKichThuoc = cbbKichThuoc.getItemCount();
                    for (int i = 0; i < soLuongKichThuoc; i++) {
                        KichThuoc kt2 = cbbKichThuoc.getItemAt(i);
                        if (kt2.getKichThuoc().equals(kt.getKichThuoc())) {
                            cbbKichThuoc.setSelectedIndex(i);
                        }
                    }
                    // cbb xuat xu
                    int soLuongXX = cbbXuatXu.getItemCount();
                    for (int i = 0; i < soLuongXX; i++) {
                        XuatXu xx2 = cbbXuatXu.getItemAt(i);
                        if (xx2.getXuatXu().equals(xx.getXuatXu())) {
                            cbbXuatXu.setSelectedIndex(i);
                        }
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblThongTinMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int index = -1;
        index = tblThongTin.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Moi chon 1 ban ghi");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?");
        if (confirm == JOptionPane.YES_OPTION) {
            // Thực hiện lưu thay đổi
            Integer maHoa = (Integer) tblThongTin.getValueAt(index, 0);
            int ketQua = hoaSer.xoaHoa(maHoa);
            if (ketQua > -1) {
                JOptionPane.showMessageDialog(this, "Thanh cong");

            } else {
                JOptionPane.showMessageDialog(this, "That bai");

            }
            loadTable();
//            clearForm();
        } else {
            return;
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        txtTimKiem.setText("");
        lblMaHoa.setText("");
        txtTenHoa.setText("");
        txtGiaBan.setText("");
        txtSoLuong.setText("");
        cbbKichThuoc.setSelectedIndex(-1);
        cbbMau.setSelectedIndex(-1);
        cbbNhaCungCap.setSelectedIndex(-1);
        cbbXuatXu.setSelectedIndex(-1);
        loadTable();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa SP không?");
        if (confirm == JOptionPane.YES_OPTION) {
            // Thực hiện lưu thay đổi
            Hoa hoa = getHoa2();
            int ketQua = -1;
            ketQua = hoaSer.capNhatHoa(hoa);
            if (ketQua > -1) {
                JOptionPane.showMessageDialog(this, "Thanh cong");

            } else {
                JOptionPane.showMessageDialog(this, "That bai");

            }
            loadTable();
//            clearForm();
        } else {
            // Không lưu thay đổi
            return;
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyHoaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel All;
    private javax.swing.JButton btnHoa;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnNhaCungCap;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnThongKe1;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTrangChu1;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<KichThuoc> cbbKichThuoc;
    private javax.swing.JComboBox<Mau> cbbMau;
    private javax.swing.JComboBox<NhaCungCap> cbbNhaCungCap;
    private javax.swing.JComboBox<XuatXu> cbbXuatXu;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaHoa;
    private javax.swing.JTable tblThongTin;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenHoa;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
