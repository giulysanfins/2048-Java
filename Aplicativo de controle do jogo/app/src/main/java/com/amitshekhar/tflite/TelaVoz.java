package com.amitshekhar.tflite;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.speech.RecognizerIntent;
import android.widget.Toast;

import com.dorvis.androidtensorflowlite.R;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutionException;


public class TelaVoz extends AppCompatActivity implements View.OnClickListener{

    private final int IdTextoForVoice =100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_voz);

        Button Falar = findViewById(R.id.Speak);
        Falar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Speak:

                Intent iVoz = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                iVoz.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                iVoz.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                iVoz.putExtra(RecognizerIntent.EXTRA_PROMPT,"Fale o Movimento Desejado");

                try {
                    startActivityForResult(iVoz, IdTextoForVoice);
                }catch(ActivityNotFoundException a){
                    Toast.makeText(getApplicationContext(),"Seu celular falta garra azedo em...",Toast.LENGTH_SHORT).show();
                }
            break;
        }
    }

    protected void onActivityResult(int id,int resultCodeID, Intent dados ) {
        switch (id) {
            case IdTextoForVoice:
                String ditado = null;
                if (resultCodeID == RESULT_OK && null != dados) {
                    ArrayList<String> result = dados.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    ditado = result.get(0);

                    if (ditado.equals("cima") || ditado.equals("para cima") || ditado .equals("subir"))
                        verificarmovimento("cima");

                    else if (ditado .equals("baixo") || ditado.equals("descer") || ditado .equals("para baixo"))
                        verificarmovimento("baixo");

                    else if (ditado .equals("direita") || ditado.equals("para direita"))
                        verificarmovimento("direita");

                    else if (ditado .equals("esquerda") || ditado.equals("para esquerda"))
                        verificarmovimento("esquerda");

                } else
                    Toast.makeText(this, "Fale um palavra valida inutil", Toast.LENGTH_SHORT).show();

                Toast.makeText(this, ditado, Toast.LENGTH_SHORT).show();
                break;
        }

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
}
