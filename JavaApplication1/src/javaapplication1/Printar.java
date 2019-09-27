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
    int aux, posX = 105, posY = 145,auxposX=0,auxposY=0,flaggeral=0,n=0;
    int vet[]=new int[16];
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
    Icon bloco32frag = new ImageIcon("bloco32frag.gif");;
    Icon bloco64 = new ImageIcon("bloco64.png");
    Icon bloco128 = new ImageIcon("bloco128.png");
    Icon bloco256 = new ImageIcon("bloco256.png");
    Icon bloco512 = new ImageIcon("bloco512.png");
    Icon bloco1024 = new ImageIcon("bloco1024.png");
    Icon bloco2048 = new ImageIcon("bloco2048.png");
    Icon win = new ImageIcon("tela de win.PNG");
    JLabel pontuacao = new JLabel("Pontuacao ");
    Icon blocoverde=new ImageIcon("Label verde.png");
    JLabel easteregg = new JLabel();
    Icon easter = new ImageIcon("Label verde.png");
    
   

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
        
        easteregg.setIcon(easter);
        easteregg.setBounds(470,550,4,3);
        add(easteregg);
        
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
                matriz.setN(0);
                gameBoard = matriz.getGameBoard();
                matriz.verificarlooser(gameBoard);
                
                int flag=matriz.moveRight(gameBoard,vet,n);
                
               vet=matriz.getVet();
            n=matriz.getN();
            
            //print testes
             for(int i=0;i<n;i++){
                System.out.println(vet[i]);
                
            }
            System.out.println(n);//ate aki...
            
            movimento(flag,vet,n);
           matriz.setN(0);
           n=0;
             for(int i=0;i<n;i++){
                vet[i]=0;
                
            }
            }

        });
        setaEsquerda.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                matriz.setN(0);
                gameBoard = matriz.getGameBoard();
                matriz.verificarlooser(gameBoard);

                int flag=matriz.moveLeft(gameBoard,vet,n);
               
                vet=matriz.getVet();
            n=matriz.getN();
            
            //print testes
             for(int i=0;i<n;i++){
                System.out.println(vet[i]);
                
            }
            System.out.println(n);//ate aki...
            
            movimento(flag,vet,n);
           matriz.setN(0);
           n=0;
             for(int i=0;i<n;i++){
                vet[i]=0;
                
            }
            }

        });
        setaBaixo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                matriz.setN(0);
                gameBoard = matriz.getGameBoard();
                matriz.verificarlooser(gameBoard);
                int flag=matriz.moveDown(gameBoard,vet,n);  
                
                vet=matriz.getVet();
            n=matriz.getN();
            
            //print testes
             for(int i=0;i<n;i++){
                System.out.println(vet[i]);
                
            }
            System.out.println(n);//ate aki...
            
            movimento(flag,vet,n);
           matriz.setN(0);
           n=0;
             for(int i=0;i<n;i++){
                vet[i]=0;
                
            }
            }

        });

        setaCima.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                matriz.setN(0);
                gameBoard = matriz.getGameBoard();
                matriz.verificarlooser(gameBoard);
                int flag =matriz.moveUp(gameBoard,vet,n);
                
                vet=matriz.getVet();
            n=matriz.getN();
            
            //print testes
             for(int i=0;i<n;i++){
                System.out.println(vet[i]);
                
            }
            System.out.println(n);//ate aki...
            
            movimento(flag,vet,n);
           matriz.setN(0);
           n=0;
             for(int i=0;i<n;i++){
                vet[i]=0;
                
            }
            }
               
        });
        
         easteregg.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               System.out.println("COMPILOU");
            for (int i = 0; i < 4; i++) {
                for(int j=0;j<4;j++)
                {
                    gameBoard[i][j]=0;
                }
             }
            
            for (int i = 0; i < 4; i++) {
                for(int j=0;j<4;j++)
                {
                    
                    gameBoard[i][j]=0;
                    gameBoard[2][3]=1024;
                    gameBoard[2][2]=1024;
                    aux=gameBoard[i][j];
                    verificar(aux, i, j,0);
                }
             }
                

            }
            });

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int codigo = e.getKeyCode(); //atribuindo teclado
        //Seta P/ baixo
        if (e.getKeyCode() == 40 || e.getKeyCode() == KeyEvent.VK_S) { //BAIXO
            matriz.setN(0);
            gameBoard = matriz.getGameBoard();
            matriz.verificarlooser(gameBoard);

            int flag=matriz.moveDown(gameBoard,vet,n);
            
            vet=matriz.getVet();
            n=matriz.getN();
            
            //print testes
             for(int i=0;i<n;i++){
                System.out.println(vet[i]);
                
            }
            System.out.println(n);//ate aki...
            
            movimento(flag,vet,n);
           matriz.setN(0);
           n=0;
             for(int i=0;i<n;i++){
                vet[i]=0;
                
            }
        }
        //Seta P/ cima        
        if (e.getKeyCode() == 38 || e.getKeyCode() == KeyEvent.VK_W) { //MOVER CIMA
            matriz.setN(0);
            gameBoard = matriz.getGameBoard();
            matriz.verificarlooser(gameBoard);

            int flag=matriz.moveUp(gameBoard,vet,n);
            
            vet=matriz.getVet();
            n=matriz.getN();
            
            //print testes
             for(int i=0;i<n;i++){
                System.out.println(vet[i]);
                
            }
            System.out.println(n);//ate aki...
            
            movimento(flag,vet,n);
           matriz.setN(0);
           n=0;
             for(int i=0;i<n;i++){
                vet[i]=0;
                
            }
        }
        //Seta P/ direita
        if (e.getKeyCode() == 39 || e.getKeyCode() == KeyEvent.VK_D) { //DIREITA
            matriz.setN(0);
            gameBoard = matriz.getGameBoard();
            matriz.verificarlooser(gameBoard);
            int flag=matriz.moveRight(gameBoard,vet,n);
            
           vet=matriz.getVet();
            n=matriz.getN();
            
            //print testes
             for(int i=0;i<n;i++){
                System.out.println(vet[i]);
                
            }
            System.out.println(n);//ate aki...
            
            movimento(flag,vet,n);
           matriz.setN(0);
           n=0;
             for(int i=0;i<n;i++){
                vet[i]=0;
                
            }
           
        }
        //Seta P/ esquerda
        if (e.getKeyCode() == 37 || e.getKeyCode() == KeyEvent.VK_A) { //ESQUERDA
            matriz.setN(0);
            gameBoard = matriz.getGameBoard();
            matriz.verificarlooser(gameBoard);
            int flag=matriz.moveLeft(gameBoard,vet,n);
            
            vet=matriz.getVet();
            n=matriz.getN();
            
            //print testes
             for(int i=0;i<n;i++){
                System.out.println(vet[i]);
                
            }
            System.out.println(n);//ate aki...
            
            movimento(flag,vet,n);
           matriz.setN(0);
           n=0;
             for(int i=0;i<n;i++){
                vet[i]=0;
                
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

    
    public void verificar(int aux, int y, int x,int flag) {
       Animation anim =new Animation();
       
       if(flag==0){
           if(aux==0){
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
       }else{
       
        anim.setAux(aux);
        anim.setX(x);
        anim.setY(y);
        anim.run(Numblocos);
       }
    }
    
    public void movimento(int flag,int vet[],int n){
            
            n--;
            matriz.setGameBoard(gameBoard);
            gameBoard = matriz.getGameBoard();
            score.setText(Integer.toString(matriz.score));
            matriz.printArray();
            System.out.println(flag);
                   
            for (int y = 0; y < 4; y++) {
                for (int x = 0; x < 4; x++) {
                    aux = gameBoard[x][y];
                    for(int i=0;i<n;i=i+2){
                        if(vet[i]==x&&vet[i+1]==y){
                            verificar(aux, x, y,flag);
                        flaggeral=1;
                        }
                    }
                    if(flaggeral==0) verificar(aux, x, y,0);
                    posY = posY + 72;
                    flaggeral=0;
                }
                posY = 145;
                posX = posX + 72;
            }
            matriz.setN(0);
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
