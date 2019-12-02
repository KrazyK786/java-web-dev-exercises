package exercises.technology;

public class Main {
    public static void main(String[] args) {
        Computer dell = new Computer(8,"SSD",500);

        SmartPhone pixel = new SmartPhone(4,"Flash Drive",128);
        SmartPhone rachellesBeautiful = new SmartPhone(12,"SSD",1000);
        Computer lenovo = new Computer(12,"HDD",250);

        pixel.setPhoneCarrier("Sprint");

        System.out.println(pixel.getPhoneCarrier());
        System.out.println(pixel.getHdType());

        System.out.println(dell.getId());
        System.out.println(pixel.getId());
        System.out.println(rachellesBeautiful.getId());
        System.out.println(lenovo.getId());
    }
}
