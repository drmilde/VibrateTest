package com.example.milde.vibratetest;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VibrateActivity extends AppCompatActivity {
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrate);

        // vibrate
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long[] pattern = {1000, 1500, 1000, 1200}; //  Stop it   open   Stop it   open
        vibrator.vibrate(pattern, 2);
    }

    @Override
    protected void onStop() {
        super.onStop();
        vibrator.cancel();
    }
}
