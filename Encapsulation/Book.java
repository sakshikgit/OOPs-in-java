package Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Book{
    public List<String> title = new ArrayList<>();
    public List<String> author = new ArrayList<>();
    private List<Boolean> isAvailable = new ArrayList<>();

    // constructor
    public Book(List<String> title, List<String> author, List<Boolean> isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    //Method to borrow a book
    public void borrowBook(String bookName){
        int index = title.indexOf(bookName);
        if(index != -1 && isAvailable.get(index)){
            isAvailable.set(index, false);
        } else{
            System.out.println("Book is not available.");
        }
    }

    //Method to return a book
    public void returnBook(String bookName){
        int index = title.indexOf(bookName);
        if(index != -1){
           isAvailable.set(index, true);
            System.out.println("Book " + bookName + " is returned"); 
        }
    }

    public void getAvailability(String bookName){
        int index = title.indexOf(bookName);
        if(index != -1){
            System.out.println(isAvailable.get(index));
        }
    }


    public static void main(String[] args) {
        List<String> titles = List.of("Sherlock_Holmes", "Frankenstein", "King_Arthur", "Treasure_Island");
        List<String> authors = List.of("Arthur_Conan_Doyle", "Mary_Shelley", "Roger_Green", "Stevenson");
        List<Boolean> availability = List.of(false, true, false, false);

        Book myLibrary = new Book(titles, authors, new ArrayList<>(availability));

        myLibrary.borrowBook("Frankenstein"); // Will succeed
        myLibrary.borrowBook("Sherlock_Holmes"); // Will print not available
        myLibrary.returnBook("King_Arthur"); // Will mark available
        myLibrary.getAvailability("Sherlock_Holmes"); // Prints false
        myLibrary.borrowBook("Frankenstein"); // Book already borrowed
    }


}




