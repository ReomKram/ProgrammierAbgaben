package hw3.ex2;

public class Email extends Message {

    public Email() {
    }

    public Email(String messageString) {
        super(messageString);
    }

    public void send(){
        System.out.println("Email sent");
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return "Email";
    }

}
