import java.io.Serializable;

public class Message implements Serializable {
     int message;
     String name;
     int number;
     String description;

    public Message(int message, String name, int number, String description){
        this.message = message;
        this.name = name;
        this.number = number;
        this.description = description;
    }
    public Message(int message){
        this.message = message;
    }
}