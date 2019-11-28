package com.amitshekhar.tflite;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClientWS extends AsyncTask<Void,Void,String> {

    public String data;

    public ClientWS(String data){
        this.data=data;
    }

    @Override
    protected String doInBackground(Void... voids) {
        //log.i("teste",String);
        StringBuilder resposta= new StringBuilder();

        URL url= null;
        try {
            url = new URL("http://192.168.43.224:8080/Servidor2048/webresources/Movimento/alterar");


            // Create the urlConnection
            HttpURLConnection urlConnection = null;
            try {
                urlConnection = (HttpURLConnection) url.openConnection();


                urlConnection.setDoInput(true);
                urlConnection.setDoOutput(true);

                urlConnection.setRequestProperty("Content-Type", "application/json");

                urlConnection.setRequestMethod("POST");

                // Send the post body

                OutputStreamWriter writer = new OutputStreamWriter(urlConnection.getOutputStream());
                writer.write(data.toString());
                writer.flush();


                int statusCode = urlConnection.getResponseCode();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}