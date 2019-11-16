package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HashMap<Integer,String> roster = new HashMap<>();
        String student;

        System.out.println("Enter student names. Press ENTER when finished.");
        do{
            System.out.println("Student name: ");
            student = input.nextLine();
            if (!student.equals("")){
                System.out.println("What is the ID of the student? ");
                Integer id = input.nextInt();

                roster.put(id,student);

                input.nextLine();
//                if (!id.equals("")){
//                //add to hashmap
//
//                }
            }
        }while(!student.equals(""));

//        System.out.println(roster);

        // print class roster
        System.out.println("\nClass Roster:");

        for(Map.Entry<Integer,String> currentStudent : roster.entrySet()){
            System.out.println(currentStudent.getValue() + " (" + currentStudent.getKey() + ")");
        }
    }
}
