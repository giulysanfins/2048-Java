/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    int aux, posX = 105, posY = 145, auxposX = 0, auxposY = 0, flaggeral = 0, n = 0;
    int vet[] = new int[16];
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
    Icon bloco2 = new ImageIcon("bloco2.png");
    Icon bloco2frag = new ImageIcon("bloco2frag.gif");
    Icon bloco4 = new ImageIcon("bloco4.png");
    Icon bloco4frag = new ImageIcon("bloco4frag.gif");
    Icon bloco8 = new ImageIcon("bloco8.png");
    Icon bloco8frag = new ImageIcon("bloco8frag.gif");
    Icon bloco16 = new ImageIcon("bloco16.png");
    Icon bloco16frag = new ImageIcon("bloco16frag.gif");
    Icon bloco32 = new ImageIcon("bloco32.png");
    Icon bloco32frag = new ImageIcon("bloco32frag.gif");
    ;
    Icon bloco64 = new ImageIcon("bloco64.png");
    Icon bloco128 = new ImageIcon("bloco128.png");
    Icon bloco256 = new ImageIcon("bloco256.png");
    Icon bloco512 = new ImageIcon("bloco512.png");
    Icon bloco1024 = new ImageIcon("bloco1024.png");
    Icon bloco2048 = new ImageIcon("bloco2048.png");
    Icon win = new ImageIcon("tela de win.PNG");
    //JLabel pontuacao = new JLabel("Pontuacao ");
    Icon blocoverde = new ImageIcon("Label verde.png");
    JLabel easteregg = new JLabel();
    Icon easter = new ImageIcon("hellokitty.png");
    JLabel fundo = new JLabel();
    Icon back = new ImageIcon("background.PNG");
    Font font = new Font("Arial", Font.BOLD, 20);

    som som = new som();
    
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

        background = new JPanel();
        background.setBackground(Color.DARK_GRAY);
        add(background);

        easteregg.setIcon(easter);
        easteregg.setBounds(0, 400, 50, 50);
        add(easteregg);

        score.setBounds(185, 0, 100, 100);
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

        fundo.setBounds(0, 0, 500, 600);
        fundo.setIcon(back);
        add(fundo);

        setaDireita.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                moverparadireita();
            }

        });
        setaEsquerda.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                moverparaesquerda();
            }

        });
        setaBaixo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                moverparabaixo();
            }

        });

        setaCima.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                moverparacima();
            }

        });

        easteregg.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("COMPILOU");
                easteregg.setVisible(false);

 

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {

                        gameBoard[i][j] = 0;
                        gameBoard[2][3] = 1024;
                        gameBoard[2][2] = 1024;
                        matriz.setGameBoard(gameBoard);
                        aux = gameBoard[i][j];
                        verificar(aux, i, j, 0);
                    }
                }

            }
        }
        );
    }
    public void moverparadireita(){
        matriz.setN(0);
                gameBoard = matriz.getGameBoard();
                int flaglose=matriz.verificarlooser(gameBoard);
                derrota(flaglose);

                int flag = matriz.moveRight(gameBoard, vet, n);

                vet = matriz.getVet();
                n = matriz.getN();

                //print testes
                for (int i = 0; i < n; i++) {
                    System.out.println(vet[i]);

                }
                System.out.println(n);//ate aki...

                movimento(flag, vet, n);
                matriz.setN(0);
                n = 0;
                for (int i = 0; i < n; i++) {
                    vet[i] = 0;

                }
        
    }
    public void moverparaesquerda(){
        matriz.setN(0);
                gameBoard = matriz.getGameBoard();
                int flaglose=matriz.verificarlooser(gameBoard);
                derrota(flaglose);

                int flag = matriz.moveLeft(gameBoard, vet, n);

                vet = matriz.getVet();
                n = matriz.getN();

                //print testes
                for (int i = 0; i < n; i++) {
                    System.out.println(vet[i]);

                }
                System.out.println(n);//ate aki...

                movimento(flag, vet, n);
                matriz.setN(0);
                n = 0;
                for (int i = 0; i < n; i++) {
                    vet[i] = 0;

                }
    }
    
    public void moverparabaixo(){
        matriz.setN(0);
                gameBoard = matriz.getGameBoard();
                int flaglose=matriz.verificarlooser(gameBoard);
                derrota(flaglose);
                int flag = matriz.moveDown(gameBoard, vet, n);

                vet = matriz.getVet();
                n = matriz.getN();

                //print testes
                for (int i = 0; i < n; i++) {
                    System.out.println(vet[i]);

                }
                System.out.println(n);//ate aki...

                movimento(flag, vet, n);
                matriz.setN(0);
                n = 0;
                for (int i = 0; i < n; i++) {
                    vet[i] = 0;

                }
        
    }
    public void moverparacima(){
        matriz.setN(0);
                gameBoard = matriz.getGameBoard();
                int flaglose=matriz.verificarlooser(gameBoard);
                derrota(flaglose);
                int flag = matriz.moveUp(gameBoard, vet, n);

                vet = matriz.getVet();
                n = matriz.getN();

                //print testes
                for (int i = 0; i < n; i++) {
                    System.out.println(vet[i]);

                }
                System.out.println(n);//ate aki...

                movimento(flag, vet, n);
                matriz.setN(0);
                n = 0;
                for (int i = 0; i < n; i++) {
                    vet[i] = 0;

                }
        
    }

    public void run() { //funcao chamada na Janela.java
        Runnable Run = new Runnable() {
            @Override
            public void run() {
                while (true) {

                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                    }

                    if (easteregg.getX() < 420 && easteregg.getY() > 399) { //x=0 y=400

                        easteregg.setBounds(easteregg.getX() + 1, 480, 50, 50); //getx420
                    }

                    if (easteregg.getX() >= 420 && easteregg.getY() <= 480) {

                        // easteregg.setBounds(10, 10, 50, 50);        //canto direito inf x=420 y =480 sup dir x=420 y=10 sup esq x=10 y=10
                        easteregg.setBounds(420, easteregg.getY() - 1, 50, 50);
                    }

                    if (easteregg.getX() <= 420 && easteregg.getY() <= 10) {

                        easteregg.setBounds(easteregg.getX() - 1, 10, 50, 50); //ir
                    }
                    if (easteregg.getX() >= 420 && easteregg.getY() <= 10) {
                        easteregg.setBounds(420, easteregg.getY() - 1, 50, 50);

                    }
                    if (easteregg.getX() <= 10 && easteregg.getY() <= 400) {
                        // System.out.println("oi");
                        easteregg.setBounds(0, easteregg.getY() + 1, 50, 50);

                    }

                    //gety = 10
                }
            }

        };

        Thread hello = new Thread(Run);
        hello.start();

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int codigo = e.getKeyCode(); //atribuindo teclado
        //Seta P/ baixo
        if (e.getKeyCode() == 40 || e.getKeyCode() == KeyEvent.VK_S) { //BAIXO
            moverparabaixo();
        }
        //Seta P/ cima        
        if (e.getKeyCode() == 38 || e.getKeyCode() == KeyEvent.VK_W) { //MOVER CIMA
            moverparacima();
        }
        //Seta P/ direita
        if (e.getKeyCode() == 39 || e.getKeyCode() == KeyEvent.VK_D) { //DIREITA
            moverparadireita();

        }
        //Seta P/ esquerda
        if (e.getKeyCode() == 37 || e.getKeyCode() == KeyEvent.VK_A) { //ESQUERDA
            moverparaesquerda();

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
                    Numblocos[x][y].setIcon(bloco2frag);
                    Numblocos[x][y].setIcon(bloco2);

                }
                if (aux == 4) {
                    Numblocos[x][y].setIcon(bloco4);
                    Numblocos[x][y].setIcon(bloco4frag);
                    Numblocos[x][y].setIcon(bloco4);
                }
                posY = posY + 72;
            }
            posY = 145;
            posX = posX + 72;
        }
    }

    public void verificar(int aux, int y, int x, int flag) {

            Animation anim = new Animation();
            anim.setAux(aux);
            anim.setX(x);
            anim.setY(y);
            if (aux == 2048) {
                dispose();
                anim.run(Numblocos,flag);
            } else {
                anim.run(Numblocos,flag);
            }
        
    }

    public void movimento(int flag, int vet[], int n) {

        n--;
        matriz.setGameBoard(gameBoard);
        gameBoard = matriz.getGameBoard();
        score.setText(Integer.toString(matriz.score));
        score.setForeground(Color.WHITE);
        score.setFont(font);
        matriz.printArray();
        System.out.println(flag);

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                aux = gameBoard[x][y];
                for (int i = 0; i < n; i = i + 2) {
                    if (vet[i] == x && vet[i + 1] == y) {
                        verificar(aux, x, y, flag);
                        flaggeral = 1;
                    }
                }
                if (flaggeral == 0) {
                    verificar(aux, x, y, 0);
                }
                posY = posY + 72;
                flaggeral = 0;
            }
            posY = 145;
            posX = posX + 72;
        }
        matriz.setN(0);
    }
    public void derrota(int flaglose){
        if(flaglose==1){
            dispose();
            lose loser=new lose();
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

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

}
