package Classes;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Dog extends Animal {

    private Calendar lastWalk ;
    private Calendar currentDate = Calendar.getInstance();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public Dog (String name, Gender gender){
        super(name,gender);
    }

    public boolean needsWalk() {
        if (lastWalk.compareTo(currentDate) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void walk(Calendar newDate){
        this.lastWalk = newDate;
    }

    @Override
    public String toString(){
        return super.toString() + ", last walk: " + (formatter.format(currentDate.getTime()));
    }


}
