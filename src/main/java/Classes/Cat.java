package Classes;

public class Cat extends Animal{

    private String badHabits;

    public Cat(String newName, Gender newGender, String newBadhabbits){
        super(newName,newGender);
        this.badHabits = newBadhabbits;
    }

    @Override
    public String toString(){
        return super.toString() + ", bad habits: " + this.badHabits;
    }

    //Getter
    public String getBadHabits(){
        return this.badHabits;
    }
    //Setter
    public void setBadHabits(String newBadHabbits){
        this.badHabits = newBadHabbits;
    }
}
