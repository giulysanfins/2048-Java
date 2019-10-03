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
public class Win extends JFrame {

    JLabel teladeWin = new JLabel();
    JLabel botaosair = new JLabel();
    JLabel botaoreniciar = new JLabel();
    Printar matriz = new Printar();
    int[][] matrizaux = new int[4][4];

    Icon Win = new ImageIcon("tela de win2.png");
    ImageIcon botsair=new ImageIcon("botsair.PNG");
    ImageIcon botsair2=new ImageIcon("botsair2.PNG");
    ImageIcon botreiniciar=new ImageIcon("botreiniciar.PNG");
    ImageIcon botreiniciar2=new ImageIcon("botreiniciar2.PNG");
    public Win() {

        setLocationRelativeTo(null);
        teladeWin.setIcon(Win);

        botaosair.setBounds(45, 460, 155, 85);
        botaosair.setIcon(botsair);
        
        botaoreniciar.setBounds(210, 460, 250, 85);
        botaoreniciar.setIcon(botreiniciar);
        
        add(botaosair);
        add(botaoreniciar);
        
        teladeWin.setBounds(0, 0, 500, 600);
        
        add(teladeWin);
 //adicionando botoes no painel

        botaoreniciar.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                 botaoreniciar.setIcon(botreiniciar2);
            }
            public void mouseExited(MouseEvent e){
                botaoreniciar.setIcon(botreiniciar);
            }
            public void mouseClicked(MouseEvent e) {
                dispose(); //fechar tela
                reiniciar();
                matriz.run(); //rodando a thread da hello kitty
            }
        });

        botaosair.addMouseListener(new MouseAdapter() {
            
            public void mouseEntered(MouseEvent e){
                 botaosair.setIcon(botsair2);
            }
            public void mouseExited(MouseEvent e){
                botaosair.setIcon(botsair);
            }
            
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        setTitle("2048 by Giuly and Vking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void reiniciar() { //renicia o game zerando a matriz
        Game matrizgame = new Game();
        matriz.getGameBoard();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matrizaux[i][j] = 0;
            }
        }
        matriz.setGameBoard(matrizaux);
        matrizgame.setGameBoard(matrizaux);
    }

}
