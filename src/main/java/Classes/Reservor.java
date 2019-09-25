package Classes;

import java.time.LocalDateTime;

public class Reservor {

    private String name;
    private LocalDateTime reservedAt;

    public Reservor(String newName, LocalDateTime newDate){
        this.name = newName;
        this.reservedAt = newDate;
    }

    //Getter
    public String getName(){
        return name;
    }
    public LocalDateTime getReservedAt(){
        return reservedAt;
    }

    //Setter
    public void setName(String newName){
        this.name = newName;
    }
    public void setReservedAt(LocalDateTime newDate){
        this.reservedAt = newDate;
    }
}
