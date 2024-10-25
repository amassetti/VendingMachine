/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.utils;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
/**
 *
 * @author ariel
 */
public class JTextFieldUtils {
    
    public static void onlyDigitsOnKeyTyped(KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }
    
    public static void onlyDigitsAndDecimalPointOnKeyTyped(KeyEvent evt) {
        char keyTyped = evt.getKeyChar();
        if (!(Character.isDigit(keyTyped) || keyTyped == '.')) {
            evt.consume();
        }
    }
}
