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
public class lose extends JFrame {

    JLabel teladeloose = new JLabel();
    JLabel botaosair = new JLabel();
    JLabel botaoreniciar = new JLabel();
    Printar matriz = new Printar();
    int[][] matrizaux = new int[4][4];
    Icon loose = new ImageIcon("derrota.png");
    ImageIcon botsair=new ImageIcon("botsair.PNG");
    ImageIcon botsair2=new ImageIcon("botsair2.PNG");
    ImageIcon botreiniciar=new ImageIcon("botreiniciar.PNG");
    ImageIcon botreiniciar2=new ImageIcon("botreiniciar2.PNG");

    public lose() {
        setLocationRelativeTo(null);
        teladeloose.setIcon(loose);
        teladeloose.setBounds(0, 0, 500, 600);

        botaosair.setBounds(45, 460, 155, 85);
        botaosair.setIcon(botsair);
        
        botaoreniciar.setBounds(210, 460, 250, 85);
        botaoreniciar.setIcon(botreiniciar);
        
        setIconImage(new ImageIcon("download.png").getImage()); 
        add(botaoreniciar);
        add(botaosair);
        add(teladeloose); //adicionando botoes no painel

        botaoreniciar.addMouseListener(new MouseAdapter() { //evento do botao pra reniciar o jogo inteiro
            public void mouseEntered(MouseEvent e){
                 botaoreniciar.setIcon(botreiniciar2);
            }
            public void mouseExited(MouseEvent e){
                botaoreniciar.setIcon(botreiniciar);
            }
            public void mouseClicked(MouseEvent e) {
                dispose();
                reiniciar();
                matriz.run(); //rodando a thread
            }
        });

        botaosair.addMouseListener(new MouseAdapter() { //evento do botao pra sair do jogo
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

    public void reiniciar() { //zera a matriz pra jogar de novo
        matriz.getGameBoard();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizaux[i][j] = 0;
            }
        }
        matriz.setGameBoard(matrizaux);
    }
}
