package exercises.technology;

public class SmartPhone extends Computer {
    private String phoneCarrier;

    public SmartPhone(int aRam, String aHdType, int aHdSize){
        super(aRam,aHdType,aHdSize);
    }

    public String getPhoneCarrier(){
        return phoneCarrier;
    }

    public void setPhoneCarrier(String aPhoneCarrier){
        this.phoneCarrier = aPhoneCarrier;
    }
}
