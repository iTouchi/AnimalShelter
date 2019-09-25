package Classes;

import java.time.LocalDateTime;

public class Dog extends Animal {

    private LocalDateTime lastWalk;
    private LocalDateTime currentDate = LocalDateTime.now();

    public Dog (String name, Gender gender){
        super(name,gender);
    }

    public boolean needsWalk() {
        if (currentDate.compareTo(lastWalk) > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return super.toString() + ", last walk: " + currentDate;
    }


}
