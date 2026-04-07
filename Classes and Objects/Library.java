import java.util.*;

class Book {
    String title, author, ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }

    void display() {
        System.out.println(title + " | " + author + " | " + ISBN);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(b -> b.ISBN.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Title: ");
            String t = sc.nextLine();
            System.out.print("Author: ");
            String a = sc.nextLine();
            System.out.print("ISBN: ");
            String iS = sc.nextLine();

            lib.addBook(new Book(t, a, iS));
        }

        System.out.println("\nBooks:");
        lib.displayBooks();

        System.out.print("\nEnter ISBN to remove: ");
        String rem = sc.nextLine();
        lib.removeBook(rem);

        System.out.println("After removal:");
        lib.displayBooks();
    }
}