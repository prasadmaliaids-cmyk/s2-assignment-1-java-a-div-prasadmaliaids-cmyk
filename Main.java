class Book {
    String title, author, isbn;
    double price;
    int stock;

    // Constructor
    Book(String title, String author, double price, String isbn, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.stock = stock;
    }

    // Display method
    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs " + price);
        System.out.println("ISBN: " + isbn);
        System.out.println("Stock: " + stock);
    }

    // Apply discount
    void applyDiscount(double percent) {
        price = price - (price * percent / 100);
        System.out.println("Discount applied: " + percent + "%");
    }

    // Add stock
    void addStock(int quantity) {
        stock += quantity;
        System.out.println("Stock increased by: " + quantity);
    }

    // Check availability
    void isAvailable() {
        if (stock > 0)
            System.out.println("Available for purchase");
        else
            System.out.println("Out of stock");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Book 1: Novel
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 500, "ISBN001", 10);

        // Book 2: Textbook
        Book book2 = new Book("Data Structures", "Schaum Series", 800, "ISBN002", 0);

        // Demonstration for Book 1
        book1.display();
        book1.applyDiscount(10);
        book1.addStock(5);
        book1.isAvailable();
        book1.display();

        // Demonstration for Book 2
        book2.display();
        book2.applyDiscount(15);
        book2.addStock(3);
        book2.isAvailable();
        book2.display();
    }
}
