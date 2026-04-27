package com.gla;
public class Admin extends User {
    public Admin(String name) {
        super(name);
    }
    public void addBook(Library library,Book book){
        library.addBook(book);
        System.out.println("Book added:"+book.getName());
    }
    public void issueBook(Library library,int bookId,User user){
        library.issueBook(bookId, user);
    }
    public void showBooks(Library library){
        library.showBooks();
    }
}