package exercises;

import java.util.Scanner;

/*The first sentence of Alice’s Adventures in Wonderland is below. Store this sentence in a string, and then prompt
the user for a term to search for within this string. Print whether or not the search term was found.
Make the search case-insensitive, so that searching for “alice”, for example, prints true.*/
public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String term = "";
        Boolean found;
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        
        while (true){
            System.out.println("What string do you want to search for?");
            term = input.nextLine();
            
            // check for empty string to signal stop
            if (term.equals("")){
                break;
            }
    
            found = alice.toLowerCase().contains(term.toLowerCase());
            
            // Print out its index within the string and its length
            if (found){
                int index = alice.toLowerCase().indexOf(term.toLowerCase());
                String part1 = alice.substring(0,index);
                String part2 = alice.substring(index,alice.length());
                System.out.println("The index of '" + term + "' is: " + alice.toLowerCase().indexOf(term)+ "\nThe length of '" + term + "' is: " + term.length());
                System.out.println(part1 + part2);
            }
    
            System.out.println(found);
        }
    }
}
