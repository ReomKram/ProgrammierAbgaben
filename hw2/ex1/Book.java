package hw2.ex1;

public class Book extends Publication{

    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + ", by " + author;
    }

    @Override
    public String saveData(){
        return super.saveData() + "|"+author;
    }

}