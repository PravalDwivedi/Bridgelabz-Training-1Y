package com.gla;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        Admin admin=new Admin("Mr. Admin");
        Student student=new Student("Aman", 101, 2, Branch.BTECH);
        Faculty faculty=new Faculty("Dr. Sharma", 201);
        while(true){
            System.out.println("\n1 Add Book");
            System.out.println("2 Show Books");
            System.out.println("3 Issue Book to Student");
            System.out.println("4 Issue Book to Faculty");
            System.out.println("5 Exit");
            int choice = sc.nextInt(); sc.nextLine();
            if(choice==1){
                System.out.print("Book ID: "); int id = sc.nextInt(); sc.nextLine();
                System.out.print("Book Name: "); String name = sc.nextLine();
                System.out.println("Select Category: 1 MATHEMATICS 2 PSYCHOLOGY 3 BIOLOGY 4 CHEMISTRY");
                int cat = sc.nextInt(); sc.nextLine();
                BookCategory category =
                        (cat == 1)?BookCategory.MATHEMATICS :
                                (cat == 2)?BookCategory.PSYCHOLOGY :
                                        (cat == 3)?BookCategory.BIOLOGY :
                                                BookCategory.CHEMISTRY;
                System.out.print("Author: "); String author = sc.nextLine();
                System.out.print("Publisher: "); String publisher = sc.nextLine();
                System.out.print("Price: "); int price = sc.nextInt(); sc.nextLine();
                Book book = new Book(id, name, category, author, publisher, price);
                admin.addBook(library, book);
            }
            else if(choice==2){
            admin.showBooks(library);
            }
            else if(choice==3){
                System.out.print("Enter Book ID to issue: "); int id=sc.nextInt(); sc.nextLine();
                admin.issueBook(library, id, student);
            }
            else if(choice==4){
                System.out.print("Enter Book ID to issue: "); int id=sc.nextInt(); sc.nextLine();
                admin.issueBook(library, id, faculty);
            }
            else{
                System.out.println("Exiting");
                break;
            }
        }
    }
}