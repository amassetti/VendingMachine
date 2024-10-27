/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.model;

import java.math.BigDecimal;
import javax.swing.JLabel;

/**
 *
 * @author ariel
 */
public class MachineCredit {
    private int coins10c;
    private int coins20c;
    private int coins50c;
    private int coins1e;
    private int coins2e;
    private BigDecimal credit = new BigDecimal(0);
    private JLabel creditLabel;

    public MachineCredit() {
    }

    public MachineCredit(JLabel creditLabel) {
        this.creditLabel = creditLabel;
    }

    public int getCoins10c() {
        return coins10c;
    }

    public void setCoins10c(int coins10c) {
        this.coins10c = coins10c;
    }

    public int getCoins20c() {
        return coins20c;
    }

    public void setCoins20c(int coins20c) {
        this.coins20c = coins20c;
    }

    public int getCoins50c() {
        return coins50c;
    }

    public void setCoins50c(int coins50c) {
        this.coins50c = coins50c;
    }

    public int getCoins1e() {
        return coins1e;
    }

    public void setCoins1e(int coins1e) {
        this.coins1e = coins1e;
    }

    public int getCoins2e() {
        return coins2e;
    }

    public void setCoins2e(int coins2e) {
        this.coins2e = coins2e;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
        creditLabel.setText("" + this.credit);
    }
    
    public JLabel getCreditLabel() {
        return creditLabel;
    }

    public void setCreditLabel(JLabel creditLabel) {
        this.creditLabel = creditLabel;
    }
    
    public void reset() {
        setCoins10c(0);
        setCoins20c(0);
        setCoins50c(0);
        setCoins1e(0);
        setCoins2e(0);
        setCredit(BigDecimal.valueOf(0.0));
    }
    
    public void addCoins10c(int quantity) {
        setCoins10c(this.coins10c+quantity);
    }
    
    public void addCoins20c(int quantity) {
        setCoins20c(this.coins20c+quantity);
    }

    public void addCoins50c(int quantity) {
        setCoins50c(this.coins50c+quantity);
    }
    
    public void addCoins1e(int quantity) {
        setCoins1e(this.coins1e+quantity);
    }
    
    public void addCoins2e(int quantity) {
        setCoins2e(this.coins2e+quantity);
    }

    public void calculateCredit() {
        BigDecimal credit = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(coins10c))
                .add(BigDecimal.valueOf(0.2).multiply(BigDecimal.valueOf(coins20c)))
                .add(BigDecimal.valueOf(0.5).multiply(BigDecimal.valueOf(coins50c)))
                .add(BigDecimal.valueOf(1).multiply(BigDecimal.valueOf(coins1e)))
                .add(BigDecimal.valueOf(2).multiply(BigDecimal.valueOf(coins2e)));
        setCredit(credit);
    }

    @Override
    public String toString() {
        return "MachineCredit{" + "coins10c=" + coins10c + ", coins20c=" + coins20c + ", coins50c=" + coins50c + ", coins1e=" + coins1e + ", coins2e=" + coins2e + ", credit=" + credit + ", creditLabel=" + creditLabel + '}';
    }

    
    
}
