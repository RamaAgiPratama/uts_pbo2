package uts;

import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RAMA AGI PRATAMA
 */

public class FDaftar21552011058 extends javax.swing.JFrame {
    Connection conn = CKoneksi21552011058.getKoneksi();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    String sql, jk, kodeUser, kode, kosong;
    
    public FDaftar21552011058() {
        initComponents();
        kodeUserOtomatis();
    }
    
    private void kodeUserOtomatis(){
        try {
            st = conn.createStatement();
            sql = "SELECT * FROM tbluser order by idUser DESC";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                kodeUser = rs.getString("idUser").substring(1);
                kode = "" + (Integer.parseInt(kodeUser) + 1);
                kosong = "";
                switch (kode.length()) {
                    case 1 : kosong = "00";
                    case 2 : kosong = "0";
                    case 3 : kosong = "";
                    default : {
                    }
                }
               tfKodeUser.setText("USER00" + kosong + kode);
       } else {
           tfKodeUser.setText("USER001");
       } 
        rs.close();
        st.close();
        } catch (NumberFormatException | SQLException e) {
       }
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        pfConfirm = new javax.swing.JPasswordField();
        btnDaftar = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        tooltip = new javax.swing.JLabel();
        rbProduksi = new javax.swing.JRadioButton();
        rbMarkering = new javax.swing.JRadioButton();
        tfKodeUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("21552011058 RAMA AGI PRATAMA");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel4.setText("Konfirmasi Password");

        tfUsername.setBackground(new java.awt.Color(204, 255, 255));
        tfUsername.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUsernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsernameKeyTyped(evt);
            }
        });

        pfPassword.setBackground(new java.awt.Color(204, 255, 255));
        pfPassword.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        pfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfPasswordKeyReleased(evt);
            }
        });

        pfConfirm.setBackground(new java.awt.Color(204, 255, 255));
        pfConfirm.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        pfConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfConfirmKeyReleased(evt);
            }
        });

        btnDaftar.setBackground(new java.awt.Color(51, 255, 255));
        btnDaftar.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnDaftar.setForeground(new java.awt.Color(0, 0, 0));
        btnDaftar.setText("Daftar");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(51, 255, 255));
        btnKembali.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(0, 0, 0));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        tooltip.setForeground(new java.awt.Color(255, 0, 0));

        buttonGroup2.add(rbProduksi);
        rbProduksi.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        rbProduksi.setText("Produksi");
        rbProduksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProduksiActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbMarkering);
        rbMarkering.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        rbMarkering.setText("Marketing");
        rbMarkering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMarkeringActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbProduksi)
                .addGap(18, 18, 18)
                .addComponent(rbMarkering)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfKodeUser, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(pfConfirm)
                    .addComponent(pfPassword)
                    .addComponent(tfUsername)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKembali))
                    .addComponent(tooltip, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(tfKodeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pfConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbProduksi)
                    .addComponent(rbMarkering))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tooltip, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        // TODO add your handling code here:
        if (tfUsername.getText().isEmpty() || pfPassword.getText().isEmpty() || 
             pfConfirm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data Harus Diisi Semua!");
            }else if (!pfConfirm.getText().equals(pfPassword.getText())) {
            JOptionPane.showMessageDialog(null, "Confirm Password Harus Sama Dengan Password!");
            }else {
            String password = pfPassword.getText();
            if (password.length() < 8) {
                tooltip.setText("Password Terlalu Tendek, Minimal 8 Karakter");
            }
            if (!password.matches(".*\\d.*")) {
                tooltip.setText("Password Harus Mengandung Setidaknya 1 Angka");
            }
            if (!password.matches(".*[A-Z].*")) {
                tooltip.setText("Password Harus Mengandung Setidaknya 1 Huruf Besar");
            }
            if (!password.matches(".*[a-z].*")) {     
                tooltip.setText("Password Harus Mengandung Setidaknya 1 Huruf Kecil");
            }
            if (!password.matches(".*[!@#$%^&*()].*")) {
                tooltip.setText("Password Harus Mengandung Setidaknya 1 Simbol");
            }
            if (password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[A-Z].*") && 
                password.matches(".*[a-z].*") && password.matches(".*[!@#$%^&*()].*")) {
                tooltip.setText("");
                try {
                    String username = tfUsername.getText();
                    sql = "select email from tbluser;";
                    st = conn.createStatement();
                    rs = st.executeQuery(sql);
                    boolean email = false;

                    while (rs.next()) {
                        String compare = rs.getString("email");
                        if (compare.equalsIgnoreCase(username)) {
                            email = true;
                            break;
                        }
                    }

                    if (email == false) {
                        sql = "INSERT INTO tbluser VALUES (?, ?, ?, ?)";
                        ps = conn.prepareStatement(sql);
                        ps.setString(1, tfKodeUser.getText());
                        ps.setString(2, tfUsername.getText());
                        ps.setString(3, pfPassword.getText());
                        if (rbProduksi.isSelected()) {
                        jk = "Produksi";
                        }else{
                        jk = "Marketing";
                         }
                        ps.setString(4, jk);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
                        FLogin21552011058 fl = new FLogin21552011058();
                        fl.setVisible(true);
                        ps.close();
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Silahkan Buat Email Baru!", "Email Sudah Ada", 
                        JOptionPane.WARNING_MESSAGE);
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }         
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new FLogin21552011058().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void pfPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPasswordKeyReleased
        // TODO add your handling code here:
        String password = pfPassword.getText();
        if (password.length() < 8) {
                tooltip.setText("Password Terlalu Tendek, Minimal 8 Karakter");
            }
            if (!password.matches(".*\\d.*")) {
                tooltip.setText("Password Harus Kuat Setidaknya 1 Angka");
            }
            if (!password.matches(".*[A-Z].*")) {
                tooltip.setText("Password Harus Kuat Setidaknya 1 Huruf Besar");
            }
            if (!password.matches(".*[a-z].*")) {     
                tooltip.setText("Password Harus Kuat Setidaknya 1 Huruf Kecil");
            }
            if (!password.matches(".*[!@#$%^&*()].*")) {
                tooltip.setText("Password Harus Kuat Setidaknya 1 Simbol");
        }
        if (password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[A-Z].*") 
            && password.matches(".*[a-z].*") && password.matches(".*[!@#$%^&*()].*")) {
            tooltip.setText("");
        }        
    }//GEN-LAST:event_pfPasswordKeyReleased

    private void pfConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfConfirmKeyReleased
        // TODO add your handling code here:
        String password = pfPassword.getText();
        String confirm = pfConfirm.getText();
        if (password.length() < 8) {
                tooltip.setText("Password Terlalu Tendek, Minimal 8 Karakter");
            }
            if (!password.matches(".*\\d.*")) {
                tooltip.setText("Password Harus Mengandung Setidaknya 1 Angka");
            }
            if (!password.matches(".*[A-Z].*")) {
                tooltip.setText("Password Harus Mengandung Setidaknya 1 Huruf Besar");
            }
            if (!password.matches(".*[a-z].*")) {     
                tooltip.setText("Password Harus Mengandung Setidaknya 1 Huruf Kecil");
            }
            if (!password.matches(".*[!@#$%^&*()].*")) {
                tooltip.setText("Password Harus Mengandung Setidaknya 1 Simbol");
        }
        if (confirm.length() >= 8 && confirm.matches(".*\\d.*") && confirm.matches(".*[A-Z].*") 
            && confirm.matches(".*[a-z].*") && confirm.matches(".*[!@#$%^&*()].*")) {
            if (confirm.equalsIgnoreCase(password)) {
                tooltip.setText("");
            } else {
                tooltip.setText("password harus sama!");
            }            
        }        
    }//GEN-LAST:event_pfConfirmKeyReleased

    private void tfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tfUsernameKeyTyped

    private void tfUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyReleased
        // TODO add your handling code here:
         String username = tfUsername.getText();
        if (username.length() > 10) {
            if (username.substring(username.length() - 10).equalsIgnoreCase("@gmail.com")) {
                tooltip.setText("");
            } else {
                tooltip.setText("Username Harus Berupa Format Email");
            }
        } else {
            tooltip.setText("");
        }
    }//GEN-LAST:event_tfUsernameKeyReleased

    private void rbMarkeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMarkeringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMarkeringActionPerformed

    private void rbProduksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProduksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbProduksiActionPerformed

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
            java.util.logging.Logger.getLogger(FDaftar21552011058.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDaftar21552011058.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDaftar21552011058.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDaftar21552011058.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FDaftar21552011058().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnKembali;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pfConfirm;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JRadioButton rbMarkering;
    private javax.swing.JRadioButton rbProduksi;
    private javax.swing.JTextField tfKodeUser;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JLabel tooltip;
    // End of variables declaration//GEN-END:variables
}






































