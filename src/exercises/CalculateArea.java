package exercises;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double length;
        Double width;
        Double area;
    
        System.out.println("What is the length of your parallelogram?");
        length = input.nextDouble();
        System.out.println("What is the width of your parallelogram?");
        width = input.nextDouble();
        
        area = length * width;
        
        System.out.println("The area is: " + area);
    }
}
