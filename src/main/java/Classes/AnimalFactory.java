package Classes;

import java.util.ArrayList;

public class AnimalFactory {
    public ArrayList<Animal> animals = new ArrayList<>();

    public void createCat(String name,Gender gender, String badHabits){
        this.animals.add(new Cat(name,gender,badHabits));
    }

    public void createDog(String name,Gender gender){
        this.animals.add(new Dog(name, gender));
    }

    public ArrayList<Animal> getAnimals(){
        return animals;
    }
}
