/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author VICTOR
 */
public class loose extends JFrame{
    
    JLabel teladeloose = new JLabel();
    Icon loose = new ImageIcon("derrota.png");
    public loose(){
        setLocationRelativeTo( null );
        teladeloose.setIcon(loose);
        teladeloose.setBounds(0, 0, 500, 600);
        add(teladeloose); //adicionando botoes no painel
        teladeloose.setVisible(true);
        setTitle("2048 by Giuly and Vking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(this);
        
    }
    
}
