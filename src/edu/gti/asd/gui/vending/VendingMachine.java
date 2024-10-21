/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.gti.asd.gui.vending;

import edu.gti.asd.gui.vending.model.MachineCoin;
import edu.gti.asd.gui.vending.model.MachineCredit;
import edu.gti.asd.gui.vending.model.MachineProduct;
import edu.gti.asd.gui.vending.model.MachineSelectedProduct;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class VendingMachine extends javax.swing.JFrame {

    public static MachineCoin coin10c;
    public static MachineCoin coin20c;
    public static MachineCoin coin50c;
    public static MachineCoin coin1e;
    public static MachineCoin coin2e;


    public static MachineProduct productCoca;
    public static MachineProduct product7up;
    public static MachineProduct productFanta;
    public static MachineProduct productSchweps;
        
    public static MachineCredit credit;
    public static MachineSelectedProduct selectedProduct;
    

    /**
     * Creates new form VendingMachine
     */
    public VendingMachine() {
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

        buttonGroupProducts = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2e = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1e = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel50c = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20c = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10c = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelSelected = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCredit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jToggleButtonCoca = new javax.swing.JToggleButton();
        jLabelCoca = new javax.swing.JLabel();
        jToggleButton7Up = new javax.swing.JToggleButton();
        jLabel7up = new javax.swing.JLabel();
        jToggleButtonFanta = new javax.swing.JToggleButton();
        jLabelFanta = new javax.swing.JLabel();
        jToggleButtonSchweps = new javax.swing.JToggleButton();
        jLabelSchweps = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonPay = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Admin = new javax.swing.JMenu();
        jMenuItemAddCoins = new javax.swing.JMenuItem();
        jMenuItemAddStock = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemClearAll = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Coins in stock"));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel6.setText("2e");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2e.setText("0");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel5.setText("1e");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1e.setText("0");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel3.setText("50c");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel50c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50c.setText("0");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel4.setText("20c");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel20c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20c.setText("0");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel2.setText("10c");
        jLabel2.setToolTipText("");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10c.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10c, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20c, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50c, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1e, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2e, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10c)
                    .addComponent(jLabel20c)
                    .addComponent(jLabel50c)
                    .addComponent(jLabel1e)
                    .addComponent(jLabel2e))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selected Product"));

        jLabel7.setText("Selected:");

        jLabelSelected.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Price:");

        jLabelPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Credit"));

        jLabel1.setText("Credit:");

        jLabelCredit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCredit.setText("0");
        jLabelCredit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Open Wallet");
        jButton1.setToolTipText("Open Wallet to add money");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelCredit)
                    .addComponent(jButton1))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Products"));

        buttonGroupProducts.add(jToggleButtonCoca);
        jToggleButtonCoca.setText("Coca");
        jToggleButtonCoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCocaActionPerformed(evt);
            }
        });

        jLabelCoca.setText("0");

        buttonGroupProducts.add(jToggleButton7Up);
        jToggleButton7Up.setText("7up");
        jToggleButton7Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7UpActionPerformed(evt);
            }
        });

        jLabel7up.setText("0");

        buttonGroupProducts.add(jToggleButtonFanta);
        jToggleButtonFanta.setText("Fanta");
        jToggleButtonFanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonFantaActionPerformed(evt);
            }
        });

        jLabelFanta.setText("0");

        buttonGroupProducts.add(jToggleButtonSchweps);
        jToggleButtonSchweps.setText("Schweps");
        jToggleButtonSchweps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSchwepsActionPerformed(evt);
            }
        });

        jLabelSchweps.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelCoca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonCoca, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton7Up, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelFanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButtonFanta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelSchweps, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButtonSchweps)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonCoca, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCoca))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton7Up, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7up))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonFanta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFanta))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonSchweps, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSchweps))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        jButtonPay.setText("Pay");
        jButtonPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPayActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPay, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButtonPay)
                .addGap(26, 26, 26)
                .addComponent(jButtonCancel)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        Admin.setText("Admin");

        jMenuItemAddCoins.setText("Add Coins");
        jMenuItemAddCoins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddCoinsActionPerformed(evt);
            }
        });
        Admin.add(jMenuItemAddCoins);

        jMenuItemAddStock.setText("Add Products");
        jMenuItemAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddStockActionPerformed(evt);
            }
        });
        Admin.add(jMenuItemAddStock);
        Admin.add(jSeparator1);

        jMenuItemClearAll.setText("Clear all");
        jMenuItemClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClearAllActionPerformed(evt);
            }
        });
        Admin.add(jMenuItemClearAll);

        jMenuBar1.add(Admin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearAllStock() {
        clearCoinsStock();
        clearProductsStock();
        
    } 
    
    private void clearCoinsStock() {
        coin10c.resetStock();
        coin20c.resetStock();
        coin50c.resetStock();
        coin1e.resetStock();
        coin2e.resetStock();
    }
    
    private void clearProductsStock() {
        productCoca.resetStock();
        product7up.resetStock();
        productFanta.resetStock();
        productSchweps.resetStock();
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Wallet wallet = new Wallet();
        wallet.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItemAddCoinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddCoinsActionPerformed
        AdminAddCoins addCoins = new AdminAddCoins();
        addCoins.setVisible(true);
    }//GEN-LAST:event_jMenuItemAddCoinsActionPerformed

    private void jButtonPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPayActionPerformed
        if (selectedProduct != null && selectedProduct.getSelectedProduct() == null) {
            JOptionPane.showMessageDialog(this, "You must select a product first");
            return;
        }
        
        // Check stock
        if (selectedProduct.getSelectedProduct().getQuantity() <= 0) {
            JOptionPane.showMessageDialog(this, "There is no stock of " + selectedProduct.getSelectedProduct().getProductName() + " at the moment");
            return;
        }
        
        
        // Check money
        if (credit.getCredit() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter the required amount: " + selectedProduct.getSelectedProduct().getPrice());
            return;
        }
        
        if (credit.getCredit() < selectedProduct.getSelectedProduct().getPrice()) {
            JOptionPane.showMessageDialog(this, "More money is required. You added: " + credit.getCredit() + ", required:  " + selectedProduct.getSelectedProduct().getPrice());
            return;
        }
        
        // Check change
        double difference = credit.getCredit() - selectedProduct.getSelectedProduct().getPrice();
        
        if (difference == 0) {
            // OK
        } else {
            // Give change
        }
        
        
        // Update stock
        
        // Resert credit and selected product
        credit.reset();
        selectedProduct.reset();
    }//GEN-LAST:event_jButtonPayActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        coin10c = new MachineCoin("10c", 0.1, 0, jLabel10c);
        coin20c = new MachineCoin("20c", 0.2, 0, jLabel20c);
        coin50c = new MachineCoin("50c", 0.5, 0, jLabel50c);
        coin1e = new MachineCoin("1e", 1, 0, jLabel1e);
        coin2e = new MachineCoin("2e", 2, 0, jLabel2e);
        
        productCoca = new MachineProduct("Coca", 2.8, 0, jLabelCoca);
        product7up = new MachineProduct("7up", 2.7, 0, jLabel7up);
        productFanta = new MachineProduct("Fanta", 1.8, 0, jLabelFanta);
        productSchweps = new MachineProduct("Schweps",3.2, 0, jLabelSchweps);
        
        selectedProduct = new MachineSelectedProduct(jLabelSelected, jLabelPrice);
        
        credit = new MachineCredit(jLabelCredit);
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jMenuItemAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddStockActionPerformed
        AdminAddProducts products = new AdminAddProducts();
        products.setVisible(true);
    }//GEN-LAST:event_jMenuItemAddStockActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        credit.reset();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jToggleButtonCocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCocaActionPerformed
        selectedProduct.setSelectedProduct(productCoca);
        selectedProduct.setToggleButton(jToggleButtonCoca);
    }//GEN-LAST:event_jToggleButtonCocaActionPerformed

    private void jToggleButton7UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7UpActionPerformed
        selectedProduct.setSelectedProduct(product7up);
        selectedProduct.setToggleButton(jToggleButton7Up);
    }//GEN-LAST:event_jToggleButton7UpActionPerformed

    private void jToggleButtonFantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonFantaActionPerformed
        selectedProduct.setSelectedProduct(productFanta);
        selectedProduct.setToggleButton(jToggleButtonFanta);
    }//GEN-LAST:event_jToggleButtonFantaActionPerformed

    private void jToggleButtonSchwepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSchwepsActionPerformed
        selectedProduct.setSelectedProduct(productSchweps);
        selectedProduct.setToggleButton(jToggleButtonSchweps);
    }//GEN-LAST:event_jToggleButtonSchwepsActionPerformed

    private void jMenuItemClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClearAllActionPerformed
        clearAllStock();
    }//GEN-LAST:event_jMenuItemClearAllActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemExitActionPerformed

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
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendingMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Admin;
    private javax.swing.ButtonGroup buttonGroupProducts;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonPay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10c;
    private javax.swing.JLabel jLabel1e;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20c;
    private javax.swing.JLabel jLabel2e;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50c;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel7up;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCoca;
    private javax.swing.JLabel jLabelCredit;
    private javax.swing.JLabel jLabelFanta;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelSchweps;
    private javax.swing.JLabel jLabelSelected;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAddCoins;
    private javax.swing.JMenuItem jMenuItemAddStock;
    private javax.swing.JMenuItem jMenuItemClearAll;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToggleButton jToggleButton7Up;
    private javax.swing.JToggleButton jToggleButtonCoca;
    private javax.swing.JToggleButton jToggleButtonFanta;
    private javax.swing.JToggleButton jToggleButtonSchweps;
    // End of variables declaration//GEN-END:variables
}
