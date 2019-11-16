package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println(evenSum(nums));
    }

    public static int evenSum(ArrayList<Integer> numList){
        int sum = 0;

        for (int i = 0; i < numList.size(); i++){
            if (numList.get(i) % 2 == 0){
                sum += numList.get(i);
            }
        }

        return sum;
    }
}
