package com.athyamsha.mediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView txtHelloWorld, txtHaiWorld,androidDeveloper;
    private boolean isHelloWorldShowing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHaiWorld = findViewById(R.id.txtHaioWorld);
        androidDeveloper = findViewById(R.id.androidDeveloper);

txtHelloWorld.animate().translationX(0).setDuration(2000);
androidDeveloper.animate().translationY(0).setDuration(3000);
        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isHelloWorldShowing) {
                    txtHelloWorld.animate().alpha(0).setDuration(3000);
                    txtHaiWorld.animate().alpha(1).setDuration(3000);
                    isHelloWorldShowing=false;
                }else if(!isHelloWorldShowing) {
                    txtHelloWorld.animate().alpha(1).setDuration(3000);
                    txtHaiWorld.animate().alpha(0).setDuration(3000);
                    isHelloWorldShowing=true;
                }


                Log.i("MyTag", "Hai");
            }
        });

        androidDeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                androidDeveloper.animate().translationX(3000).setDuration(2000);
                androidDeveloper.animate().translationX(3000).rotationX(3000).setDuration(3000);
            }
        });
    }
}
