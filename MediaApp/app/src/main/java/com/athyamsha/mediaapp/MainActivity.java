package com.athyamsha.mediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView txtHelloWorld, txtHaiWorld;
    private boolean isHelloWorldShowing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHaiWorld = findViewById(R.id.txtHaioWorld);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHelloWorld.animate().alpha(0).setDuration(3000);
                txtHaiWorld.animate().alpha(1).setDuration(3000);

                Log.i("MyTag", "Hai");
            }
        });
    }
}
