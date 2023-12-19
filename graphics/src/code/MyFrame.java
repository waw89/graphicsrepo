/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author waw
 */
public class MyFrame extends JFrame {
    MyPanel panel; 
    public MyFrame(){
        panel = new MyPanel(); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel); 
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    
}
