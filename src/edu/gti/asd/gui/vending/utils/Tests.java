/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.utils;

import edu.gti.asd.gui.vending.model.MachineCoin;
import edu.gti.asd.gui.vending.model.MachineCoinsStock;
import java.util.List;

/**
 *
 * @author ariel
 */
public class Tests {
    
    public static void main(String[] args) {
        MachineCoin coin10c = new MachineCoin("10c", 0.1, 10, null);
        MachineCoin coin20c = new MachineCoin("20c", 0.2, 10, null);
        MachineCoin coin50c = new MachineCoin("50c", 0.5, 10, null);
        MachineCoin coin1e = new MachineCoin("1e", 1, 10, null);
        MachineCoin coin2e = new MachineCoin("2e", 2, 10, null);
        
        MachineCoinsStock coinsStock = new MachineCoinsStock(coin10c, coin20c, coin50c, coin1e, coin2e, null);
        
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(0.1));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(0.2));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(0.3));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(0.4));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(0.5));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(0.6));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(0.7));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(0.8));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(0.9));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(1.0));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(1.1));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(1.3));
        System.out.println("coins: " + ChangeUtil.calculateCoinsToGive(13.9));
        
        List coinsToGive = ChangeUtil.calculateCoinsToGive(13.9);
        
        System.out.println(ChangeUtil.checkCoinsStock(coinsToGive, coinsStock));
    }
    
}
