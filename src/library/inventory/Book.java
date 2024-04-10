package library.inventory;

/**
 * This code creates author and bookGenre and sets them for use in LibraryApp.java.
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/app.LibraryApp.git
 */

public class Book extends Item {

    // Instance Fields

    /**
     * Authors
     */
    private String author;

    /**
     * inventory.Book genres
     */
    private BookGenre bookGenre;

    // Overload Constructors

    /**
     * Recieves title and invDate, calls super passing it the title and invDate
     * @param title
     * @param invDate
     * @throws Exception
     */
    public Book(String title, String invDate) throws Exception {
        super(title, invDate);
    }

    /**
     * Recieves title, invDate, author, and bookGenre. The setters for author and genre are called and super passes the
     * title and invDate
     * @param title
     * @param invDate
     * @param author
     * @param bookGenre
     * @throws Exception
     */
    public Book(String title, String invDate, String author, BookGenre bookGenre) throws Exception {
        super(title, invDate);
        this.author = author;
        this.bookGenre = bookGenre;
    }

    public Book(int id, String title, String invDate, String author, BookGenre bookGenre) throws Exception {
        super(id, title, invDate);
        this.author = author;
        this.bookGenre = bookGenre;
    }

    // Getters

    /**
     * Gets the authors name
     * @return
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the book genre
     * @return
     */
    public BookGenre getBookGenre() {
        return this.bookGenre;
    }

    // Setters

    /**
     * Sets the authors name
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the book genre
     * @param bookGenre
     */
    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    // Additional Method

    /**
     * Outputs displayItem with updated info from inventory.Book.java
     */
    @Override
    public void displayItem() {
        System.out.printf("%-4d%-16s%-5s ", id, title, invDate);
        System.out.printf("%-16s%-20s", author, bookGenre);
    }

}