package com.example.myapplication.model;

class PersonDa implements PersonDaI{

    Person person ;

    PersonDa()
    {

    }

    @Override
    public Person getUser() {
        return this.person;
    }
}
