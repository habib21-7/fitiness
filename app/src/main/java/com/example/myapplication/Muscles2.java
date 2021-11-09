package com.example.myapplication;

public class Muscles2 {
    int image;
    String Name;



    public Muscles2(int image, String name) {
        this.image = image;
        Name = name;

    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    @Override
    public String toString() {
        return "Muscles2{" +
                "image=" + image +
                ", Name='" + Name + '\''+
                '}';

    }
}