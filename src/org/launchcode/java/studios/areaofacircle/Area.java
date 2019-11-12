package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

//Write a class, Area, that prompts the user for the radius of a circle and then calculate its area and print the result
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double area;
        double radius;

        System.out.println("What is the radius of your circle? ");
        radius = input.nextDouble();

        // area of a circle is A = pi * r * r where pi is 3.14 and r is the radius.
//        area = 3.14 * radius * radius;
        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
