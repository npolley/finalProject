/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Vinnie
 */
public class Moria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        loginGui login = new loginGui();
        login.setVisible(true);
       
    }
    
}
