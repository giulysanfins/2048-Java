package com.example.jogo2048;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoCima = findViewById(R.id.botaoCima);
        Button botaoBaixo = findViewById(R.id.botaoBaixo);
        Button botaoDireita = findViewById(R.id.botaoDireita);
        Button botaoEsquerda = findViewById(R.id.botaoEsquerda);

        botaoCima.setOnClickListener(this);
        botaoBaixo.setOnClickListener(this);
        botaoDireita.setOnClickListener(this);
        botaoEsquerda.setOnClickListener(this);

    }
    public void verificarmovimento(String movimento){
        ClientWS movi=new ClientWS(movimento);
        try {
            movi.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.botaoCima:

                verificarmovimento("cima");
                Toast.makeText(this, "Apertou botao cima", Toast.LENGTH_SHORT).show();
                break;
            case R.id.botaoBaixo:

                verificarmovimento("baixo");
                Toast.makeText(this, "Apertou botao baixo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.botaoDireita:

                verificarmovimento("direita");
                Toast.makeText(this, "Apertou botao direita", Toast.LENGTH_SHORT).show();
                break;
            case R.id.botaoEsquerda:

                verificarmovimento("esquerda");
                Toast.makeText(this, "Apertou botao esquerda", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}