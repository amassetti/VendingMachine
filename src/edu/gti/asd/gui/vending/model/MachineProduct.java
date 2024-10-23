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
public class MachineProduct {
    
    private String productName;
    private double price;
    private int quantity;
    private JLabel quantityLabel;

    public MachineProduct() {
    }

    public MachineProduct(String productName, double price, int quantity, JLabel quantityLabel) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.quantityLabel = quantityLabel;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        quantityLabel.setText(""+this.quantity);
    }
    
    public void incrementStock(int quantity) {
        setQuantity(this.quantity + quantity);
    }
    
    public void resetStock() {
        this.quantity = 0;
        quantityLabel.setText(""+quantity);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void hideStock() {
        quantityLabel.setVisible(false);
    }

    public void showStock() {
        quantityLabel.setVisible(true);
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
    
    
}
