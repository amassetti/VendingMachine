/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.model;

import edu.gti.asd.gui.vending.utils.Logger;
import java.math.BigDecimal;
import java.util.Locale;
import javax.swing.JLabel;

/**
 *
 * @author ariel
 */
public class MachineCoin {
    private String denomination;
    private BigDecimal value;
    private int quantity;
    private JLabel quantityLabel;

    public MachineCoin() {
    }

    public MachineCoin(String denomination, BigDecimal value, int quantity, JLabel quantityLabel) {
        this.denomination = denomination;
        this.value = value;
        this.quantity = quantity;
        this.quantityLabel = quantityLabel;
        Logger.info("MachineCoin", "Object created: " + this.toString());
    }
    

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
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
    
    public void decrementStock(int quantity) {
        setQuantity(this.quantity - quantity);
    }
    
    public void resetStock() {
        this.quantity = 0;
        quantityLabel.setText(""+quantity);
    }
    
    public void hideStock() {
        quantityLabel.setVisible(false);
    }

    public void showStock() {
        quantityLabel.setVisible(true);
    }
    

    @Override
    public String toString() {
        return "Coin{" + "denomination=" + denomination + ", value=" + value + ", quantity=" + quantity + '}';
    }
       
}
