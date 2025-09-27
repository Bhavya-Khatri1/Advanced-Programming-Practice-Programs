public class Library {
    private Book[] books;
    private int count; // how many books are currently added

    // Constructor
    public Library(int size) {
        books = new Book[size]; // fixed-size array
        count = 0;
    }

    // Add a book
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println(book.getTitle() + " added to the library.");
        } else {
            System.out.println("Library is full!");
        }
    }

    // Search book by title
    public Book searchBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null; // not found
    }

    // Display all books
    public void displayAllBooks() {
        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < count; i++) {
            String status = books[i].isAvailable() ? "Available" : "Not Available";
            System.out.println("Title: " + books[i].getTitle() + ", Author: " + books[i].getAuthor() + ", Status: " + status);
        }
    }
}