/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import JFrames.CustomerJFrame.CustomerDetails;
import JFrames.CustomerJFrame.DeleteCustomer;
import JFrames.CustomerJFrame.AddCustomer;
import JFrames.CustomerJFrame.UpdateCustomer;
import JFrames.ProductJF.AddProduct;
import JFrames.ProductJF.UpdateProduct;
import JFrames.ProductJF.ProductDetails;
import JFrames.ProductJF.DeleteProduct;

/**
 *
 * @author dopes
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jPanel1 = new javax.swing.JPanel();
        AddCust = new javax.swing.JLabel();
        UpdateCust = new javax.swing.JLabel();
        CustDet = new javax.swing.JLabel();
        CustDelete = new javax.swing.JLabel();
        Addprod = new javax.swing.JLabel();
        UpdateProd = new javax.swing.JLabel();
        ProdDet = new javax.swing.JLabel();
        ProdDelete = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LeftHomePanel = new javax.swing.JPanel();
        RightHomePanel = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(66, 76, 138));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddCust.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        AddCust.setForeground(new java.awt.Color(255, 255, 255));
        AddCust.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddCust.setText("Add Customer");
        AddCust.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        AddCust.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddCust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCustMouseClicked(evt);
            }
        });
        jPanel1.add(AddCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 147, 40));

        UpdateCust.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        UpdateCust.setForeground(new java.awt.Color(255, 255, 255));
        UpdateCust.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateCust.setText("Update");
        UpdateCust.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        UpdateCust.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateCust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateCustMouseClicked(evt);
            }
        });
        jPanel1.add(UpdateCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 20, 147, 40));

        CustDet.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        CustDet.setForeground(new java.awt.Color(255, 255, 255));
        CustDet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustDet.setText("Details");
        CustDet.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        CustDet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustDetMouseClicked(evt);
            }
        });
        jPanel1.add(CustDet, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 20, 147, 40));

        CustDelete.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        CustDelete.setForeground(new java.awt.Color(255, 255, 255));
        CustDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustDelete.setText("Delete");
        CustDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        CustDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustDeleteMouseClicked(evt);
            }
        });
        jPanel1.add(CustDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 20, 147, 40));

        Addprod.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Addprod.setForeground(new java.awt.Color(255, 255, 255));
        Addprod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Addprod.setText("Add Product");
        Addprod.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        Addprod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Addprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddprodMouseClicked(evt);
            }
        });
        jPanel1.add(Addprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 20, 147, 40));

        UpdateProd.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        UpdateProd.setForeground(new java.awt.Color(255, 255, 255));
        UpdateProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateProd.setText("Update");
        UpdateProd.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        UpdateProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateProdMouseClicked(evt);
            }
        });
        jPanel1.add(UpdateProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 20, 147, 40));

        ProdDet.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        ProdDet.setForeground(new java.awt.Color(255, 255, 255));
        ProdDet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProdDet.setText("Details");
        ProdDet.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        ProdDet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProdDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdDetMouseClicked(evt);
            }
        });
        jPanel1.add(ProdDet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 20, 147, 40));

        ProdDelete.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        ProdDelete.setForeground(new java.awt.Color(255, 255, 255));
        ProdDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProdDelete.setText("Delete");
        ProdDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        ProdDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProdDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdDeleteMouseClicked(evt);
            }
        });
        jPanel1.add(ProdDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1174, 20, 147, 40));

        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 606, 6));

        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 606, 6));

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CUSTOMER");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 606, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PRODUCT");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 606, -1));

        LeftHomePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout LeftHomePanelLayout = new javax.swing.GroupLayout(LeftHomePanel);
        LeftHomePanel.setLayout(LeftHomePanelLayout);
        LeftHomePanelLayout.setHorizontalGroup(
            LeftHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        LeftHomePanelLayout.setVerticalGroup(
            LeftHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(LeftHomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 610, -1));

        RightHomePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout RightHomePanelLayout = new javax.swing.GroupLayout(RightHomePanel);
        RightHomePanel.setLayout(RightHomePanelLayout);
        RightHomePanelLayout.setHorizontalGroup(
            RightHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        RightHomePanelLayout.setVerticalGroup(
            RightHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(RightHomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(255, 0, 51));
        jToggleButton1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("LOG OUT");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 160, 40));

        jToggleButton2.setBackground(new java.awt.Color(66, 76, 138));
        jToggleButton2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("BILL DETAILS");
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 650, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1386, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddCustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCustMouseClicked
        // TODO add your handling code here:
        new AddCustomer().setVisible(true);
    }//GEN-LAST:event_AddCustMouseClicked

    private void UpdateCustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateCustMouseClicked
        // TODO add your handling code here:
        new UpdateCustomer().setVisible(true);
    }//GEN-LAST:event_UpdateCustMouseClicked

    private void CustDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustDetMouseClicked
        // TODO add your handling code here:
        new CustomerDetails().setVisible(true);
    }//GEN-LAST:event_CustDetMouseClicked

    private void CustDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustDeleteMouseClicked
        // TODO add your handling code here:
        new DeleteCustomer().setVisible(true);
    }//GEN-LAST:event_CustDeleteMouseClicked

    private void AddprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddprodMouseClicked
        // TODO add your handling code here:
        new AddProduct().setVisible(true);
    }//GEN-LAST:event_AddprodMouseClicked

    private void UpdateProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateProdMouseClicked
        // TODO add your handling code here:
        new UpdateProduct().setVisible(true);
    }//GEN-LAST:event_UpdateProdMouseClicked

    private void ProdDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdDetMouseClicked
        // TODO add your handling code here:
        new ProductDetails().setVisible(true);
    }//GEN-LAST:event_ProdDetMouseClicked

    private void ProdDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdDeleteMouseClicked
        // TODO add your handling code here:
        new DeleteProduct().setVisible(true);
    }//GEN-LAST:event_ProdDeleteMouseClicked

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new Billing().setVisible(true);
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jToggleButton1MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddCust;
    private javax.swing.JLabel Addprod;
    private javax.swing.JLabel CustDelete;
    private javax.swing.JLabel CustDet;
    private javax.swing.JPanel LeftHomePanel;
    private javax.swing.JLabel ProdDelete;
    private javax.swing.JLabel ProdDet;
    private javax.swing.JPanel RightHomePanel;
    private javax.swing.JLabel UpdateCust;
    private javax.swing.JLabel UpdateProd;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
