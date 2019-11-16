package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice2 {
    public static void main(String[] args){
        ArrayList<String> wordList = new ArrayList<>();
//        wordList.addAll(Arrays.asList("tests","pipe","Java","clock"));
        String drSeuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordArray = drSeuss.replaceAll("[^a-zA-Z ]","").split(" ");

        System.out.println(Arrays.toString(wordArray));

        wordList.addAll(Arrays.asList(wordArray));

        printIf(wordList);
    }

    public static void printIf(ArrayList<String> list){
        Scanner input = new Scanner(System.in);

        System.out.println("How many letters should the word contain? ");
        int wordSize = input.nextInt();

        for (String word : list){
            if (word.length() == wordSize){
                System.out.println(word);
            }
        }
    }
}
