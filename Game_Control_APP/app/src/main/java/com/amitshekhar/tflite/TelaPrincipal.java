package com.amitshekhar.tflite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dorvis.androidtensorflowlite.R;

public class TelaPrincipal extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);

        Button botaoTensor = findViewById(R.id.botaoTensor);
        Button botaoSeta = findViewById(R.id.botaoSeta);
        Button botaoVoz = findViewById(R.id.botaoVoz);
        Button botaoSair = findViewById(R.id.botaoSair);



        botaoTensor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(TelaPrincipal.this, MainActivity.class);
                startActivity(it);
            }
        });
        botaoSeta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(TelaPrincipal.this, TelaSeta.class);
                startActivity(it);
            }
        });
        botaoVoz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(TelaPrincipal.this, TelaVoz.class);
                startActivity(it);
            }
        });
        botaoSair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }




}
