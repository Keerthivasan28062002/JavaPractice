package com.specifierConstructorActivity.shapes;

import java.util.Scanner;

public class Circle {
    private float radius;
    static float pi = 3.15f;

    public Circle(){
        this.radius = 1.5f;
    }

    Circle(float radius){
        this(radius,3.15f);
        this.radius = radius;
    }

    private Circle(float radius, float pi){
        Circle.pi = pi;
        this.radius = radius;
    }

    private static float calculateCircleArea(float radius){
        return pi*radius*radius;
    }

    private static float calculateCircleCircumference(float radius){
        return 2*pi*radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Circle radius: ");
        float radius = sc.nextFloat();
        System.out.println("Circle Area: "+calculateCircleArea(radius));
        System.out.println("Circle Circumference: "+calculateCircleCircumference(radius));
    }

}
