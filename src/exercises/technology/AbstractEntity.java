package exercises.technology;

public abstract class AbstractEntity {
    private static int idCounter = 0;
    private int id;

    public AbstractEntity(){
        setId();
        this.id = idCounter;
    }

    public int getId(){
        return id;
    }

    protected static void setId(){
        idCounter++;
    }
}
