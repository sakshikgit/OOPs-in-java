package generics.generics;

import java.util.ArrayList;

class Book implements Cloneable{
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;

    }

    // Deep copy support for book

    @Override
    protected Book clone(){
        return new Book(this.title, this.author);
    }

    @Override
    public String toString(){
        return "Book{Title='" + title + "', Author='" + author + "'}";
        
    }
} 

class Library implements Cloneable{
    String name;
    List<Book> books;

    Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void display(){
        System.out.println("Library name: " + name);
        System.out.println("Books: ");
        for (Book b : books) {
            System.out.println("  - " + b);
        }
        System.out.println();

    }
}

// Shallow copy
public Library shallowClone(){
    try{
        Library cloned = (Library) super.clone();
        // shallow copy: books list is shared
        cloned.books = this.books;
        return cloned;
    } catch (CloneNotSupportedException e){
        return null;
    }
}

// Deep copy

public Library deepClone(){
    try{
        Library cloned = (Library) super.clone();
        // deep copy: books list is copied independently
        cloned.books = new ArrayList<>();
        for(Book book : this.books){
            cloned.books.add(book.clone());
        }
        return cloned;
    } catch (CloneNotSupportedException e){
        return null;
    }
}

public class ObjectClonning {
    public static void main(String[] args) {

         // Create original library
         Library original = new Library("City Library");
         original.addBook(new Book("The Alchemist", "Paulo Coelho"));
         original.addBook(new Book("1984", "George Orwell"));
 
         // Create shallow and deep clones
         Library shallowCopy = original.shallowClone();
         Library deepCopy = original.deepClone();
 
         System.out.println("Original Library:");
         original.display();
 
         System.out.println("Shallow Copy:");
         shallowCopy.display();
 
         System.out.println("Deep Copy:");
         deepCopy.display();
 
         // Modify original library
         original.books.get(0).title = "Changed Title";
 
         System.out.println("After modifying original book title:\n");
 
         System.out.println("Original Library:");
         original.display();
 
         System.out.println("Shallow Copy:");
         shallowCopy.display(); // Will reflect change
 
         System.out.println("Deep Copy:");
         deepCopy.display(); // Will not reflect change
        
    }
    
}
