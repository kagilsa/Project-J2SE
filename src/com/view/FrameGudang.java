/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.koneksi.koneksi;
import static com.koneksi.koneksi.conn;
import static com.koneksi.koneksi.pst;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public final class FrameGudang extends javax.swing.JFrame {
    public static String ambil_kd_barang_tambah, ambil_nama_barang_tambah, ambil_no_order_bukti, ambil_no_order_detail;
    /**
     * Creates new form FrameGudang
     */
    public FrameGudang() {
        initComponents();
        dataTableBarang();
        dataTableOrderInvoice();
        dataTableOrderShipped();
        NoUrutBarang();
        NoUrutOrderInvoice();
        NoUrutOrderShipped();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabOrder = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        b_buat_barang = new javax.swing.JButton();
        b_hapus_barang = new javax.swing.JButton();
        cetak_stok_barang = new javax.swing.JButton();
        b_refresh_barang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        readDataBarang = new javax.swing.JTable();
        Panel = new javax.swing.JTabbedPane();
        order = new javax.swing.JPanel();
        cetak_bukti_bayar = new javax.swing.JButton();
        refresh_bukti_bayar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataOrderInvoice = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cetak_detail_order = new javax.swing.JButton();
        refresh_bukti_bayar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dataOrderShipped = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_buat_barang.setText("Tambah");
        b_buat_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buat_barangActionPerformed(evt);
            }
        });

        b_hapus_barang.setText("Hapus");

        cetak_stok_barang.setText("Cetak Stok Barang");
        cetak_stok_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetak_stok_barangActionPerformed(evt);
            }
        });

        b_refresh_barang.setText("Refresh");
        b_refresh_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refresh_barangActionPerformed(evt);
            }
        });

        readDataBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(readDataBarang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_buat_barang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_hapus_barang)
                .addGap(60, 60, 60)
                .addComponent(cetak_stok_barang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_refresh_barang)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_buat_barang)
                    .addComponent(b_hapus_barang)
                    .addComponent(cetak_stok_barang)
                    .addComponent(b_refresh_barang))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabOrder.addTab("Produk", jPanel1);

        cetak_bukti_bayar.setText("Cetak Faktur");
        cetak_bukti_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetak_bukti_bayarActionPerformed(evt);
            }
        });

        refresh_bukti_bayar.setText("Refresh");
        refresh_bukti_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_bukti_bayarActionPerformed(evt);
            }
        });

        dataOrderInvoice.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(dataOrderInvoice);

        javax.swing.GroupLayout orderLayout = new javax.swing.GroupLayout(order);
        order.setLayout(orderLayout);
        orderLayout.setHorizontalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderLayout.createSequentialGroup()
                .addGroup(orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderLayout.createSequentialGroup()
                        .addComponent(cetak_bukti_bayar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refresh_bukti_bayar))
                    .addGroup(orderLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        orderLayout.setVerticalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cetak_bukti_bayar)
                    .addComponent(refresh_bukti_bayar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );

        Panel.addTab("Order", order);

        cetak_detail_order.setText("Cek Detail Order");
        cetak_detail_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetak_detail_orderActionPerformed(evt);
            }
        });

        refresh_bukti_bayar1.setText("Refresh");
        refresh_bukti_bayar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_bukti_bayar1ActionPerformed(evt);
            }
        });

        dataOrderShipped.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(dataOrderShipped);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cetak_detail_order)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh_bukti_bayar1)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cetak_detail_order)
                    .addComponent(refresh_bukti_bayar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Panel.addTab("Shipped Order", jPanel2);

        TabOrder.addTab("Order", Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabOrder)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabOrder))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_refresh_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refresh_barangActionPerformed
        dataTableBarang();
        NoUrutBarang();
    }//GEN-LAST:event_b_refresh_barangActionPerformed

    private void b_buat_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buat_barangActionPerformed
        TambahBarang tb = new TambahBarang();
        tb.setVisible(true);
    }//GEN-LAST:event_b_buat_barangActionPerformed

    private void cetak_bukti_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetak_bukti_bayarActionPerformed
     int tabelData = dataOrderInvoice.getSelectedRow();
        if(dataOrderInvoice.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih datanya pada tabel !!!");
        }else{
            ambil_no_order_bukti = dataOrderInvoice.getValueAt(tabelData, 1).toString();
            try{
                DetailOrderGudang detaildang = new DetailOrderGudang();
                detaildang.setVisible(true);
            }catch(Exception ex){
                Logger.getLogger(FrameSales.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cetak_bukti_bayarActionPerformed

    private void refresh_bukti_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_bukti_bayarActionPerformed
        dataTableOrderInvoice();
        NoUrutOrderInvoice();
    }//GEN-LAST:event_refresh_bukti_bayarActionPerformed

    private void cetak_detail_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetak_detail_orderActionPerformed
        int tabelData = dataOrderShipped.getSelectedRow();
        if(dataOrderShipped.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih datanya pada tabel !!!");
        }else{
            ambil_no_order_detail = dataOrderShipped.getValueAt(tabelData, 1).toString();
            try{
                DetailOrderShipped detailor = new DetailOrderShipped();
                detailor.setVisible(true);
            }catch(Exception ex){
                Logger.getLogger(FrameSales.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                                
    }//GEN-LAST:event_cetak_detail_orderActionPerformed

    private void refresh_bukti_bayar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_bukti_bayar1ActionPerformed
        dataTableOrderShipped();
        NoUrutOrderShipped();
    }//GEN-LAST:event_refresh_bukti_bayar1ActionPerformed

    private void cetak_stok_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetak_stok_barangActionPerformed
                                                         
        try{
            conn = koneksi.koneksi();
            FileInputStream fis = new FileInputStream("C:\\Users\\hamim\\OneDrive\\Documents\\NetBeansProjects\\InventoriJava\\src\\com\\controller\\laporanStokBarang.jrxml");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
            Map map = new HashMap();

            JasperReport jasperReport = (JasperReport) JasperCompileManager.compileReport(bufferedInputStream);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, conn);

            JasperViewer.viewReport(jasperPrint, false);  
        }catch(FileNotFoundException | JRException e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }//GEN-LAST:event_cetak_stok_barangActionPerformed
    private void NoUrutBarang(){
        String no;
        int brs = readDataBarang.getRowCount();
        for(int j=0;j<brs;j++){
            no = String.valueOf(j+1);
            readDataBarang.setValueAt(no,j,0);
        }
    }
    public static void dataTableBarang(){
        int jumBaris =0;
        int i=0;
        conn = koneksi.koneksi();
        String query = "SELECT kd_barang, nama_barang, harga, kualitas, stok_barang FROM barang";
        try{
            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery(query);
            
            while(res.next()){
                jumBaris++; 
            }
        }catch(SQLException ex){  
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada sistem");
        } 
        
        String isi[][] = new String[jumBaris][6];
        try{
            Statement st = conn.createStatement();
            ResultSet data = st.executeQuery(query);
            while(data.next()){   
                isi[i][1] = data.getString("kd_barang");         
                isi[i][2] = data.getString("nama_barang");
                isi[i][3] = data.getString("harga");
                isi[i][4] = data.getString("kualitas");         
                isi[i][5] = data.getString("stok_barang");                 
                i++;     
            } 
        }catch(SQLException ex){  
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan"); 
        } 
        
        String NamaKolom[] = {"No","Kode Barang","Nama Barang","Harga Barang","Kualitas","Stok Barang"}; 
        //DefaultTableModel model = new DefaultTableModel(){}; 
        DefaultTableModel dtms = new DefaultTableModel(isi,NamaKolom){
            @Override
            public boolean isCellEditable(int row, int column){
                //return false;
                switch(column){
                    case 0:
                        return false;
                    case 1:
                        return false;
                    default:
                        return true;
                 }
            }
        };
        readDataBarang.setModel(dtms);
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
            java.util.logging.Logger.getLogger(FrameGudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGudang().setVisible(true);
            }
        });
    }
     private void UbahDataBarang(){
        int input = JOptionPane.showOptionDialog(null, "Apakah ingin mengubah data barang?", "Ubah Data Customer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION){
                 try{
                    int barisCellCekProduk = readDataBarang.getSelectedRow();
                    //int kolomCellCekProduk = readData.getSelectedColumn();    
                    String kd_barang = (String)readDataBarang.getValueAt(barisCellCekProduk, 1);   
                    String nama_barang = (String)readDataBarang.getValueAt(barisCellCekProduk, 2);
                    String harga_barang = (String)readDataBarang.getValueAt(barisCellCekProduk, 3);
                    String kualitas_barang = (String)readDataBarang.getValueAt(barisCellCekProduk, 4);
                    String stok_barang = (String)readDataBarang.getValueAt(barisCellCekProduk, 5);

                    String query_ubah_produk="UPDATE barang SET nama_barang=?, harga=?, kualitas=?, stok_barang=? WHERE kd_barang=?";
                    //String no = txtNoUbahTG.getText();
                    pst = (PreparedStatement) conn.prepareStatement(query_ubah_produk);

                    pst.setString(1, nama_barang);
                    pst.setString(2, harga_barang);
                    pst.setString(3, kualitas_barang);
                    pst.setString(4, stok_barang);
                    pst.setString(5, kd_barang);
                    pst.executeUpdate();
                    //pst.execute();
                    JOptionPane.showMessageDialog(null, "Data berhasil di update");
                }catch(SQLException | ArrayIndexOutOfBoundsException e){
                        JOptionPane.showMessageDialog(null, e);
                }
            }

    }
private void NoUrutOrderInvoice(){
    String no;
    int brs = dataOrderInvoice.getRowCount();
    for(int j=0;j<brs;j++){
        no = String.valueOf(j+1);
        dataOrderInvoice.setValueAt(no,j,0);
    }
}
public static void dataTableOrderInvoice(){
        int jumBaris =0;
        int i=0;
        conn = koneksi.koneksi();
        String query="SELECT * FROM header_order as a LEFT JOIN customer as b\n" +
                        "ON a.id_customer=b. id_customer\n" +
                        "LEFT JOIN users as c\n" +
                        "on a.id_user_sales = c.id_user\n" +
                        "LEFT JOIN detail_order as d\n" +
                        "on a.no_order = d.no_order\n" +
                        "LEFT JOIN barang as e\n" +       
                        "on d.kd_barang = e.kd_barang\n" +
                        "WHERE a.status_order='Invoice' \n"+
                        "GROUP BY a.no_order\n" +
                        "ORDER by a.status_order DESC, d.tanggal_order DESC";

        try{
            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery(query);
            
            while(res.next()){
                jumBaris++; 
            }
        }catch(SQLException ex){  
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
        } 
        
        String isi[][] = new String[jumBaris][8];
        try{
            Statement st = conn.createStatement();
            ResultSet data = st.executeQuery(query);
            while(data.next()){   
                isi[i][1] = data.getString("no_order");
                isi[i][2] = data.getString("nama_customer");
                isi[i][3] = data.getString("total_penjualan"); 
                isi[i][4] = data.getString("tanggal_order");         
                isi[i][5] = data.getString("tanggal_bayar");         
                isi[i][6] = data.getString("status_order"); 
                isi[i][7] = data.getString("nama_users"); 
                i++; 
            }
        }catch(SQLException ex){  
            JOptionPane.showMessageDialog(null, ex); 
        } 
        
        String NamaKolom[] = {"No","Nomor Order","Nama Customer","Total Harga Barang","Tanggal Order","Tanggal Bayar","Status Order","Nama Sales"}; 
        //DefaultTableModel model = new DefaultTableModel(){}; 
        DefaultTableModel dtms = new DefaultTableModel(isi,NamaKolom){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dataOrderInvoice.setModel(dtms);
    }
private void NoUrutOrderShipped(){
    String no;
    int brs = dataOrderShipped.getRowCount();
    for(int j=0;j<brs;j++){
        no = String.valueOf(j+1);
        dataOrderShipped.setValueAt(no,j,0);
    }
}
public static void dataTableOrderShipped(){
        int jumBaris =0;
        int i=0;
        conn = koneksi.koneksi();
        String query="SELECT * FROM header_order as a LEFT JOIN customer as b\n" +
                        "ON a.id_customer=b. id_customer\n" +
                        "LEFT JOIN users as c\n" +
                        "on a.id_user_gudang = c.id_user\n" +
                        "LEFT JOIN detail_order as d\n" +
                        "on a.no_order = d.no_order\n" +
                        "LEFT JOIN barang as e\n" +       
                        "on d.kd_barang = e.kd_barang\n" +
                        "WHERE a.status_order='Shipped' \n"+
                        "GROUP BY a.no_order\n" +
                        "ORDER by a.status_order DESC, d.tanggal_order DESC";

        try{
            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery(query);
            
            while(res.next()){
                jumBaris++; 
            }
        }catch(SQLException ex){  
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
        } 
        
        String isi[][] = new String[jumBaris][8];
        try{
            Statement st = conn.createStatement();
            ResultSet data = st.executeQuery(query);
            while(data.next()){   
                isi[i][1] = data.getString("no_order");
                isi[i][2] = data.getString("nama_customer");
                isi[i][3] = data.getString("total_penjualan"); 
                isi[i][4] = data.getString("tanggal_order");         
                isi[i][5] = data.getString("tanggal_bayar");         
                isi[i][6] = data.getString("status_order"); 
                isi[i][7] = data.getString("nama_users"); 
                i++; 
            }
        }catch(SQLException ex){  
            JOptionPane.showMessageDialog(null, ex); 
        } 
        
        String NamaKolom[] = {"No","Nomor Order","Nama Customer","Total Harga Barang","Tanggal Order","Tanggal Bayar","Status Order","Admin Gudang"}; 
        //DefaultTableModel model = new DefaultTableModel(){}; 
        DefaultTableModel dtms = new DefaultTableModel(isi,NamaKolom){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dataOrderShipped.setModel(dtms);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Panel;
    private javax.swing.JTabbedPane TabOrder;
    private javax.swing.JButton b_buat_barang;
    private javax.swing.JButton b_hapus_barang;
    private javax.swing.JButton b_refresh_barang;
    private javax.swing.JButton cetak_bukti_bayar;
    private javax.swing.JButton cetak_detail_order;
    private javax.swing.JButton cetak_stok_barang;
    public static javax.swing.JTable dataOrderInvoice;
    public static javax.swing.JTable dataOrderShipped;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel order;
    public static javax.swing.JTable readDataBarang;
    private javax.swing.JButton refresh_bukti_bayar;
    private javax.swing.JButton refresh_bukti_bayar1;
    // End of variables declaration//GEN-END:variables
}
