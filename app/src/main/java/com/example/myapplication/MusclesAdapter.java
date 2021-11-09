package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MusclesAdapter extends ArrayAdapter<Muscles2> {
    final Context mContext;
    final int mResource;


    public MusclesAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Muscles2> objects) {
        super(context, resource, objects);
        this.mContext=context;
        this.mResource=resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater =LayoutInflater.from(mContext);

        convertView= layoutInflater.inflate(mResource,parent,false);

        ImageView imageView =convertView.findViewById(R.id.image);
        TextView txtName = convertView.findViewById(R.id.txtName);

         imageView.setImageResource(getItem(position).getImage());
        txtName.setText(getItem(position).getName());


        return convertView;
    }
}