package hw3.ex1;
import java.util.Scanner;

public class Account {

    public String owner;
    public double balance;
    protected int pin;
    String internalNote;

    public Account(String owner, int pin) {
        this.balance = 0.0;
        this.owner = owner;
        this.pin = pin;
        this.internalNote = "Note";
    }

    public double getBalance() {
        return this.balance;
    }

    // Change the 4 digit pin, to enter the old pin has to be entered.
    public void changePin(int pin) {
        if (this.pin == pin) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Correct PIN entered, now enter the new pin");
            String newPinString = scanner.nextLine();
            if (newPinString.length() == 4) {
                int newPin = Integer.parseInt(scanner.nextLine());

                setPin(newPin);
                System.out.println("Setting PIN successful.");
            } else {
                System.out.println("Setting PIN failed");
            }
            scanner.close();
        } else {
            System.err.println("Wrong pin entered, not possible to change pin.");
        }
    }

    private void setPin(int newPin) {
        this.pin = newPin;
    }

}