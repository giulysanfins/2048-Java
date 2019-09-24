/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;        

public class Janela extends JFrame{
    //ImageIcon img = ;
    JLabel foto = new JLabel(new ImageIcon(getClass().getResource("Telainicial.png")));
    JButton jogo = new JButton("Jogo");
    JButton creditos = new JButton("Creditos");
    JButton sair = new JButton("Sair");
    
    Font fonte = new Font("Arial",Font.BOLD,50);
    
    
    
    
    public void painel(){
        
       setLayout(null); //setando layout como nulo para posicionar botoes
       //setLayout(new GridLayout(4,1)); //linha x coluna
       foto.setBounds(0, 0, 500, 600);
       add(foto);
                       
       jogo.setContentAreaFilled(false); //fazer botao desaparecer
        
        jogo.setBounds(0, 235, 425, 80);
        add(jogo); //adicionando botoes no painel
        add(creditos);
        add(sair);
        jogo.setFont(fonte);
        creditos.setFont(fonte); //mudando fonte dos botoes
        sair.setFont(fonte);
        
               //Captura tecla=new Captura();
        
       
        //tecla.CapturarTeclado();
        jogo.addActionListener(new ActionListener(){ //sintaxe para adicionar acao para botao
            public void actionPerformed(ActionEvent e){
                
               foto.setVisible(false);
               jogo.setVisible(false); //qnd clicar no jogo desaparece tudo
               creditos.setVisible(false);
               sair.setVisible(false);     
                
            }
        });
        

        
       // foto.setBounds(600,600,100,200);
        //add(foto);
        setTitle("2048 by Giuly and Vking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(this);
        
    
       
    }
    
}
