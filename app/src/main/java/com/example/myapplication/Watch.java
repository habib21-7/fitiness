package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class Watch extends AppCompatActivity {

    private  boolean running = false ;
    private int second = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch);
        checkSavedInstance(savedInstanceState);
        runTimer();
    }
    private void runTimer ( ){
        final TextView texttime = findViewById(R.id.txttime);
        final Handler handler = new Handler();
        handler.post(()->{
            if(running){
                second++ ;
            }
            int hourse = second/3600 ;
            int minutes = (second%3600)/60 ;
            int sec = second%60 ;
            String time = hourse+" : "+minutes+" : "+sec ;
            texttime.setText(time);
            handler.postDelayed(this::runTimer,1000) ;
        });
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("second",second);
        outState.putBoolean("running", running);
    }

    private void checkSavedInstance (Bundle savedInstanceState) {
        if(savedInstanceState!=null){
            second = savedInstanceState.getInt("second");
            running = savedInstanceState.getBoolean("running");
        }

    }
    public void btnreset(View view) {
      running=false;
      second=0 ;
    }

    public void btnstop(View view) {
        running=false ;
    }

    public void btnstart(View view) {
        running=true;
    }
}