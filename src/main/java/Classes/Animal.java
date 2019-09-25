package Classes;

import java.time.LocalDateTime;

public abstract class Animal {

    private String name;
    private Gender gender;
    private Reservor reservedBy;
    private LocalDateTime currentDate = LocalDateTime.now();

    public Animal(String newName, Gender newGender){
        this.name = newName;
        this.gender = newGender;
    }

    public boolean reserve(String reservedBy){
        if (this.reservedBy == null){
            this.reservedBy = new Reservor(reservedBy, currentDate);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String reserved ="not reserved";
                if (this.reservedBy != null){
                    reserved = "reserved by" + this.reservedBy.getName();
                }
                return this.name + "," + this.gender + "," + reserved;
    }

    //Getter
    //setName, setGender, setReservor
    //Setter
    //getName, getGender, getReservor



}
