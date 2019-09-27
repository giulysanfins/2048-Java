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
    private Random r = new Random(); //varivale pra random
    
    public Game(){
        gameBoard = new int[4][4];
        
    }
    
    public void printArray(){
        for(int[] x: gameBoard){
           
                System.out.format("%6d%6d%6d%6d%n",x[0],x[1],x[2],x[3]);
                               }
        System.out.format("%n");
        
    }
    
    public void addNewNumbers()
    {
        ArrayList<Integer> emptySpacesX = new ArrayList();
        ArrayList<Integer> emptySpacesY = new ArrayList();
       for(int x=0;x<4;x++)
       {
           for(int y=0;y<4;y++)
           {
               if(gameBoard[x][y] == 0)
               {
                   int[] c = {x,y};
                   emptySpacesX.add(x); //adicionando os espacos vazios 
                   emptySpacesY.add(y);
               }
               
           }
           
       } 
     int escolha = r.nextInt(emptySpacesX.size());
     int escolhaNumero = r.nextInt(10);
     int newNumber=2;
      if(escolhaNumero == 0 || escolhaNumero == 5){
          newNumber = 4;
      }
      
      int X = emptySpacesX.get(escolha);
      int Y = emptySpacesY.get(escolha);
      gameBoard[X][Y] = newNumber;
    }
}
