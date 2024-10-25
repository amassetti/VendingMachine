/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.utils;

import edu.gti.asd.gui.vending.model.MachineCoinsStock;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariel
 */
public class ChangeUtil {
    
    public static List<Double> calculateCoinsToGive(double change) {
        
        // TODO take into account the stock of coins
        List<Double> listOfCoins = new ArrayList();
        int rest = Double.valueOf(change*10).intValue();
        
        while (rest > 0) {
            if (rest >= 20) {
                rest = rest - 20;
                listOfCoins.add(2d);
            } else if (rest >= 10) {
                rest = rest - 10;
                listOfCoins.add(1d);
            } else if (rest >= 5) {
                rest = rest - 5;
                listOfCoins.add(0.50);
            } else if (rest >= 2) {
                rest = rest - 2;
                listOfCoins.add(0.20);
            } else if (rest >= 1) {
                rest = rest - 1;
                listOfCoins.add(0.10);
            } else {
                rest = 0;
            }
        }
        
        return listOfCoins;
    }
    
    public static boolean checkCoinsStock(List<Double>coinsToGive, MachineCoinsStock coinsStock) {
        if (coinsStock == null) return false;
        
        // Using streams to easily count
        long quantity2e = coinsToGive.stream().filter( coin -> coin == 2d).count();
        long quantity1e = coinsToGive.stream().filter( coin -> coin == 1d).count();
        long quantity50c = coinsToGive.stream().filter( coin -> coin == 0.50).count();
        long quantity20c = coinsToGive.stream().filter( coin -> coin == 0.20).count();
        long quantity10c = coinsToGive.stream().filter( coin -> coin == 0.10).count();
        
        boolean enoughCoinsToGiveChange = (
                coinsStock.getCoin2e().getQuantity() >= quantity2e &&
                coinsStock.getCoin1e().getQuantity() >= quantity1e &&
                coinsStock.getCoin50c().getQuantity() >= quantity50c &&
                coinsStock.getCoin20c().getQuantity() >= quantity20c &&
                coinsStock.getCoin10c().getQuantity() >= quantity10c
        );
        
        return enoughCoinsToGiveChange;
    }
    
}
