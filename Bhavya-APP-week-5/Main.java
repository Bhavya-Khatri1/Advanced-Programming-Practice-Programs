public class Main {
    public static void main(String[] args) {
        Library library = new Library(5); // library can hold 5 books

        // Create books
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Add books
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Search and borrow
        Book searchResult = library.searchBook("1984");
        if (searchResult != null) {
            searchResult.borrowBook();   // borrow
            searchResult.borrowBook();   // try again to show validation
            searchResult.returnBook();   // return
        }

        // Display all books
        library.displayAllBooks();
    }
}