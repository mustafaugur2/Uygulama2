package com.example.uygulama2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ParlaklikGoster;
    Button EkranSuresiGoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParlaklikGoster=(Button ) findViewById(R.id.ParlaklikGosterId);
        EkranSuresiGoster=(Button ) findViewById(R.id.EkranSuresiGosterId);


        ParlaklikGoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openParlaklik();





            }

        });
        EkranSuresiGoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openEkranSuresi();





            }

        });
    }




    public void openParlaklik()
    {
        Intent intent = new Intent(this, Parlaklik.class);

        this.startActivity(intent);
    }
    public void openEkranSuresi()
    {
        Intent intent = new Intent(this, EkranSuresi.class);

        this.startActivity(intent);
    }
}
