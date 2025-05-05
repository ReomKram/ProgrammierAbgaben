package hw2;

import java.util.ArrayList;
import java.util.Scanner;
import hw2.ex1.*;

public class Main {

    public Main(){
        main(null);
    }
    public static void main(String[] args) {
        ArrayList<Publication> publications = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a Publication");
            System.out.println("2. Add a Book");
            System.out.println("3. Add a TextBook");
            System.out.println("4. List all entries");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title of the publication: ");
                    String pubTitle = scanner.nextLine();
                    System.out.print("Enter year of the publication: ");
                    String pubyear = scanner.nextLine();
                    publications.add(new Publication(pubTitle, Integer.parseInt(pubyear)));
                    System.out.println("Publication added.");
                    break;
                case 2:
                    System.out.print("Enter title of the book: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter year of the book: ");
                    String bookYear = scanner.nextLine();
                    System.out.print("Enter author of the book: ");
                    String bookAuthor = scanner.nextLine();
                    publications.add(new Book(bookTitle, Integer.parseInt(bookYear), bookAuthor));
                    System.out.println("Book added.");
                    break;
                case 3:
                    System.out.print("Enter title of the textbook: ");
                    String textBookTitle = scanner.nextLine();
                    System.out.print("Enter year of the textbook: ");
                    String textBookYear = scanner.nextLine();
                    System.out.print("Enter author of the textbook: ");
                    String textBookAuthor = scanner.nextLine();
                    System.out.print("Enter subject of the textbook: ");
                    String textBookSubject = scanner.nextLine();
                    publications.add(new TextBook(textBookTitle, Integer.parseInt(textBookYear), textBookAuthor,
                            textBookSubject));
                    System.out.println("TextBook added.");
                    break;
                case 4:
                    System.out.println("Listing all entries:");
                    for (Publication pub : publications) {
                        System.out.println(pub.getInfo());
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");

                    String folderPath = "/Users/markschommarz/Documents/Uni Köln/6. Semester/ProgPrak/hw2/SavedPublications/";
                    new java.io.File(folderPath).mkdirs(); // Ensure the folder exists
                    int fileCount = new java.io.File(folderPath).list((dir, name) -> name.endsWith(".txt")).length;
                    String fileName = folderPath + "publications_" + (fileCount + 1) + ".txt";
                
                    try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File(fileName))) {
                        for (Publication pub : publications) {
                            writer.println(pub.saveData());
                        }
                        System.out.println("Publications saved to " + fileName);
                    } catch (java.io.IOException e) {
                        System.out.println("An error occurred while saving publications: " + e.getMessage());
                    }

                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
