/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikelompokimk;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adam
 */
public class Cekdata extends javax.swing.JFrame {
// variabel
    int q,i,id,deleteitem;
    /**
     * Creates new form Cekdata
     */
    public Cekdata() {
        initComponents();
        showTable();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        showtabel = new javax.swing.JTable();
        updatebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(150, 100));

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(102, 0, 102));
        deletebtn.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        showtabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama pendaftar", "Tempat lahir", "Tanggal lahir", "Jenis kelamin", "Kewarganegaraan", "Agama", "NIK", "Email", "No telpon", "Pendidikan Terakhir", "Nama sekolah", "Kode pos", "Program studi 1", "Program studi 2", "Provinsi", "Alamat", "Kecamatan", "Kabupaten"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showtabel.setShowGrid(true);
        jScrollPane3.setViewportView(showtabel);
        if (showtabel.getColumnModel().getColumnCount() > 0) {
            showtabel.getColumnModel().getColumn(1).setPreferredWidth(50);
            showtabel.getColumnModel().getColumn(18).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 4097, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        updatebtn.setBackground(new java.awt.Color(204, 204, 0));
        updatebtn.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 702, Short.MAX_VALUE)
                        .addComponent(updatebtn)
                        .addGap(33, 33, 33)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Halaman_utama utama = new Halaman_utama();
        utama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        try {
            if (showtabel.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(null, "klik tabel terlebih dahulu", "error", JOptionPane.ERROR_MESSAGE);

            } else {
                int klik = JOptionPane.showConfirmDialog(null, "Apakah data anda ingin di ubah?", "Update", JOptionPane.YES_OPTION);
                if (klik == JOptionPane.NO_OPTION) {
                    Cekdata data = null;
                    data.setVisible(true);
                } else {
                    HalamanDaftar daftar = new HalamanDaftar();
                    DefaultTableModel tableModel;
                    tableModel = (DefaultTableModel) showtabel.getModel();
                    int selekbaris = showtabel.getSelectedRow();
                    
                    // id
                    daftar.inputId.setText(tableModel.getValueAt(selekbaris, 0).toString());
                    //nama lengkap
                    daftar.texkinputnama.setText(tableModel.getValueAt(selekbaris, 1).toString());

                    //tempat lahir
                    daftar.texttempatlahir.setText(tableModel.getValueAt(selekbaris, 2).toString());

                    //tanggal lahir
                    daftar.texttanggallahir.setText(tableModel.getValueAt(selekbaris, 3).toString());

                    // jenis kelamin
                    if (tableModel.getValueAt(selekbaris, 4).toString().equals("Laki-laki")) {
                        daftar.lakiradiobutton.setSelected(true);
                    } else if (tableModel.getValueAt(selekbaris, 4).toString().equals("Perempuan")) {
                        daftar.perempuanradiobutton.setSelected(true);
                    }

                    //Kewarganegaraan
                    daftar.kewarganegaraancombobox.setSelectedItem(tableModel.getValueAt(selekbaris, 5));

                    // agama
                    daftar.agamacombobox.setSelectedItem(tableModel.getValueAt(selekbaris, 6));

                    //NIK
                    daftar.textNik.setText(tableModel.getValueAt(selekbaris, 7).toString());

                    //Email
                    daftar.textEmail.setText(tableModel.getValueAt(selekbaris, 8).toString());

                    //telpon
                    daftar.textTelpn.setText(tableModel.getValueAt(selekbaris, 9).toString());

                    //pendidikan terakhir
                    daftar.pendidikancombobox.setSelectedItem(tableModel.getValueAt(selekbaris, 10).toString());

                    //nama sekolah
                    daftar.textnamsekolah.setText(tableModel.getValueAt(selekbaris, 11).toString());

                    //kode pos
                    daftar.textkodepos.setText(tableModel.getValueAt(selekbaris, 12).toString());

                    //program study1
                    daftar.jurusan1.setSelectedItem(tableModel.getValueAt(selekbaris, 13).toString());

                    //program study2
                    daftar.jurusan2.setSelectedItem(tableModel.getValueAt(selekbaris, 14).toString());

                    //provinsi
                    daftar.textprovinsi.setText(tableModel.getValueAt(selekbaris, 15).toString());

                    //alamat
                    daftar.textpanealamat.setText(tableModel.getValueAt(selekbaris, 16).toString());

                    //kecamatan
                    daftar.textkecmatan.setText(tableModel.getValueAt(selekbaris, 17).toString());

                    //kabupaten
                    daftar.textkabkota.setText(tableModel.getValueAt(selekbaris, 18).toString());

                    //display
                    daftar.daftarbtn.setVisible(false);
                    daftar.updatebtn.setVisible(true);
                    daftar.setVisible(true);
                    this.dispose();
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tableModel;
        tableModel = (DefaultTableModel) showtabel.getModel();
        int selekbaris = showtabel.getSelectedRow();
        try{
        id = Integer.parseInt(tableModel.getValueAt(selekbaris, 0).toString());
        deleteitem = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus?","Peringatan",JOptionPane.YES_NO_OPTION);
        if(deleteitem == JOptionPane.YES_OPTION){
            Connection conn = (Connection) DBConnection.connectDatabase();
            PreparedStatement pst = conn.prepareStatement("DELETE from Tabel_Pendaftaran where id=?");
            pst.setInt(1, id);
            pst.executeUpdate();
             
            
        }
        }catch(SQLException ex){
     Logger.getLogger(HalamanDaftar.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_deletebtnMouseClicked

    public void showTable() {
        try {
            Statement stat = (Statement) DBConnection.connectDatabase().createStatement();
            String sql = "select * from Tabel_Pendaftaran";
            ResultSet rs = stat.executeQuery(sql);
            DefaultTableModel tableModel;
            tableModel = (DefaultTableModel) showtabel.getModel();
            while (rs.next()) {
                tableModel.addRow((new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),
                    rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19)
                }));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cekdata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(Cekdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cekdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cekdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cekdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cekdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable showtabel;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
