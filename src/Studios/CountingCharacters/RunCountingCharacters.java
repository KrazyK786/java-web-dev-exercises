package Studios.CountingCharacters;

import java.util.HashMap;
import java.util.Map;

public class RunCountingCharacters {
    public static void main(String[] args){

        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] textChars = text.toCharArray();
        HashMap<Character,Integer> wordCount = new HashMap<>();

        for (char textChar : textChars) {
            if (!wordCount.containsKey(textChar)) {
                wordCount.put(textChar, 1);
            }
            else if (wordCount.containsKey(textChar)){
                wordCount.put(textChar,wordCount.get(textChar) + 1);
            }
        }

        for (Map.Entry<Character,Integer> c : wordCount.entrySet()){

            System.out.println(c.getKey() + ": " + c.getValue() );
        }
    }
}
