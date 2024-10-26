/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.model;

import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author ariel
 */
public class MachineSelectedProduct {
    private MachineProduct selectedProduct;
    private JLabel labelSelectedName;
    private JLabel labelSelectedPrice;
    private JToggleButton toggleButton;

    public MachineSelectedProduct() {
    }

    public MachineSelectedProduct(JLabel labelSelectedName, JLabel labelSelectedPrice) {
        this.labelSelectedName = labelSelectedName;
        this.labelSelectedPrice = labelSelectedPrice;
    }

    public MachineProduct getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(MachineProduct selectedProduct) {
        this.selectedProduct = selectedProduct;
        if (this.selectedProduct != null) {
            if (this.selectedProduct.getQuantity() > 0) {
                labelSelectedName.setText(this.selectedProduct.getProductName());
            } else {
                labelSelectedName.setText("NO STOCK OF " + this.selectedProduct.getProductName());
            }
            
            labelSelectedPrice.setText("" + this.selectedProduct.getPrice());
        } else {
            labelSelectedName.setText("");
            labelSelectedPrice.setText("");
        }
    }

    public JLabel getLabelSelectedName() {
        return labelSelectedName;
    }

    public void setLabelSelectedName(JLabel labelSelectedName) {
        this.labelSelectedName = labelSelectedName;
    }

    public JLabel getLabelSelectedPrice() {
        return labelSelectedPrice;
    }

    public void setLabelSelectedPrice(JLabel labelSelectedPrice) {
        this.labelSelectedPrice = labelSelectedPrice;
    }

    public JToggleButton getToggleButton() {
        return toggleButton;
    }

    public void setToggleButton(JToggleButton toggleButton) {
        this.toggleButton = toggleButton;
    }
    
    
    public void reset() {
        setSelectedProduct(null);
        toggleButton.setSelected(false);
    }

    @Override
    public String toString() {
        return "MachineSelectedProduct{" + "selectedProduct=" + selectedProduct + ", labelSelectedName=" + labelSelectedName + ", labelSelectedPrice=" + labelSelectedPrice + '}';
    }
    
    
}
