/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.utils;

import edu.gti.asd.gui.vending.model.MachineCoin;
import edu.gti.asd.gui.vending.model.MachineCoinsStock;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author ariel
 */
public class Tests {
    
    public static void main(String[] args) {
        MachineCoin coin10c = new MachineCoin("10c", BigDecimal.valueOf(0.1), 10, null);
        MachineCoin coin20c = new MachineCoin("20c", BigDecimal.valueOf(0.2), 10, null);
        MachineCoin coin50c = new MachineCoin("50c", BigDecimal.valueOf(0.5), 10, null);
        MachineCoin coin1e = new MachineCoin("1e", BigDecimal.valueOf(1), 10, null);
        MachineCoin coin2e = new MachineCoin("2e", BigDecimal.valueOf(2), 10, null);
        
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
        
        // Decision on data type for coin value
        // java double precision issue 
        double sum = 0;
        sum = sum + 5.6;
        sum = sum + 5.8;
        System.out.println(sum); // prints 11.399999999999999
        
        float sumFloat = 0;
        sumFloat = sumFloat + 5.6f;
        sumFloat = sumFloat + 5.8f;
        System.out.println("sumFloat: " + sumFloat); // prints 11.4
        
        sumFloat = 0;
        for (int i = 0 ; i < 100 ; i++) {
            sumFloat = sumFloat + 0.1f;
            System.out.println("Sum float #" + i + ": "  + sumFloat);
        }
        System.out.println("Sum float total = " + sumFloat);

        
        Double aDouble = new Double(0);
        aDouble = aDouble + 5.6;
        aDouble = aDouble + 5.8;
        System.out.println(aDouble); // prints 11.399999999999999
        
        BigDecimal aBigDecimal = new BigDecimal(0);
        aBigDecimal = aBigDecimal.add(BigDecimal.valueOf(5.6));
        aBigDecimal = aBigDecimal.add(BigDecimal.valueOf(5.8));
        System.out.println("aBigDecimal: " + aBigDecimal); // prints 11.4
        
        BigDecimal sumBigDecimal = new BigDecimal(0);
        for (int i = 0 ; i < 100 ; i++) {
            sumBigDecimal = sumBigDecimal.add(BigDecimal.valueOf(0.1));
            System.out.println("Sum big decimal #" + i + ": "  + sumBigDecimal);
        }
        System.out.println("Sum big decimal total = " + sumBigDecimal);
        
        // As you can see, with BigDecimal there is no precision issue
        // so that's why I choose BigDecimal

        
    }
    
}
