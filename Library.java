package library;

import java.util.ArrayList;

public class Library {
 private ArrayList<Book> books;

 public Library() {
     books = new ArrayList<>();
 }

 public void addBook(Book book) {
     books.add(book);
 }

 public void showAvailableBooks() {
     System.out.println("Available Books:");
     for (Book book : books) {
         if (!book.isIssued()) {
             System.out.println(book.getTitle() + " by " + book.getAuthor());
         }
     }
 }

 public void issueBook(String title) {
     for (Book book : books) {
         if (book.getTitle().equals(title) && !book.isIssued()) {
             book.setIssued(true);
             System.out.println(title + " has been issued.");
             return;
         }
     }
     System.out.println("Book not available or already issued.");
 }

 public void returnBook(String title) {
     for (Book book : books) {
         if (book.getTitle().equals(title) && book.isIssued()) {
             book.setIssued(false);
             System.out.println(title + " has been returned.");
             return;
         }
     }
     System.out.println("Invalid return attempt.");
 }
}
