/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Janela extends JFrame implements ActionListener {

    ImageIcon img = new ImageIcon(getClass().getResource("Telainicial.png"));
    JLabel foto = new JLabel(img);
    ImageIcon creditos1 = new ImageIcon(getClass().getResource("Creditos.PNG"));
    JLabel creditos = new JLabel(creditos1);
    JButton jogo = new JButton("Jogo");
    JButton creditos_b = new JButton("Creditos");
    JButton sair = new JButton("Sair");
    JButton sair_creditos = new JButton("Sair");
    JButton github = new JButton("Github");
    Game g = new Game();

    public void painel() {

        setLayout(null); //setando layout como nulo para posicionar botoes
        foto.setBounds(0, 0, 500, 600);
        add(foto);

        jogo.setContentAreaFilled(false); //fazer botao desaparecer

        jogo.setBounds(0, 235, 425, 80);
        add(jogo); //adicionando botoes no painel
        jogo.addActionListener(this);
        creditos_b.setContentAreaFilled(false);
        creditos_b.setBounds(50, 340, 425, 80);
        add(creditos_b);
        sair.setContentAreaFilled(false);
        sair.setBounds(0,460,425,80);
         add(sair);

        setTitle("2048 by Giuly and Vking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setVisible(true);
        setLocationRelativeTo(null);

        
        
        
        creditos_b.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                foto.setVisible(false);
                jogo.setVisible(false); //qnd clicar no jogo desaparece tudo
                creditos_b.setVisible(false);
                sair.setVisible(false);

                creditos.setBounds(0, 0, 500, 600);
                add(creditos);
                sair_creditos.setContentAreaFilled(false);
                sair_creditos.setBounds(0, 490, 340, 80);
                add(sair_creditos);
                github.setContentAreaFilled(false);
                github.setBounds(100,300,300,120);
                add(github);

                github.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop().browse(new URL("https://github.com/giulysanfins/2048-Java").toURI());
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (URISyntaxException ex) {
                            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

        });
                sair_creditos.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                foto.setVisible(true);
                jogo.setVisible(true); //qnd clicar no jogo desaparece tudo
                creditos_b.setVisible(true);
                sair.setVisible(true);      
                    }

                });
                
                

            }
        }
        );
        
        
        
        
        
        
        sair.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

        });
        //setFocusable(true);
    }

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
        som.executaSom("C:\\Users\\Giuliano\\Desktop\\2048-Java-Anima-o\\JavaApplication1\\baby.wav");

    }

}
