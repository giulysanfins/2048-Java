
package javaapplication1;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class som {

    Clip clip;

    public void executaSom(String caminho) {
        try {
            File audioPath = new File(caminho);                                 //instancia o arquivo
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioPath);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }

    public void parar() {
        // Clip clip = AudioSystem.getClip();
        try {
            this.clip.stop();
        } catch (Exception e) {

        }
    }

}

