package exercises;

import java.util.Scanner;

/*Numeric types: Write a program that asks a user for the number of miles they have driven and the amount of gas
they’ve consumed (in gallons), and print their miles-per-gallon.*/
public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double miles;
        Double gallonsUsed;
        Double mpg;
        
        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();
        System.out.println("How much gas have you used?");
        gallonsUsed = input.nextDouble();
        
        mpg = miles / gallonsUsed;
        System.out.println("Your mpg is: " + mpg + " mpg");
    }
}
