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
public class Win extends JFrame{
    
    JLabel teladeWin = new JLabel();
    
    JLabel botaosair = new JLabel();
    JLabel botaoreniciar = new JLabel();
    Printar matriz= new Printar();
    int[][] matrizaux=new int[4][4];
    
    
    Icon Win = new ImageIcon("tela de win2.png");
    public Win(){
       
        
        
        setLocationRelativeTo(null);
        teladeWin.setIcon(Win);
        

        botaosair.setBounds(50,465,140,71);
        botaoreniciar.setBounds(210, 465, 230, 71);
        teladeWin.setBounds(0, 0, 500, 600);
        add(botaoreniciar);
        add(botaosair);
        add(teladeWin); //adicionando botoes no painel
        
        
        
        
        
                botaoreniciar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                dispose();
                reiniciar();
                matriz.run(); //rodando a thread
            }
            });
        
        
         botaosair.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
            });
        
        
        setTitle("2048 by Giuly and Vking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    
    
     public void reiniciar(){
         Game matrizgame=new Game();
        matriz.getGameBoard();
        for (int i = 0; i < 4; i++) {
            for(int j=0;j<4;j++)
            {

                matrizaux[i][j]=0;
            }
        }
        matriz.setGameBoard(matrizaux);
        matrizgame.setGameBoard(matrizaux);
      // matriz.setN
    }
    
}
