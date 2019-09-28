/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Janela extends JFrame implements ActionListener {

    ImageIcon img = new ImageIcon(getClass().getResource("Telainicial.png"));
    JLabel foto = new JLabel(img);
    JButton jogo = new JButton("Jogo");
    JButton creditos = new JButton("Creditos");
    JButton sair = new JButton("Sair");
    Game g = new Game();
 


    public void painel() {

        
        
        setLayout(null); //setando layout como nulo para posicionar botoes
        foto.setBounds(0, 0, 500, 600);
        add(foto);

        jogo.setContentAreaFilled(false); //fazer botao desaparecer

        jogo.setBounds(0, 235, 425, 80);
        add(jogo); //adicionando botoes no painel
        jogo.addActionListener(this);
        // add(creditos);
        // add(sair);

        setTitle("2048 by Giuly and Vking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setVisible(true);
        setLocationRelativeTo(null);

        //setFocusable(true);
    }

 
    
    
  /*  public class teste extends Thread {
 public void run() {
  executar = false;
  while(true){
      play("baby");
      try{sleep(40000);}catch(Exception erro){}
      play("baby");
  }
 }
}*/
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        foto.setVisible(false);
        jogo.setVisible(false); //qnd clicar no jogo desaparece tudo
        creditos.setVisible(false);
        sair.setVisible(false);
        dispose();
        //play("baby");
        Printar p = new Printar();
        p.run();
        som som = new som();
        som.executaSom("C:\\Users\\Sergio\\Desktop\\JavaApplication1\\baby.wav");
          
         

    }

}
