package javaapplication1;

import java.awt.Color;
import java.awt.Font;
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

    Game matriz = new Game();
    public int[][] gameBoard = matriz.FirstNumber();
    public int[][] matrizAux = new int[4][4];
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
    ImageIcon botaosair1 = new ImageIcon("reiniciar.png");
    JLabel botaoReiniciar = new JLabel(botaosair1);
    ImageIcon voltarMovimento1 = new ImageIcon("botão voltar cópia.png");
    JLabel voltarMovimento = new JLabel(voltarMovimento1);

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

    ImageIcon bloco2frag2 = new ImageIcon("bloco2treme.gif");
    ImageIcon bloco4frag2 = new ImageIcon("bloco4treme.gif");
    ImageIcon bloco8frag2 = new ImageIcon("bloco8treme.gif");
    ImageIcon bloco16frag2 = new ImageIcon("bloco16treme.gif");
    ImageIcon bloco32frag2 = new ImageIcon("bloco32treme.gif");
    ImageIcon bloco64frag2 = new ImageIcon("bloco64treme.gif");
    ImageIcon bloco128frag2 = new ImageIcon("bloco128treme.gif");
    ImageIcon bloco256frag2 = new ImageIcon("bloco256treme.gif");
    ImageIcon bloco512frag2 = new ImageIcon("bloco512treme.gif");
    ImageIcon bloco1024frag2 = new ImageIcon("bloco1024treme.gif");
    ImageIcon bloco10242 = new ImageIcon("bloco-1024.gif");

    Icon bloco64 = new ImageIcon("bloco64.png");
    Icon bloco128 = new ImageIcon("bloco128.png");
    Icon bloco256 = new ImageIcon("bloco256.png");
    Icon bloco512 = new ImageIcon("bloco512.png");
    Icon bloco1024 = new ImageIcon("bloco1024.png");
    Icon bloco2048 = new ImageIcon("bloco2048.png");
    Icon win = new ImageIcon("tela de win.PNG");
    Icon blocoverde = new ImageIcon("Label verde.png");
    JLabel easteregg = new JLabel();
    Icon easter = new ImageIcon("hellokitty.png");
    JLabel fundo = new JLabel();
    Icon back = new ImageIcon("background.PNG");
    Font font = new Font("Arial", Font.BOLD, 20);

    JLabel pontuacaoMax = new JLabel();
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
        
        matriz.loadScore();
        pontuacaoMax.setBounds(400,0,100,100);
        add(pontuacaoMax);

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

        voltarMovimento.setBounds(420, 500, 50, 50);
        add(voltarMovimento);

        botaoReiniciar.setBounds(250, 500,150, 50);
        add(botaoReiniciar);

        setIconImage(new ImageIcon("download.png").getImage()); 
        
        fundo.setBounds(0, 0, 500, 600);
        fundo.setIcon(back);
        add(fundo);

        botaoReiniciar.addMouseListener(new MouseAdapter() { //botao pra reniciar o game
            public void mouseClicked(MouseEvent e) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) { //zerando a matriz 
                        gameBoard[i][j] = 0;
                    }
                }
                easteregg.setVisible(true);
                if(matriz.score > matriz.highScore){
                                matriz.highScore = matriz.score;
                                                matriz.setScore();
                            }

                matriz.score=0;
                matriz.setGameBoard(gameBoard); //setando a matriz (0)
                matriz.addNewNumbers(gameBoard); //adicionando novos numeros
                matriz.addNewNumbers(gameBoard);
                movimento(0, vet, 0);//printar na tela novo jogo
            }
        });

        setaDireita.addMouseListener(new MouseAdapter() { //evento seta direita
            public void mouseClicked(MouseEvent e) {
                moverparadireita();
            }
        });

        setaEsquerda.addMouseListener(new MouseAdapter() {//evento seta esquerda
            public void mouseClicked(MouseEvent e) {
                moverparaesquerda();
            }
        });
        setaBaixo.addMouseListener(new MouseAdapter() {//evento seta baixo
            public void mouseClicked(MouseEvent e) {
                moverparabaixo();
            }
        });

        setaCima.addMouseListener(new MouseAdapter() {//evento seta cima
            public void mouseClicked(MouseEvent e) {
                moverparacima();
            }
        });

        voltarMovimento.addMouseListener(new MouseAdapter() {//volta o movimento feito
            public void mouseClicked(MouseEvent e) {
                int vet[] = new int[0];
                matriz.setGameBoard(matrizAux);
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        gameBoard[i][j] = matrizAux[i][j]; //passando tudo da matriz pro game
                    }
                }
                movimento(0, vet, 0); //chama para printar os numeros              
            }
        });

        easteregg.addMouseListener(new MouseAdapter() { //evento clicando na hello kitty
            public void mouseClicked(MouseEvent e) {
                System.out.println("COMPILOU");
                easteregg.setVisible(false);
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        gameBoard[i][j] = 0;//zera a matriz inteira 
                        gameBoard[2][3] = 1024;//spawna 2 blocos de 2014
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

    public void voltarmovimento() {
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                matrizAux[x][y] = gameBoard[x][y]; //salvar a posicao anterior na matriz
            }
        }
    }

    public void moverparadireita() {
        matriz.setN(0);//setar N(tamanho do vetor que pega as posicoes)
        gameBoard = matriz.getGameBoard(); //joga a var global gameboard na var local gameboard 
        int flaglose = matriz.verificarlooser(gameBoard);
        derrota(flaglose); //verificar derrota
        voltarmovimento(); //se clicar voltarmovimento volta
        int flag = matriz.moveRight(gameBoard, vet, n);

        vet = matriz.getVet();
        n = matriz.getN();
        movimento(flag, vet, n); //faz o movimento
        matriz.setN(0);
        n = 0;
        for (int i = 0; i < n; i++) {
            vet[i] = 0;
        }

    }

    public void moverparaesquerda() {
        matriz.setN(0);
        gameBoard = matriz.getGameBoard();
        int flaglose = matriz.verificarlooser(gameBoard);
        derrota(flaglose);

        voltarmovimento();
        int flag = matriz.moveLeft(gameBoard, vet, n);

        vet = matriz.getVet();
        n = matriz.getN();

        movimento(flag, vet, n);
        matriz.setN(0);
        n = 0;
        for (int i = 0; i < n; i++) {
            vet[i] = 0;

        }
    }

    public void moverparabaixo() {
        matriz.setN(0);
        gameBoard = matriz.getGameBoard();
        int flaglose = matriz.verificarlooser(gameBoard);
        derrota(flaglose);
        voltarmovimento();
        int flag = matriz.moveDown(gameBoard, vet, n);

        vet = matriz.getVet();
        n = matriz.getN();

        movimento(flag, vet, n);
        matriz.setN(0);
        n = 0;
        for (int i = 0; i < n; i++) {
            vet[i] = 0;

        }

    }

    public void moverparacima() {
        matriz.setN(0);
        gameBoard = matriz.getGameBoard();
        int flaglose = matriz.verificarlooser(gameBoard);
        derrota(flaglose);
        voltarmovimento();
        int flag = matriz.moveUp(gameBoard, vet, n);

        vet = matriz.getVet();
        n = matriz.getN();

        movimento(flag, vet, n);
        matriz.setN(0);
        n = 0;
        for (int i = 0; i < n; i++) {
            vet[i] = 0;

        }

    }

    public void run() { //funcao chamada na Janela.java PARA rodar a hellokitty - thread
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
                        easteregg.setBounds(easteregg.getX() - 1, 10, 50, 50); 
                    }
                    if (easteregg.getX() >= 420 && easteregg.getY() <= 10) {
                        easteregg.setBounds(420, easteregg.getY() - 1, 50, 50);
                    }
                    if (easteregg.getX() <= 10 && easteregg.getY() <= 400) {
                        easteregg.setBounds(0, easteregg.getY() + 1, 50, 50);
                    }
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

    public void printarNumblocos() {// printar matriz inicial e dar add na matriz na label
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

    public void verificar(int aux, int y, int x, int flag) {//escolher a animacao dependendo do numero enviado em aux

        if (flag == 0) {
            if (aux == 0) {
                Numblocos[x][y].setIcon(inicial);
            }
            if (aux == 2) {
                bloco2frag2.getImage().flush();
                Numblocos[x][y].setIcon(bloco2frag2);
            }
            if (aux == 4) {
                bloco4frag2.getImage().flush();
                Numblocos[x][y].setIcon(bloco4frag2);
            }
            if (aux == 8) {
                bloco8frag2.getImage().flush();
                Numblocos[x][y].setIcon(bloco8frag2);
            }
            if (aux == 16) {
                bloco16frag2.getImage().flush();
                Numblocos[x][y].setIcon(bloco16frag2);
            }
            if (aux == 32) {
                bloco32frag2.getImage().flush();
                Numblocos[x][y].setIcon(bloco32frag2);

            }
            if (aux == 64) {
                bloco64frag2.getImage().flush();
                Numblocos[x][y].setIcon(bloco64frag2);
            }
            if (aux == 128) {
                bloco128frag2.getImage().flush();
                Numblocos[x][y].setIcon(bloco128frag2);
            }
            if (aux == 256) {
                bloco256frag2.getImage().flush();
                Numblocos[x][y].setIcon(bloco256frag2);
            }
            if (aux == 512) {
                bloco512frag2.getImage().flush();
                Numblocos[x][y].setIcon(bloco512frag2);
            }
            if (aux == 1024) {
                bloco1024frag2.getImage().flush();
                Numblocos[x][y].setIcon(bloco1024frag2);
            }
            if (aux == 2048) {
                setVisible(false);
                dispose();
                Win winner = new Win();
                if(matriz.score > matriz.highScore){
                                matriz.highScore = matriz.score;
                                 matriz.setScore();
                            }
               
                
                Numblocos[x][y].setIcon(bloco2048);
            }
        }else{
            Animation anim = new Animation(); //instancia da variavel anim
            anim.setAux(aux);
            anim.setX(x);
            anim.setY(y);
            if (aux == 2048) {
                dispose();//fechar Jframe antes da chamda da classe
                anim.run(Numblocos);
            } else {
                anim.run(Numblocos);
            }
        }
    }

    public void movimento(int flag, int vet[], int n) {//fucao para movimento dos blocos
        n--;//ajuste do tamanho do vetor de posições
        matriz.setGameBoard(gameBoard);
        gameBoard = matriz.getGameBoard();
        score.setText(Integer.toString(matriz.score));
        score.setForeground(Color.WHITE);
        score.setFont(font);
        
        pontuacaoMax.setText(Integer.toString(matriz.highScore));
        pontuacaoMax.setForeground(Color.WHITE);
        pontuacaoMax.setFont(font);
        
        matriz.printArray();

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                aux = gameBoard[x][y];
                for (int i = 0; i < n; i = i + 2) {//N serve para ver o tamanho do vetor que verifica posições onde foram  feito somas 
                    if (vet[i] == x && vet[i + 1] == y) {//caso a posição seja a msm do vetor manda a flag para verificar
                        verificar(aux, x, y, flag);
                        flaggeral = 1;
                    }
                }
                if (flaggeral == 0) { //se nao entrar no if de verificação do vetor é passado 0 na flag da auxiliar
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

    public void derrota(int flaglose) {//verifica se nao ha mais movimentos assim declarando derrota
        if (flaglose == 1) {
            dispose();
            lose loser = new lose();
        }
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
