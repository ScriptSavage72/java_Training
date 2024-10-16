package ArrayStringAssignment;

import java.util.Scanner;

/*
A library stores a list of book titles. Create a Java program that uses a string array to store 6 book titles. Write functions that:
•	Searches for a specific book title entered by the user.
•	Replaces a specific book title in the array if a user wants to update the library records

 */
public class LibraryBookManagement {
    String[] books;

    public LibraryBookManagement(String[] books){
        this.books = books;
    }

    public void searchBook(String book){
        boolean found = false;
        for (String str : books){
            if(str.equals(book)){
                found = true;
            }
        }
        if(found){
            System.out.println("the book exists in the library!");
        }else{
            System.out.println("This book is not in the library");
        }
    }

    public void replaceBook(String oldBook, String newBook){
        System.out.println("The library before replacing " + oldBook + " with " + newBook);
        for(String str : books){
            System.out.println(str);
        }

        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if(books[i].equals(oldBook)){
                index = i;
            }
        }
        if(index != -1){
            books[index] = newBook;
            System.out.println("The library after replacing " + oldBook + " with " + newBook);
            for(String str : books){
                System.out.println(str);
            }
        }else {
            System.out.println("The book does not exist in the library.");
        }
    }

    public static void main(String[] args) {

        String[] books = {"Quran", "Bible", "Torah", "Gita", "AtheistBook", "Dictionary"};
        LibraryBookManagement library = new LibraryBookManagement(books);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of a book: ");
        library.searchBook(scan.next());
        System.out.println();

        System.out.print("Enter the book you want to replace: ");
        String oldBook = scan.nextLine();

        System.out.println();
        System.out.print("Enter the name of the new book: ");
        String newBook = scan.nextLine();
        library.replaceBook(oldBook, newBook);
    }
}
