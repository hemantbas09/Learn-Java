package ClassesObjects;
// Create a LibraryBook class with title and isBorrowed. Add methods borrow() and returnBook() that update the flag.

public class LibraryBook {

    private final String title;
    private boolean isBorrowed;

    LibraryBook(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public void printStatus() {
        if (isBorrowed) {
            System.out.println(title + " is borrowed");
        } else {
            System.out.println(title + " is available");
        }
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Monsoon");

        book.printStatus();   // available
        book.borrow();
        book.printStatus();   // borrowed
        book.returnBook();
        book.printStatus();   // available
    }
}