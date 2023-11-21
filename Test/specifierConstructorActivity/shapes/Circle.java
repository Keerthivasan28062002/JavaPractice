package com.specifierConstructorActivity.shapes;

import java.util.Scanner;

public class Circle {
    private float radius;
    private float pi = 3.15f;

    public Circle(){
        this.radius = 1.5f;
    }

    Circle(float radius){
        this(radius,3.15f);
    }

    private Circle(float radius, float pi){
        this.pi = pi;
        this.radius = radius;
    }

    private float calculateCircleArea(){
        return this.pi*this.radius*this.radius;
    }

    private float calculateCircleCircumference(float radius){
        return 2*this.pi*radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Circle radius: ");
        float radius = sc.nextFloat();
        Circle circle = new Circle(radius);
        System.out.println("Circle Area: "+circle.calculateCircleArea());
        System.out.println("Circle Circumference: "+circle.calculateCircleCircumference(radius));
    }

}

