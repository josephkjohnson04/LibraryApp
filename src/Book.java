/**
 * Section 4 - Library App
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/LibraryApp.git
 */

public class Book extends Item {

    // Instance Fields
    /**
     * Authors
     */
    private String author;

    /**
     * Book genres
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
     * @param bookGenre
     * @param invDate
     * @param title
     * @param author
     * @throws Exception
     */
    public Book(BookGenre bookGenre, String invDate, String title, String author) throws Exception {
        super(title, invDate);
        this.author = author;
        this.bookGenre = bookGenre;
    }

    /**
     * Gets the authors name
     * @return
     */
    // Getters
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

    /**
     * Sets the authors name
     * @param author
     */
    // Setters
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

    /**
     * Outputs displayItem with updated info from Book.java
     */
    // Additional Methods
    @Override
    public void displayItem() {
        super.displayItem();
        System.out.printf("%-16s%-20s", author, bookGenre);
    }

}
