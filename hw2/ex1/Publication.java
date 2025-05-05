package hw2.ex1;
public class Publication {
    private String title;
    private int year;

    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getInfo() {
        //Data Structures, published in 2020, by Jane Doe Subject: Computer Science
        return title + ", published in " + year;
    }

    public String saveData(){
        return title +"|"+ year;
    }
}
