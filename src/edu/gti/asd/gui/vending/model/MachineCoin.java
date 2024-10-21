/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.model;

import javax.swing.JLabel;

/**
 *
 * @author ariel
 */
public class MachineCoin {
    private String denomination;
    private double value;
    private int quantity;
    private JLabel quantityLabel;

    public MachineCoin() {
    }

    public MachineCoin(String denomination, double value, int quantity, JLabel quantityLabel) {
        this.denomination = denomination;
        this.value = value;
        this.quantity = quantity;
        this.quantityLabel = quantityLabel;
    }
    

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.quantityLabel.setText(""+this.quantity);
    }

    public JLabel getQuantityLabel() {
        return quantityLabel;
    }

    public void setQuantityLabel(JLabel quantityLabel) {
        this.quantityLabel = quantityLabel;
    }
    
    public void incrementStock(int quantity) {
        setQuantity(this.quantity + quantity);
    }
    
    public void resetStock() {
        this.quantity = 0;
        quantityLabel.setText(""+quantity);
    }
    

    @Override
    public String toString() {
        return "Coin{" + "denomination=" + denomination + ", value=" + value + ", quantity=" + quantity + '}';
    }
    
    
    
}
