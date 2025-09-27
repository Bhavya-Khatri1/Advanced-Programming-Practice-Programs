public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // new books are available
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Borrow book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
            return true;
        } else {
            System.out.println(title + " is not available.");
            return false;
        }
    }

    // Return book
    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
            return true;
        } else {
            System.out.println(title + " was not borrowed.");
            return false;
        }
    }

    // Check availability
    public boolean isAvailable() {
        return isAvailable;
    }
}