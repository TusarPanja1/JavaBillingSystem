/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames.CustomerJFrame;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

/**
 *
 * @author dopes
 */
public class DeleteCustomer extends javax.swing.JFrame {

    /**
     * Creates new form DeleteCustomer
     */
    public DeleteCustomer() {
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
        jLabel1 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        custName = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Location = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Gender = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        DeleteBtn = new javax.swing.JToggleButton();
        CloseBtn = new javax.swing.JToggleButton();
        SearchContact = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(55, 140));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 76, 138));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DELETE CUSTOMER");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(66, 76, 138)));

        SearchBtn.setBackground(new java.awt.Color(66, 76, 138));
        SearchBtn.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchBtn.setText("SEARCH");
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(66, 76, 138));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 76, 138));
        jLabel3.setText("NAME :");

        custName.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        custName.setForeground(new java.awt.Color(66, 76, 138));
        custName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        custName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(66, 76, 138)));
        custName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameActionPerformed(evt);
            }
        });

        contact.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        contact.setForeground(new java.awt.Color(66, 76, 138));
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(66, 76, 138)));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 76, 138));
        jLabel4.setText("CONTACT :");

        Email.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(66, 76, 138));
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(66, 76, 138)));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 76, 138));
        jLabel5.setText("EMAIL :");

        Location.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        Location.setForeground(new java.awt.Color(66, 76, 138));
        Location.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Location.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(66, 76, 138)));
        Location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 76, 138));
        jLabel6.setText("LOCATION :");

        Gender.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        Gender.setForeground(new java.awt.Color(66, 76, 138));
        Gender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Gender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(66, 76, 138)));
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 76, 138));
        jLabel7.setText("GENDER :");

        jSeparator2.setForeground(new java.awt.Color(66, 76, 138));

        DeleteBtn.setBackground(new java.awt.Color(66, 76, 138));
        DeleteBtn.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        CloseBtn.setBackground(new java.awt.Color(66, 76, 138));
        CloseBtn.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        CloseBtn.setText("CLOSE");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });

        SearchContact.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        SearchContact.setForeground(new java.awt.Color(204, 204, 204));
        SearchContact.setText("      ENTER CONTACT NUMBER");
        SearchContact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 76, 138), 1, true));
        SearchContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchContactFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(SearchContact, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(SearchBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(DeleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseBtn)
                .addGap(156, 156, 156))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(SearchContact)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBtn)
                    .addComponent(CloseBtn))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void LocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        // TODO add your handling code here:
       setVisible(false);
    }//GEN-LAST:event_CloseBtnActionPerformed

    private void SearchContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchContactFocusGained
        // TODO add your handling code here:
         if(SearchContact.getText().equals("      ENTER CONTACT NUMBER"))
        {
            SearchContact.setText("");
            SearchContact.setForeground(new Color(66,76,138));
        }
    }//GEN-LAST:event_SearchContactFocusGained

    private void SearchContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchContactFocusLost
        // TODO add your handling code here:
         if(SearchContact.getText().equals(""))
        {
            SearchContact.setText("      ENTER CONTACT NUMBER");
            SearchContact.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_SearchContactFocusLost

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        String search=SearchContact.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from newcustomer where Contact='"+search+"'");
            if(rs.next())
            {
                custName.setText(rs.getString(1));
                contact.setText(rs.getString(2));
                Email.setText(rs.getString(3));
                Location.setText(rs.getString(4));
                Gender.setText(rs.getString(5));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Contact Number is not registered");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        String search=SearchContact.getText();
        int a=JOptionPane.showConfirmDialog(null, "Do You really want to delete?");
        if(a==0)
        {
            try{
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.execute("delete from newcustomer where Contact='"+search+"'");
                JOptionPane.showMessageDialog(null, "Customer Deleted Successfully");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CloseBtn;
    private javax.swing.JToggleButton DeleteBtn;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField Location;
    private javax.swing.JToggleButton SearchBtn;
    private javax.swing.JTextField SearchContact;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField custName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
