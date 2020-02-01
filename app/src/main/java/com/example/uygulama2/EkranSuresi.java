package com.example.uygulama2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import static android.os.Build.VERSION_CODES.P;

public class EkranSuresi extends AppCompatActivity {


    long counter;

    TextView EkranText1;

    Timer timer_clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran_suresi);

        EkranText1 = (TextView) findViewById(R.id.uc);


        final PowerManager powerManager = (PowerManager) getSystemService(POWER_SERVICE);

        timer_clock = new Timer();

        timer_clock.schedule(new TimerTask() {


            @Override
            public void run() {
                EkranSuresi.this.runOnUiThread(new Runnable() {




                    @Override
                    public void run() {




                        Handler handler = new Handler();
                        Runnable myRunnable = new Runnable() {
                            public void run() {
                                if (powerManager.isScreenOn()) {
                                    counter++;
                                }
                            }
                        };
                        handler.postDelayed(myRunnable, 1000);

                        EkranText1.setText("Ekran Süresi: " + counter);


                    }

                });}},0, 1000);















    }
}
