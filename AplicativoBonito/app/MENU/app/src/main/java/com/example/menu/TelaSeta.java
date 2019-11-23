package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class TelaSeta extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setas);
        Button botaoCima = findViewById(R.id.setaCima);
        Button botaoBaixo = findViewById(R.id.setaBaixo);
        Button botaoDireita = findViewById(R.id.setaDireita);
        Button botaoEsquerda = findViewById(R.id.setaEsquerda);
        Button botaoVoltar = findViewById(R.id.voltar);
        Button botaoResetar = findViewById(R.id.botaoreiniciar);


        botaoCima.setOnClickListener(this);
        botaoBaixo.setOnClickListener(this);
        botaoDireita.setOnClickListener(this);
        botaoEsquerda.setOnClickListener(this);
        botaoVoltar.setOnClickListener(this);
        botaoResetar.setOnClickListener(this);
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

            case R.id.setaCima:
                verificarmovimento("cima");
                Toast.makeText(this, "Apertou botao cima", Toast.LENGTH_SHORT).show();
                break;

            case R.id.setaBaixo:
                verificarmovimento("baixo");
                Toast.makeText(this, "Apertou botao baixo", Toast.LENGTH_SHORT).show();
                break;

            case R.id.setaDireita:
                verificarmovimento("direita");
                Toast.makeText(this, "Apertou botao direita", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setaEsquerda:

                verificarmovimento("esquerda");
                Toast.makeText(this, "Apertou botao esquerda", Toast.LENGTH_SHORT).show();
                break;

            case R.id.botaoreiniciar:
                verificarmovimento("resetar");
                Toast.makeText(this, "Apertou botao resetar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.voltar:

                verificarmovimento("voltar");
                Toast.makeText(this, "Apertou botao voltar", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
