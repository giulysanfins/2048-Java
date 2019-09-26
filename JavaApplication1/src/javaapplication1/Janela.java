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
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;        

public class Janela extends JFrame implements KeyListener, ActionListener {
    ImageIcon img = new ImageIcon(getClass().getResource("Telainicial.png"));
    JLabel foto = new JLabel(img);
    JButton jogo = new JButton("Jogo");
    JButton creditos = new JButton("Creditos");
    JButton sair = new JButton("Sair");
    Game g= new Game();
    Font fonte = new Font("Arial",Font.BOLD,50);
    
    
    
    
    public void painel(){
        
        setLayout(null); //setando layout como nulo para posicionar botoes
        foto.setBounds(0, 0, 500, 600);
        add(foto);
                       
       jogo.setContentAreaFilled(false); //fazer botao desaparecer
        
    
        
        jogo.setBounds(0, 235, 425, 80);
        add(jogo); //adicionando botoes no painel
        jogo.addActionListener(this);
       // add(creditos);
       // add(sair);
        jogo.setFont(fonte);
        creditos.setFont(fonte); //mudando fonte dos botoes
        sair.setFont(fonte);
        
    
        setTitle("2048 by Giuly and Vking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(this);
       addKeyListener(this);
       setFocusable(true);
    }
    
    

    @Override
    public void keyPressed(KeyEvent e){
            
            int codigo = e.getKeyCode(); //atribuindo teclado
            //Seta P/ baixo
        if (e.getKeyCode()==40|| e.getKeyCode()==KeyEvent.VK_S){
            g.moveDown();
            System.out.println("Tecla BAIXO"); //API https://docs.oracle.com/javase/1.5.0/docs/api/
            g.printArray();
        }
        //Seta P/ cima        
        if (e.getKeyCode()==38 || e.getKeyCode()==KeyEvent.VK_W ){
            g.moveUp();
             System.out.println("Tecla CIMA");
             g.printArray();
        }
        //Seta P/ direita
        if (e.getKeyCode()==39|| e.getKeyCode()==KeyEvent.VK_D){
            g.moveRight();
             System.out.println("Tecla DIREITA");
             g.printArray();
        }
        //Seta P/ esquerda
        if (e.getKeyCode()==37|| e.getKeyCode()==KeyEvent.VK_A){
            g.moveLeft();
             System.out.println("Tecla ESQUERDA");
             g.printArray();
        }
        }
     
    @Override
     public void keyReleased(KeyEvent e){
         
         
     }
    
    @Override
     public void keyTyped(KeyEvent e){
         
         
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        foto.setVisible(false);
        jogo.setVisible(false); //qnd clicar no jogo desaparece tudo
        creditos.setVisible(false);
        sair.setVisible(false);

    }
    
}
