import java.util.Scanner;

import service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to Your Library Management System");
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. List All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice=scanner.nextInt();
            scanner.nextLine(); // Consume the line

            switch(choice){
                case 1 ->{
                    System.out.print("Enter Book ID: ");
                    String id=scanner.nextLine();
                    System.out.print("Enter Book title: ");
                    String title=scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author=scanner.nextLine();
                    libraryService.addBook(id,title,author);
                }
                case 2 ->{
                    System.out.print("Enter Book Title to search: ");
                    String title=scanner.nextLine();
                    libraryService.searchBookByTitle(title).ifPresentOrElse(book -> System.out.println("Found: "+book),
                                                                            () -> System.out.println("Book not found."));
                }
                case 3 ->{
                    System.out.println("Enter Book Id to borrow:");
                    String bookId = scanner.nextLine();
                    libraryService.borrowBook(bookId);
                }
                case 4 ->{
                    System.out.println("Enter Book ID to return:");
                    String bookId = scanner.nextLine();
                    libraryService.returnBook(bookId);
                }
                case 5 ->libraryService.listAllBooks();
                case 6 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                }
                default->System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}
 