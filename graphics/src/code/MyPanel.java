/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author waw
 */
public class MyPanel extends JPanel {
    
    
    public MyPanel(){
        this.setPreferredSize(new Dimension(500, 500));
    }
    
        @Override
    public void paint(Graphics g){
        
        Graphics2D g2d = (Graphics2D)g; 
        g2d.setStroke(new BasicStroke(10));
        g2d.setPaint(Color.blue);
        
        g2d.drawRect(0, 0, 100, 200);
    }
}
