/**
 * Section 4 - Library App
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/LibraryApp.git
 */

public class Book extends Item {

    // Instance Fields
    private String author;
    private BookGenre bookGenre;

    // Overload Constructors
    public Book(String title, String invDate) throws Exception {
        super(title, invDate);
    }

    public Book(BookGenre bookGenre, String invDate, String title, String author) throws Exception {
        super(title, invDate);
        this.author = author;
        this.bookGenre = bookGenre;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public BookGenre getBookGenre() {
        return this.bookGenre;
    }

    // Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    // Additional Methods
    @Override
    public void displayItem() {
        super.displayItem();
        System.out.printf("%-7d%-20s%", author, bookGenre);
    }

}
