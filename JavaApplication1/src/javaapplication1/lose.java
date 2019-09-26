/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author VICTOR
 */
public class lose extends JFrame{
    
    JLabel teladeloose = new JLabel();
    JLabel botaosair = new JLabel();
    JLabel botaoreniciar = new JLabel();
    Printar matriz= new Printar();
    int[][] matrizaux=new int[4][4];
    
    Icon reniciar = new ImageIcon("Label verde.png");
    Icon loose = new ImageIcon("derrota.png");
    Icon sair = new ImageIcon("Label verde.png");
    
    public lose(){
        setLocationRelativeTo(null);
        teladeloose.setIcon(loose);
        teladeloose.setBounds(0, 0, 500, 600);
        botaosair.setIcon(sair);
        botaosair.setBounds(130,400,100,100);
        botaoreniciar.setIcon(reniciar);
        botaoreniciar.setBounds(260, 400, 100, 100);
        
        add(botaoreniciar);
        add(botaosair);
        add(teladeloose); //adicionando botoes no painel
        
        
        botaoreniciar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                dispose();
                reiniciar();
            }
            });
        
        
         botaosair.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
            });
        
        //botaosair.setVisible(true);
       // teladeloose.setVisible(true);
        setTitle("2048 by Giuly and Vking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    
    
    public void reiniciar(){
        matriz.getGameBoard();
        for (int i = 0; i < 4; i++) {
            for(int j=0;j<4;j++)
            {
                matrizaux[i][j]=0;
            }
        }
        matriz.setGameBoard(matrizaux);
       
    }
    
}
