/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Random; // pro numero random

/**
 *
 * @author 17142837
 */
public class Game {

    private int[][] gameBoard;
    
    public int score=0,flagcont=0;

    private Random r = new Random(); //varivale pra random

    int flagup = 0, flagdown = 0, flagright = 0, flagleft = 0;

    public Game() {
        gameBoard = new int[4][4];

    }

    public void printArray() {
        for (int[] x : gameBoard) {

            System.out.format("%6d%6d%6d%6d%n", x[0], x[1], x[2], x[3]);
        }
        System.out.format("%n");

    }

    public void addNewNumbers(int[][] gameBoard) {
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
        if (escolhaNumero == 0 || escolhaNumero == 5) {
            newNumber = 4;
        }

        int X = emptySpacesX.get(escolha);
        int Y = emptySpacesY.get(escolha);
        gameBoard[X][Y] = newNumber;
    }

    public int moveUp(int[][] gameBoard) {
        System.out.println("Movendo cima");
        int k = 1, x = 0, auxX = -1, flag = 0;

        for (int y = 0; y < 4; y++) {
            for (int j = 0; j < 3; j++) {
                x = k;
                while (x > 0) {
                    if (gameBoard[x - 1][y] == 0) {
                        gameBoard[x - 1][y] = gameBoard[x][y];
                        gameBoard[x][y] = 0;
                        if (gameBoard[x][y] != 0 || gameBoard[x - 1][y] != 0) {
                            flag = 1;
                        }

                    } else if (gameBoard[x][y] == gameBoard[x - 1][y] && auxX != x - 1 && auxX != x) {
                        if(flagcont==0){
                            
                            score += gameBoard[x][y] + gameBoard[x - 1][y];
                        }
                        gameBoard[x - 1][y] = (gameBoard[x - 1][y]) + (gameBoard[x][y]);
                        gameBoard[x][y] = 0;
                        auxX = x - 1;
                        flag = 1;
                        
                    }
                    x--;
                }

                k++;
            }
            auxX = -1;

            k = 1;
        }
        if (flag == 1) {
            addNewNumbers(gameBoard);
        }
        return flag;
    }

    public int moveDown(int[][] gameBoard) {
        int k = 2, x, auxX = -1, flag = 0;
        System.out.println("Movendo baixo");

        //gameBoard[0][2]=2048;
        for (int y = 3; y >= 0; y--) {
            for (int j = 0; j < 3; j++) {
                x = k;
                while (x < 3) {
                    if (gameBoard[x + 1][y] == 0) {
                        gameBoard[x + 1][y] = gameBoard[x][y];
                        gameBoard[x][y] = 0;

                        if (gameBoard[x][y] != 0 || gameBoard[x + 1][y] != 0) {
                            flag = 1;
                        }

                    } else if (gameBoard[x][y] == gameBoard[x + 1][y] && auxX != x + 1 && auxX != x) {
                        if(flagcont==0)
                        {
                            score += gameBoard[x][y] + gameBoard[x+1][y];
                        }
                        gameBoard[x + 1][y] = (gameBoard[x + 1][y]) + (gameBoard[x][y]);
                        gameBoard[x][y] = 0;
                        auxX = x + 1;
                        flag = 1;
                    }
                    x++;
                }

                k--;
            }
            auxX = -1;
            k = 2;
        }

        if (flag == 1) {
            addNewNumbers(gameBoard);
        }
        return flag;

    }

    public int moveRight(int[][] gameBoard) {
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
                            flag = 1;
                        }

                    } else if (gameBoard[x][y] == gameBoard[x][y + 1] && auxY != y + 1 && auxY != y) {
                        if(flagcont==0){
                            
                            score+= gameBoard[x][y] + gameBoard[x][y+1];
                        }
                        gameBoard[x][y + 1] = (gameBoard[x][y + 1]) + (gameBoard[x][y]);
                        gameBoard[x][y] = 0;
                        auxY = y + 1;
                        flag = 1;

                    }
                    y++;
                }

                k--;
            }
            auxY = -1;
            k = 2;
        }
        if (flag == 1) {
            addNewNumbers(gameBoard);
        }
        return flag;
    }

    public int moveLeft(int[][] gameBoard) {
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
                            flag = 1;
                        }

                    } else if (gameBoard[x][y] == gameBoard[x][y - 1] && auxY != y - 1 && auxY != y) {
                        if(flagcont==0){
                            score += gameBoard[x][y] + gameBoard[x][y-1];
                        }
                        gameBoard[x][y - 1] = (gameBoard[x][y - 1]) + (gameBoard[x][y]);
                        gameBoard[x][y] = 0;
                        auxY = y - 1;
                        flag = 1;

                    }
                    y--;
                }

                k++;
            }
            auxY = -1;
            k = 1;
        }
        if (flag == 1) {
            addNewNumbers(gameBoard);
        }
        return flag;

    }

    public int[][] FirstNumber() {
        addNewNumbers(gameBoard);
        addNewNumbers(gameBoard);
        return gameBoard;
    }

    public void verificarlooser(int[][] gameBoard) {

        int[][] matrizaux = new int[4][4];//verificar loose

        for (int i = 0; i < 4; i++) {
            System.arraycopy(gameBoard[i], 0, matrizaux[i], 0, 4);
        }
        flagcont=1; 
        flagdown = moveDown(matrizaux);
        flagup = moveUp(matrizaux);
        flagleft = moveLeft(matrizaux);
        flagright = moveRight(matrizaux);

        if (flagdown == 0 && flagup == 0 && flagleft == 0 && flagright == 0) {
            lose looser = new lose();
        }
        flagcont=0;
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

}
