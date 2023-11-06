package com.consoleapp;

public class Person {
    String city ="chennai";
    int id=1000;
    String name="Keerthivasan";

    Person(){
        System.out.println(id);
    }
    public void display(){
        System.out.println(city + " " + id);
    }
}
