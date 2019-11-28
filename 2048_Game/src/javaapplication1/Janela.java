
package javaapplication1;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Janela extends JFrame implements ActionListener {

    ImageIcon img = new ImageIcon("Tela inicial.png");
    JLabel foto = new JLabel(img);
    ImageIcon creditos1 = new ImageIcon("Créditosfundo.PNG");
    ImageIcon botaosair= new ImageIcon("botão sair.png");
    JLabel bsair=new JLabel();
    ImageIcon botaosair2= new ImageIcon("botão sair 2.png");
    ImageIcon botaoiniciar= new ImageIcon("botão iniciar.png");
    JLabel biniciar=new JLabel();
    ImageIcon botaoiniciar2= new ImageIcon("botão iniciar 2.png");
    ImageIcon botaocreditos= new ImageIcon("botão creditos.png");
    JLabel bcreditos=new JLabel();
    ImageIcon botaocreditos2= new ImageIcon("botão creditos 2.png");
    ImageIcon botaovoltar= new ImageIcon("Voltarcreditos.PNG");
    JLabel bvoltar=new JLabel();
    ImageIcon botaovoltar2= new ImageIcon("Voltarcreditos2.PNG");
    ImageIcon botaogit= new ImageIcon("nossogit.PNG");
    JLabel bgit=new JLabel();
    ImageIcon botaogit2= new ImageIcon("nossogit2.PNG");
    JLabel creditos = new JLabel(creditos1);
    JButton jogo = new JButton("Jogo");
    JButton creditos_b = new JButton("Creditos");
    JButton sair = new JButton("Sair");
    JButton sair_creditos = new JButton("Sair");
    JButton github = new JButton("Github");
    Game g = new Game();

    public void painel() {

        setLayout(null); //setando layout como nulo para posicionar botoes
        jogo.setContentAreaFilled(false); //fazer botao desaparecer
        
        biniciar.setBounds(-5,235,460,80);
        biniciar.setIcon(botaoiniciar);
        add(biniciar);
        
        bsair.setBounds(0,460,460,80);
        bsair.setIcon(botaosair);
        add(bsair);
                
        bcreditos.setBounds(0,340,480,80);
        bcreditos.setIcon(botaocreditos);
        add(bcreditos);
        
        foto.setBounds(0, 0, 500, 600);
        add(foto);
        
        jogo.setBounds(0, 235, 425, 80);
        add(jogo); //adicionando botoes no painel
        jogo.addActionListener(this);
        
        bvoltar.setBounds(0, 475, 340, 80);
        bvoltar.setIcon(botaovoltar);
        add(bvoltar);
        

        bgit.setBounds(-5,285,520,160);
        bgit.setIcon(botaogit);
        add(bgit);
        
        creditos_b.setContentAreaFilled(false);
        creditos_b.setBounds(50, 340, 425, 80);
        add(creditos_b);
        
        
        sair.setContentAreaFilled(false);
        sair.setBounds(0,460,425,80);
        add(sair);

        setIconImage(new ImageIcon("download.png").getImage()); //icone da janela
        setTitle("2048 by Giuly and Vking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setVisible(true);
        setLocationRelativeTo(null);      
             
        creditos_b.addMouseListener(new MouseAdapter() { //evento botao credito
            
            public void mouseEntered(MouseEvent e){
                bcreditos.setIcon(botaocreditos2);
            }
            public void mouseExited(MouseEvent e){
                bcreditos.setIcon(botaocreditos);
            }
            
            public void mouseClicked(MouseEvent e) {
                bcreditos.setVisible(false); //se clicar no creditos deixa os outros botoes sem visibilidade e coloca o credito
                bsair.setVisible(false);
                biniciar.setVisible(false);
                foto.setVisible(false);
                jogo.setVisible(false); //qnd clicar no jogo desaparece tudo
                creditos_b.setVisible(false);
                sair.setVisible(false);
                bvoltar.setVisible(true); 

                creditos.setBounds(0, 0, 500, 600);
                add(creditos);
            
                sair_creditos.setContentAreaFilled(false);
                sair_creditos.setBounds(0, 490, 340, 80);
                add(sair_creditos);
                github.setContentAreaFilled(false);
                github.setBounds(100,300,300,120);
                add(github);

                github.addMouseListener(new MouseAdapter() { //evento pra redirecionar pro github
                      public void mouseEntered(MouseEvent e){
                        bgit.setIcon(botaogit2);
                     }
                     public void mouseExited(MouseEvent e){
                         bgit.setIcon(botaogit);
                    }
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
            sair_creditos.addMouseListener(new MouseAdapter() { //evento do botao voltar do credito
                public void mouseEntered(MouseEvent e){
                    bvoltar.setIcon(botaovoltar2);
                  //  System.out.println("oazsndaousdn");
                }
                public void mouseExited(MouseEvent e){
    
                   
                   bvoltar.setIcon(botaovoltar);
                }
                public void mouseClicked(MouseEvent e) {
                bcreditos.setVisible(true);
                bsair.setVisible(true);
                biniciar.setVisible(true);
                foto.setVisible(true);
                jogo.setVisible(true); //qnd clicar no jogo desaparece tudo
                creditos_b.setVisible(true);
                sair.setVisible(true);      
                    }
                });
            }
        }
        ); 
        
        sair.addMouseListener(new MouseAdapter() { //sair do jogo
            
            public void mouseEntered(MouseEvent e){
                bsair.setIcon(botaosair2);
            }
            public void mouseExited(MouseEvent e){
                bsair.setIcon(botaosair);
            }
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

        });
    
  jogo.addMouseListener(new MouseAdapter() { //funcao do jogo
    public void mouseEntered(MouseEvent e){
        biniciar.setIcon(botaoiniciar2);
    }
    public void mouseExited(MouseEvent e){
        biniciar.setIcon(botaoiniciar);
    }    
    public void mouseClicked(ActionEvent e) {
            actionPerformed(e);
    }
    });

}

    @Override
    public void actionPerformed(ActionEvent e) {
        foto.setVisible(false);
        jogo.setVisible(false); //qnd clicar no jogo desaparece tudo
        creditos.setVisible(false);
        sair.setVisible(false);
        dispose();
        Printar p = new Printar();
        p.run();
       p.runMicroService();
        som som = new som();
        som.executaSom("baby.wav");
      
    }
}
