     
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
        System.out.println("Adicionando numero");
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
    
    public void moveUp(){
        System.out.println("Movendo cima");
        int k = 1, x = 0,auxX=-1;
    
        
        for(int y=0;y<4;y++){
            for(int j=0;j<3;j++){
                x=k;
                while(x>0)
                {
                    if(gameBoard[x-1][y]==0){
                        gameBoard[x-1][y]=gameBoard[x][y];
                        gameBoard[x][y]=0;
                    }else
                    if(gameBoard[x][y]==gameBoard[x-1][y] &&  auxX != x-1 && auxX != x)
                    {
                        gameBoard[x-1][y]=(gameBoard[x-1][y])+(gameBoard[x][y]);
                        gameBoard[x][y]=0;
                         auxX= x-1;
                        
                    }
                 x--;
                }
                
                k++;
            }
           auxX = -1;
           
            k=1;
        }
        addNewNumbers();
    }
    
    
    
    public void moveDown(){
        int k = 2, x,auxX=-1;
        System.out.println("Movendo baixo");
    
        for(int y=3;y>=0;y--){
            for(int j=0;j<3;j++){
                x=k;
                while(x<3)
                {
                    if(gameBoard[x+1][y]==0){
                        gameBoard[x+1][y]=gameBoard[x][y];
                        gameBoard[x][y]=0;
                    }else
                    if(gameBoard[x][y]==gameBoard[x+1][y] && auxX != x+1 && auxX != x )
                    {
                        gameBoard[x+1][y]=(gameBoard[x+1][y])+(gameBoard[x][y]);
                        gameBoard[x][y]=0;
                        auxX= x+1;
                        
                    }
                 x++;
                }
                
                k--;
            }
            auxX = -1;
            k=2;
        }
        addNewNumbers();
        
    }
    
    public void moveRight(){
        int k = 2, y,auxY=-1;
        System.out.println("Movendo direita");
    
        for(int x=3;x>=0;x--){
            for(int j=0;j<3;j++){
                y=k;
                while(y<3)
                {
                    if(gameBoard[x][y+1]==0){
                        gameBoard[x][y+1]=gameBoard[x][y];
                        gameBoard[x][y]=0;
                    }else
                    if(gameBoard[x][y]==gameBoard[x][y+1] && auxY != y+1 && auxY != y )
                    {
                        gameBoard[x][y+1]=(gameBoard[x][y+1])+(gameBoard[x][y]);
                        gameBoard[x][y]=0;
                        auxY= y+1;
                        
                    }
                 y++;
                }
                
                k--;
            }
            auxY = -1;
            k=2;
        }
      addNewNumbers();  
    }
    
 public void moveLeft(){
        int k = 1, y,auxY=-1;
        System.out.println("Movendo esquerda");
    
        for(int x=0;x<4;x++){
            for(int j=0;j<3;j++){
                y=k;
                while(y>0)
                {
                    if(gameBoard[x][y-1]==0){
                        gameBoard[x][y-1]=gameBoard[x][y];
                        gameBoard[x][y]=0;
                    }else
                    if(gameBoard[x][y]==gameBoard[x][y-1] && auxY != y-1 && auxY != y )
                    {
                        gameBoard[x][y-1]=(gameBoard[x][y-1])+(gameBoard[x][y]);
                        gameBoard[x][y]=0;
                        auxY= y-1;
                        
                    }
                 y--;
                }
                
                k++;
            }
            auxY = -1;
            k=1;
        }
       addNewNumbers(); 
    }
       
    
    
}
