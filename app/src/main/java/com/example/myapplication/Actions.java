package com.example.myapplication;

public class Actions {
    int image;
    String Name;
    String Des;


    public Actions(int image, String name, String des) {
        this.image = image;
        Name = name;
        Des = des;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return Name;
    }

    public String getDes() {
        return Des;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDes(String des) {
        Des = des;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "image=" + image +
                ", Name='" + Name + '\'' +
                ", Des='" + Des + '\'' +
                '}';

    }
}