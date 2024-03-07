import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagementSystem {

    private Map<String, Book> bookInventory;

    public LibraryManagementSystem() {
        this.bookInventory = new HashMap<>();
    }

    // Main method to run the library system
    public void runLibrarySystem() {
        Scanner scanner = new Scanner(System.in);
        int userOption = 0; // Initialize userOption with a default value

        do {
            displayMenu();

            try {
                userOption = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character left in the buffer
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.nextLine(); // Consume the invalid input
                continue;
            }

            processUserOption(userOption, scanner);

        } while (userOption != 4);

        System.out.println("Exiting the Library Management System. Goodbye!");
        scanner.close();
    }

    // Display the library system menu
    private void displayMenu() {
        System.out.println("Library Management System Menu:");
        System.out.println("1. Add Books");
        System.out.println("2. Borrow Books");
        System.out.println("3. Return Books");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Process user's chosen option
    private void processUserOption(int option, Scanner scanner) {
        switch (option) {
            case 1:
                handleBookAddition(scanner);
                break;
            case 2:
                handleBookBorrowing(scanner);
                break;
            case 3:
                handleBookReturn(scanner);
                break;
            case 4:
                // Exiting the system (handled in the main loop)
                break;
            default:
                System.out.println("Invalid option. Please enter a number between 1 and 4.");
        }
    }

    // Method for adding books to the library
    private void handleBookAddition(Scanner scanner) {
        System.out.println("Add Books:");
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();

        if (bookInventory.containsKey(title)) {
            System.out.print("Enter the quantity to add: ");
            int quantityToAdd = scanner.nextInt();
            bookInventory.get(title).addQuantity(quantityToAdd);
            System.out.println("Book quantity updated successfully.");
        } else {
            System.out.print("Enter the author: ");
            String author = scanner.nextLine();
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            Book newBook = new Book(title, author, quantity);
            bookInventory.put(title, newBook);
            System.out.println("Book added successfully.");
        }
    }

    // Method for borrowing books from the library
    private void handleBookBorrowing(Scanner scanner) {
        System.out.println("Borrow Books:");
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();

        if (bookInventory.containsKey(title)) {
            System.out.print("Enter the quantity to borrow: ");
            int quantityToBorrow = scanner.nextInt();

            Book book = bookInventory.get(title);

            if (book.getQuantity() >= quantityToBorrow) {
                book.borrowBooks(quantityToBorrow);
                System.out.println("Books borrowed successfully.");
            } else {
                System.out.println("Not enough books available for borrowing.");
            }
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    // Method for returning books to the library
    private void handleBookReturn(Scanner scanner) {
        System.out.println("Return Books:");
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();

        if (bookInventory.containsKey(title)) {
            System.out.print("Enter the quantity to return: ");
            int quantityToReturn = scanner.nextInt();

            Book book = bookInventory.get(title);

            if (book.returnBooks(quantityToReturn)) {
                System.out.println("Books returned successfully.");
            } else {
                System.out.println("Invalid return quantity. Please check and try again.");
            }
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    // Inner class representing a book
    private static class Book {
        private String title;
        private String author;
        private int quantity;

        public Book(String title, String author, int quantity) {
            this.title = title;
            this.author = author;
            this.quantity = quantity;
        }

        public void addQuantity(int quantityToAdd) {
            this.quantity += quantityToAdd;
        }

        public void borrowBooks(int quantityToBorrow) {
            this.quantity -= quantityToBorrow;
        }

        public boolean returnBooks(int quantityToReturn) {
            if (quantityToReturn > 0 && quantityToReturn <= (100 - quantity)) {
                this.quantity += quantityToReturn;
                return true;
            } else {
                return false;
            }
        }

        public int getQuantity() {
            return quantity;
        }
    }

    // Main method to start the library system
    public static void main(String[] args) {
        LibraryManagementSystem librarySystem = new LibraryManagementSystem();
        librarySystem.runLibrarySystem();
    }
}
