/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRIP;

/**
 *
 * @author ASUS
 */
public class MenuUtama extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
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

        Txt1 = new javax.swing.JLabel();
        AddButtom = new javax.swing.JButton();
        ShowDataButtom = new javax.swing.JButton();
        PriceListButtom = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        Txt1.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        Txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt1.setText("SELAMAT DATANG");

        AddButtom.setBackground(new java.awt.Color(204, 204, 255));
        AddButtom.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        AddButtom.setForeground(new java.awt.Color(102, 102, 102));
        AddButtom.setText("Pemesanan");
        AddButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtomActionPerformed(evt);
            }
        });

        ShowDataButtom.setBackground(new java.awt.Color(204, 204, 255));
        ShowDataButtom.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        ShowDataButtom.setForeground(new java.awt.Color(102, 102, 102));
        ShowDataButtom.setText("Lihat Data Pemesanan");
        ShowDataButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataButtomActionPerformed(evt);
            }
        });

        PriceListButtom.setBackground(new java.awt.Color(204, 204, 255));
        PriceListButtom.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        PriceListButtom.setForeground(new java.awt.Color(102, 102, 102));
        PriceListButtom.setText("Price List ");
        PriceListButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceListButtomActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 12)); // NOI18N
        jLabel2.setText("S'TRIP ADMIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 128, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ShowDataButtom, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(AddButtom, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(PriceListButtom, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(Txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(Txt1)
                .addGap(35, 35, 35)
                .addComponent(PriceListButtom)
                .addGap(38, 38, 38)
                .addComponent(AddButtom)
                .addGap(42, 42, 42)
                .addComponent(ShowDataButtom)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PriceListButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceListButtomActionPerformed
        PriceListMenu PriceList = new PriceListMenu();
        PriceList.setVisible(true);
        this.getDesktopPane().add(PriceList);
        this.dispose();
    }//GEN-LAST:event_PriceListButtomActionPerformed

    private void AddButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtomActionPerformed
        OrderMenu orderMenu = new OrderMenu();
        orderMenu.setVisible(true);
        this.getDesktopPane().add(orderMenu);
        this.dispose();
    }//GEN-LAST:event_AddButtomActionPerformed

    private void ShowDataButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataButtomActionPerformed
        DataPesanan Pesanan = new DataPesanan();
        Pesanan.setVisible(true);
        this.getDesktopPane().add(Pesanan);
        this.dispose();
    }//GEN-LAST:event_ShowDataButtomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButtom;
    private javax.swing.JButton PriceListButtom;
    private javax.swing.JButton ShowDataButtom;
    private javax.swing.JLabel Txt1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
