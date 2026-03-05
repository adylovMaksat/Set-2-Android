package com.example.lab1mobilesystems;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LAB1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String message = "Witaj obiektowy świecie";

        Log.i(TAG, message);

        runTests();
    }

    private void runTests() {

        Lamp lamp = new Lamp();

        Log.i(TAG,"TEST 1: Turn lamp ON");
        lamp.turnOn();
        Log.i(TAG, lamp.isOn() ? "PASS" : "FAIL");


        Log.i(TAG,"TEST 2: Turn lamp OFF");
        lamp.turnOff();
        Log.i(TAG, !lamp.isOn() ? "PASS" : "FAIL");


        Log.i(TAG,"TEST 3: Brighten to 10");

        lamp.turnOn();

        for(int i=0;i<9;i++){
            lamp.brighten();
        }

        Log.i(TAG, lamp.getIntensity()==10 ? "PASS":"FAIL");


        Log.i(TAG,"TEST 4: Brighten above 10 (burn bulb)");

        lamp.brighten();

        Log.i(TAG, lamp.isBulbBurned() ? "PASS":"FAIL");


        Log.i(TAG,"TEST 5: Dim to 0 (lamp off)");

        lamp.replaceBulb();
        lamp.turnOn();

        lamp.dim();

        Log.i(TAG, !lamp.isOn() ? "PASS":"FAIL");


        Log.i(TAG,"TEST 6: Replace bulb while lamp OFF");

        lamp.turnOff();

        boolean replaced = lamp.replaceBulb();

        Log.i(TAG, replaced ? "PASS":"FAIL");


        Log.i(TAG,"TEST 7: Replace bulb while lamp ON");

        lamp.turnOn();

        boolean replaced2 = lamp.replaceBulb();

        Log.i(TAG, !replaced2 ? "PASS":"FAIL");


        Log.i(TAG,"TEST 8: Turn on lamp with burned bulb");

        Lamp lamp2 = new Lamp();

        lamp2.turnOn();

        for(int i=0;i<10;i++){
            lamp2.brighten();
        }

        lamp2.turnOn();

        Log.i(TAG, !lamp2.isShining() ? "PASS":"FAIL");
    }
}