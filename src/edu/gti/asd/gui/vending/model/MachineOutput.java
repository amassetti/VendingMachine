/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gti.asd.gui.vending.model;

import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ariel
 */
public class MachineOutput {
    
    // Reference to Visual Components
    private JLabel jLabelOutputMessage;
    
    private JLabel jLabelOutputCoca;
    private JLabel jLabelOutput7up;
    private JLabel jLabelOutputFanta;
    private JLabel jLabelOutputSchweps;
    
    private JTextField jTextFieldOutput2e;
    private JTextField jTextFieldOutput1e;
    private JTextField jTextFieldOutput50c;
    private JTextField jTextFieldOutput20c;
    private JTextField jTextFieldOutput10c;
    
    private boolean empty = true;

    public MachineOutput() {
    }

    public MachineOutput(JLabel jLabelOutputMessage, JLabel jLabelOutputCoca, JLabel jLabelOutput7up, JLabel jLabelOutputFanta, JLabel jLabelOutputSchweps, JTextField jTextFieldOutput2e, JTextField jTextFieldOutput1e, JTextField jTextFieldOutput50c, JTextField jTextFieldOutput20c, JTextField jTextFieldOutput10c) {
        this.jLabelOutputMessage = jLabelOutputMessage;
        this.jLabelOutputCoca = jLabelOutputCoca;
        this.jLabelOutput7up = jLabelOutput7up;
        this.jLabelOutputFanta = jLabelOutputFanta;
        this.jLabelOutputSchweps = jLabelOutputSchweps;
        this.jTextFieldOutput2e = jTextFieldOutput2e;
        this.jTextFieldOutput1e = jTextFieldOutput1e;
        this.jTextFieldOutput50c = jTextFieldOutput50c;
        this.jTextFieldOutput20c = jTextFieldOutput20c;
        this.jTextFieldOutput10c = jTextFieldOutput10c;
    }
    
    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

           
    public void showOutput(String product, List<Double> coinsToGive, String message) {
        empty = false;
        jLabelOutputMessage.setText(message);
                
        if (product.equals("Coke")) {
            showCoke();
        } else if (product.equals("7up")) {
            show7Up();
        } else if (product.equals("Fanta")) {
            showFanta();
        } else if (product.equals("Schweps")) {
            showSchweps();
        }
        
        if (coinsToGive != null) {
            long quantity2e = coinsToGive.stream().filter( coin -> coin == 2d).count();
            long quantity1e = coinsToGive.stream().filter( coin -> coin == 1d).count();
            long quantity50c = coinsToGive.stream().filter( coin -> coin == 0.50).count();
            long quantity20c = coinsToGive.stream().filter( coin -> coin == 0.20).count();
            long quantity10c = coinsToGive.stream().filter( coin -> coin == 0.10).count();

            if (quantity2e > 0) {
                jTextFieldOutput2e.setText(""+quantity2e);
            } else {
                jTextFieldOutput2e.setText("");
            }

            if (quantity1e > 0) {
                jTextFieldOutput1e.setText(""+quantity1e);
            } else {
                jTextFieldOutput1e.setText("");
            }

            if (quantity50c > 0) {
                jTextFieldOutput50c.setText(""+quantity50c);
            } else {
                jTextFieldOutput50c.setText("");
            }

            if (quantity20c > 0) {
                jTextFieldOutput20c.setText(""+quantity20c);
            } else {
                jTextFieldOutput20c.setText("");
            }

            if (quantity10c > 0) {
                jTextFieldOutput10c.setText(""+quantity10c);
            } else {
                jTextFieldOutput10c.setText("");
            }
        }

    }
    
    public void resetOutput() {
        empty = true;
        jLabelOutputMessage.setText(" --- NOTHING TO GET ---");
        jTextFieldOutput2e.setText("");
        jTextFieldOutput1e.setText("");
        jTextFieldOutput50c.setText("");
        jTextFieldOutput20c.setText("");
        jTextFieldOutput10c.setText("");
        
        jLabelOutputSchweps.setVisible(false);
        jLabelOutputFanta.setVisible(false);
        jLabelOutput7up.setVisible(false);
        jLabelOutputCoca.setVisible(false);

    }

    private void showCoke() {
        jLabelOutputSchweps.setVisible(false);
        jLabelOutputFanta.setVisible(false);
        jLabelOutput7up.setVisible(false);
        jLabelOutputCoca.setVisible(true); 
    }
    
    private void showFanta() {
        jLabelOutputSchweps.setVisible(false);
        jLabelOutput7up.setVisible(false);
        jLabelOutputCoca.setVisible(false); 
        jLabelOutputFanta.setVisible(true);
    }
    
    private void show7Up() {
        jLabelOutputSchweps.setVisible(false);
        jLabelOutputCoca.setVisible(false); 
        jLabelOutputFanta.setVisible(false);
        jLabelOutput7up.setVisible(true);
    }
    
    private void showSchweps() {
        jLabelOutputCoca.setVisible(false); 
        jLabelOutputFanta.setVisible(false);
        jLabelOutput7up.setVisible(false);
        jLabelOutputSchweps.setVisible(true);
    }

    
}
