package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        String chosenLang = "";
        Scanner input = new Scanner(System.in);
    
        while (true){
            System.out.println("Choose a language!");
            chosenLang = input.next();
            
            if(chosenLang.toLowerCase().equals("stop")){
                break;
            }
            
            String message = Message.getMessage(chosenLang);
            System.out.println(message + "\n");
        }
        
    }

}
