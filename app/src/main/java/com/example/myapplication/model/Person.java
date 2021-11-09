package com.example.myapplication.model;

public class Person {
    double weight;
    double height;
    String name;
    Double bmi;

    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }

    public String getBmi_type() {
        return bmi_type;
    }

    public void setBmi_type(String bmi_type) {
        this.bmi_type = bmi_type;
    }

    String bmi_type;

    public Person() {
    }

    public Person(double weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    double getBMI()
    {

        return weight/(height*height);
    }
}
