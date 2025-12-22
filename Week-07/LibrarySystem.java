class Book {
    String title;
    String author;
    String isbn;
    int publicationYear;
    String genre;
    boolean availabilityStatus;
    Book(String title, String author, String isbn, int publicationYear, String genre, boolean availabilityStatus) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + availabilityStatus);
        System.out.println("-----------------------");
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN101", 2005, "Programming", true);
        Book b2 = new Book("C Programming", "Dennis Ritchie", "ISBN102", 1998, "Programming", false);
        Book b3 = new Book("Clean Code", "Robert Martin", "ISBN103", 2008, "Software", true);

        Book[] books = {b1, b2, b3};
        
        System.out.println("All Books:");
        for (Book b : books) {
            b.displayInfo();
        }
        System.out.println("Available Books:");
        for (Book b : books) {
            if (b.availabilityStatus == true) {
                b.displayInfo();
            }
        }
        System.out.println("Not Available Books:");
        for (Book b : books) {
            if (b.availabilityStatus == false) {
                b.displayInfo();
            }
        }
        System.out.println("Available Books Published After 2000:");
        for (Book b : books) {
            if (b.availabilityStatus == true)
                if (b.publicationYear > 2000)
                    b.displayInfo();
        }
    }
}
