/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.model;

import edu.gti.asd.gui.vending.utils.Logger;
import java.math.BigDecimal;
import javax.swing.JLabel;

/**
 *
 * @author ariel
 */
public class MachineCoinsStock {
    
    private MachineCoin coin10c;
    private MachineCoin coin20c;
    private MachineCoin coin50c;
    private MachineCoin coin1e;
    private MachineCoin coin2e;
    private JLabel totalMoneyLabel;
    private BigDecimal totalMoney = BigDecimal.ZERO;

    public MachineCoinsStock() {
    }

    public MachineCoinsStock(JLabel totalMoneyLabel) {
        this.totalMoneyLabel = totalMoneyLabel;
    }

    public MachineCoinsStock(MachineCoin coin10c, MachineCoin coin20c, MachineCoin coin50c, MachineCoin coin1e, MachineCoin coin2e, JLabel totalMoneyLabel) {
        this.coin10c = coin10c;
        this.coin20c = coin20c;
        this.coin50c = coin50c;
        this.coin1e = coin1e;
        this.coin2e = coin2e;
        this.totalMoneyLabel = totalMoneyLabel;
        Logger.info("MachineCoinsStock", "Creating object: " + this.toString());
    }

    public MachineCoin getCoin10c() {
        return coin10c;
    }

    public void setCoin10c(MachineCoin coin10c) {
        this.coin10c = coin10c;
    }

    public MachineCoin getCoin20c() {
        return coin20c;
    }

    public void setCoin20c(MachineCoin coin20c) {
        this.coin20c = coin20c;
    }

    public MachineCoin getCoin50c() {
        return coin50c;
    }

    public void setCoin50c(MachineCoin coin50c) {
        this.coin50c = coin50c;
    }

    public MachineCoin getCoin1e() {
        return coin1e;
    }

    public void setCoin1e(MachineCoin coin1e) {
        this.coin1e = coin1e;
    }

    public MachineCoin getCoin2e() {
        return coin2e;
    }

    public void setCoin2e(MachineCoin coin2e) {
        this.coin2e = coin2e;
    }

    public JLabel getTotalMoneyLabel() {
        return totalMoneyLabel;
    }

    public void setTotalMoneyLabel(JLabel totalMoneyLabel) {
        this.totalMoneyLabel = totalMoneyLabel;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
        totalMoneyLabel.setText(""+totalMoney);
    }
    
    public void reset() {
        coin10c.resetStock();
        coin20c.resetStock();
        coin50c.resetStock();
        coin1e.resetStock();
        coin2e.resetStock();
    }
    
    public BigDecimal calculateTotalMoneyInStock() {
        setTotalMoney(
                coin10c.getValue().multiply(BigDecimal.valueOf(coin10c.getQuantity()))
                .add(coin20c.getValue().multiply(BigDecimal.valueOf(coin20c.getQuantity())))
                .add(coin50c.getValue().multiply(BigDecimal.valueOf(coin50c.getQuantity())))
                .add(coin1e.getValue().multiply(BigDecimal.valueOf(coin1e.getQuantity())))
                .add(coin2e.getValue().multiply(BigDecimal.valueOf(coin2e.getQuantity())))
        );

        totalMoneyLabel.setText("" + totalMoney);
        
        return totalMoney;
    }

    
    @Override
    public String toString() {
        return "MachineCoinsStock{" + "coin10c=" + coin10c + ", coin20c=" + coin20c + ", coin50c=" + coin50c + ", coin1e=" + coin1e + ", coin2e=" + coin2e + ", totalMoneyLabel=JLabel" +  ", totalMoney=" + totalMoney + '}';
    }

}
