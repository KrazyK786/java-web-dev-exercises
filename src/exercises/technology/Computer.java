package exercises.technology;

public class Computer extends AbstractEntity {
    private int ram;
    private String hdType;
    private int hdSize;

    public Computer(int aRam, String aHdType, int aHdSize){
        this.ram = aRam;
        this.hdType = aHdType;
        this.hdSize = aHdSize;
    }

    public int getRam(){
        return ram;
    }

    public void setRam(int aRam){
        this.ram = aRam;
    }

    public String getHdType(){
        return hdType;
    }

    public void setHdType(String aHdType){
        this.hdType = aHdType;
    }

    public int getHdSize(){
        return hdSize;
    }

    public void setHdSize(int aHdSize){
        this.hdSize = aHdSize;
    }
}
