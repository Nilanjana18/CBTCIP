import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Books {
    private String book_title;
    private String author;

    public Books(String title, String author) {
        this.book_title = title;
        this.author = author;
    }

    public String get_Title() {
        return book_title;
    }

    public String get_Author() {
        return author;
    }
}

class Digital_Library {
    private List<Books> books;

    public Digital_Library() {
        books = new ArrayList<>();
    }

    public void add_Book(Books book) {
        books.add(book);
    }

    public List<Books> get_All_Books() {
        return books;
    }
}

class Admin_Module {
    public static void add_Book(Digital_Library library, Scanner scanner) {
        System.out.print("Enter title of the book: ");
        String title = scanner.nextLine();
        System.out.print("Enter name of the author: ");
        String author = scanner.nextLine();

        Books book = new Books(title, author);
        library.add_Book(book);

        System.out.println("Book addition done successfully");
    }
}

class User_Module {
    public static void display_Books(Digital_Library library) {
        List<Books> books = library.get_All_Books();

        System.out.println("Total Books Available:");
        for (Books book : books) {
            System.out.println("Title: " + book.get_Title() + ", Author: " + book.get_Author());
        }
    }
}

public class Digital_Library_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Digital_Library library = new Digital_Library();

        while (true) {
            System.out.println("1.Admin");
            System.out.println("2.User Module");
            System.out.println("3.Exit");
            System.out.print("Enter the choice: ");
            int ch = scanner.nextInt();
            scanner.nextLine();

            switch (ch) {
                case 1:
                    System.out.println("Admin Module:");
                    Admin_Module.add_Book(library, scanner);
                    break;
                case 2:
                    System.out.println("User Module:");
                    User_Module.display_Books(library);
                    break;
                case 3:
                    System.out.println("Exit!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("choice is invalid");
            }
        }
    }
}

