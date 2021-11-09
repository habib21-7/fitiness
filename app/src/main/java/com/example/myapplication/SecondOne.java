package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;


public class SecondOne extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_one);


        listView = findViewById(R.id.listView);
        //Create data
        ArrayList<Actions> arrayList = new ArrayList<>();

        arrayList.add(new Actions(R.drawable.p1, "Stop Watch", "Organize your time well!!"));
        arrayList.add(new Actions(R.drawable.p2, "Check BMI", "Calculate Your BMI!!"));
        arrayList.add(new Actions(R.drawable.p3, "Muscles Exercises", "Learn by Exercises!!"));

        ActionsAdapter actionsAdapter = new ActionsAdapter(this, R.layout.list_row, arrayList);
        listView.setAdapter(actionsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                System.out.println("Position: "+pos);
                if (pos==0) {
                    Intent intent =new Intent(view.getContext(),Watch.class);
                    startActivity(intent);
                }
                else if (pos==1){
                    Intent intent2 =new Intent(view.getContext(),Bmi.class);
                    startActivity(intent2);
                }
                else if(pos==2){
                    Intent intent3 =new Intent(view.getContext(),Muscles.class);
                    startActivity(intent3);
                }

            }
        });

    }
}

