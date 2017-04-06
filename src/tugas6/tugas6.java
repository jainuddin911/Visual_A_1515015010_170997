
package tugas6;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tugas6 extends javax.swing.JFrame {

private DefaultTableModel model;
private Connection con=database.getConnection();
private Statement stt;
private ResultSet rss;
private int baris;
private boolean cek=true;

public tugas6(){
    initComponents();
}

public void Initable(){
    model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("JUDUL");
    model.addColumn("PENULIS");
    model.addColumn("HARGA");
    tabel.setModel(model);
}
private void TampilData(){
    try{
        String sql="SELECT *FROM buku";
        stt=con.createStatement();
        rss=stt.executeQuery(sql);
        while(rss.next()){
            Object[]o=new Object[4];
            o[0]=rss.getInt("id");
            o[1]=rss.getString("judul");
            o[2]=rss.getString("penulis");
            o[3]=rss.getString("harga");
            model.addRow(o);
        }
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}
private void TambahData(String judul, String penulis, String harga){
    try{
        String sql=
                "insert into buku values(NULL,'"+judul+"','"+penulis+"',"+harga+")";
        stt=con.createStatement();
        stt.executeUpdate(sql);
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}

private void UbahData(String judul, String penulis, String harga, String id){
    try{
        String sql = "update buku set"+"judul='"+tjudul+"',"+"penulis='"+tpenulis+"',"+"harga='"+tharga+"'"+"where id='"+id+"'";
        stt = con.createStatement();
        stt.executeUpdate(sql);
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
}

private void HapusData(String id,int baris){
    try{
        String sqldelete = "delete from buku where id='"+id+"'";
        stt = con.createStatement();
        stt.executeUpdate(sqldelete);
        model.removeRow(baris);
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
}
private void cariid(){
    try{
        String sql = "select *from buku where id='"+caridata.getText()+"'";
        stt = con.createStatement();
        rss = stt.executeQuery(sql);
        while(rss.next()){
            Object[]o= new Object[4];
            o[0] = rss.getInt("id");
            o[1] = rss.getString("judul");
            o[2] = rss.getString("penulis");
            o[3] = rss.getString("harga");
            model.addRow(o);
        }
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
}
private void carijudul(){
    try{
        String sql = "select *from buku where judul='"+caridata.getText()+"'";
        stt = con.createStatement();
        rss = stt.executeQuery(sql);
        while(rss.next()){
            Object[]o= new Object[4];
            o[0] = rss.getInt("id");
            o[1] = rss.getString("judul");
            o[2] = rss.getString("penulis");
            o[3] = rss.getString("harga");
            model.addRow(o);
        }
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
}

private void caripenulis(){
    try{
        String sql = "select *from buku where penulis='"+caridata.getText()+"'";
        stt = con.createStatement();
        rss = stt.executeQuery(sql);
        while(rss.next()){
            Object[]o= new Object[4];
            o[0] = rss.getInt("id");
            o[1] = rss.getString("judul");
            o[2] = rss.getString("penulis");
            o[3] = rss.getString("harga");
            model.addRow(o);
        }
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
}
private void cariharga(){
    try{
        String sql = "select *from buku where harga='"+caridata.getText()+"'";
        stt = con.createStatement();
        rss = stt.executeQuery(sql);
        while(rss.next()){
            Object[]o= new Object[4];
            o[0] = rss.getInt("id");
            o[1] = rss.getString("judul");
            o[2] = rss.getString("penulis");
            o[3] = rss.getString("harga");
            model.addRow(o);
        }
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
}
private void validasi(String judul, String penulis, String harga){
    try{
        String sql = "select *from buku";
        stt = con.createStatement();
        ResultSet rss = stt.executeQuery(sql) ;
        while(rss.next()){
            Object[]o= new Object[2];
            o[0] = rss.getString("judul").toLowerCase();
            o[1] = rss.getString("penulis").toLowerCase();
            if(o[0].equals(judul.toLowerCase())&&o[1].equals(penulis.toLowerCase())){
            JOptionPane.showMessageDialog(null,"data sudah ada");
            cek=false;
            break;
            }
        }if(cek==true){
            TambahData(judul, penulis, harga);
        }
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tjudul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tpenulis = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        tharga = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        lihat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        caridata = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        by = new javax.swing.JComboBox();
        cari = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setText("Form Data Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel2.setText("Judul");

        jLabel3.setText("Penulis");

        tpenulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Penulis", "Ahmad Suyuti", "Abdul Haris", "Jainuddin", "Dika Mahardika" }));

        jLabel4.setText("Harga");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tjudul)
                    .addComponent(tpenulis, 0, 220, Short.MAX_VALUE)
                    .addComponent(tharga))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tpenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setText("Keluar");
        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarMouseClicked(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Judul", "Penulis", "harga"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        lihat.setText("Lihat Data");
        lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatActionPerformed(evt);
            }
        });

        jLabel5.setText("Cari Data");

        jLabel6.setText("by");

        by.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Silahkan Pilih", "Id", "Judul", "Penulis", "Harga" }));

        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(caridata, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cari))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(simpan)
                                .addGap(18, 18, 18)
                                .addComponent(ubah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(lihat)
                                .addGap(18, 18, 18)
                                .addComponent(keluar)))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(ubah)
                    .addComponent(hapus)
                    .addComponent(keluar)
                    .addComponent(lihat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(caridata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here
        String judul=tjudul.getText();
        String penulis=tpenulis.getSelectedItem().toString();
        String harga = tharga.getText();
        validasi (judul, penulis, harga);
        
        Initable();
        TampilData();
    }//GEN-LAST:event_simpanActionPerformed

    private void keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int baris = tabel.getSelectedRow();
        String id = tabel.getValueAt(baris, 0).toString();
        HapusData(id, baris);
    }//GEN-LAST:event_hapusActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int baris = tabel.getSelectedRow();
        
        String id=tabel.getValueAt(baris,0).toString();
        String judul=tabel.getValueAt(baris,1).toString();
        String penulis=tabel.getValueAt(baris,2).toString();
        String harga=tabel.getValueAt(baris,3).toString();
        
        tjudul.setText(judul);
        tpenulis.setSelectedItem(penulis);
        tharga.setText(harga);
    }//GEN-LAST:event_tabelMouseClicked

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        int baris = tabel.getSelectedRow();
        
        tabel.setValueAt(tjudul.getText(), baris, 1);
        tabel.setValueAt(tpenulis.getSelectedItem(), baris, 2);
         tabel.setValueAt(tharga.getText(), baris, 3);
         String id=tabel.getValueAt(baris,0).toString();
         String judul=tabel.getValueAt(baris,1).toString();
         String penulis=tabel.getValueAt(baris,0).toString();
         String harga=tabel.getValueAt(baris,0).toString();
         
        tjudul.setText(judul);
        tpenulis.setSelectedItem(penulis);
        tharga.setText(harga);
        
        UbahData(judul,penulis,harga,id);
    }//GEN-LAST:event_ubahActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        if(caridata.getText().equals("")){
            JOptionPane.showMessageDialog(null,"apa yang anda cari","tidak ditemukan",JOptionPane.INFORMATION_MESSAGE);
        }else{
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            if(by.getSelectedItem().equals("Id")){
                cariid();
            }else if(by.getSelectedItem().equals("Judul")){
                carijudul();
            }else if(by.getSelectedItem().equals("penulis")){
                caripenulis();
            }else{
                cariharga();
            }
        }
    }//GEN-LAST:event_cariActionPerformed

    private void lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatActionPerformed
        // TODO add your handling code here:
        Initable();
        TampilData();
    }//GEN-LAST:event_lihatActionPerformed

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
            java.util.logging.Logger.getLogger(tugas6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tugas6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tugas6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tugas6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tugas6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox by;
    private javax.swing.JButton cari;
    private javax.swing.JTextField caridata;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton lihat;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tharga;
    private javax.swing.JTextField tjudul;
    private javax.swing.JComboBox tpenulis;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
