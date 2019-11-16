package exercises;



public class ArrayPractice1 {
    public static void main(String[] args){
        int[] numArray = {1,1,2,3,5,8};

        for (int i = 0; i < numArray.length; i++){
            if (numArray[i] % 2 != 0){
            System.out.println(numArray[i]);

            }
        }
    }
}
