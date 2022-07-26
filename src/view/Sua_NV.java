/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Sua_NV extends javax.swing.JFrame {
    DefaultTableModel tbn = new DefaultTableModel();
    
    /**
     * Creates new form Add_NV
     */
    public Sua_NV() {
        initComponents();
        this.setVisible(true); // Hien Frame
        this.setTitle("Edit employee information"); // tieu de Frame
        this.setLocationRelativeTo(null);
        loadData();
    }
    
    public void loadData(){
        try{
            DAO d = new DAO();
            Connection conn = d.getConnection();
            int number;
            Vector row, column;
            column = new Vector();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from staff");
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            
            for(int i = 1; i <= number; i++){
                column.add(metadata.getColumnName(i));
            }
            tbn.setColumnIdentifiers(column);
            
            while(rs.next()){
                row = new Vector();
                for(int i = 1; i <= number; i++){
                    row.addElement(rs.getString(i));
                }
                tbn.addRow(row);
                jTable1.setModel(tbn);
            }
            
            jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                
                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    if(jTable1.getSelectedRow() >= 0){
                        txtMaNV.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
                        txtHoTen.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1) + "");
                        txtTenKhoa.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2) + "");
                        txtDiaChi.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3) + "");
                        txtSDT.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5) + "");
                    }
                }
            });
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenKhoa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbdNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SỬA THÔNG TIN NHÂN VIÊN");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã nhân viên:");

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Họ tên:");

        txtHoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tên khoa:");

        txtTenKhoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Địa chỉ:");

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Giới tính:");

        buttonGroup1.add(rbdNam);
        rbdNam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbdNam.setForeground(new java.awt.Color(255, 255, 255));
        rbdNam.setText("Nam");

        buttonGroup1.add(rdbNu);
        rdbNu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdbNu.setForeground(new java.awt.Color(255, 255, 255));
        rdbNu.setText("Nữ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Số điện thoại:");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSua.setText("Finish");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbdNam)
                                        .addGap(40, 40, 40)
                                        .addComponent(rdbNu)))
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(btnSua))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rbdNam)
                            .addComponent(rdbNu)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnSua)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new ql_nhanVien();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try{
            String nam = "Nam";
            String nu = "Nu";
            DAO d = new DAO();
            Connection conn = d.getConnection();
            PreparedStatement comm = conn.prepareStatement("Update staff set hoTen=?, tenKhoa=?,  diaChi=?, gioiTinh=?, sdt=? where maNV=?");
            comm.setString(6, txtMaNV.getText());
            comm.setString(1, txtHoTen.getText());
            comm.setString(2, txtTenKhoa.getText());
            comm.setString(3, txtDiaChi.getText());
            if(rbdNam.isSelected()){
                comm.setString(4, nam);
            } else{
                comm.setString(4, nu);
            }
            comm.setString(5, txtSDT.getText());

            int chk = comm.executeUpdate();
            if(chk > 0){
                JOptionPane.showMessageDialog(this, "Sua thanh cong");
                tbn.setRowCount(0);
                loadData();
            }
            else {
                JOptionPane.showMessageDialog(this, "Loi, can sua lai");
            }
        }catch(Exception ex){
            System.out.print(ex.toString());
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
            java.util.logging.Logger.getLogger(Sua_NV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sua_NV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sua_NV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sua_NV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sua_NV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSua;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbdNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKhoa;
    // End of variables declaration//GEN-END:variables
}