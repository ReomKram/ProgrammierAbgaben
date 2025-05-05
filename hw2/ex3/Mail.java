package hw2.ex3;

import java.time.LocalDateTime;

public class Mail {
    private String senderAddress, subject, message;
    private LocalDateTime dateTime;
    private boolean read = false;

    public Mail(String senderAdress, String subject, String message){
        setDateTime(this.getDateTime());
        this.senderAddress = senderAdress;
        this.subject = subject;
        this.message = message;
        this.dateTime = LocalDateTime.now();
    }

    public void markAsRead(){
        read = true;
    }

    public String print(){
        String returnString ="";

        returnString += subject;
        returnString += " from " + senderAddress;
        returnString += " on " + dateTime;
        returnString += ": "+message;

        return returnString;
    }


    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String input){
        this.subject = input;
    }

    public String getSenderAdress(){
        return this.senderAddress;
    }

    public void setSenderAdress(String input){
        this.senderAddress = input;
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return LocalDateTime return the dateTime
     */
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return boolean return the read
     */
    public boolean isRead() {
        return read;
    }

    /**
     * @param read the read to set
     */
    public void setRead(boolean read) {
        this.read = read;
    }

}
