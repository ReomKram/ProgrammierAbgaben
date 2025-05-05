package hw3.ex2;

public class SMS extends Message {

    public SMS() {
    };

    public SMS(String messageString) {
        super(messageString);
    }

    @Override
    public String getType() {
        return "SMS";
    }

}
