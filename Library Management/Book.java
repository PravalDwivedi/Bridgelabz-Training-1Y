package com.gla;
public class Book{
    private int id;
    private String name;
    private BookCategory category;
    private String author;
    private String publisher;
    private int price;
    private boolean issued;
    public Book(int id,String name,BookCategory category,String author,String publisher,int price) {
        this.id=id;
        this.name=name;
        this.category=category;
        this.author=author;
        this.publisher=publisher;
        this.price=price;
        this.issued=false;
    }
    public int getId() {return id;}
    public String getName() {return name;}
    public BookCategory getCategory() {return category;}
    public String getAuthor() {return author;}
    public String getPublisher() {return publisher;}
    public int getPrice() {return price;}
    public boolean isIssued() {return issued;}
    public void setIssued(boolean issued) {this.issued = issued;}
}