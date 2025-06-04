/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportmanagementsysyem;

import at.favre.lib.crypto.bcrypt.BCrypt;
import at.favre.lib.crypto.bcrypt.LongPasswordStrategies;
import interfaces.login;
import interfaces.tmain;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thashmika
 */
public class Transportmanagementsysyem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        login m = new login();
        m.setVisible(true);

    }

}
