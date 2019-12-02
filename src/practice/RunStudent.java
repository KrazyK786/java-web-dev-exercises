package practice;

public class RunStudent {
    public static void main(String[] args){
        Student kris = new Student();

        kris.setName("Kris");
        kris.setNumberOfCredits(1);
        kris.setGpa(4.0);

        System.out.println(kris);
    }
}
