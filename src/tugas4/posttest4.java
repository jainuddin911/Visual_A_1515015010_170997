/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author hanif
 */
public class posttest4 extends javax.swing.JFrame {

    /**
     * Creates new form pelanggan
     */
    public posttest4() {
        initComponents();
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
        tx_nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tx_notelp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tx_beratbarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        slider_diskon = new javax.swing.JSlider();
        tx_slider = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rb_reguler = new javax.swing.JRadioButton();
        rb_express = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tx_total = new javax.swing.JTextField();
        btn_proses = new javax.swing.JButton();
        btn_ulang = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pelanggan");
        setBackground(new java.awt.Color(153, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setText("Nama :");

        tx_nama.setBackground(new java.awt.Color(102, 153, 255));
        tx_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_namaActionPerformed(evt);
            }
        });
        tx_nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tx_namaKeyReleased(evt);
            }
        });

        jLabel2.setText("No. Telepon :");

        tx_notelp.setBackground(new java.awt.Color(102, 153, 255));
        tx_notelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_notelpActionPerformed(evt);
            }
        });
        tx_notelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_notelpKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tx_notelpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_notelpKeyTyped(evt);
            }
        });

        jLabel3.setText("Berat Barang :");

        tx_beratbarang.setBackground(new java.awt.Color(102, 153, 255));
        tx_beratbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_beratbarangActionPerformed(evt);
            }
        });
        tx_beratbarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_beratbarangKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tx_beratbarangKeyReleased(evt);
            }
        });

        jLabel4.setText("KG");

        jLabel6.setText("Atur Diskon :");

        slider_diskon.setBackground(new java.awt.Color(102, 153, 255));
        slider_diskon.setValue(0);
        slider_diskon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                slider_diskonMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                slider_diskonMouseMoved(evt);
            }
        });
        slider_diskon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slider_diskonMouseReleased(evt);
            }
        });

        tx_slider.setText("0%");

        jLabel7.setText("Jenis Jasa :");

        rb_reguler.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(rb_reguler);
        rb_reguler.setText("Reguler");
        rb_reguler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rb_regulerMouseReleased(evt);
            }
        });
        rb_reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_regulerActionPerformed(evt);
            }
        });

        rb_express.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(rb_express);
        rb_express.setText("Express");
        rb_express.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rb_expressMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tx_notelp)
                    .addComponent(tx_nama)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_reguler)
                                .addGap(10, 10, 10)
                                .addComponent(rb_express))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tx_beratbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(slider_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tx_slider))
                            .addComponent(jLabel7))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tx_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tx_notelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_beratbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slider_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tx_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_reguler)
                    .addComponent(rb_express))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Total Harga :");

        tx_total.setEditable(false);
        tx_total.setBackground(new java.awt.Color(102, 153, 255));

        btn_proses.setBackground(new java.awt.Color(51, 204, 0));
        btn_proses.setText("OK (Proses)");
        btn_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesActionPerformed(evt);
            }
        });

        btn_ulang.setBackground(new java.awt.Color(204, 0, 0));
        btn_ulang.setText("Batalkan");
        btn_ulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ulangActionPerformed(evt);
            }
        });

        btn_keluar.setBackground(new java.awt.Color(255, 0, 0));
        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        jLabel9.setText("SILAHKAN KLIK TOMBOL PILIHAN DIBAWAH INI :");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setText("---------------HASIL TRANSAKSI---------------");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("*Jika anda ingin keluar, tekan tombol KELUAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_proses, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_ulang, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_total, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ulang, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btn_proses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tx_total, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("FORM PENGIRIMAN BARANG");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void slider_diskonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slider_diskonMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_slider_diskonMouseReleased

    private void slider_diskonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slider_diskonMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_slider_diskonMouseMoved

    private void slider_diskonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slider_diskonMouseDragged
        // TODO add your handling code here:
                String valueOf = String.valueOf(slider_diskon.getValue());
                tx_slider.setText(valueOf+"%");      
    }//GEN-LAST:event_slider_diskonMouseDragged

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_ulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ulangActionPerformed
        // TODO add your handling code here:
        tx_beratbarang.setText("");
        tx_nama.setText("");
        tx_notelp.setText("");
        tx_total.setText("");
        tx_slider.setText("0%");
        slider_diskon.setValue(0);
        buttonGroup1.clearSelection();
        btn_proses.setEnabled(false);
    }//GEN-LAST:event_btn_ulangActionPerformed

    private void btn_prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesActionPerformed
        // TODO add your handling code here:
        double express = 0, diskon = 0,reguler = 0, total_harga=0;
        if(tx_nama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Tidak Boleh Kosong");        
        }else if(tx_notelp.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No. Telp Tidak Boleh Kosong");        
        }else if(tx_beratbarang.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Berat Barang Tidak Boleh Kosong");
        }else if(!rb_express.isSelected() && !rb_reguler.isSelected()){
            JOptionPane.showMessageDialog(null, "Jenis Jasa Belum Dipilih");
        }else{
          diskon = slider_diskon.getValue()/100;
          if(rb_express.isSelected()){
              express = Integer.parseInt(tx_beratbarang.getText())*11500;  
              total_harga = express - (diskon*express);
          }else{
              reguler = (11500*0.5)*Integer.parseInt(tx_beratbarang.getText());
              total_harga = reguler - (diskon*reguler);
          }
          tx_total.setText(String.valueOf(total_harga));
        } 
    }//GEN-LAST:event_btn_prosesActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        btn_proses.setEnabled(false);
    }//GEN-LAST:event_formWindowActivated

    private void tx_namaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_namaKeyReleased
        // TODO add your handling code here:
        if(tx_nama.getText().equals("")||tx_notelp.getText().equals("")||tx_beratbarang.getText().equals("")||(!rb_express.isSelected() && !rb_reguler.isSelected())){
            btn_proses.setEnabled(false);
        }else {
            btn_proses.setEnabled(true);
        }
    }//GEN-LAST:event_tx_namaKeyReleased

    private void tx_notelpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_notelpKeyReleased
        // TODO add your handling code here:
        if(tx_nama.getText().equals("")||tx_notelp.getText().equals("")||tx_beratbarang.getText().equals("")||(!rb_express.isSelected() && !rb_reguler.isSelected())){
            btn_proses.setEnabled(false);
        }else {
            btn_proses.setEnabled(true);
        }
    }//GEN-LAST:event_tx_notelpKeyReleased

    private void tx_beratbarangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_beratbarangKeyReleased
        // TODO add your handling code here:
        if(tx_nama.getText().equals("")||tx_notelp.getText().equals("")||tx_beratbarang.getText().equals("")||(!rb_express.isSelected() && !rb_reguler.isSelected())){
            btn_proses.setEnabled(false);
        }else {
            btn_proses.setEnabled(true);
        }
    }//GEN-LAST:event_tx_beratbarangKeyReleased

    private void rb_regulerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_regulerMouseReleased
        // TODO add your handling code here:
        if(tx_nama.getText().equals("")||tx_notelp.getText().equals("")||tx_beratbarang.getText().equals("")||(!rb_express.isSelected() && !rb_reguler.isSelected())){
            btn_proses.setEnabled(false);
        }else {
            btn_proses.setEnabled(true);
        }
    }//GEN-LAST:event_rb_regulerMouseReleased

    private void rb_expressMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_expressMouseReleased
        // TODO add your handling code here:
        if(tx_nama.getText().equals("")||tx_notelp.getText().equals("")||tx_beratbarang.getText().equals("")||(!rb_express.isSelected() && !rb_reguler.isSelected())){
            btn_proses.setEnabled(false);
        }else {
            btn_proses.setEnabled(true);
        }
    }//GEN-LAST:event_rb_expressMouseReleased

    private void tx_beratbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_beratbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_beratbarangActionPerformed

    private void tx_notelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_notelpKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tx_notelpKeyTyped

    private void tx_notelpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_notelpKeyPressed
        // TODO add your handling code here:
        JTextField textField = new JTextField(10);
        tx_notelp.addKeyListener(new KeyAdapter() {
           public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                 e.consume();  // ignore event
              }
           }
        });
    }//GEN-LAST:event_tx_notelpKeyPressed

    private void tx_beratbarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_beratbarangKeyPressed
        // TODO add your handling code here:
        JTextField textField = new JTextField(10);
        tx_beratbarang.addKeyListener(new KeyAdapter() {
           public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if ( ((c < '0') || (c > '9') ) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_PERIOD)) {
                 e.consume();  // ignore event
              }
           }
        });
    }//GEN-LAST:event_tx_beratbarangKeyPressed

    private void tx_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_namaActionPerformed

    private void tx_notelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_notelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_notelpActionPerformed

    private void rb_regulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_regulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_regulerActionPerformed

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
            java.util.logging.Logger.getLogger(posttest4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(posttest4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(posttest4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(posttest4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new posttest4().setVisible(true);
            
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_proses;
    private javax.swing.JButton btn_ulang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rb_express;
    private javax.swing.JRadioButton rb_reguler;
    private javax.swing.JSlider slider_diskon;
    private javax.swing.JTextField tx_beratbarang;
    private javax.swing.JTextField tx_nama;
    private javax.swing.JTextField tx_notelp;
    private javax.swing.JLabel tx_slider;
    private javax.swing.JTextField tx_total;
    // End of variables declaration//GEN-END:variables

}