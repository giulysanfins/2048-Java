/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author VICTOR
 */
public final class Printar extends javax.swing.JFrame implements KeyListener, ActionListener {

    //JLabel blackground = new JLabel(new ImageIcon(getClass().getResource("blackground.png")));
    Game matriz = new Game();
    
    public int[][] gameBoard = matriz.FirstNumber();
    Janela janela = new Janela();
    JPanel background = new JPanel();
    JLabel[][] Numblocos = new JLabel[4][4];
    int aux, posX = 105, posY = 145;

    ImageIcon img = new ImageIcon(getClass().getResource("Telainicial.png"));
    JLabel foto = new JLabel(img);
    ImageIcon setaCima1 = new ImageIcon(getClass().getResource("seta up.png"));
    JLabel setaCima = new JLabel(setaCima1);
    ImageIcon setaBaixo1 = new ImageIcon(getClass().getResource("seta down.png"));
    JLabel setaBaixo = new JLabel(setaBaixo1);
    ImageIcon setaDireita1 = new ImageIcon(getClass().getResource("seta rigth.png"));
    JLabel setaDireita = new JLabel(setaDireita1);
    ImageIcon setaEsquerda1 = new ImageIcon(getClass().getResource("seta left.png"));
    JLabel setaEsquerda = new JLabel(setaEsquerda1);
    JLabel score = new JLabel();
    JButton jogo = new JButton("Jogo");
    JButton creditos = new JButton("Creditos");
    JButton sair = new JButton("Sair");
    ImageIcon inicial = new ImageIcon("blocoincial.png");
    ImageIcon bloco2 = new ImageIcon("bloco2.PNG");
    Icon bloco4 = new ImageIcon("bloco4.png");
    Icon bloco8 = new ImageIcon("bloco8.png");
    Icon bloco16 = new ImageIcon("bloco16.png");
    Icon bloco32 = new ImageIcon("bloco32.png");
    Icon bloco64 = new ImageIcon("bloco64.png");
    Icon bloco128 = new ImageIcon("bloco128.png");
    Icon bloco256 = new ImageIcon("bloco256.png");
    Icon bloco512 = new ImageIcon("bloco512.png");
    Icon bloco1024 = new ImageIcon("bloco1024.png");
    Icon bloco2048 = new ImageIcon("bloco2048.png");
    Icon win = new ImageIcon("tela de win.PNG");
    JLabel pontuacao = new JLabel("Pontuacao ");

    public Printar() {

        setBounds(600, 600, 500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("2048 by Giuly and Vking");
        printarNumblocos();
        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
        setLocationRelativeTo(null);
        //teladewin.setVisible(true);
        //add(teladewin);
        //teladewin.setBounds(95, 135, 300, 300);
        //teladewin.setIcon(win);

        background = new JPanel();
        background.setBackground(Color.DARK_GRAY);
        
        pontuacao.setBounds(80,0,100,100);
        add(pontuacao);
        
        score.setBounds(150, 0, 100, 100);
        add(score);
        
        
        background.setBounds(95, 135, 300, 300);
        add(background);

        setaCima.setBounds(175, 55, 150, 100);
        add(setaCima);

        setaBaixo.setBounds(175, 410, 150, 100);
        add(setaBaixo);

        setaDireita.setBounds(365, 225, 100, 150);
        add(setaDireita);

        setaEsquerda.setBounds(25, 225, 100, 150);
        add(setaEsquerda);

        setaDireita.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                posY = 105;
                posX = 145;
                gameBoard = matriz.getGameBoard();
                matriz.verificarlooser(gameBoard);
                
                matriz.moveRight(gameBoard);
                matriz.setGameBoard(gameBoard);
                gameBoard = matriz.getGameBoard();
                score.setText(Integer.toString(matriz.score));
                matriz.printArray();
                for (int y = 0; y < 4; y++) {
                    for (int x = 0; x < 4; x++) {
                        aux = gameBoard[x][y];
                        verificar(aux, x, y);
                        posY = posY + 72;
                    }
                    posY = 145;
                    posX = posX + 72;
                }
            }

        });
        setaEsquerda.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                posY = 105;
                posX = 145;
                gameBoard = matriz.getGameBoard();
                matriz.verificarlooser(gameBoard);

                matriz.moveLeft(gameBoard);
                matriz.setGameBoard(gameBoard);
                gameBoard = matriz.getGameBoard();
                score.setText(Integer.toString(matriz.score));
                matriz.printArray();
                for (int y = 0; y < 4; y++) {
                    for (int x = 0; x < 4; x++) {
                        aux = gameBoard[x][y];
                        verificar(aux, x, y);
                        posY = posY + 72;
                    }
                    posY = 145;
                    posX = posX + 72;
                }
            }

        });
        setaBaixo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                posY = 105;
                posX = 150;
                gameBoard = matriz.getGameBoard();
                matriz.verificarlooser(gameBoard);

                matriz.moveDown(gameBoard);
                matriz.setGameBoard(gameBoard);
                gameBoard = matriz.getGameBoard();
                score.setText(Integer.toString(matriz.score));
                matriz.printArray();
                for (int y = 0; y < 4; y++) {
                    for (int x = 0; x < 4; x++) {
                        aux = gameBoard[x][y];
                        verificar(aux, x, y);
                        posY = posY + 72;
                    }
                    posY = 145;
                    posX = posX + 72;
                }
            }

        });

        setaCima.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                posY = 105;
                posX = 145;
                gameBoard = matriz.getGameBoard();
                matriz.verificarlooser(gameBoard);

                matriz.moveUp(gameBoard);
                matriz.setGameBoard(gameBoard);
                gameBoard = matriz.getGameBoard();
                score.setText(Integer.toString(matriz.score));
                matriz.printArray();
                for (int y = 0; y < 4; y++) {
                    for (int x = 0; x < 4; x++) {
                        aux = gameBoard[x][y];
                        verificar(aux, x, y);

                        posY = posY + 72;
                    }
                    posY = 145;
                    posX = posX + 72;
                }
            }

        });

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int codigo = e.getKeyCode(); //atribuindo teclado
        //Seta P/ baixo
        if (e.getKeyCode() == 40 || e.getKeyCode() == KeyEvent.VK_S) { //BAIXO
            //API https://docs.oracle.com/javase/1.5.0/docs/api/
            posY = 105;
            posX = 150;
            gameBoard = matriz.getGameBoard();
            matriz.verificarlooser(gameBoard);

            matriz.moveDown(gameBoard);
            matriz.setGameBoard(gameBoard);
            gameBoard = matriz.getGameBoard();
            score.setText(Integer.toString(matriz.score));
            matriz.printArray();
            for (int y = 0; y < 4; y++) {
                for (int x = 0; x < 4; x++) {
                    aux = gameBoard[x][y];
                    verificar(aux, x, y);
                    posY = posY + 72;
                }
                posY = 145;
                posX = posX + 72;
            }

        }
        //Seta P/ cima        
        if (e.getKeyCode() == 38 || e.getKeyCode() == KeyEvent.VK_W) { //MOVER CIMA
            posY = 105;
            posX = 145;
            gameBoard = matriz.getGameBoard();
            matriz.verificarlooser(gameBoard);

            matriz.moveUp(gameBoard);
            matriz.setGameBoard(gameBoard);
            gameBoard = matriz.getGameBoard();
            score.setText(Integer.toString(matriz.score));
            matriz.printArray();
            for (int y = 0; y < 4; y++) {
                for (int x = 0; x < 4; x++) {
                    aux = gameBoard[x][y];
                    verificar(aux, x, y);

                    posY = posY + 72;
                }
                posY = 145;
                posX = posX + 72;
            }

        }
        //Seta P/ direita
        if (e.getKeyCode() == 39 || e.getKeyCode() == KeyEvent.VK_D) { //DIREITA
            posY = 105;
            posX = 145;
            gameBoard = matriz.getGameBoard();
            matriz.verificarlooser(gameBoard);

            matriz.moveRight(gameBoard);
            matriz.setGameBoard(gameBoard);
            gameBoard = matriz.getGameBoard();
            score.setText(Integer.toString(matriz.score));
            matriz.printArray();
            for (int y = 0; y < 4; y++) {
                for (int x = 0; x < 4; x++) {
                    aux = gameBoard[x][y];
                    verificar(aux, x, y);
                    posY = posY + 72;
                }
                posY = 145;
                posX = posX + 72;
            }

        }
        //Seta P/ esquerda
        if (e.getKeyCode() == 37 || e.getKeyCode() == KeyEvent.VK_A) { //ESQUERDA
            posY = 105;
            posX = 145;
            gameBoard = matriz.getGameBoard();
            matriz.verificarlooser(gameBoard);

            matriz.moveLeft(gameBoard);
            matriz.setGameBoard(gameBoard);
            gameBoard = matriz.getGameBoard();
            score.setText(Integer.toString(matriz.score));
            matriz.printArray();
            for (int y = 0; y < 4; y++) {
                for (int x = 0; x < 4; x++) {
                    aux = gameBoard[x][y];
                    verificar(aux, x, y);
                    posY = posY + 72;
                }
                posY = 145;
                posX = posX + 72;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void printarNumblocos() {
        gameBoard = matriz.getGameBoard();
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                Numblocos[x][y] = new JLabel();
                Numblocos[x][y].setVisible(true);
                Numblocos[x][y].setBounds(posX, posY, 65, 65);
                add(Numblocos[x][y]);
                aux = gameBoard[y][x];
                if (aux == 0) {
                    Numblocos[x][y].setIcon(inicial);
                }
                if (aux == 2) {
                    Numblocos[x][y].setIcon(bloco2);
                }
                if (aux == 4) {
                    Numblocos[x][y].setIcon(bloco4);
                }

                posY = posY + 72;
            }
            posY = 145;
            posX = posX + 72;
        }
    }

    public void verificar(int aux, int y, int x) {

        if (aux == 0) {
            Numblocos[x][y].setIcon(inicial);
        }
        if (aux == 2) {
            Numblocos[x][y].setIcon(bloco2);
        }
        if (aux == 4) {
            Numblocos[x][y].setIcon(bloco4);
        }
        if (aux == 8) {
            Numblocos[x][y].setIcon(bloco8);
        }
        if (aux == 16) {
            Numblocos[x][y].setIcon(bloco16);
        }
        if (aux == 32) {
            Numblocos[x][y].setIcon(bloco32);
        }
        if (aux == 64) {
            Numblocos[x][y].setIcon(bloco64);
        }
        if (aux == 128) {
            Numblocos[x][y].setIcon(bloco128);
        }
        if (aux == 256) {
            Numblocos[x][y].setIcon(bloco256);
        }
        if (aux == 512) {
            Numblocos[x][y].setIcon(bloco512);
        }
        if (aux == 1024) {
            Numblocos[x][y].setIcon(bloco1024);
        }
        if (aux == 2048) {

            Win winner = new Win();
            Numblocos[x][y].setIcon(bloco2048);

        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Printar().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
