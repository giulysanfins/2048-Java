package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void telaSeta(View view){

        Intent intent = new Intent(this, TelaSeta.class);
        startActivity(intent);
    }
    public void telaTensor(View view){

        Intent intent = new Intent(this, TelaTensorFlow.class);
        startActivity(intent);
    }

    public void telaVoz(View view){

        Intent intent = new Intent(this, TelaVoz.class);
        startActivity(intent);
    }
}
