package ClassesObjects;
// Create a Book class with title, author, and pages. Write a method that prints a one-line summary of the book.

public class Book {
    private final String title;
    private final String author;
    private final int pages;

    Book(String title, String author, int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }

    public void bookPrint(){
        System.out.println("The name of the book is " + title
                + ". The author of this book is " + author
                + ". There are " + pages + " pages.");
    }

    public static void main(String[] args) {
        Book book=new Book("Monsson","Subin Bhatrai",400);
        book.bookPrint();
    }
}

