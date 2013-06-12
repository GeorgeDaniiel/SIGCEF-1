/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria;

import bicicletaria.gui.JanelaLogin;

/**
 *
 * @author George Daniel
 */
public class Bicicletaria {
    
    private static JanelaLogin janelaLogin;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        janelaLogin = new JanelaLogin();
        janelaLogin.setVisible(true);
    }
}