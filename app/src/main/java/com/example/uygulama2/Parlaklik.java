package com.example.uygulama2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

public class Parlaklik extends AppCompatActivity {

    TextView ParlaklikText1;

    float ParlaklikDeger1;
    int ParlaklikDeger2;




    String anlikParlaklik;
    float a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parlaklik);
        ParlaklikText1 = (TextView) findViewById(R.id.bir);



        anlikParlaklik = android.provider.Settings.System.getString(getContentResolver(), android.provider.Settings.System.SCREEN_BRIGHTNESS);

        ParlaklikDeger1 = Float.parseFloat(anlikParlaklik);

        ParlaklikDeger2 = (int)((ParlaklikDeger1/255)*100);




        ParlaklikText1.setText("Şu anki Parlaklığınız: %"+ ParlaklikDeger2);





    }

}
