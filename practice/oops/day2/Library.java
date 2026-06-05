class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Success: You rented " + title);
        } else {
            System.out.println("Sorry: " + title + " is already checked out.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Success: " + title + " has been returned.");
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");

        System.out.println("--- Library Actions ---");
        book1.rentBook();
        book1.rentBook();

        System.out.println("\n--- Return Actions ---");
        book1.returnBook();
        book1.rentBook();
    }
}
