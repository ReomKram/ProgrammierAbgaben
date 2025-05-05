package hw2.ex3;

import java.util.ArrayList;

public class Inbox {

    public static void main(String[] args) {
        
    }



    public ArrayList<Mail> mailList = new ArrayList<>();

    public void printHeaders(){
        for (int i = 0; i < mailList.size(); i++) {
            Mail current = mailList.get(i);

            System.out.println(current.isRead()+" | "+
            current.getSubject()+" | "+
            current.getSenderAdress()+" | "+
            current.getDateTime());
        }
    }

    public void open(int index){
        if(getMails().size() <= index){
            System.out.println("No such Mail");
        }else{
            System.out.println(getMails().get(index).print());
        }
    }

    public ArrayList<Mail> getMails(){
        return this.mailList;
    }

}
