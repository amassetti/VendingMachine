/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.utils;

import java.util.Date;

/**
 *
 * @author ariel
 */
public class Logger {
    
    public static void info(String in, String message) {
        System.out.println(String.format("%tc - [INFO] - %s - %s",new Date().getTime() ,  in, message));
    }
    
    public static void error(String in, String message) {
        System.err.println(String.format("%tc - [ERROR] - %s - %s",new Date().getTime() ,  in, message));
    }

    public static void warn(String in, String message) {
        System.err.println(String.format("%tc - [WARNING] - %s - %s",new Date().getTime() ,  in, message));
    }
    
    
}
