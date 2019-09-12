/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 17142837
 */
public class Java2048 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Game g= new Game();
        
        for(int i=0;i<10;i++){
            
        
            g.addNewNumbers();
            g.printArray();
        }
        
    }
    
}
