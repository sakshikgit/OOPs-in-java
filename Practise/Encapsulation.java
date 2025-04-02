package Practise;

class Book {
    public String title;
    public String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;

    }

    public void borrowBook(){
        if(!isAvailable){
            System.out.println("Book not Available " + title);
        }else{
            isAvailable = false;
            System.out.println("you have borrowed " + title);
        }
    }

    public void returnBook(){
        isAvailable = true;
        System.out.println("you have returned: " + title);
    }

    public void getAvailability(){
        if(isAvailable){
            System.out.println("available");
        }
        else{
            System.out.println("unavailable");
        }
    }

    
}

public class Encapsulation {
    public static void main(String[] args) {
       Book[] books = {
        new Book("Sherlock Holmes", "Arthur Conan Doyle", false),
            new Book("Frankenstein", "Mary Shelley", true),
            new Book("King Arthur and the Round Table", "Roger Lancelyn Green", false),
            new Book("Treasure Island", "Robert Louis Stevenson", false)
       };
       for(Book book : books){
        book.getAvailability();
       }

       books[0].borrowBook();
       books[0].returnBook();

       for(Book book : books){
        book.getAvailability();

    }
    
 }
}

