package hw2.ex1;

public class TextBook extends Book{
    
    private String subject;

    public TextBook(String name, int year, String author, String subject){
        super(subject, year, author);
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +" Subject: " + subject;
        
    }

    @Override
    public String saveData(){
        return super.saveData() + "|"+subject;
    }

}
