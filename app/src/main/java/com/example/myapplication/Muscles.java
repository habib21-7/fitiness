package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Muscles extends AppCompatActivity {
     ListView listView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscles);

        listView2 = findViewById(R.id.listView2);
        //Create data
        ArrayList<Muscles2> arrayList2 = new ArrayList<>();

        arrayList2.add(new Muscles2(R.drawable.p4,"FLAT STOMACH"));
        arrayList2.add(new Muscles2(R.drawable.p5,"CHEST WORKOUT"));
        arrayList2.add(new Muscles2(R.drawable.p6,"BACK WORKOUT"));
        arrayList2.add(new Muscles2(R.drawable.p7,"LEGS WORKOUT"));


        MusclesAdapter musclesAdapter = new MusclesAdapter(this, R.layout.list2_row, arrayList2);
        listView2.setAdapter(musclesAdapter);
    }
}