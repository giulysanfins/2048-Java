/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import static java.lang.Integer.parseInt;
import java.util.Formatter;
import java.util.Scanner;

public class HighScore {

    //Controla score do jogo
    public int currentScore;
    public int highScore;

    //Cores do score
    public Color scoreColor = new Color(0xA020F0);
    public Color bestColor = new Color(0x191970);

    //Fonte do score
    public Font scoreFont;

    public HighScore() {
    }

    /*
     Toda manipulção com arquivos necessita try-catch
     Exemplo: não existencia do arquivo
     */
    //========================================================================//
    //Função para criar o arquivo
    public void createScore() {
        try {
            //Cria arquivo com sua localização e nome
            File file = new File("build\\classes\\SaveHighScore.txt");

            //Para poder escrever no arquivo
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("" + 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //========================================================================//
    //Função dar load no valor do arquivo
    public void loadScore() {
        try {
            File file = new File("build\\classes\\SaveHighScore.txt");
            Scanner sc = new Scanner(file);

            //Se o arquivo não existe
            if (!file.isFile()) {
                createScore();
            }

            //Leitura do arquivo
            highScore = parseInt(sc.next()); //String para inteiro

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //========================================================================//
    //Função para escrever o novo 'highScore' no arquivo
    public void setScore() {
        FileWriter output = null;
        try {

            Formatter file = new Formatter("build\\classes\\SaveHighScore.txt");
            file.format("" + highScore);
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}