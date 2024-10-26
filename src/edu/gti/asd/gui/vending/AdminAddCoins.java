/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.gti.asd.gui.vending;

import edu.gti.asd.gui.vending.utils.JTextFieldUtils;

/**
 *
 * @author ariel
 */
public class AdminAddCoins extends javax.swing.JFrame {
    
    public static int q10c;
    public static int q20c;
    public static int q50c;
    public static int q1e;
    public static int q2e;
    public static double moneyToAdd; 

    /**
     * Creates new form Wallet
     */
    public AdminAddCoins() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextFieldTotalToAdd = new javax.swing.JTextField();
        jButtonAddMoney = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2e = new javax.swing.JButton();
        jTextField2e = new javax.swing.JTextField();
        jTextField1e = new javax.swing.JTextField();
        jButton1e = new javax.swing.JButton();
        jButton50c = new javax.swing.JButton();
        jTextField50c = new javax.swing.JTextField();
        jButton20c = new javax.swing.JButton();
        jTextField20c = new javax.swing.JTextField();
        jButton10c = new javax.swing.JButton();
        jTextField10c = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Coins to machine");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Total money to add ito the machine:");

        jTextFieldTotalToAdd.setText("0");

        jButtonAddMoney.setText("Add Coins to machine");
        jButtonAddMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMoneyActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select coins to add"));

        jButton2e.setText("2e");
        jButton2e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2eActionPerformed(evt);
            }
        });

        jTextField2e.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2eFocusLost(evt);
            }
        });
        jTextField2e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2eActionPerformed(evt);
            }
        });
        jTextField2e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2eKeyTyped(evt);
            }
        });

        jTextField1e.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1eFocusLost(evt);
            }
        });
        jTextField1e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1eKeyTyped(evt);
            }
        });

        jButton1e.setText("1e");
        jButton1e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1eActionPerformed(evt);
            }
        });

        jButton50c.setText("50c");
        jButton50c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50cActionPerformed(evt);
            }
        });

        jTextField50c.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField50cFocusLost(evt);
            }
        });
        jTextField50c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField50cKeyTyped(evt);
            }
        });

        jButton20c.setText("20c");
        jButton20c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20cActionPerformed(evt);
            }
        });

        jTextField20c.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField20cFocusLost(evt);
            }
        });
        jTextField20c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20cActionPerformed(evt);
            }
        });
        jTextField20c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField20cKeyTyped(evt);
            }
        });

        jButton10c.setText("10c");
        jButton10c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10cActionPerformed(evt);
            }
        });

        jTextField10c.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField10cFocusLost(evt);
            }
        });
        jTextField10c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10cKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton10c, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton20c, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton50c, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1e, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2e, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField10c, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField20c, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField50c, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1e, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2e, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2e, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1e, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50c, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20c, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10c, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField50c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTotalToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTotalToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButtonAddMoney)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateMoney() {
        double moneyToAdd = (q10c*0.1)+(q20c*0.2)+(q50c*0.5)+(q1e*1)+(q2e*2);
        jTextFieldTotalToAdd.setText(""+moneyToAdd);
    }
    
    private void jButton10cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10cActionPerformed
        q10c+=10;
        jTextField10c.setText(""+q10c);
        updateMoney();
    }//GEN-LAST:event_jButton10cActionPerformed

    private void jButton20cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20cActionPerformed
        q20c+=10;
        jTextField20c.setText(""+q20c);
        updateMoney();
    }//GEN-LAST:event_jButton20cActionPerformed

    private void jButton50cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50cActionPerformed
        q50c+=10;
        jTextField50c.setText(""+q50c);
        updateMoney();
    }//GEN-LAST:event_jButton50cActionPerformed

    private void jButton1eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1eActionPerformed
        q1e+=10;
        jTextField1e.setText(""+q1e);
        updateMoney();
    }//GEN-LAST:event_jButton1eActionPerformed

    private void jButton2eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2eActionPerformed
        q2e+=10;
        jTextField2e.setText(""+q2e);
        updateMoney();
    }//GEN-LAST:event_jButton2eActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        q10c = 0;
        q20c = 0;
        q50c = 0;
        q1e = 0;
        q2e = 0;
    }//GEN-LAST:event_formWindowOpened

    private void jTextField20cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20cActionPerformed

    private void jTextField10cFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10cFocusLost
        q10c = Integer.parseInt(jTextField10c.getText());
        updateMoney();
    }//GEN-LAST:event_jTextField10cFocusLost

    private void jTextField20cFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField20cFocusLost
        q20c = Integer.parseInt(jTextField20c.getText());
        updateMoney();
    }//GEN-LAST:event_jTextField20cFocusLost

    private void jTextField50cFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField50cFocusLost
        q50c = Integer.parseInt(jTextField50c.getText());
        updateMoney();
    }//GEN-LAST:event_jTextField50cFocusLost

    private void jTextField1eFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1eFocusLost
        q1e = Integer.parseInt(jTextField1e.getText());
        updateMoney();

    }//GEN-LAST:event_jTextField1eFocusLost

    private void jTextField2eFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2eFocusLost
        q2e = Integer.parseInt(jTextField2e.getText());
        updateMoney();

    }//GEN-LAST:event_jTextField2eFocusLost

    private void jButtonAddMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMoneyActionPerformed
        VendingMachine.coinStock.getCoin10c().incrementStock(q10c);
        VendingMachine.coinStock.getCoin20c().incrementStock(q20c);
        VendingMachine.coinStock.getCoin50c().incrementStock(q50c);
        VendingMachine.coinStock.getCoin1e().incrementStock(q1e);
        VendingMachine.coinStock.getCoin2e().incrementStock(q2e);
        VendingMachine.coinStock.calculateTotalMoneyInStock();
        dispose();
    }//GEN-LAST:event_jButtonAddMoneyActionPerformed

    private void jTextField2eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2eActionPerformed

    private void jTextField10cKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10cKeyTyped
        JTextFieldUtils.onlyDigitsOnKeyTyped(evt);
    }//GEN-LAST:event_jTextField10cKeyTyped

    private void jTextField20cKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20cKeyTyped
        JTextFieldUtils.onlyDigitsOnKeyTyped(evt);
    }//GEN-LAST:event_jTextField20cKeyTyped

    private void jTextField50cKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField50cKeyTyped
        JTextFieldUtils.onlyDigitsOnKeyTyped(evt);
    }//GEN-LAST:event_jTextField50cKeyTyped

    private void jTextField1eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1eKeyTyped
        JTextFieldUtils.onlyDigitsOnKeyTyped(evt);
    }//GEN-LAST:event_jTextField1eKeyTyped

    private void jTextField2eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2eKeyTyped
        JTextFieldUtils.onlyDigitsOnKeyTyped(evt);
    }//GEN-LAST:event_jTextField2eKeyTyped

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
            java.util.logging.Logger.getLogger(AdminAddCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddCoins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10c;
    private javax.swing.JButton jButton1e;
    private javax.swing.JButton jButton20c;
    private javax.swing.JButton jButton2e;
    private javax.swing.JButton jButton50c;
    private javax.swing.JButton jButtonAddMoney;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10c;
    private javax.swing.JTextField jTextField1e;
    private javax.swing.JTextField jTextField20c;
    private javax.swing.JTextField jTextField2e;
    private javax.swing.JTextField jTextField50c;
    private javax.swing.JTextField jTextFieldTotalToAdd;
    // End of variables declaration//GEN-END:variables
}
