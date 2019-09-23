/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo2048;


import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author VICTOR
 */
public final class Printar extends javax.swing.JFrame {

    //JLabel blackground = new JLabel(new ImageIcon(getClass().getResource("blackground.png")));

    Game matriz = new Game();
    public int[][] gameBoard = matriz.FirstNumber();
    
    JPanel background = new JPanel();
    JLabel[][] Numblocos = new JLabel[4][4];
    int aux, posX = 102, posY = 150;
   // Font fonte = new Font("Boulder", Font.BOLD, 15);
    ImageIcon inicial = new ImageIcon("download.png");
    ImageIcon bloco2 = new ImageIcon("bloco2.PNG");
    Icon bloco4 = new ImageIcon("bloco4.png");
    Icon bloco8 = new ImageIcon("bloco8.png");
    Icon bloco16 = new ImageIcon("bloco16.png");
    Icon bloco32 = new ImageIcon("bloco32.png");
    Icon bloco64= new ImageIcon("bloco64.png");
    Icon bloco128 = new ImageIcon("bloco128.png");
    Icon bloco256 = new ImageIcon("bloco256.png");
    Icon bloco512 = new ImageIcon("bloco512.png");
    Icon bloco1024 = new ImageIcon("bloco1024.png");
    Icon bloco2048 = new ImageIcon("bloco2048.png");
    

               

    public Printar() {
        //setResizable(false);
        initComponents();
        setLayout(null);
        printarNumblocos();
 
        background = new JPanel();
        background.setBackground(Color.DARK_GRAY);
        background.setBounds(95, 135, 300, 300);
        add(background);
    }

    public void printarNumblocos() {
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                Numblocos[x][y] = new JLabel();
                Numblocos[x][y].setVisible(true);
                Numblocos[x][y].setIcon(inicial);
                Numblocos[x][y].setBounds(posX, posY, 70,70);
                add(Numblocos[x][y]);
                posY = posY + 72;
            }
            posY = 150;
            posX = posX + 70;
        }
    }


    public void verificar(int aux,int posX,int posY,int y,int x){    
        if(aux==0){
           
            Numblocos[x][y].setIcon(inicial);
            
        }if(aux==2){
           
            Numblocos[x][y].setIcon(bloco2);
             
        }
        if(aux==4){
           
            Numblocos[x][y].setIcon(bloco4);
              
        }
        if(aux==8){
           
            Numblocos[x][y].setIcon(bloco8);
             
        }
         if(aux==16){
           
            Numblocos[x][y].setIcon(bloco16);
            
        }
         if(aux==32){
           
            Numblocos[x][y].setIcon(bloco32);
               
        }
         if(aux==64){
           
            Numblocos[x][y].setIcon(bloco64);
               
        }
         if(aux==128){
           
            Numblocos[x][y].setIcon(bloco128);
             
        }
         if(aux==256){
           
            Numblocos[x][y].setIcon(bloco256);
            
        }
         if(aux==512){
           
            Numblocos[x][y].setIcon(bloco512);
               
        }
         if(aux==1024){
           
            Numblocos[x][y].setIcon(bloco1024);
             
        }
         if(aux==2048){
           
            Numblocos[x][y].setIcon(bloco2048);
              
        }
 
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo2048/seta down.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(208, 450, 70, 50);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo2048/seta rigth.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 245, 50, 80);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo2048/seta up.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(208, 70, 80, 40);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo2048/seta left.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(26, 245, 50, 80);

        setBounds(700, 200, 501, 639);
    }// </editor-fold>//GEN-END:initComponents

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        posY = 102;
        posX = 150;
        matriz.moveDown();
        gameBoard = matriz.getGameBoard();

        matriz.printArray();
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                aux = gameBoard[x][y];
                verificar(aux,posX,posY, x, y);
                posY = posY + 72;
            }
            posY = 150;
            posX = posX + 70;
        }

    }

    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        posY = 102;
        posX = 150;

        matriz.moveRight();
        gameBoard = matriz.getGameBoard();

        matriz.printArray();
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                aux = gameBoard[x][y];
                verificar(aux,posX,posY, x, y);
                posY = posY + 70;
            }
            posY = 150;
            posX = posX + 70;
        }

    }

    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        posY = 102;
        posX = 150;
        matriz.moveUp();
        gameBoard = matriz.getGameBoard();
        matriz.printArray();
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                aux = gameBoard[x][y];
                verificar(aux,posX,posY, x, y);

                posY = posY + 70;
            }
            posY = 150;
            posX = posX + 70;
        }

    }

    public void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        posY = 102;
        posX = 150;
        matriz.moveLeft();
        gameBoard = matriz.getGameBoard();
        matriz.printArray();
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                aux = gameBoard[x][y];
                verificar(aux,posX,posY, x, y);
                posY = posY + 70;
            }
            posY = 150;
            posX = posX + 70;
        }

    }

    static {
        /*
         {
         }/*  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          //for(int i=0;i<4;i++){  
         aux=gameBoard[0][0];
         jLabel1.setText(Integer.toString(aux));
         aux=gameBoard[0][1];
         jLabel2.setText(Integer.toString(aux));
         aux=gameBoard[0][2];
         jLabel3.setText(Integer.toString(aux));
         aux=gameBoard[0][3];
         jLabel4.setText(Integer.toString(aux));
         aux=gameBoard[1][0];
         jLabel5.setText(Integer.toString(aux));
         aux=gameBoard[1][1];
         jLabel6.setText(Integer.toString(aux));
         aux=gameBoard[1][2];
         jLabel7.setText(Integer.toString(aux));
         aux=gameBoard[1][3];
         jLabel8.setText(Integer.toString(aux));
         aux=gameBoard[2][0];
         jLabel9.setText(Integer.toString(aux));
         aux=gameBoard[2][1];
         jLabel10.setText(Integer.toString(aux));
         aux=gameBoard[2][2];
         jLabel11.setText(Integer.toString(aux));
         aux=gameBoard[2][3];
         jLabel12.setText(Integer.toString(aux));
         aux=gameBoard[3][0];
         jLabel13.setText(Integer.toString(aux));
         aux=gameBoard[3][1];
         jLabel14.setText(Integer.toString(aux));
         aux=gameBoard[3][2];
         jLabel15.setText(Integer.toString(aux));
         aux=gameBoard[3][3];
         jLabel16.setText(Integer.toString(aux));
        
         //matriz.addNewNumbers();
        
        
         //}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add yur handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    /*
         public void imprimindo(){
         for(int i=0;i<3;i++){
         matriz.moveLeft();
         gameBoard=matriz.getGameBoard();
         //Printar.jButton3ActionPerformed();
         }
         }
         }
         */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Printar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Printar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Printar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Printar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Printar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables

}
