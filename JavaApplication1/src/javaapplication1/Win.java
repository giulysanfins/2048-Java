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
public class Win extends JFrame{
    
    JLabel teladeWin = new JLabel();
    Icon Win = new ImageIcon("tela de win2.png");
    public Win(){
        setLocationRelativeTo( null );
        teladeWin.setIcon(Win);
        teladeWin.setBounds(0, 0, 500, 600);
        add(teladeWin); //adicionando botoes no painel
        teladeWin.setVisible(true);
        setTitle("2048 by Giuly and Vking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(this);
        
    }
    
}
