package javaapplication1;

import java.util.ArrayList;
import java.util.Random; // pro numero random

/**
 *
 * @author 17142837
 */
public class Game extends HighScore{

    private int[][] gameBoard; //matriz principal
 
    
    public int score=0,flagcont=0;

    private Random r = new Random(); //varivale pra random

    int flagup = 0, flagdown = 0, flagright = 0, flagleft = 0,flagaux=0;
    
    int vet[]=new int[16];
    
    public int n;

    public Game() {
        gameBoard = new int[4][4];

    }

    public void printArray() { //função para printar a gameboard
        for (int[] x : gameBoard) {

            System.out.format("%6d%6d%6d%6d%n", x[0], x[1], x[2], x[3]);
        }
        System.out.format("%n");

    }

    public void addNewNumbers(int[][] gameBoard) { //funcao para escolher numeros aleatorios e add esses numeros
        System.out.println("Adicionando numero");
        ArrayList<Integer> emptySpacesX = new ArrayList();
        ArrayList<Integer> emptySpacesY = new ArrayList();
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if (gameBoard[x][y] == 0) {
                    int[] c = {x, y};
                    emptySpacesX.add(x); //adicionando os espacos vazios 
                    emptySpacesY.add(y);
                }

            }
        }
        int escolha = r.nextInt(emptySpacesX.size());
        int escolhaNumero = r.nextInt(10);
        int newNumber = 2;
        if (escolhaNumero == 0 || escolhaNumero == 5) { //20% de chance de cair um numero "4"
            newNumber = 4;
        }

        int X = emptySpacesX.get(escolha); //coordenada da posicao pra spawnar
        int Y = emptySpacesY.get(escolha);
        gameBoard[X][Y] = newNumber;
    }

    public int moveUp(int[][] gameBoard,int vet[],int n) {//movimento para cima
        System.out.println("Movendo cima");
        int k = 1, x = 0, auxX = -1, flag = 0;

        for (int y = 0; y < 4; y++) {
            for (int j = 0; j < 3; j++) {
                x = k;//
                while (x > 0) {
                    if (gameBoard[x - 1][y] == 0) {//caso em que nao é somado e apenas faz a troca de uma posição com a outra
                        gameBoard[x - 1][y] = gameBoard[x][y];
                        gameBoard[x][y] = 0;

                        if (gameBoard[x][y] != 0 || gameBoard[x - 1][y] != 0) {//
                            flagaux = 1;
                        }
                    } else if (gameBoard[x][y] == gameBoard[x - 1][y] && auxX != x - 1 && auxX != x) {// caso colisão, em que se é somado na posição,
                                                                                                      //flags para evitar casos de erros de somar em 1 movimento
                        if(flagcont==0){//para quando fazer verificar de lose não adicionar score
                            score += gameBoard[x][y] + gameBoard[x - 1][y];
                            if(score > highScore){
                                highScore = score;
                                
                            }
                            setScore();
                        }
                        gameBoard[x - 1][y] = (gameBoard[x - 1][y]) + (gameBoard[x][y]);//soma das posições
                        gameBoard[x][y] = 0;//zera a posição anterior
                        auxX = x - 1;
                        flag = 1;
                        flagaux = 1;//verifica se foi feita a soma
                        if(flagcont==0){// flag para evitar quando for a verificação
                            vet[n]=x-1;// vetor salva as posições onde foram feito as somas
                            n++;//posição do vetor
                            vet[n]=y;
                            n++;
                        }
                    }
                    x--;
                }

                k++;
            }
            auxX = -1;
            k = 1;
        }
        if (flagaux == 1&&flagcont==0) {//se foi feito a soma e nao for verificação add numero novo
            addNewNumbers(gameBoard);
        }
        if(flagcont==0){
        setN(n);
        setVet(vet);
        }
        return flag;
    }

    public int moveDown(int[][] gameBoard,int vet[],int n) {
        int k = 2, x, auxX = -1, flag = 0;
        System.out.println("Movendo baixo");
        for (int y = 3; y >= 0; y--) {
            for (int j = 0; j < 3; j++) {
                x = k;
                while (x < 3) {
                    if (gameBoard[x + 1][y] == 0) {
                        gameBoard[x + 1][y] = gameBoard[x][y];
                        gameBoard[x][y] = 0;

                        if (gameBoard[x][y] != 0 || gameBoard[x + 1][y] != 0) {
                            flagaux = 1;
                        }
                   
                    } else if (gameBoard[x][y] == gameBoard[x + 1][y] && auxX != x + 1 && auxX != x) {
                        if(flagcont==0)
                        {
                            score += gameBoard[x][y] + gameBoard[x+1][y];
                            if(score > highScore){
                                highScore = score;
                                
                            }
                            setScore();
                        }
                        gameBoard[x + 1][y] = (gameBoard[x + 1][y]) + (gameBoard[x][y]);
                        gameBoard[x][y] = 0;
                        auxX = x + 1;
                        flag = 1;
                        flagaux = 1;
                        if(flagcont==0){
                        vet[n]=x+1;
                        n++;
                        vet[n]=y;
                        n++;
                        
                        }
                    }
                    x++;
                }

                k--;
            }
            auxX = -1;
            k = 2;
        }

        if (flagaux == 1&&flagcont==0) {
            addNewNumbers(gameBoard);
        }
       if(flagcont==0){
        setN(n);
        setVet(vet);}
        return flag;

    }

    public int moveRight(int[][] gameBoard,int[] vet,int n) {
        int k = 2, y, auxY = -1, flag = 0;
        System.out.println("Movendo direita");
        for (int x = 3; x >= 0; x--) {
            for (int j = 0; j < 3; j++) {
                y = k;
                while (y < 3) {
                    if (gameBoard[x][y + 1] == 0) {
                        gameBoard[x][y + 1] = gameBoard[x][y];
                        gameBoard[x][y] = 0;
                         if (gameBoard[x][y] != 0 || gameBoard[x][y + 1] != 0) {
                            flagaux = 1;
                        }
                    } else if (gameBoard[x][y] == gameBoard[x][y + 1] && auxY != y + 1 && auxY != y) {
                        if(flagcont==0){               
                            score+= gameBoard[x][y] + gameBoard[x][y+1];
                            if(score > highScore){
                                highScore = score;
                                
                            }
                            setScore();
                        }
                        gameBoard[x][y + 1] = (gameBoard[x][y + 1]) + (gameBoard[x][y]);
                        gameBoard[x][y] = 0;
                        auxY = y + 1;
                        flag = 1;
                        flagaux = 1;
                        if(flagcont==0){
                        vet[n]=x;
                        n++;
                        vet[n]=y+1;
                        n++;
                        }
                    }
                    y++;
                }
                k--;
            }
            auxY = -1;
            k = 2;
        }
        if (flagaux == 1&&flagcont==0) {
            addNewNumbers(gameBoard);
        }
        if(flagcont==0){
        setN(n);
        setVet(vet);}
        return flag;
    }

    public int moveLeft(int[][] gameBoard,int vet[],int n) {
        int k = 1, y, auxY = -1, flag = 0;
        System.out.println("Movendo esquerda");
        for (int x = 0; x < 4; x++) {
            for (int j = 0; j < 3; j++) {
                y = k;
                while (y > 0) {
                    if (gameBoard[x][y - 1] == 0) {
                        gameBoard[x][y - 1] = gameBoard[x][y];
                        gameBoard[x][y] = 0;      
                        if ((gameBoard[x][y] != 0) || (gameBoard[x][y - 1] != 0)) {
                            flagaux = 1;
                        }                      
                    } else if (gameBoard[x][y] == gameBoard[x][y - 1] && auxY != y - 1 && auxY != y) {
                        if(flagcont==0){
                            score += gameBoard[x][y] + gameBoard[x][y-1];
                            if(score > highScore){
                                highScore = score;
                                
                            }
                            setScore();
                        }
                        gameBoard[x][y - 1] = (gameBoard[x][y - 1]) + (gameBoard[x][y]);
                        gameBoard[x][y] = 0;
                        auxY = y - 1;
                        flag = 1;
                        flagaux = 1;
                        if(flagcont==0){
                        vet[n]=x;
                        n++;
                        vet[n]=y-1;
                        n++;
                        }
                    }
                    y--;
                }
                k++;
            }
            auxY = -1;
            k = 1;
        }
        if (flagaux == 1) {
            addNewNumbers(gameBoard);
        }       
        if(flagcont==0){
        setN(n);
        setVet(vet);}
        return flag;
    }

    public int[][] FirstNumber() { // quando iniciar o jogo é adicionado 2 numeros
        addNewNumbers(gameBoard);
        addNewNumbers(gameBoard);
        return gameBoard;
    }

    public int verificarlooser(int[][] gameBoard) {//verificar derrota 

        int[][] matrizaux = new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.arraycopy(gameBoard[i], 0, matrizaux[i], 0, 4);
        }
        flagcont=1; 
        moveDown(matrizaux,vet,0);
        flagdown = flagaux;
        flagaux=0;
        moveUp(matrizaux,vet,0);
        flagup = flagaux;
        flagaux=0;
        moveLeft(matrizaux,vet,0);
        flagleft = flagaux;
        flagaux=0;
        moveRight(matrizaux,vet,0);
        flagright = flagaux;
        flagaux=0;
        setN(0);
        if (flagdown == 0 && flagup == 0 && flagleft == 0 && flagright == 0) {
            flagcont=0;
            return 1;
        }
        flagcont=0;
        return 0;
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public int getFlagaux() {
        return flagaux;
    }

    public void setFlagaux(int flagaux) {
        this.flagaux = flagaux;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getVet() {
        return vet;
    }

    public void setVet(int[] vet) {
        this.vet = vet;
    }
    
}
