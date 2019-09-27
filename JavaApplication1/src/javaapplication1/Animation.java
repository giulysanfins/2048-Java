/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author VICTOR
 */
public class Animation extends Thread{
    
    public int aux,x,y;


    ImageIcon inicial = new ImageIcon("blocoincial.png");
    Icon bloco2 = new ImageIcon("bloco2.png");
    Icon bloco2frag = new ImageIcon("bloco2aument.gif");
    Icon bloco4 = new ImageIcon("bloco4.png");
    Icon bloco4frag = new ImageIcon("bloco4aument.gif");
    Icon bloco8 = new ImageIcon("bloco8.png");
    Icon bloco8frag = new ImageIcon("bloco8frag.gif");
    Icon bloco16 = new ImageIcon("bloco16.png");
    Icon bloco16frag = new ImageIcon("bloco16frag.gif");
    Icon bloco32 = new ImageIcon("bloco32.png");
    Icon bloco32frag = new ImageIcon("bloco32frag.gif");
    Icon bloco64 = new ImageIcon("bloco64.png");
    Icon bloco128 = new ImageIcon("bloco128.png");
    Icon bloco256 = new ImageIcon("bloco256.png");
    Icon bloco512 = new ImageIcon("bloco512.png");
    Icon bloco1024 = new ImageIcon("bloco1024.png");
    Icon bloco2048 = new ImageIcon("bloco2048.png");

    public Animation() {

    }
    
    
    public void run(JLabel Numblocos[][]){
       Runnable Run = new Runnable() {
            public void run() {
        if(aux==0){
             Numblocos[x][y].setIcon(inicial);
        }
        if (aux == 2) {

            Numblocos[x][y].setIcon(bloco2frag);
            try{Thread.sleep(250);}catch(Exception e){}
            Numblocos[x][y].setIcon(bloco2);

        }
        if (aux == 4) {

            Numblocos[x][y].setIcon(bloco4frag);
            try{Thread.sleep(250);}catch(Exception e){}
            Numblocos[x][y].setIcon(bloco4);

        }
        if (aux == 8) {
            Numblocos[x][y].setIcon(bloco8frag);
            try{Thread.sleep(200);}catch(Exception e){}
            Numblocos[x][y].setIcon(bloco8);
        }
        if (aux == 16) {
            Numblocos[x][y].setIcon(bloco16frag);
            try{Thread.sleep(200);}catch(Exception e){}
            Numblocos[x][y].setIcon(bloco16);
            
        }
        if (aux == 32) {
            Numblocos[x][y].setIcon(bloco32frag);
            try{Thread.sleep(200);}catch(Exception e){}
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
        };
        Thread Ani = new Thread(Run);
        Ani.start();
        
    }
    
    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    
    
    

}
