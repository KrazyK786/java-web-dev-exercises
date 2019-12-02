package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield",12);
//        garfield.eat();
//        System.out.println(garfield.isTired());
//        System.out.println(garfield.noise());
//        garfield.sleep();
//        garfield.eat();
//        System.out.println(garfield.noise());
        Cat confusedCat = new HouseCat("Confused",15);
        System.out.println(confusedCat.noise());
        System.out.println(((HouseCat)confusedCat).isSatisfied());

    }
}
