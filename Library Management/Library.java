package com.gla;
import java.util.ArrayList;
public class Library{
    private ArrayList<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void showBooks(){
        for(Book b:books){
            System.out.println(
                    "ID: " + b.getId() +
                            " | Name: " + b.getName() +
                            " | Category: " + b.getCategory() +
                            " | Author: " + b.getAuthor() +
                            " | Publisher: " + b.getPublisher() +
                            " | Price: " + b.getPrice() +
                            " | Issued: " + b.isIssued()
            );
        }
    }
    public void issueBook(int id,User user){
        for (Book b:books){
            if (b.getId()==id){
                if (!b.isIssued()){
                    b.setIssued(true);
                    System.out.println("Book '" + b.getName() + "' issued to " + user.getName());
                }else{
                    System.out.println("Book already issued");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
}
