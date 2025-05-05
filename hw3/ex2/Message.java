package hw3.ex2;

public class Message {

    private String message = "";

    public Message() {
    }

    public Message(String messageString) {
        this.message = messageString;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return "Generic";
    }

}
