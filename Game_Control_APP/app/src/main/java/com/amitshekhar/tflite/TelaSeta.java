package com.amitshekhar.tflite;


import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.dorvis.androidtensorflowlite.R;

import java.util.concurrent.ExecutionException;

public class TelaSeta extends AppCompatActivity implements View.OnClickListener, SensorEventListener {

    private TextView textView;
    private SensorManager sensorManager;
    private Sensor acelerometro;
    public int varswitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaseta);

        textView = (TextView) findViewById(R.id.lado);

        // Instância da classe sensorManager através do método abaixo
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        // Definindo o tipo de sensor que vou estar utilizando
        acelerometro = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);


        Button botaoCima = findViewById(R.id.setaCima);
        Button botaoBaixo = findViewById(R.id.setaBaixo);
        Button botaoDireita = findViewById(R.id.setaDireita);
        Button botaoEsquerda = findViewById(R.id.setaEsquerda);
        Button botaoVoltar = findViewById(R.id.voltar);
        Button botaoResetar = findViewById(R.id.botaoreiniciar);
        Button botaoEaster = findViewById(R.id.botaoEaster);
        Switch switch1 = findViewById(R.id.switch1);
        switch1.setOnClickListener(this);


        botaoCima.setOnClickListener(this);
        botaoBaixo.setOnClickListener(this);
        botaoDireita.setOnClickListener(this);
        botaoEsquerda.setOnClickListener(this);
        botaoVoltar.setOnClickListener(this);
        botaoResetar.setOnClickListener(this);
        botaoEaster.setOnClickListener(this);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // do something, the isChecked will be
                // true if the switch is in the On position
                if(isChecked == true){
                    varswitch=1;

                }
                else{
                    varswitch=0;

                }
            }
        });


    }

    // Método que inicia a captura do acelerômetro
    protected void onResume(){
        super.onResume();

        // Parâmetro SENSOR_DELAY_NORMAL define a velocidade da captura das informações
        sensorManager.registerListener(this, acelerometro, SensorManager.SENSOR_DELAY_NORMAL);
    }

    // Método para parar quando não houver interação do usuário, para economizar a bateria
    protected void onPause(){
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    //Acionando se houver mudança na precisão do sensor do acelerômetro
    public void onAccuracyChanged(Sensor sensor, int accuracy){
    }

    //Acionando sempre quando houver na posição do dispositivo identificado pelo sensor
    public void onSensorChanged(SensorEvent event){

        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];
        textView.setText("NEUTRO");
        if (varswitch == 1) {

            if (x >= -4 && x <= 4 && y <= 12 && y >= 9 && z >= -4 && z <= 4) {
                textView.setText("NEUTRO");
            } else {
                if (x >= 9 && x <= 10.5 && y >= -3 && y <= 3 && z >= -3 && z <= 3) {
                    textView.setText("ESQUERDA");
                    verificarmovimento("esquerda");
                } else {
                    if (x >= -3 && x <= 3 && y <= 3 && y >= -3 && z >= -12 && z <= -7) {
                        textView.setText("BAIXO");
                        verificarmovimento("baixo");
                    } else {
                        if (x >= -3 && x <= 3 && y <= 3 && y >= -3 && z >= 9 && z <= 10.5) {
                            textView.setText("CIMA");
                            verificarmovimento("cima");
                        } else {
                            if (x >= -10.5 && x <= -9 && y >= -3 && y <= 3 && z >= -3 && z <= 2) {
                                textView.setText("DIREITA");
                                verificarmovimento("direita");
                            } else {
                                textView.setText("NEUTRO");
                            }
                        }
                    }
                }
            }
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
            case R.id.botaoEaster:

                verificarmovimento("easter");
                Toast.makeText(this, "HUR DUR HUR DUR", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
